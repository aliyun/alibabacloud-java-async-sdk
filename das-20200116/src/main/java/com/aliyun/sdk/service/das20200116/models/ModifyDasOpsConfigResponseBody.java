// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link ModifyDasOpsConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDasOpsConfigResponseBody</p>
 */
public class ModifyDasOpsConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ModifyDasOpsConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDasOpsConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(ModifyDasOpsConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>SqlLogConfig</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ModifyDasOpsConfigResponseBody build() {
            return new ModifyDasOpsConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDasOpsConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDasOpsConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityInstanceId")
        private String commodityInstanceId;

        @com.aliyun.core.annotation.NameInMap("EcoEnable")
        private Boolean ecoEnable;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("OpsEnable")
        private Boolean opsEnable;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityInstanceId = builder.commodityInstanceId;
            this.ecoEnable = builder.ecoEnable;
            this.enable = builder.enable;
            this.endTime = builder.endTime;
            this.opsEnable = builder.opsEnable;
            this.orderId = builder.orderId;
            this.startTime = builder.startTime;
            this.status = builder.status;
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
         * @return commodityInstanceId
         */
        public String getCommodityInstanceId() {
            return this.commodityInstanceId;
        }

        /**
         * @return ecoEnable
         */
        public Boolean getEcoEnable() {
            return this.ecoEnable;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return opsEnable
         */
        public Boolean getOpsEnable() {
            return this.opsEnable;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String chargeType; 
            private String commodityInstanceId; 
            private Boolean ecoEnable; 
            private Boolean enable; 
            private Long endTime; 
            private Boolean opsEnable; 
            private Long orderId; 
            private Long startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.chargeType = model.chargeType;
                this.commodityInstanceId = model.commodityInstanceId;
                this.ecoEnable = model.ecoEnable;
                this.enable = model.enable;
                this.endTime = model.endTime;
                this.opsEnable = model.opsEnable;
                this.orderId = model.orderId;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The payment method.</p>
             * 
             * <strong>example:</strong>
             * <p>prepay</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Managed Services instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-2zelo5v5u0678jx04</p>
             */
            public Builder commodityInstanceId(String commodityInstanceId) {
                this.commodityInstanceId = commodityInstanceId;
                return this;
            }

            /**
             * <p>Indicates whether DAS Economy Edition is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ecoEnable(Boolean ecoEnable) {
                this.ecoEnable = ecoEnable;
                return this;
            }

            /**
             * <p>Indicates whether the Alibaba Cloud Managed Services feature is enabled (including DAS Economy Edition).</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The end time. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1608888296000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Indicates whether Alibaba Cloud Managed Services is enabled.</p>
             */
            public Builder opsEnable(Boolean opsEnable) {
                this.opsEnable = opsEnable;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>285412912420536</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The start time.</p>
             * 
             * <strong>example:</strong>
             * <p>1672531200000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: Pending scheduling.</li>
             * <li><strong>RUNNING</strong>: Running.</li>
             * <li><strong>FAILED</strong>: Failed.</li>
             * <li><strong>CANCELED</strong>: Canceled.</li>
             * <li><strong>COMPLETED</strong>: Completed.</li>
             * </ul>
             * <blockquote>
             * <p>When the task is in the <strong>COMPLETED</strong> state, you can view the task result.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
