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
 * {@link ListIcebergNamespaceDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIcebergNamespaceDetailsResponseBody</p>
 */
public class ListIcebergNamespaceDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("namespaceDetails")
    private java.util.List<Namespace> namespaceDetails;

    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    private ListIcebergNamespaceDetailsResponseBody(Builder builder) {
        this.namespaceDetails = builder.namespaceDetails;
        this.nextPageToken = builder.nextPageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIcebergNamespaceDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceDetails
     */
    public java.util.List<Namespace> getNamespaceDetails() {
        return this.namespaceDetails;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public static final class Builder {
        private java.util.List<Namespace> namespaceDetails; 
        private String nextPageToken; 

        private Builder() {
        } 

        private Builder(ListIcebergNamespaceDetailsResponseBody model) {
            this.namespaceDetails = model.namespaceDetails;
            this.nextPageToken = model.nextPageToken;
        } 

        /**
         * namespaceDetails.
         */
        public Builder namespaceDetails(java.util.List<Namespace> namespaceDetails) {
            this.namespaceDetails = namespaceDetails;
            return this;
        }

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        public ListIcebergNamespaceDetailsResponseBody build() {
            return new ListIcebergNamespaceDetailsResponseBody(this);
        } 

    } 

}
