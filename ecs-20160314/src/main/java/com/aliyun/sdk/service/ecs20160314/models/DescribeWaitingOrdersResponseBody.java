// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWaitingOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWaitingOrdersResponseBody</p>
 */
public class DescribeWaitingOrdersResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeWaitingOrdersResponseBody(Builder builder) {
        this.data = builder.data;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWaitingOrdersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWaitingOrdersResponseBody build() {
            return new DescribeWaitingOrdersResponseBody(this);
        } 

    } 

    public static class InstanceInfos extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ResultCode")
        private String resultCode;

        private InstanceInfos(Builder builder) {
            this.instanceId = builder.instanceId;
            this.resultCode = builder.resultCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfos create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        public static final class Builder {
            private String instanceId; 
            private String resultCode; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            public InstanceInfos build() {
                return new InstanceInfos(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("FailedMessage")
        private String failedMessage;

        @NameInMap("InstanceAmount")
        private Long instanceAmount;

        @NameInMap("InstanceInfos")
        private java.util.List < InstanceInfos> instanceInfos;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("LxCreateParam")
        private String lxCreateParam;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("SuccessAmount")
        private Long successAmount;

        @NameInMap("WaitingOrderId")
        private String waitingOrderId;

        @NameInMap("ZoneId")
        private String zoneId;

        private Data(Builder builder) {
            this.chargeType = builder.chargeType;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.failedMessage = builder.failedMessage;
            this.instanceAmount = builder.instanceAmount;
            this.instanceInfos = builder.instanceInfos;
            this.instanceType = builder.instanceType;
            this.lxCreateParam = builder.lxCreateParam;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.successAmount = builder.successAmount;
            this.waitingOrderId = builder.waitingOrderId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return failedMessage
         */
        public String getFailedMessage() {
            return this.failedMessage;
        }

        /**
         * @return instanceAmount
         */
        public Long getInstanceAmount() {
            return this.instanceAmount;
        }

        /**
         * @return instanceInfos
         */
        public java.util.List < InstanceInfos> getInstanceInfos() {
            return this.instanceInfos;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return lxCreateParam
         */
        public String getLxCreateParam() {
            return this.lxCreateParam;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return successAmount
         */
        public Long getSuccessAmount() {
            return this.successAmount;
        }

        /**
         * @return waitingOrderId
         */
        public String getWaitingOrderId() {
            return this.waitingOrderId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String chargeType; 
            private String createTime; 
            private String expireTime; 
            private String failedMessage; 
            private Long instanceAmount; 
            private java.util.List < InstanceInfos> instanceInfos; 
            private String instanceType; 
            private String lxCreateParam; 
            private String regionId; 
            private String status; 
            private Long successAmount; 
            private String waitingOrderId; 
            private String zoneId; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * FailedMessage.
             */
            public Builder failedMessage(String failedMessage) {
                this.failedMessage = failedMessage;
                return this;
            }

            /**
             * InstanceAmount.
             */
            public Builder instanceAmount(Long instanceAmount) {
                this.instanceAmount = instanceAmount;
                return this;
            }

            /**
             * InstanceInfos.
             */
            public Builder instanceInfos(java.util.List < InstanceInfos> instanceInfos) {
                this.instanceInfos = instanceInfos;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * LxCreateParam.
             */
            public Builder lxCreateParam(String lxCreateParam) {
                this.lxCreateParam = lxCreateParam;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * SuccessAmount.
             */
            public Builder successAmount(Long successAmount) {
                this.successAmount = successAmount;
                return this;
            }

            /**
             * WaitingOrderId.
             */
            public Builder waitingOrderId(String waitingOrderId) {
                this.waitingOrderId = waitingOrderId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
