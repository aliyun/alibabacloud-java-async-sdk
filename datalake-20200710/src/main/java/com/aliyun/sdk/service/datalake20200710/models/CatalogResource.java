// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CatalogResource} extends {@link TeaModel}
 *
 * <p>CatalogResource</p>
 */
public class CatalogResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    private CatalogResource(Builder builder) {
        this.catalogId = builder.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogResource create() {
        return builder().build();
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    public static final class Builder {
        private String catalogId; 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public CatalogResource build() {
            return new CatalogResource(this);
        } 

    } 

}
