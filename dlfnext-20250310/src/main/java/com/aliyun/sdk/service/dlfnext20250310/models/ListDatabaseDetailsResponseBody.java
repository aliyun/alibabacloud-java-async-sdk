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
 * {@link ListDatabaseDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatabaseDetailsResponseBody</p>
 */
public class ListDatabaseDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("databaseDetails")
    private java.util.List<Database> databaseDetails;

    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    private ListDatabaseDetailsResponseBody(Builder builder) {
        this.databaseDetails = builder.databaseDetails;
        this.nextPageToken = builder.nextPageToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabaseDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseDetails
     */
    public java.util.List<Database> getDatabaseDetails() {
        return this.databaseDetails;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public static final class Builder {
        private java.util.List<Database> databaseDetails; 
        private String nextPageToken; 

        private Builder() {
        } 

        private Builder(ListDatabaseDetailsResponseBody model) {
            this.databaseDetails = model.databaseDetails;
            this.nextPageToken = model.nextPageToken;
        } 

        /**
         * databaseDetails.
         */
        public Builder databaseDetails(java.util.List<Database> databaseDetails) {
            this.databaseDetails = databaseDetails;
            return this;
        }

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        public ListDatabaseDetailsResponseBody build() {
            return new ListDatabaseDetailsResponseBody(this);
        } 

    } 

}
