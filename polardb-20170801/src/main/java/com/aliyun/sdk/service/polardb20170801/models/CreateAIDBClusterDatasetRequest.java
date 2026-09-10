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
 * {@link CreateAIDBClusterDatasetRequest} extends {@link RequestModel}
 *
 * <p>CreateAIDBClusterDatasetRequest</p>
 */
public class CreateAIDBClusterDatasetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private String datasetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportMode")
    private String importMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

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

    private CreateAIDBClusterDatasetRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetName = builder.datasetName;
        this.datasetType = builder.datasetType;
        this.importMode = builder.importMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trainMode = builder.trainMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIDBClusterDatasetRequest create() {
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
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return datasetType
     */
    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * @return importMode
     */
    public String getImportMode() {
        return this.importMode;
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

    public static final class Builder extends Request.Builder<CreateAIDBClusterDatasetRequest, Builder> {
        private String DBClusterId; 
        private String datasetName; 
        private String datasetType; 
        private String importMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trainMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIDBClusterDatasetRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetName = request.datasetName;
            this.datasetType = request.datasetType;
            this.importMode = request.importMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trainMode = request.trainMode;
        } 

        /**
         * <p>The ID of the PolarDB database cluster.</p>
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
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset01</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The type of the dataset. Valid values:</p>
         * <ul>
         * <li><p><strong>train</strong>: training set</p>
         * </li>
         * <li><p><strong>eval</strong>: evaluation set</p>
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
         * <p>The import method. Valid values:</p>
         * <ul>
         * <li><strong>LocalImport</strong>: local import</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LocalImport</p>
         */
        public Builder importMode(String importMode) {
            this.putQueryParameter("ImportMode", importMode);
            this.importMode = importMode;
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
         * <p>The training mode for the dataset. The dataset format depends on the mode. Valid values:</p>
         * <ul>
         * <li><p><strong>sft</strong>: supervised fine-tuning. For training sets only.</p>
         * </li>
         * <li><p><strong>grpo</strong>: reinforcement learning optimization. For training sets only.</p>
         * </li>
         * <li><p><strong>text</strong>: text generation. For validation sets only.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sft</p>
         */
        public Builder trainMode(String trainMode) {
            this.putQueryParameter("TrainMode", trainMode);
            this.trainMode = trainMode;
            return this;
        }

        @Override
        public CreateAIDBClusterDatasetRequest build() {
            return new CreateAIDBClusterDatasetRequest(this);
        } 

    } 

}
