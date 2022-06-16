// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowProductListResponseBody} extends {@link TeaModel}
 *
 * <p>GetFreeFlowProductListResponseBody</p>
 */
public class GetFreeFlowProductListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private GetFreeFlowProductListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rt = builder.rt;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFreeFlowProductListResponseBody create() {
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
     * @return rt
     */
    public Long getRt() {
        return this.rt;
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
        private Long rt; 
        private Boolean success; 

        /**
         * 结果码
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
         * 结果描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求链路ID，如POP请求进来的requestId，返回时原样返回
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务端处理耗时，ms
         */
        public Builder rt(Long rt) {
            this.rt = rt;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFreeFlowProductListResponseBody build() {
            return new GetFreeFlowProductListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Configured")
        private Boolean configured;

        @NameInMap("FlowProductAmount")
        private String flowProductAmount;

        @NameInMap("FlowProductId")
        private String flowProductId;

        @NameInMap("FlowProductName")
        private String flowProductName;

        @NameInMap("FlowProductPeriod")
        private String flowProductPeriod;

        @NameInMap("FlowType")
        private String flowType;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("SpecType")
        private String specType;

        @NameInMap("Spid")
        private String spid;

        @NameInMap("UnitPrice")
        private Integer unitPrice;

        private Data(Builder builder) {
            this.configured = builder.configured;
            this.flowProductAmount = builder.flowProductAmount;
            this.flowProductId = builder.flowProductId;
            this.flowProductName = builder.flowProductName;
            this.flowProductPeriod = builder.flowProductPeriod;
            this.flowType = builder.flowType;
            this.operator = builder.operator;
            this.specType = builder.specType;
            this.spid = builder.spid;
            this.unitPrice = builder.unitPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return configured
         */
        public Boolean getConfigured() {
            return this.configured;
        }

        /**
         * @return flowProductAmount
         */
        public String getFlowProductAmount() {
            return this.flowProductAmount;
        }

        /**
         * @return flowProductId
         */
        public String getFlowProductId() {
            return this.flowProductId;
        }

        /**
         * @return flowProductName
         */
        public String getFlowProductName() {
            return this.flowProductName;
        }

        /**
         * @return flowProductPeriod
         */
        public String getFlowProductPeriod() {
            return this.flowProductPeriod;
        }

        /**
         * @return flowType
         */
        public String getFlowType() {
            return this.flowType;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return spid
         */
        public String getSpid() {
            return this.spid;
        }

        /**
         * @return unitPrice
         */
        public Integer getUnitPrice() {
            return this.unitPrice;
        }

        public static final class Builder {
            private Boolean configured; 
            private String flowProductAmount; 
            private String flowProductId; 
            private String flowProductName; 
            private String flowProductPeriod; 
            private String flowType; 
            private String operator; 
            private String specType; 
            private String spid; 
            private Integer unitPrice; 

            /**
             * 产品当前状态，true为已配置，false为未配置
             */
            public Builder configured(Boolean configured) {
                this.configured = configured;
                return this;
            }

            /**
             * 产品包含的流量大小
             */
            public Builder flowProductAmount(String flowProductAmount) {
                this.flowProductAmount = flowProductAmount;
                return this;
            }

            /**
             * 免流产品ID
             */
            public Builder flowProductId(String flowProductId) {
                this.flowProductId = flowProductId;
                return this;
            }

            /**
             * 流量包名称
             */
            public Builder flowProductName(String flowProductName) {
                this.flowProductName = flowProductName;
                return this;
            }

            /**
             * 产品周期
             */
            public Builder flowProductPeriod(String flowProductPeriod) {
                this.flowProductPeriod = flowProductPeriod;
                return this;
            }

            /**
             * 取值包括free（定向流量）/normal（通用流量）
             */
            public Builder flowType(String flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * 取值包括cm（中国移动）/ct（中国电信）/cu（中国联通）
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 注意这里返回的全量套餐里，只能包含SpecType与该InstanceId的SpecType相同的规格
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * Spid.
             */
            public Builder spid(String spid) {
                this.spid = spid;
                return this;
            }

            /**
             * UnitPrice.
             */
            public Builder unitPrice(Integer unitPrice) {
                this.unitPrice = unitPrice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
