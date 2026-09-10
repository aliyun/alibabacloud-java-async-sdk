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
 * {@link ListDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabasesResponseBody</p>
 */
public class ListDatabasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("databases")
    private java.util.List<String> databases;

    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    private ListDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.nextPageToken = builder.nextPageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databases
     */
    public java.util.List<String> getDatabases() {
        return this.databases;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public static final class Builder {
        private java.util.List<String> databases; 
        private String nextPageToken; 

        private Builder() {
        } 

        private Builder(ListDatabasesResponseBody model) {
            this.databases = model.databases;
            this.nextPageToken = model.nextPageToken;
        } 

        /**
         * <p>The databases.</p>
         */
        public Builder databases(java.util.List<String> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The token for the next page of results. A null value indicates that this is the last page.</p>
         * 
         * <strong>example:</strong>
         * <p>E8ABEB1C3DB893D16576269017992F57</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        public ListDatabasesResponseBody build() {
            return new ListDatabasesResponseBody(this);
        } 

    } 

}
