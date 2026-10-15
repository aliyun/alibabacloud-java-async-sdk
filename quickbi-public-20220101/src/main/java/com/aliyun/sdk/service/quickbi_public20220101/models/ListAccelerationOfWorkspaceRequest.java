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
 * {@link ListAccelerationOfWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>ListAccelerationOfWorkspaceRequest</p>
 */
public class ListAccelerationOfWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeName")
    private String cubeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListAccelerationOfWorkspaceRequest(Builder builder) {
        super(builder);
        this.creatorId = builder.creatorId;
        this.cubeName = builder.cubeName;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccelerationOfWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return cubeName
     */
    public String getCubeName() {
        return this.cubeName;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListAccelerationOfWorkspaceRequest, Builder> {
        private String creatorId; 
        private String cubeName; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListAccelerationOfWorkspaceRequest request) {
            super(request);
            this.creatorId = request.creatorId;
            this.cubeName = request.cubeName;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The user ID in Quick BI, not your Alibaba Cloud account ID. You can call the QueryUserInfoByAccount operation to obtain the user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1***************139</p>
         */
        public Builder creatorId(String creatorId) {
            this.putQueryParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder cubeName(String cubeName) {
            this.putQueryParameter("CubeName", cubeName);
            this.cubeName = cubeName;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of rows per page for a paged query.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListAccelerationOfWorkspaceRequest build() {
            return new ListAccelerationOfWorkspaceRequest(this);
        } 

    } 

}
