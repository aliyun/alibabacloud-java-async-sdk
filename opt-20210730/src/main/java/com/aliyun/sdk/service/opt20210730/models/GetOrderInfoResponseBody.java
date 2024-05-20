// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opt20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderInfoResponseBody</p>
 */
public class GetOrderInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOrderInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrderInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetOrderInfoResponseBody build() {
            return new GetOrderInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("currentConcurrency")
        private Integer currentConcurrency;

        @com.aliyun.core.annotation.NameInMap("currentDays")
        private Integer currentDays;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("licenseKey")
        private String licenseKey;

        @com.aliyun.core.annotation.NameInMap("remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("totalDays")
        private Integer totalDays;

        private Data(Builder builder) {
            this.bizType = builder.bizType;
            this.currentConcurrency = builder.currentConcurrency;
            this.currentDays = builder.currentDays;
            this.instanceId = builder.instanceId;
            this.licenseKey = builder.licenseKey;
            this.remark = builder.remark;
            this.totalDays = builder.totalDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return currentConcurrency
         */
        public Integer getCurrentConcurrency() {
            return this.currentConcurrency;
        }

        /**
         * @return currentDays
         */
        public Integer getCurrentDays() {
            return this.currentDays;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return licenseKey
         */
        public String getLicenseKey() {
            return this.licenseKey;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return totalDays
         */
        public Integer getTotalDays() {
            return this.totalDays;
        }

        public static final class Builder {
            private String bizType; 
            private Integer currentConcurrency; 
            private Integer currentDays; 
            private String instanceId; 
            private String licenseKey; 
            private String remark; 
            private Integer totalDays; 

            /**
             * bizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * currentConcurrency.
             */
            public Builder currentConcurrency(Integer currentConcurrency) {
                this.currentConcurrency = currentConcurrency;
                return this;
            }

            /**
             * currentDays.
             */
            public Builder currentDays(Integer currentDays) {
                this.currentDays = currentDays;
                return this;
            }

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * licenseKey.
             */
            public Builder licenseKey(String licenseKey) {
                this.licenseKey = licenseKey;
                return this;
            }

            /**
             * remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * totalDays.
             */
            public Builder totalDays(Integer totalDays) {
                this.totalDays = totalDays;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
