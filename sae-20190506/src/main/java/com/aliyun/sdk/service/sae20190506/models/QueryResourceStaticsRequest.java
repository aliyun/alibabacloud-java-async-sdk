// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link QueryResourceStaticsRequest} extends {@link RequestModel}
 *
 * <p>QueryResourceStaticsRequest</p>
 */
public class QueryResourceStaticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    private QueryResourceStaticsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryResourceStaticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<QueryResourceStaticsRequest, Builder> {
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(QueryResourceStaticsRequest request) {
            super(request);
            this.appId = request.appId;
        } 

        /**
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public QueryResourceStaticsRequest build() {
            return new QueryResourceStaticsRequest(this);
        } 

    } 

}
