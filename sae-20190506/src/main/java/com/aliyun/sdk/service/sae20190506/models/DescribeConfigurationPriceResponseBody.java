// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigurationPriceResponseBody</p>
 */
public class DescribeConfigurationPriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private DescribeConfigurationPriceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigurationPriceResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeConfigurationPriceResponseBody build() {
            return new DescribeConfigurationPriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class BagUsage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Float cu;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Float mem;

        private BagUsage(Builder builder) {
            this.cpu = builder.cpu;
            this.cu = builder.cu;
            this.mem = builder.mem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BagUsage create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return cu
         */
        public Float getCu() {
            return this.cu;
        }

        /**
         * @return mem
         */
        public Float getMem() {
            return this.mem;
        }

        public static final class Builder {
            private Float cpu; 
            private Float cu; 
            private Float mem; 

            /**
             * Cpu.
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Cu.
             */
            public Builder cu(Float cu) {
                this.cu = cu;
                return this;
            }

            /**
             * Mem.
             */
            public Builder mem(Float mem) {
                this.mem = mem;
                return this;
            }

            public BagUsage build() {
                return new BagUsage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class Order extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private java.util.List < String > ruleIds;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private Order(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
            this.ruleIds = builder.ruleIds;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return ruleIds
         */
        public java.util.List < String > getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private Float discountAmount; 
            private Float originalAmount; 
            private java.util.List < String > ruleIds; 
            private Float tradeAmount; 

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * RuleIds.
             */
            public Builder ruleIds(java.util.List < String > ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * TradeAmount.
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private Float ruleDescId;

        private Rules(Builder builder) {
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleDescId
         */
        public Float getRuleDescId() {
            return this.ruleDescId;
        }

        public static final class Builder {
            private String name; 
            private Float ruleDescId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleDescId.
             */
            public Builder ruleDescId(Float ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class CpuMemPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private Order order;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < Rules> rules;

        private CpuMemPrice(Builder builder) {
            this.order = builder.order;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CpuMemPrice create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public Order getOrder() {
            return this.order;
        }

        /**
         * @return rules
         */
        public java.util.List < Rules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private Order order; 
            private java.util.List < Rules> rules; 

            /**
             * Order.
             */
            public Builder order(Order order) {
                this.order = order;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < Rules> rules) {
                this.rules = rules;
                return this;
            }

            public CpuMemPrice build() {
                return new CpuMemPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class DataOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private java.util.List < String > ruleIds;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private DataOrder(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
            this.ruleIds = builder.ruleIds;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataOrder create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return ruleIds
         */
        public java.util.List < String > getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private Float discountAmount; 
            private Float originalAmount; 
            private java.util.List < String > ruleIds; 
            private Float tradeAmount; 

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * RuleIds.
             */
            public Builder ruleIds(java.util.List < String > ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * TradeAmount.
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public DataOrder build() {
                return new DataOrder(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class RequestPriceOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private java.util.List < String > ruleIds;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private RequestPriceOrder(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
            this.ruleIds = builder.ruleIds;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestPriceOrder create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return ruleIds
         */
        public java.util.List < String > getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private Float discountAmount; 
            private Float originalAmount; 
            private java.util.List < String > ruleIds; 
            private Float tradeAmount; 

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * RuleIds.
             */
            public Builder ruleIds(java.util.List < String > ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * TradeAmount.
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public RequestPriceOrder build() {
                return new RequestPriceOrder(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class RequestPriceRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private Long ruleDescId;

        private RequestPriceRules(Builder builder) {
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestPriceRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleDescId
         */
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        public static final class Builder {
            private String name; 
            private Long ruleDescId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleDescId.
             */
            public Builder ruleDescId(Long ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            public RequestPriceRules build() {
                return new RequestPriceRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class RequestPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private RequestPriceOrder order;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < RequestPriceRules> rules;

        private RequestPrice(Builder builder) {
            this.order = builder.order;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestPrice create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public RequestPriceOrder getOrder() {
            return this.order;
        }

        /**
         * @return rules
         */
        public java.util.List < RequestPriceRules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private RequestPriceOrder order; 
            private java.util.List < RequestPriceRules> rules; 

            /**
             * Order.
             */
            public Builder order(RequestPriceOrder order) {
                this.order = order;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < RequestPriceRules> rules) {
                this.rules = rules;
                return this;
            }

            public RequestPrice build() {
                return new RequestPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class DataRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private Long ruleDescId;

        private DataRules(Builder builder) {
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleDescId
         */
        public Long getRuleDescId() {
            return this.ruleDescId;
        }

        public static final class Builder {
            private String name; 
            private Long ruleDescId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleDescId.
             */
            public Builder ruleDescId(Long ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            public DataRules build() {
                return new DataRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class TrafficPriceOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiscountAmount")
        private Float discountAmount;

        @com.aliyun.core.annotation.NameInMap("OriginalAmount")
        private Float originalAmount;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        private java.util.List < String > ruleIds;

        @com.aliyun.core.annotation.NameInMap("TradeAmount")
        private Float tradeAmount;

        private TrafficPriceOrder(Builder builder) {
            this.discountAmount = builder.discountAmount;
            this.originalAmount = builder.originalAmount;
            this.ruleIds = builder.ruleIds;
            this.tradeAmount = builder.tradeAmount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficPriceOrder create() {
            return builder().build();
        }

        /**
         * @return discountAmount
         */
        public Float getDiscountAmount() {
            return this.discountAmount;
        }

        /**
         * @return originalAmount
         */
        public Float getOriginalAmount() {
            return this.originalAmount;
        }

        /**
         * @return ruleIds
         */
        public java.util.List < String > getRuleIds() {
            return this.ruleIds;
        }

        /**
         * @return tradeAmount
         */
        public Float getTradeAmount() {
            return this.tradeAmount;
        }

        public static final class Builder {
            private Float discountAmount; 
            private Float originalAmount; 
            private java.util.List < String > ruleIds; 
            private Float tradeAmount; 

            /**
             * DiscountAmount.
             */
            public Builder discountAmount(Float discountAmount) {
                this.discountAmount = discountAmount;
                return this;
            }

            /**
             * OriginalAmount.
             */
            public Builder originalAmount(Float originalAmount) {
                this.originalAmount = originalAmount;
                return this;
            }

            /**
             * RuleIds.
             */
            public Builder ruleIds(java.util.List < String > ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            /**
             * TradeAmount.
             */
            public Builder tradeAmount(Float tradeAmount) {
                this.tradeAmount = tradeAmount;
                return this;
            }

            public TrafficPriceOrder build() {
                return new TrafficPriceOrder(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class TrafficPriceRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RuleDescId")
        private Float ruleDescId;

        private TrafficPriceRules(Builder builder) {
            this.name = builder.name;
            this.ruleDescId = builder.ruleDescId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficPriceRules create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleDescId
         */
        public Float getRuleDescId() {
            return this.ruleDescId;
        }

        public static final class Builder {
            private String name; 
            private Float ruleDescId; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RuleDescId.
             */
            public Builder ruleDescId(Float ruleDescId) {
                this.ruleDescId = ruleDescId;
                return this;
            }

            public TrafficPriceRules build() {
                return new TrafficPriceRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class TrafficPrice extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Order")
        private TrafficPriceOrder order;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < TrafficPriceRules> rules;

        private TrafficPrice(Builder builder) {
            this.order = builder.order;
            this.rules = builder.rules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficPrice create() {
            return builder().build();
        }

        /**
         * @return order
         */
        public TrafficPriceOrder getOrder() {
            return this.order;
        }

        /**
         * @return rules
         */
        public java.util.List < TrafficPriceRules> getRules() {
            return this.rules;
        }

        public static final class Builder {
            private TrafficPriceOrder order; 
            private java.util.List < TrafficPriceRules> rules; 

            /**
             * Order.
             */
            public Builder order(TrafficPriceOrder order) {
                this.order = order;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < TrafficPriceRules> rules) {
                this.rules = rules;
                return this;
            }

            public TrafficPrice build() {
                return new TrafficPrice(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeConfigurationPriceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfigurationPriceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BagUsage")
        private BagUsage bagUsage;

        @com.aliyun.core.annotation.NameInMap("CpuMemPrice")
        private CpuMemPrice cpuMemPrice;

        @com.aliyun.core.annotation.NameInMap("Order")
        private DataOrder order;

        @com.aliyun.core.annotation.NameInMap("RequestPrice")
        private RequestPrice requestPrice;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private java.util.List < DataRules> rules;

        @com.aliyun.core.annotation.NameInMap("TrafficPrice")
        private TrafficPrice trafficPrice;

        private Data(Builder builder) {
            this.bagUsage = builder.bagUsage;
            this.cpuMemPrice = builder.cpuMemPrice;
            this.order = builder.order;
            this.requestPrice = builder.requestPrice;
            this.rules = builder.rules;
            this.trafficPrice = builder.trafficPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bagUsage
         */
        public BagUsage getBagUsage() {
            return this.bagUsage;
        }

        /**
         * @return cpuMemPrice
         */
        public CpuMemPrice getCpuMemPrice() {
            return this.cpuMemPrice;
        }

        /**
         * @return order
         */
        public DataOrder getOrder() {
            return this.order;
        }

        /**
         * @return requestPrice
         */
        public RequestPrice getRequestPrice() {
            return this.requestPrice;
        }

        /**
         * @return rules
         */
        public java.util.List < DataRules> getRules() {
            return this.rules;
        }

        /**
         * @return trafficPrice
         */
        public TrafficPrice getTrafficPrice() {
            return this.trafficPrice;
        }

        public static final class Builder {
            private BagUsage bagUsage; 
            private CpuMemPrice cpuMemPrice; 
            private DataOrder order; 
            private RequestPrice requestPrice; 
            private java.util.List < DataRules> rules; 
            private TrafficPrice trafficPrice; 

            /**
             * BagUsage.
             */
            public Builder bagUsage(BagUsage bagUsage) {
                this.bagUsage = bagUsage;
                return this;
            }

            /**
             * CpuMemPrice.
             */
            public Builder cpuMemPrice(CpuMemPrice cpuMemPrice) {
                this.cpuMemPrice = cpuMemPrice;
                return this;
            }

            /**
             * Order.
             */
            public Builder order(DataOrder order) {
                this.order = order;
                return this;
            }

            /**
             * RequestPrice.
             */
            public Builder requestPrice(RequestPrice requestPrice) {
                this.requestPrice = requestPrice;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(java.util.List < DataRules> rules) {
                this.rules = rules;
                return this;
            }

            /**
             * TrafficPrice.
             */
            public Builder trafficPrice(TrafficPrice trafficPrice) {
                this.trafficPrice = trafficPrice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
