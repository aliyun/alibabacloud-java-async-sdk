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
 * {@link ListViewDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListViewDetailsResponseBody</p>
 */
public class ListViewDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("viewDetails")
    private java.util.List<View> viewDetails;

    private ListViewDetailsResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.viewDetails = builder.viewDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListViewDetailsResponseBody create() {
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
     * @return viewDetails
     */
    public java.util.List<View> getViewDetails() {
        return this.viewDetails;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<View> viewDetails; 

        private Builder() {
        } 

        private Builder(ListViewDetailsResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.viewDetails = model.viewDetails;
        } 

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * viewDetails.
         */
        public Builder viewDetails(java.util.List<View> viewDetails) {
            this.viewDetails = viewDetails;
            return this;
        }

        public ListViewDetailsResponseBody build() {
            return new ListViewDetailsResponseBody(this);
        } 

    } 

}
