package org.tron.core.config;

public interface Parameter {

  interface ChainConstant {

    long TRANSFER_FEE = 0; // 1 drop
    long ASSET_ISSUE_FEE = 1024000000; // 1024 trx 1024*10^6
    long VOTE_WITNESS_FEE = 10000; // 10000 drop
    long CREATE_ACCOUNT_FEE = 10000; // 10000 drop
    long WITNESS_PAY_PER_BLOCK = 32000000;  // 32trx
    double SOLIDIFIED_THRESHOLD = 0.6;
    int PRIVATE_KEY_LENGTH = 64;
    int MAX_ACTIVE_WITNESS_NUM = 15;
    int TRXS_SIZE = 2_000_000; // < 2MiB
    int BLOCK_PRODUCED_INTERVAL = 3000; //ms,produce block period, must be divisible by 60. millisecond
    long CLOCK_MAX_DELAY = 3600 * 1000; //ms
    long BATCH_FETCH_RESPONSE_SIZE = 1000; //for each inventory message from peer, the max count of fetch inv message
  }

  interface NodeConstant {
    long SYNC_RETURN_BATCH_NUM = 1000;
    long SYNC_FETCH_BATCH_NUM = 2000;
    long MAX_BLOCKS_IN_PROCESS = 400;
    long MAX_BLOCKS_ALREADY_FETCHED = 800;
    long MAX_BLOCKS_SYNC_FROM_ONE_PEER = 1000;
    long SYNC_CHAIN_LIMIT_NUM = 500;
    int MAX_TRANSACTION_PENDING = 2000;
  }

  interface NetConstants {
    long ADV_TIME_OUT = 20000L;
    long SYNC_TIME_OUT = 5000L;
    long HEAD_NUM_MAX_DELTA = 1000L;
    long HEAD_NUM_CHECK_TIME = 60000L;
    int MAX_INVENTORY_SIZE_IN_MINUTES = 2;
    long NET_MAX_TRX_PER_SECOND = 1000L;
    long MAX_TRX_PER_PEER = 1L;
    int NET_MAX_INV_SIZE_IN_MINUTES = 2;
    int MSG_CACHE_DURATION_IN_BLOCKS = 5;
  }
}
