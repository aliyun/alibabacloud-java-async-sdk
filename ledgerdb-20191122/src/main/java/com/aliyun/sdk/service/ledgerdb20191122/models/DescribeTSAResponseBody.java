// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTSAResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTSAResponseBody</p>
 */
public class DescribeTSAResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TSADetail")
    private TSADetail TSADetail;

    private DescribeTSAResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.TSADetail = builder.TSADetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTSAResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return TSADetail
     */
    public TSADetail getTSADetail() {
        return this.TSADetail;
    }

    public static final class Builder {
        private String requestId; 
        private TSADetail TSADetail; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TSADetail.
         */
        public Builder TSADetail(TSADetail TSADetail) {
            this.TSADetail = TSADetail;
            return this;
        }

        public DescribeTSAResponseBody build() {
            return new DescribeTSAResponseBody(this);
        } 

    } 

    public static class TSADetail extends TeaModel {
        @NameInMap("BlockNumber")
        private Long blockNumber;

        @NameInMap("CTSR")
        private String CTSR;

        @NameInMap("RootHash")
        private String rootHash;

        @NameInMap("SN")
        private String SN;

        @NameInMap("TS")
        private Long TS;

        private TSADetail(Builder builder) {
            this.blockNumber = builder.blockNumber;
            this.CTSR = builder.CTSR;
            this.rootHash = builder.rootHash;
            this.SN = builder.SN;
            this.TS = builder.TS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TSADetail create() {
            return builder().build();
        }

        /**
         * @return blockNumber
         */
        public Long getBlockNumber() {
            return this.blockNumber;
        }

        /**
         * @return CTSR
         */
        public String getCTSR() {
            return this.CTSR;
        }

        /**
         * @return rootHash
         */
        public String getRootHash() {
            return this.rootHash;
        }

        /**
         * @return SN
         */
        public String getSN() {
            return this.SN;
        }

        /**
         * @return TS
         */
        public Long getTS() {
            return this.TS;
        }

        public static final class Builder {
            private Long blockNumber; 
            private String CTSR; 
            private String rootHash; 
            private String SN; 
            private Long TS; 

            /**
             * BlockNumber.
             */
            public Builder blockNumber(Long blockNumber) {
                this.blockNumber = blockNumber;
                return this;
            }

            /**
             * CTSR.
             */
            public Builder CTSR(String CTSR) {
                this.CTSR = CTSR;
                return this;
            }

            /**
             * RootHash.
             */
            public Builder rootHash(String rootHash) {
                this.rootHash = rootHash;
                return this;
            }

            /**
             * SN.
             */
            public Builder SN(String SN) {
                this.SN = SN;
                return this;
            }

            /**
             * TS.
             */
            public Builder TS(Long TS) {
                this.TS = TS;
                return this;
            }

            public TSADetail build() {
                return new TSADetail(this);
            } 

        } 

    }
}
