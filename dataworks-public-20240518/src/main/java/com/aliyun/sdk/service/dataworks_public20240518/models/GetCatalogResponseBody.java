// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetCatalogResponseBody} extends {@link TeaModel}
 *
 * <p>GetCatalogResponseBody</p>
 */
public class GetCatalogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Catalog")
    private Catalog catalog;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCatalogResponseBody(Builder builder) {
        this.catalog = builder.catalog;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalog
     */
    public Catalog getCatalog() {
        return this.catalog;
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
        private Catalog catalog; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCatalogResponseBody model) {
            this.catalog = model.catalog;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Catalog.
         */
        public Builder catalog(Catalog catalog) {
            this.catalog = catalog;
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

        public GetCatalogResponseBody build() {
            return new GetCatalogResponseBody(this);
        } 

    } 

}
