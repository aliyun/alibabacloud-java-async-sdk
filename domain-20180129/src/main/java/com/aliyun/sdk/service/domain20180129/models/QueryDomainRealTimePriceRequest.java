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
 * {@link QueryDomainRealTimePriceRequest} extends {@link RequestModel}
 *
 * <p>QueryDomainRealTimePriceRequest</p>
 */
public class QueryDomainRealTimePriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Currency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainItem")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DomainItem> domainItem;

    private QueryDomainRealTimePriceRequest(Builder builder) {
        super(builder);
        this.currency = builder.currency;
        this.domainItem = builder.domainItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainRealTimePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currency
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * @return domainItem
     */
    public java.util.List<DomainItem> getDomainItem() {
        return this.domainItem;
    }

    public static final class Builder extends Request.Builder<QueryDomainRealTimePriceRequest, Builder> {
        private String currency; 
        private java.util.List<DomainItem> domainItem; 

        private Builder() {
            super();
        } 

        private Builder(QueryDomainRealTimePriceRequest request) {
            super(request);
            this.currency = request.currency;
            this.domainItem = request.domainItem;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        public Builder currency(String currency) {
            this.putQueryParameter("Currency", currency);
            this.currency = currency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainItem(java.util.List<DomainItem> domainItem) {
            String domainItemShrink = shrink(domainItem, "DomainItem", "json");
            this.putQueryParameter("DomainItem", domainItemShrink);
            this.domainItem = domainItem;
            return this;
        }

        @Override
        public QueryDomainRealTimePriceRequest build() {
            return new QueryDomainRealTimePriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainRealTimePriceRequest} extends {@link TeaModel}
     *
     * <p>QueryDomainRealTimePriceRequest</p>
     */
    public static class DomainItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        @com.aliyun.core.annotation.Validation(required = true)
        private String action;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("Suffix")
        private String suffix;

        private DomainItem(Builder builder) {
            this.action = builder.action;
            this.domainName = builder.domainName;
            this.period = builder.period;
            this.suffix = builder.suffix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainItem create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
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
         * @return suffix
         */
        public String getSuffix() {
            return this.suffix;
        }

        public static final class Builder {
            private String action; 
            private String domainName; 
            private Integer period; 
            private String suffix; 

            private Builder() {
            } 

            private Builder(DomainItem model) {
                this.action = model.action;
                this.domainName = model.domainName;
                this.period = model.period;
                this.suffix = model.suffix;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>renew</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.com</p>
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
             * Suffix.
             */
            public Builder suffix(String suffix) {
                this.suffix = suffix;
                return this;
            }

            public DomainItem build() {
                return new DomainItem(this);
            } 

        } 

    }
}
