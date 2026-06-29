// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link BatchRevokeSeatsRequest} extends {@link RequestModel}
 *
 * <p>BatchRevokeSeatsRequest</p>
 */
public class BatchRevokeSeatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locale")
    private String locale;

    private BatchRevokeSeatsRequest(Builder builder) {
        super(builder);
        this.items = builder.items;
        this.locale = builder.locale;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchRevokeSeatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    public static final class Builder extends Request.Builder<BatchRevokeSeatsRequest, Builder> {
        private java.util.List<Items> items; 
        private String locale; 

        private Builder() {
            super();
        } 

        private Builder(BatchRevokeSeatsRequest request) {
            super(request);
            this.items = request.items;
            this.locale = request.locale;
        } 

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            String itemsShrink = shrink(items, "Items", "json");
            this.putQueryParameter("Items", itemsShrink);
            this.items = items;
            return this;
        }

        /**
         * Locale.
         */
        public Builder locale(String locale) {
            this.putQueryParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        @Override
        public BatchRevokeSeatsRequest build() {
            return new BatchRevokeSeatsRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchRevokeSeatsRequest} extends {@link TeaModel}
     *
     * <p>BatchRevokeSeatsRequest</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        private Items(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.accountId = model.accountId;
            } 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
