// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowUsageStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>GetFreeFlowUsageStatisticResponseBody</p>
 */
public class GetFreeFlowUsageStatisticResponseBody extends TeaModel {
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

    private GetFreeFlowUsageStatisticResponseBody(Builder builder) {
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

    public static GetFreeFlowUsageStatisticResponseBody create() {
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
         * 结果
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

        public GetFreeFlowUsageStatisticResponseBody build() {
            return new GetFreeFlowUsageStatisticResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("SpecType")
        private String specType;

        @NameInMap("TotalMoney")
        private String totalMoney;

        @NameInMap("TotalOrderNumber")
        private Long totalOrderNumber;

        @NameInMap("TotalUnitNumber")
        private Long totalUnitNumber;

        @NameInMap("YunOutProduct")
        private String yunOutProduct;

        private Data(Builder builder) {
            this.instanceId = builder.instanceId;
            this.specType = builder.specType;
            this.totalMoney = builder.totalMoney;
            this.totalOrderNumber = builder.totalOrderNumber;
            this.totalUnitNumber = builder.totalUnitNumber;
            this.yunOutProduct = builder.yunOutProduct;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return specType
         */
        public String getSpecType() {
            return this.specType;
        }

        /**
         * @return totalMoney
         */
        public String getTotalMoney() {
            return this.totalMoney;
        }

        /**
         * @return totalOrderNumber
         */
        public Long getTotalOrderNumber() {
            return this.totalOrderNumber;
        }

        /**
         * @return totalUnitNumber
         */
        public Long getTotalUnitNumber() {
            return this.totalUnitNumber;
        }

        /**
         * @return yunOutProduct
         */
        public String getYunOutProduct() {
            return this.yunOutProduct;
        }

        public static final class Builder {
            private String instanceId; 
            private String specType; 
            private String totalMoney; 
            private Long totalOrderNumber; 
            private Long totalUnitNumber; 
            private String yunOutProduct; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * 该实例对应的包类型
             */
            public Builder specType(String specType) {
                this.specType = specType;
                return this;
            }

            /**
             * TotalMoney.
             */
            public Builder totalMoney(String totalMoney) {
                this.totalMoney = totalMoney;
                return this;
            }

            /**
             * 该实例的订单总数
             */
            public Builder totalOrderNumber(Long totalOrderNumber) {
                this.totalOrderNumber = totalOrderNumber;
                return this;
            }

            /**
             * 该实例的订单总计量单元数
             */
            public Builder totalUnitNumber(Long totalUnitNumber) {
                this.totalUnitNumber = totalUnitNumber;
                return this;
            }

            /**
             * 产品规格
             */
            public Builder yunOutProduct(String yunOutProduct) {
                this.yunOutProduct = yunOutProduct;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
