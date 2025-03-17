// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link QueryLlmCubeWithThemeListByUserIdRequest} extends {@link RequestModel}
 *
 * <p>QueryLlmCubeWithThemeListByUserIdRequest</p>
 */
public class QueryLlmCubeWithThemeListByUserIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private QueryLlmCubeWithThemeListByUserIdRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLlmCubeWithThemeListByUserIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryLlmCubeWithThemeListByUserIdRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryLlmCubeWithThemeListByUserIdRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adsdasd-***********-123wdasd</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryLlmCubeWithThemeListByUserIdRequest build() {
            return new QueryLlmCubeWithThemeListByUserIdRequest(this);
        } 

    } 

}
