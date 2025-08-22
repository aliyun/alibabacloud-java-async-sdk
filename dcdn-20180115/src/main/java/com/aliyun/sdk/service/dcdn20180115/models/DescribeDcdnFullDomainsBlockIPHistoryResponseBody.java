// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
    private java.util.List<IPBlockInfo> IPBlockInfo;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<IPBlockInfo> getIPBlockInfo() {
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
        private java.util.List<IPBlockInfo> IPBlockInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDcdnFullDomainsBlockIPHistoryResponseBody model) {
            this.code = model.code;
            this.description = model.description;
            this.IPBlockInfo = model.IPBlockInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * <p>The value of Code is not 0 in the following scenarios:</p>
         * <ul>
         * <li>The format of the IP address is invalid.</li>
         * <li>The format of the time is invalid.</li>
         * <li>Other abnormal scenarios</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The description of the status returned.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The result of the operation.</p>
         */
        public Builder IPBlockInfo(java.util.List<IPBlockInfo> IPBlockInfo) {
            this.IPBlockInfo = IPBlockInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>13A2B792-9212-1CC9-8525-59EBEF3FFE01</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnFullDomainsBlockIPHistoryResponseBody build() {
            return new DescribeDcdnFullDomainsBlockIPHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnFullDomainsBlockIPHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnFullDomainsBlockIPHistoryResponseBody</p>
     */
    public static class IPBlockInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockIP")
        private String blockIP;

        @com.aliyun.core.annotation.NameInMap("BlockInterval")
        private String blockInterval;

        @com.aliyun.core.annotation.NameInMap("DeliverTime")
        private String deliverTime;

        @com.aliyun.core.annotation.NameInMap("OperationType")
        private String operationType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateType")
        private String updateType;

        private IPBlockInfo(Builder builder) {
            this.blockIP = builder.blockIP;
            this.blockInterval = builder.blockInterval;
            this.deliverTime = builder.deliverTime;
            this.operationType = builder.operationType;
            this.status = builder.status;
            this.updateType = builder.updateType;
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
         * @return blockInterval
         */
        public String getBlockInterval() {
            return this.blockInterval;
        }

        /**
         * @return deliverTime
         */
        public String getDeliverTime() {
            return this.deliverTime;
        }

        /**
         * @return operationType
         */
        public String getOperationType() {
            return this.operationType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateType
         */
        public String getUpdateType() {
            return this.updateType;
        }

        public static final class Builder {
            private String blockIP; 
            private String blockInterval; 
            private String deliverTime; 
            private String operationType; 
            private String status; 
            private String updateType; 

            private Builder() {
            } 

            private Builder(IPBlockInfo model) {
                this.blockIP = model.blockIP;
                this.blockInterval = model.blockInterval;
                this.deliverTime = model.deliverTime;
                this.operationType = model.operationType;
                this.status = model.status;
                this.updateType = model.updateType;
            } 

            /**
             * <p>The blocked IP address or CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>1.XXX.XXX.0~1.XXX.XXX.255</p>
             */
            public Builder blockIP(String blockIP) {
                this.blockIP = blockIP;
                return this;
            }

            /**
             * BlockInterval.
             */
            public Builder blockInterval(String blockInterval) {
                this.blockInterval = blockInterval;
                return this;
            }

            /**
             * <p>The delivery time.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-24 18:49:37</p>
             */
            public Builder deliverTime(String deliverTime) {
                this.deliverTime = deliverTime;
                return this;
            }

            /**
             * OperationType.
             */
            public Builder operationType(String operationType) {
                this.operationType = operationType;
                return this;
            }

            /**
             * <p>The delivery status.</p>
             * <ul>
             * <li>Success</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateType.
             */
            public Builder updateType(String updateType) {
                this.updateType = updateType;
                return this;
            }

            public IPBlockInfo build() {
                return new IPBlockInfo(this);
            } 

        } 

    }
}
