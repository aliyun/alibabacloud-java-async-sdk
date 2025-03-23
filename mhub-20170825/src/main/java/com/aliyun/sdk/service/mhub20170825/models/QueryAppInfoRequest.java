// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825.models;

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
 * {@link QueryAppInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryAppInfoRequest</p>
 */
public class QueryAppInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appKey;

    private QueryAppInfoRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAppInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    public static final class Builder extends Request.Builder<QueryAppInfoRequest, Builder> {
        private String appKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryAppInfoRequest request) {
            super(request);
            this.appKey = request.appKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        @Override
        public QueryAppInfoRequest build() {
            return new QueryAppInfoRequest(this);
        } 

    } 

}
