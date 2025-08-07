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
 * {@link ListShareReceiversResponseBody} extends {@link TeaModel}
 *
 * <p>ListShareReceiversResponseBody</p>
 */
public class ListShareReceiversResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("receivers")
    private java.util.List<Receiver> receivers;

    private ListShareReceiversResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.receivers = builder.receivers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShareReceiversResponseBody create() {
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

        private Builder(ListShareReceiversResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.receivers = model.receivers;
        } 

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * receivers.
         */
        public Builder receivers(java.util.List<Receiver> receivers) {
            this.receivers = receivers;
            return this;
        }

        public ListShareReceiversResponseBody build() {
            return new ListShareReceiversResponseBody(this);
        } 

    } 

}
