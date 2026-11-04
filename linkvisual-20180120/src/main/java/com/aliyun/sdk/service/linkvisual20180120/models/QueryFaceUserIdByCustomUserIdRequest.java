// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryFaceUserIdByCustomUserIdRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceUserIdByCustomUserIdRequest</p>
 */
public class QueryFaceUserIdByCustomUserIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String isolationId;

    private QueryFaceUserIdByCustomUserIdRequest(Builder builder) {
        super(builder);
        this.customUserId = builder.customUserId;
        this.isolationId = builder.isolationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceUserIdByCustomUserIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customUserId
     */
    public String getCustomUserId() {
        return this.customUserId;
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    public static final class Builder extends Request.Builder<QueryFaceUserIdByCustomUserIdRequest, Builder> {
        private String customUserId; 
        private String isolationId; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceUserIdByCustomUserIdRequest request) {
            super(request);
            this.customUserId = request.customUserId;
            this.isolationId = request.isolationId;
        } 

        /**
         * <p>The user ID in the caller system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestCustomUserId</p>
         */
        public Builder customUserId(String customUserId) {
            this.putQueryParameter("CustomUserId", customUserId);
            this.customUserId = customUserId;
            return this;
        }

        /**
         * <p>The isolation ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestIsolationId</p>
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        @Override
        public QueryFaceUserIdByCustomUserIdRequest build() {
            return new QueryFaceUserIdByCustomUserIdRequest(this);
        } 

    } 

}
