// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceUserBatchRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceUserBatchRequest</p>
 */
public class QueryFaceUserBatchRequest extends Request {
    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("UserIdList")
    @Validation(required = true)
    private java.util.List < String > userIdList;

    private QueryFaceUserBatchRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.userIdList = builder.userIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceUserBatchRequest create() {
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
     * @return userIdList
     */
    public java.util.List < String > getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<QueryFaceUserBatchRequest, Builder> {
        private String isolationId; 
        private java.util.List < String > userIdList; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceUserBatchRequest request) {
            super(request);
            this.isolationId = request.isolationId;
            this.userIdList = request.userIdList;
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
         * UserIdList.
         */
        public Builder userIdList(java.util.List < String > userIdList) {
            this.putQueryParameter("UserIdList", userIdList);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public QueryFaceUserBatchRequest build() {
            return new QueryFaceUserBatchRequest(this);
        } 

    } 

}
