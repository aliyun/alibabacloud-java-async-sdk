// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opt20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrderInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrderInfoResponseBody</p>
 */
public class GetOrderInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
        @NameInMap("bizType")
        private String bizType;

        @NameInMap("currentConcurrency")
        private Integer currentConcurrency;

        @NameInMap("currentDays")
        private Integer currentDays;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("licenseKey")
        private String licenseKey;

        @NameInMap("remark")
        private String remark;

        @NameInMap("totalDays")
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
