// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOssUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssUsageDataResponseBody</p>
 */
public class GetOssUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageList")
    private java.util.List < UsageList> usageList;

    private GetOssUsageDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageList = builder.usageList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageList
     */
    public java.util.List < UsageList> getUsageList() {
        return this.usageList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UsageList> usageList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The array of usage data.
         */
        public Builder usageList(java.util.List < UsageList> usageList) {
            this.usageList = usageList;
            return this;
        }

        public GetOssUsageDataResponseBody build() {
            return new GetOssUsageDataResponseBody(this);
        } 

    } 

    public static class UsageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LanRxBw")
        private Long lanRxBw;

        @com.aliyun.core.annotation.NameInMap("LanTxBw")
        private Long lanTxBw;

        @com.aliyun.core.annotation.NameInMap("Point")
        private Long point;

        @com.aliyun.core.annotation.NameInMap("PointTs")
        private String pointTs;

        @com.aliyun.core.annotation.NameInMap("StorageUsageByte")
        private Long storageUsageByte;

        @com.aliyun.core.annotation.NameInMap("WanRxBw")
        private Long wanRxBw;

        @com.aliyun.core.annotation.NameInMap("WanTxBw")
        private Long wanTxBw;

        private UsageList(Builder builder) {
            this.lanRxBw = builder.lanRxBw;
            this.lanTxBw = builder.lanTxBw;
            this.point = builder.point;
            this.pointTs = builder.pointTs;
            this.storageUsageByte = builder.storageUsageByte;
            this.wanRxBw = builder.wanRxBw;
            this.wanTxBw = builder.wanTxBw;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageList create() {
            return builder().build();
        }

        /**
         * @return lanRxBw
         */
        public Long getLanRxBw() {
            return this.lanRxBw;
        }

        /**
         * @return lanTxBw
         */
        public Long getLanTxBw() {
            return this.lanTxBw;
        }

        /**
         * @return point
         */
        public Long getPoint() {
            return this.point;
        }

        /**
         * @return pointTs
         */
        public String getPointTs() {
            return this.pointTs;
        }

        /**
         * @return storageUsageByte
         */
        public Long getStorageUsageByte() {
            return this.storageUsageByte;
        }

        /**
         * @return wanRxBw
         */
        public Long getWanRxBw() {
            return this.wanRxBw;
        }

        /**
         * @return wanTxBw
         */
        public Long getWanTxBw() {
            return this.wanTxBw;
        }

        public static final class Builder {
            private Long lanRxBw; 
            private Long lanTxBw; 
            private Long point; 
            private String pointTs; 
            private Long storageUsageByte; 
            private Long wanRxBw; 
            private Long wanTxBw; 

            /**
             * The inbound bandwidth over the internal network. Unit: bit/s.
             */
            public Builder lanRxBw(Long lanRxBw) {
                this.lanRxBw = lanRxBw;
                return this;
            }

            /**
             * The outbound bandwidth over the internal network. Unit: bit/s.
             */
            public Builder lanTxBw(Long lanTxBw) {
                this.lanTxBw = lanTxBw;
                return this;
            }

            /**
             * The number of time points within a day.
             */
            public Builder point(Long point) {
                this.point = point;
                return this;
            }

            /**
             * The point in time, in UTC. Format: 2010-01-21T09:50:23Z.
             */
            public Builder pointTs(String pointTs) {
                this.pointTs = pointTs;
                return this;
            }

            /**
             * The storage usage. Unit: bytes.
             */
            public Builder storageUsageByte(Long storageUsageByte) {
                this.storageUsageByte = storageUsageByte;
                return this;
            }

            /**
             * The outbound bandwidth over the Internet. Unit: bit/s.
             */
            public Builder wanRxBw(Long wanRxBw) {
                this.wanRxBw = wanRxBw;
                return this;
            }

            /**
             * The outbound bandwidth over the Internet. Unit: bit/s.
             */
            public Builder wanTxBw(Long wanTxBw) {
                this.wanTxBw = wanTxBw;
                return this;
            }

            public UsageList build() {
                return new UsageList(this);
            } 

        } 

    }
}
