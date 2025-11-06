// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryDomainRealTimePriceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainRealTimePriceResponseBody</p>
 */
public class QueryDomainRealTimePriceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private QueryDomainRealTimePriceResponseBody(Builder builder) {
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpStatusCode = builder.httpStatusCode;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainRealTimePriceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
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
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpStatusCode; 
        private Module module; 
        private String requestId; 
        private Boolean success; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(QueryDomainRealTimePriceResponseBody model) {
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpStatusCode = model.httpStatusCode;
            this.module = model.module;
            this.requestId = model.requestId;
            this.success = model.success;
            this.synchro = model.synchro;
        } 

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
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
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
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
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public QueryDomainRealTimePriceResponseBody build() {
            return new QueryDomainRealTimePriceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainRealTimePriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainRealTimePriceResponseBody</p>
     */
    public static class DomainPrices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Avail")
        private Integer avail;

        @com.aliyun.core.annotation.NameInMap("Currency")
        private String currency;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("Premium")
        private Boolean premium;

        @com.aliyun.core.annotation.NameInMap("Price")
        private Double price;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private DomainPrices(Builder builder) {
            this.action = builder.action;
            this.avail = builder.avail;
            this.currency = builder.currency;
            this.domainName = builder.domainName;
            this.period = builder.period;
            this.premium = builder.premium;
            this.price = builder.price;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainPrices create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return avail
         */
        public Integer getAvail() {
            return this.avail;
        }

        /**
         * @return currency
         */
        public String getCurrency() {
            return this.currency;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return premium
         */
        public Boolean getPremium() {
            return this.premium;
        }

        /**
         * @return price
         */
        public Double getPrice() {
            return this.price;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String action; 
            private Integer avail; 
            private String currency; 
            private String domainName; 
            private Integer period; 
            private Boolean premium; 
            private Double price; 
            private String reason; 

            private Builder() {
            } 

            private Builder(DomainPrices model) {
                this.action = model.action;
                this.avail = model.avail;
                this.currency = model.currency;
                this.domainName = model.domainName;
                this.period = model.period;
                this.premium = model.premium;
                this.price = model.price;
                this.reason = model.reason;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Avail.
             */
            public Builder avail(Integer avail) {
                this.avail = avail;
                return this;
            }

            /**
             * Currency.
             */
            public Builder currency(String currency) {
                this.currency = currency;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * Premium.
             */
            public Builder premium(Boolean premium) {
                this.premium = premium;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(Double price) {
                this.price = price;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public DomainPrices build() {
                return new DomainPrices(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDomainRealTimePriceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainRealTimePriceResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainPrices")
        private java.util.List<DomainPrices> domainPrices;

        private Module(Builder builder) {
            this.domainPrices = builder.domainPrices;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return domainPrices
         */
        public java.util.List<DomainPrices> getDomainPrices() {
            return this.domainPrices;
        }

        public static final class Builder {
            private java.util.List<DomainPrices> domainPrices; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.domainPrices = model.domainPrices;
            } 

            /**
             * DomainPrices.
             */
            public Builder domainPrices(java.util.List<DomainPrices> domainPrices) {
                this.domainPrices = domainPrices;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
