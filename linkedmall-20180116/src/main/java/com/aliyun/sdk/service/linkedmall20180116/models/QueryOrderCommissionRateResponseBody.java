// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrderCommissionRateResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrderCommissionRateResponseBody</p>
 */
public class QueryOrderCommissionRateResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CommissionModels")
    private java.util.List < CommissionModels> commissionModels;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryOrderCommissionRateResponseBody(Builder builder) {
        this.code = builder.code;
        this.commissionModels = builder.commissionModels;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrderCommissionRateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return commissionModels
     */
    public java.util.List < CommissionModels> getCommissionModels() {
        return this.commissionModels;
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

    public static final class Builder {
        private String code; 
        private java.util.List < CommissionModels> commissionModels; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CommissionModels.
         */
        public Builder commissionModels(java.util.List < CommissionModels> commissionModels) {
            this.commissionModels = commissionModels;
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

        public QueryOrderCommissionRateResponseBody build() {
            return new QueryOrderCommissionRateResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @NameInMap("Value")
        private Long value;

        @NameInMap("ValueUnit")
        private String valueUnit;

        private Configs(Builder builder) {
            this.value = builder.value;
            this.valueUnit = builder.valueUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        /**
         * @return valueUnit
         */
        public String getValueUnit() {
            return this.valueUnit;
        }

        public static final class Builder {
            private Long value; 
            private String valueUnit; 

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            /**
             * ValueUnit.
             */
            public Builder valueUnit(String valueUnit) {
                this.valueUnit = valueUnit;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
    public static class RateConfig extends TeaModel {
        @NameInMap("Configs")
        private java.util.List < Configs> configs;

        private RateConfig(Builder builder) {
            this.configs = builder.configs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RateConfig create() {
            return builder().build();
        }

        /**
         * @return configs
         */
        public java.util.List < Configs> getConfigs() {
            return this.configs;
        }

        public static final class Builder {
            private java.util.List < Configs> configs; 

            /**
             * Configs.
             */
            public Builder configs(java.util.List < Configs> configs) {
                this.configs = configs;
                return this;
            }

            public RateConfig build() {
                return new RateConfig(this);
            } 

        } 

    }
    public static class CommissionInfo extends TeaModel {
        @NameInMap("RateConfig")
        private RateConfig rateConfig;

        @NameInMap("RateType")
        private String rateType;

        private CommissionInfo(Builder builder) {
            this.rateConfig = builder.rateConfig;
            this.rateType = builder.rateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommissionInfo create() {
            return builder().build();
        }

        /**
         * @return rateConfig
         */
        public RateConfig getRateConfig() {
            return this.rateConfig;
        }

        /**
         * @return rateType
         */
        public String getRateType() {
            return this.rateType;
        }

        public static final class Builder {
            private RateConfig rateConfig; 
            private String rateType; 

            /**
             * RateConfig.
             */
            public Builder rateConfig(RateConfig rateConfig) {
                this.rateConfig = rateConfig;
                return this;
            }

            /**
             * RateType.
             */
            public Builder rateType(String rateType) {
                this.rateType = rateType;
                return this;
            }

            public CommissionInfo build() {
                return new CommissionInfo(this);
            } 

        } 

    }
    public static class CommissionModels extends TeaModel {
        @NameInMap("CommissionInfo")
        private CommissionInfo commissionInfo;

        @NameInMap("LmOrderId")
        private Long lmOrderId;

        private CommissionModels(Builder builder) {
            this.commissionInfo = builder.commissionInfo;
            this.lmOrderId = builder.lmOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommissionModels create() {
            return builder().build();
        }

        /**
         * @return commissionInfo
         */
        public CommissionInfo getCommissionInfo() {
            return this.commissionInfo;
        }

        /**
         * @return lmOrderId
         */
        public Long getLmOrderId() {
            return this.lmOrderId;
        }

        public static final class Builder {
            private CommissionInfo commissionInfo; 
            private Long lmOrderId; 

            /**
             * CommissionInfo.
             */
            public Builder commissionInfo(CommissionInfo commissionInfo) {
                this.commissionInfo = commissionInfo;
                return this;
            }

            /**
             * LmOrderId.
             */
            public Builder lmOrderId(Long lmOrderId) {
                this.lmOrderId = lmOrderId;
                return this;
            }

            public CommissionModels build() {
                return new CommissionModels(this);
            } 

        } 

    }
}
