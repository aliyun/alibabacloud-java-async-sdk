// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720.models;

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
 * {@link QueryFaceRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceRequest</p>
 */
public class QueryFaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private QueryFaceRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceRequest create() {
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

    public static final class Builder extends Request.Builder<QueryFaceRequest, Builder> {
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceRequest request) {
            super(request);
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryFaceRequest build() {
            return new QueryFaceRequest(this);
        } 

    } 

}
