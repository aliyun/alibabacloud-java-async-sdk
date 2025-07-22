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
 * {@link ListTableDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTableDetailsResponseBody</p>
 */
public class ListTableDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("tableDetails")
    private java.util.List<Table> tableDetails;

    private ListTableDetailsResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.tableDetails = builder.tableDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTableDetailsResponseBody create() {
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
     * @return tableDetails
     */
    public java.util.List<Table> getTableDetails() {
        return this.tableDetails;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<Table> tableDetails; 

        private Builder() {
        } 

        private Builder(ListTableDetailsResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.tableDetails = model.tableDetails;
        } 

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * tableDetails.
         */
        public Builder tableDetails(java.util.List<Table> tableDetails) {
            this.tableDetails = tableDetails;
            return this;
        }

        public ListTableDetailsResponseBody build() {
            return new ListTableDetailsResponseBody(this);
        } 

    } 

}
