// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>49C82193-E991-5F6A-AF3E-1664D8D05CA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The commercialization status of the service.</p>
         */
        public Builder userAndCommodityStatus(UserAndCommodityStatus userAndCommodityStatus) {
            this.userAndCommodityStatus = userAndCommodityStatus;
            return this;
        }

        public GetCommercialStatusResponseBody build() {
            return new GetCommercialStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCommercialStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetCommercialStatusResponseBody</p>
     */
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
             * <p>Indicates whether you are using the Basic Edition.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder basic(Boolean basic) {
                this.basic = basic;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>usage</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>Indicates whether the service is activated.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The additional information.</p>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder extraInfo(java.util.Map < String, ? > extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * <p>The number of days during which the service is free of charge.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder freeDays(Long freeDays) {
                this.freeDays = freeDays;
                return this;
            }

            /**
             * <p>The tags.</p>
             * 
             * <strong>example:</strong>
             * <p>NEW</p>
             */
            public Builder lable(String lable) {
                this.lable = lable;
                return this;
            }

            /**
             * <p>The commercialization status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Normal: The service is activated.</li>
             * <li>Abnormal: An exception occurs during activation.</li>
             * <li>Free: The service is not activated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
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
