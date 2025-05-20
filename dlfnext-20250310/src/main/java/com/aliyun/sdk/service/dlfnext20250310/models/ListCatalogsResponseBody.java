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

    private ListCatalogsResponseBody(Builder builder) {
        this.catalogs = builder.catalogs;
        this.nextPageToken = builder.nextPageToken;
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

    public static final class Builder {
        private java.util.List<Catalog> catalogs; 
        private String nextPageToken; 

        private Builder() {
        } 

        private Builder(ListCatalogsResponseBody model) {
            this.catalogs = model.catalogs;
            this.nextPageToken = model.nextPageToken;
        } 

        /**
         * catalogs.
         */
        public Builder catalogs(java.util.List<Catalog> catalogs) {
            this.catalogs = catalogs;
            return this;
        }

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        public ListCatalogsResponseBody build() {
            return new ListCatalogsResponseBody(this);
        } 

    } 

}
