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
 * {@link ListCatalogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCatalogsResponseBody</p>
 */
public class ListCatalogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogs")
    private java.util.List<Catalog> catalogs;

    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("prepayResource")
    private java.util.List<PrepayResource> prepayResource;

    private ListCatalogsResponseBody(Builder builder) {
        this.catalogs = builder.catalogs;
        this.nextPageToken = builder.nextPageToken;
        this.prepayResource = builder.prepayResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCatalogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogs
     */
    public java.util.List<Catalog> getCatalogs() {
        return this.catalogs;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return prepayResource
     */
    public java.util.List<PrepayResource> getPrepayResource() {
        return this.prepayResource;
    }

    public static final class Builder {
        private java.util.List<Catalog> catalogs; 
        private String nextPageToken; 
        private java.util.List<PrepayResource> prepayResource; 

        private Builder() {
        } 

        private Builder(ListCatalogsResponseBody model) {
            this.catalogs = model.catalogs;
            this.nextPageToken = model.nextPageToken;
            this.prepayResource = model.prepayResource;
        } 

        /**
         * <p>The list of catalogs.</p>
         */
        public Builder catalogs(java.util.List<Catalog> catalogs) {
            this.catalogs = catalogs;
            return this;
        }

        /**
         * <p>The pagination token used to retrieve the next page of results. A null value indicates that the current query has reached the last page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>E8ABEB1C3DB893D16576269017992F57</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The list of subscription compute resources.</p>
         */
        public Builder prepayResource(java.util.List<PrepayResource> prepayResource) {
            this.prepayResource = prepayResource;
            return this;
        }

        public ListCatalogsResponseBody build() {
            return new ListCatalogsResponseBody(this);
        } 

    } 

}
