// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNewPlayVideoPlaySessionListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNewPlayVideoPlaySessionListResponseBody</p>
 */
public class DescribeNewPlayVideoPlaySessionListResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNum")
    private Long pageNum;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("ReadyTs")
    private Long readyTs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
    private Long totalNum;

    private DescribeNewPlayVideoPlaySessionListResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.readyTs = builder.readyTs;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNewPlayVideoPlaySessionListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return readyTs
     */
    public Long getReadyTs() {
        return this.readyTs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNum; 
        private Long pageSize; 
        private Long readyTs; 
        private String requestId; 
        private Long totalNum; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ReadyTs.
         */
        public Builder readyTs(Long readyTs) {
            this.readyTs = readyTs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public DescribeNewPlayVideoPlaySessionListResponseBody build() {
            return new DescribeNewPlayVideoPlaySessionListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TraceId")
        private String traceId;

        @NameInMap("UUID")
        private String UUID;

        @NameInMap("VPS")
        private String VPS;

        private Data(Builder builder) {
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.status = builder.status;
            this.traceId = builder.traceId;
            this.UUID = builder.UUID;
            this.VPS = builder.VPS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return UUID
         */
        public String getUUID() {
            return this.UUID;
        }

        /**
         * @return VPS
         */
        public String getVPS() {
            return this.VPS;
        }

        public static final class Builder {
            private String gmtModifiedTime; 
            private String status; 
            private String traceId; 
            private String UUID; 
            private String VPS; 

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * UUID.
             */
            public Builder UUID(String UUID) {
                this.UUID = UUID;
                return this;
            }

            /**
             * VPS.
             */
            public Builder VPS(String VPS) {
                this.VPS = VPS;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
