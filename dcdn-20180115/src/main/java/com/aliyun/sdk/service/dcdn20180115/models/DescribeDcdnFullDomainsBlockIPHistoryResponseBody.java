// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnFullDomainsBlockIPHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnFullDomainsBlockIPHistoryResponseBody</p>
 */
public class DescribeDcdnFullDomainsBlockIPHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("IPBlockInfo")
    private java.util.List < IPBlockInfo> IPBlockInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnFullDomainsBlockIPHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.description = builder.description;
        this.IPBlockInfo = builder.IPBlockInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnFullDomainsBlockIPHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return IPBlockInfo
     */
    public java.util.List < IPBlockInfo> getIPBlockInfo() {
        return this.IPBlockInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private String description; 
        private java.util.List < IPBlockInfo> IPBlockInfo; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * The value of Code is not 0 in the following scenarios:
         * 
         * *   The format of the IP address is invalid.
         * *   The format of the time is invalid.
         * *   Other abnormal scenarios
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The description of the status returned.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The result of the operation.
         */
        public Builder IPBlockInfo(java.util.List < IPBlockInfo> IPBlockInfo) {
            this.IPBlockInfo = IPBlockInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBody build() {
            return new DescribeDcdnFullDomainsBlockIPHistoryResponseBody(this);
        } 

    } 

    public static class IPBlockInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockIP")
        private String blockIP;

        @com.aliyun.core.annotation.NameInMap("DeliverTime")
        private String deliverTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private IPBlockInfo(Builder builder) {
            this.blockIP = builder.blockIP;
            this.deliverTime = builder.deliverTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IPBlockInfo create() {
            return builder().build();
        }

        /**
         * @return blockIP
         */
        public String getBlockIP() {
            return this.blockIP;
        }

        /**
         * @return deliverTime
         */
        public String getDeliverTime() {
            return this.deliverTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String blockIP; 
            private String deliverTime; 
            private String status; 

            /**
             * The blocked IP address or CIDR block.
             */
            public Builder blockIP(String blockIP) {
                this.blockIP = blockIP;
                return this;
            }

            /**
             * The delivery time.
             */
            public Builder deliverTime(String deliverTime) {
                this.deliverTime = deliverTime;
                return this;
            }

            /**
             * The delivery status.
             * <p>
             * 
             * *   Success
             * *   Failed
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public IPBlockInfo build() {
                return new IPBlockInfo(this);
            } 

        } 

    }
}
