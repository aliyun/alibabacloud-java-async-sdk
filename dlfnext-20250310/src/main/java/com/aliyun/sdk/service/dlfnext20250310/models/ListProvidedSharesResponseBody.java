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
 * {@link ListProvidedSharesResponseBody} extends {@link TeaModel}
 *
 * <p>ListProvidedSharesResponseBody</p>
 */
public class ListProvidedSharesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("shares")
    private java.util.List<Share> shares;

    private ListProvidedSharesResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.shares = builder.shares;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvidedSharesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return shares
     */
    public java.util.List<Share> getShares() {
        return this.shares;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<Share> shares; 

        private Builder() {
        } 

        private Builder(ListProvidedSharesResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.shares = model.shares;
        } 

        /**
         * <p>The token to retrieve the next page of results. A null value indicates that this is the last page.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The shares.</p>
         */
        public Builder shares(java.util.List<Share> shares) {
            this.shares = shares;
            return this;
        }

        public ListProvidedSharesResponseBody build() {
            return new ListProvidedSharesResponseBody(this);
        } 

    } 

}
