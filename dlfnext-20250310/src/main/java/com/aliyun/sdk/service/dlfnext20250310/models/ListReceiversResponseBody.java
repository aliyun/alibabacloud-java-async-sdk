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
 * {@link ListReceiversResponseBody} extends {@link TeaModel}
 *
 * <p>ListReceiversResponseBody</p>
 */
public class ListReceiversResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("receivers")
    private java.util.List<Receiver> receivers;

    private ListReceiversResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.receivers = builder.receivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReceiversResponseBody create() {
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
     * @return receivers
     */
    public java.util.List<Receiver> getReceivers() {
        return this.receivers;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<Receiver> receivers; 

        private Builder() {
        } 

        private Builder(ListReceiversResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.receivers = model.receivers;
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
         * <p>A list of receivers.</p>
         */
        public Builder receivers(java.util.List<Receiver> receivers) {
            this.receivers = receivers;
            return this;
        }

        public ListReceiversResponseBody build() {
            return new ListReceiversResponseBody(this);
        } 

    } 

}
