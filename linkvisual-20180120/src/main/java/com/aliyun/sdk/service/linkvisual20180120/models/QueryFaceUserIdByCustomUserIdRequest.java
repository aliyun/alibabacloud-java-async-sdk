// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceUserIdByCustomUserIdRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceUserIdByCustomUserIdRequest</p>
 */
public class QueryFaceUserIdByCustomUserIdRequest extends Request {
    @Query
    @NameInMap("CustomUserId")
    @Validation(required = true)
    private String customUserId;

    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
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

        private Builder(QueryFaceUserIdByCustomUserIdRequest response) {
            super(response);
            this.customUserId = response.customUserId;
            this.isolationId = response.isolationId;
        } 

        /**
         * CustomUserId.
         */
        public Builder customUserId(String customUserId) {
            this.putQueryParameter("CustomUserId", customUserId);
            this.customUserId = customUserId;
            return this;
        }

        /**
         * IsolationId.
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
