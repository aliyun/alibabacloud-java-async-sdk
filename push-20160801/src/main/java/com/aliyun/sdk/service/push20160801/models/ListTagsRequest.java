// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link ListTagsRequest} extends {@link RequestModel}
 *
 * <p>ListTagsRequest</p>
 */
public class ListTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    private ListTagsRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    public static final class Builder extends Request.Builder<ListTagsRequest, Builder> {
        private Long appKey; 

        private Builder() {
            super();
        } 

        private Builder(ListTagsRequest request) {
            super(request);
            this.appKey = request.appKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267207</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        @Override
        public ListTagsRequest build() {
            return new ListTagsRequest(this);
        } 

    } 

}
