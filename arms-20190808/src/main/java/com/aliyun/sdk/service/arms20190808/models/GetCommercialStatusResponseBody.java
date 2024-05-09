// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommercialStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetCommercialStatusResponseBody</p>
 */
public class GetCommercialStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserAndCommodityStatus")
    private UserAndCommodityStatus userAndCommodityStatus;

    private GetCommercialStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userAndCommodityStatus = builder.userAndCommodityStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommercialStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userAndCommodityStatus
     */
    public UserAndCommodityStatus getUserAndCommodityStatus() {
        return this.userAndCommodityStatus;
    }

    public static final class Builder {
        private String requestId; 
        private UserAndCommodityStatus userAndCommodityStatus; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserAndCommodityStatus.
         */
        public Builder userAndCommodityStatus(UserAndCommodityStatus userAndCommodityStatus) {
            this.userAndCommodityStatus = userAndCommodityStatus;
            return this;
        }

        public GetCommercialStatusResponseBody build() {
            return new GetCommercialStatusResponseBody(this);
        } 

    } 

    public static class UserAndCommodityStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Basic")
        private Boolean basic;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private java.util.Map < String, ? > extraInfo;

        @com.aliyun.core.annotation.NameInMap("FreeDays")
        private Long freeDays;

        @com.aliyun.core.annotation.NameInMap("Lable")
        private String lable;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private UserAndCommodityStatus(Builder builder) {
            this.basic = builder.basic;
            this.chargeType = builder.chargeType;
            this.enable = builder.enable;
            this.extraInfo = builder.extraInfo;
            this.freeDays = builder.freeDays;
            this.lable = builder.lable;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAndCommodityStatus create() {
            return builder().build();
        }

        /**
         * @return basic
         */
        public Boolean getBasic() {
            return this.basic;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return extraInfo
         */
        public java.util.Map < String, ? > getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return freeDays
         */
        public Long getFreeDays() {
            return this.freeDays;
        }

        /**
         * @return lable
         */
        public String getLable() {
            return this.lable;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean basic; 
            private String chargeType; 
            private Boolean enable; 
            private java.util.Map < String, ? > extraInfo; 
            private Long freeDays; 
            private String lable; 
            private String status; 

            /**
             * Basic.
             */
            public Builder basic(Boolean basic) {
                this.basic = basic;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(java.util.Map < String, ? > extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * FreeDays.
             */
            public Builder freeDays(Long freeDays) {
                this.freeDays = freeDays;
                return this;
            }

            /**
             * Lable.
             */
            public Builder lable(String lable) {
                this.lable = lable;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public UserAndCommodityStatus build() {
                return new UserAndCommodityStatus(this);
            } 

        } 

    }
}
