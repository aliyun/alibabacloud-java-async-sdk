// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceCustomUserIdByUserIdRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceCustomUserIdByUserIdRequest</p>
 */
public class QueryFaceCustomUserIdByUserIdRequest extends Request {
    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private QueryFaceCustomUserIdByUserIdRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceCustomUserIdByUserIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isolationId
     */
    public String getIsolationId() {
        return this.isolationId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryFaceCustomUserIdByUserIdRequest, Builder> {
        private String isolationId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceCustomUserIdByUserIdRequest response) {
            super(response);
            this.isolationId = response.isolationId;
            this.userId = response.userId;
        } 

        /**
         * IsolationId.
         */
        public Builder isolationId(String isolationId) {
            this.putQueryParameter("IsolationId", isolationId);
            this.isolationId = isolationId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryFaceCustomUserIdByUserIdRequest build() {
            return new QueryFaceCustomUserIdByUserIdRequest(this);
        } 

    } 

}
