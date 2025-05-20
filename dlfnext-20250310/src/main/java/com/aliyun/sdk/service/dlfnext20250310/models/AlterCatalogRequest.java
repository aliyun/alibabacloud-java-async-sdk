// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link AlterCatalogRequest} extends {@link RequestModel}
 *
 * <p>AlterCatalogRequest</p>
 */
public class AlterCatalogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("catalog")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalog;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("removals")
    private java.util.List<String> removals;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("updates")
    private java.util.Map<String, String> updates;

    private AlterCatalogRequest(Builder builder) {
        super(builder);
        this.catalog = builder.catalog;
        this.removals = builder.removals;
        this.updates = builder.updates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlterCatalogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public String getCatalog() {
        return this.catalog;
    }

    /**
     * @return removals
     */
    public java.util.List<String> getRemovals() {
        return this.removals;
    }

    /**
     * @return updates
     */
    public java.util.Map<String, String> getUpdates() {
        return this.updates;
    }

    public static final class Builder extends Request.Builder<AlterCatalogRequest, Builder> {
        private String catalog; 
        private java.util.List<String> removals; 
        private java.util.Map<String, String> updates; 

        private Builder() {
            super();
        } 

        private Builder(AlterCatalogRequest request) {
            super(request);
            this.catalog = request.catalog;
            this.removals = request.removals;
            this.updates = request.updates;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>clg-paimon-xxxx</p>
         */
        public Builder catalog(String catalog) {
            this.putPathParameter("catalog", catalog);
            this.catalog = catalog;
            return this;
        }

        /**
         * removals.
         */
        public Builder removals(java.util.List<String> removals) {
            this.putBodyParameter("removals", removals);
            this.removals = removals;
            return this;
        }

        /**
         * updates.
         */
        public Builder updates(java.util.Map<String, String> updates) {
            this.putBodyParameter("updates", updates);
            this.updates = updates;
            return this;
        }

        @Override
        public AlterCatalogRequest build() {
            return new AlterCatalogRequest(this);
        } 

    } 

}
