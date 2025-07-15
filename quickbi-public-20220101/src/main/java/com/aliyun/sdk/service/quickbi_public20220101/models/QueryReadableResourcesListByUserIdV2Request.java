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
 * {@link QueryReadableResourcesListByUserIdV2Request} extends {@link RequestModel}
 *
 * <p>QueryReadableResourcesListByUserIdV2Request</p>
 */
public class QueryReadableResourcesListByUserIdV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkType")
    private String workType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private QueryReadableResourcesListByUserIdV2Request(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.workType = builder.workType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryReadableResourcesListByUserIdV2Request create() {
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

    /**
     * @return workType
     */
    public String getWorkType() {
        return this.workType;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryReadableResourcesListByUserIdV2Request, Builder> {
        private String userId; 
        private String workType; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryReadableResourcesListByUserIdV2Request request) {
            super(request);
            this.userId = request.userId;
            this.workType = request.workType;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asdas*********sdsddf</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * WorkType.
         */
        public Builder workType(String workType) {
            this.putQueryParameter("WorkType", workType);
            this.workType = workType;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryReadableResourcesListByUserIdV2Request build() {
            return new QueryReadableResourcesListByUserIdV2Request(this);
        } 

    } 

}
