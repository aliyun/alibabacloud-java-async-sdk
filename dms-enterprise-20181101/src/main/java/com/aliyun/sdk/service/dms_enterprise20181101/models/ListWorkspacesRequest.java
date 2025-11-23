// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListWorkspacesRequest} extends {@link RequestModel}
 *
 * <p>ListWorkspacesRequest</p>
 */
public class ListWorkspacesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlreadyJoined")
    private Boolean alreadyJoined;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceAccountId")
    private Long serviceAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private ListWorkspacesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alreadyJoined = builder.alreadyJoined;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.searchKey = builder.searchKey;
        this.serviceAccountId = builder.serviceAccountId;
        this.vpcId = builder.vpcId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkspacesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return alreadyJoined
     */
    public Boolean getAlreadyJoined() {
        return this.alreadyJoined;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return serviceAccountId
     */
    public Long getServiceAccountId() {
        return this.serviceAccountId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListWorkspacesRequest, Builder> {
        private String regionId; 
        private Boolean alreadyJoined; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String region; 
        private String searchKey; 
        private Long serviceAccountId; 
        private String vpcId; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkspacesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alreadyJoined = request.alreadyJoined;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.region = request.region;
            this.searchKey = request.searchKey;
            this.serviceAccountId = request.serviceAccountId;
            this.vpcId = request.vpcId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether the current user has joined the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alreadyJoined(Boolean alreadyJoined) {
            this.putQueryParameter("AlreadyJoined", alreadyJoined);
            this.alreadyJoined = alreadyJoined;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>The region in which the bucket is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The search keyword. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>poc_test</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The service account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder serviceAccountId(Long serviceAccountId) {
            this.putQueryParameter("ServiceAccountId", serviceAccountId);
            this.serviceAccountId = serviceAccountId;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * <blockquote>
         * <p>This parameter cannot be used as a filter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp10wnlcmor****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListWorkspacesRequest build() {
            return new ListWorkspacesRequest(this);
        } 

    } 

}
