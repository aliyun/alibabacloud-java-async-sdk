// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryFaceAllUserIdsByGroupIdRequest} extends {@link RequestModel}
 *
 * <p>QueryFaceAllUserIdsByGroupIdRequest</p>
 */
public class QueryFaceAllUserIdsByGroupIdRequest extends Request {
    @Query
    @NameInMap("IsolationId")
    @Validation(required = true)
    private String isolationId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("UserGroupId")
    @Validation(required = true)
    private String userGroupId;

    private QueryFaceAllUserIdsByGroupIdRequest(Builder builder) {
        super(builder);
        this.isolationId = builder.isolationId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaceAllUserIdsByGroupIdRequest create() {
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
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<QueryFaceAllUserIdsByGroupIdRequest, Builder> {
        private String isolationId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryFaceAllUserIdsByGroupIdRequest request) {
            super(request);
            this.isolationId = request.isolationId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.userGroupId = request.userGroupId;
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
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public QueryFaceAllUserIdsByGroupIdRequest build() {
            return new QueryFaceAllUserIdsByGroupIdRequest(this);
        } 

    } 

}
