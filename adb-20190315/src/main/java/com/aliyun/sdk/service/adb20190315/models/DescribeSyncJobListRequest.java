// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyncJobListRequest} extends {@link RequestModel}
 *
 * <p>DescribeSyncJobListRequest</p>
 */
public class DescribeSyncJobListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GetSourceDetail")
    private Boolean getSourceDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBClusterDescription")
    private String sourceDBClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBClusterId")
    private String sourceDBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBType")
    private String sourceDBType;

    private DescribeSyncJobListRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.getSourceDetail = builder.getSourceDetail;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceDBClusterDescription = builder.sourceDBClusterDescription;
        this.sourceDBClusterId = builder.sourceDBClusterId;
        this.sourceDBType = builder.sourceDBType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncJobListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return getSourceDetail
     */
    public Boolean getGetSourceDetail() {
        return this.getSourceDetail;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceDBClusterDescription
     */
    public String getSourceDBClusterDescription() {
        return this.sourceDBClusterDescription;
    }

    /**
     * @return sourceDBClusterId
     */
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
    }

    /**
     * @return sourceDBType
     */
    public String getSourceDBType() {
        return this.sourceDBType;
    }

    public static final class Builder extends Request.Builder<DescribeSyncJobListRequest, Builder> {
        private String DBClusterId; 
        private Boolean getSourceDetail; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceDBClusterDescription; 
        private String sourceDBClusterId; 
        private String sourceDBType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSyncJobListRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.getSourceDetail = request.getSourceDetail;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceDBClusterDescription = request.sourceDBClusterDescription;
            this.sourceDBClusterId = request.sourceDBClusterId;
            this.sourceDBType = request.sourceDBType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-8vb39udfi356l9psq</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * GetSourceDetail.
         */
        public Builder getSourceDetail(Boolean getSourceDetail) {
            this.putQueryParameter("GetSourceDetail", getSourceDetail);
            this.getSourceDetail = getSourceDetail;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceDBClusterDescription.
         */
        public Builder sourceDBClusterDescription(String sourceDBClusterDescription) {
            this.putQueryParameter("SourceDBClusterDescription", sourceDBClusterDescription);
            this.sourceDBClusterDescription = sourceDBClusterDescription;
            return this;
        }

        /**
         * SourceDBClusterId.
         */
        public Builder sourceDBClusterId(String sourceDBClusterId) {
            this.putQueryParameter("SourceDBClusterId", sourceDBClusterId);
            this.sourceDBClusterId = sourceDBClusterId;
            return this;
        }

        /**
         * SourceDBType.
         */
        public Builder sourceDBType(String sourceDBType) {
            this.putQueryParameter("SourceDBType", sourceDBType);
            this.sourceDBType = sourceDBType;
            return this;
        }

        @Override
        public DescribeSyncJobListRequest build() {
            return new DescribeSyncJobListRequest(this);
        } 

    } 

}
