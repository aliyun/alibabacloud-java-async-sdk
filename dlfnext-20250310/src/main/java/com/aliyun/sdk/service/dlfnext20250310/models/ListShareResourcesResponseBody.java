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
 * {@link ListShareResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListShareResourcesResponseBody</p>
 */
public class ListShareResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogId")
    private String catalogId;

    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("shareResources")
    private java.util.List<ShareResource> shareResources;

    private ListShareResourcesResponseBody(Builder builder) {
        this.catalogId = builder.catalogId;
        this.nextPageToken = builder.nextPageToken;
        this.shareResources = builder.shareResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShareResourcesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return shareResources
     */
    public java.util.List<ShareResource> getShareResources() {
        return this.shareResources;
    }

    public static final class Builder {
        private String catalogId; 
        private String nextPageToken; 
        private java.util.List<ShareResource> shareResources; 

        private Builder() {
        } 

        private Builder(ListShareResourcesResponseBody model) {
            this.catalogId = model.catalogId;
            this.nextPageToken = model.nextPageToken;
            this.shareResources = model.shareResources;
        } 

        /**
         * catalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * shareResources.
         */
        public Builder shareResources(java.util.List<ShareResource> shareResources) {
            this.shareResources = shareResources;
            return this;
        }

        public ListShareResourcesResponseBody build() {
            return new ListShareResourcesResponseBody(this);
        } 

    } 

}
