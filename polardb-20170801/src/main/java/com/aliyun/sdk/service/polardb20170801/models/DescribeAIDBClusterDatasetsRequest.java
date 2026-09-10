// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAIDBClusterDatasetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAIDBClusterDatasetsRequest</p>
 */
public class DescribeAIDBClusterDatasetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContinuationToken")
    private String continuationToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private String datasetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrainMode")
    private String trainMode;

    private DescribeAIDBClusterDatasetsRequest(Builder builder) {
        super(builder);
        this.continuationToken = builder.continuationToken;
        this.DBClusterId = builder.DBClusterId;
        this.datasetId = builder.datasetId;
        this.datasetType = builder.datasetType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trainMode = builder.trainMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterDatasetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return continuationToken
     */
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetType
     */
    public String getDatasetType() {
        return this.datasetType;
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
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
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
     * @return trainMode
     */
    public String getTrainMode() {
        return this.trainMode;
    }

    public static final class Builder extends Request.Builder<DescribeAIDBClusterDatasetsRequest, Builder> {
        private String continuationToken; 
        private String DBClusterId; 
        private String datasetId; 
        private String datasetType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trainMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAIDBClusterDatasetsRequest request) {
            super(request);
            this.continuationToken = request.continuationToken;
            this.DBClusterId = request.DBClusterId;
            this.datasetId = request.datasetId;
            this.datasetType = request.datasetType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trainMode = request.trainMode;
        } 

        /**
         * <p>The token used to retrieve the next page of results. This value is obtained from the response of a previous request. For the first request, leave this parameter empty.</p>
         * 
         * <strong>example:</strong>
         * <p>EFSDF-DF-***</p>
         */
        public Builder continuationToken(String continuationToken) {
            this.putQueryParameter("ContinuationToken", continuationToken);
            this.continuationToken = continuationToken;
            return this;
        }

        /**
         * <p>The ID of the PolarDB cluster for AI model services.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze88***</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pds-2ze88***</p>
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The type of the dataset. Valid values:</p>
         * <ul>
         * <li><p><strong>train</strong>: The training set.</p>
         * </li>
         * <li><p><strong>eval</strong>: The evaluation set.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>train</p>
         */
        public Builder datasetType(String datasetType) {
            this.putQueryParameter("DatasetType", datasetType);
            this.datasetType = datasetType;
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
         * <p>The page number to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
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
         * <p>The training mode. Valid values:</p>
         * <ul>
         * <li><p><strong>sft</strong>: supervised fine-tuning.</p>
         * </li>
         * <li><p><strong>grpo</strong>: reinforcement learning.</p>
         * </li>
         * <li><p><strong>text</strong>: text generation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>grpo</p>
         */
        public Builder trainMode(String trainMode) {
            this.putQueryParameter("TrainMode", trainMode);
            this.trainMode = trainMode;
            return this;
        }

        @Override
        public DescribeAIDBClusterDatasetsRequest build() {
            return new DescribeAIDBClusterDatasetsRequest(this);
        } 

    } 

}
