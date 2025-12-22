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
 * {@link ListViewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListViewsResponseBody</p>
 */
public class ListViewsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("nextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("views")
    private java.util.List<String> views;

    private ListViewsResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.views = builder.views;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListViewsResponseBody create() {
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
     * @return views
     */
    public java.util.List<String> getViews() {
        return this.views;
    }

    public static final class Builder {
        private String nextPageToken; 
        private java.util.List<String> views; 

        private Builder() {
        } 

        private Builder(ListViewsResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.views = model.views;
        } 

        /**
         * nextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * views.
         */
        public Builder views(java.util.List<String> views) {
            this.views = views;
            return this;
        }

        public ListViewsResponseBody build() {
            return new ListViewsResponseBody(this);
        } 

    } 

}
