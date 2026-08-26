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
 * {@link CreateKnowledgeSpaceRequest} extends {@link RequestModel}
 *
 * <p>CreateKnowledgeSpaceRequest</p>
 */
public class CreateKnowledgeSpaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingDimension")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer embeddingDimension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EmbeddingModel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String embeddingModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnforceAcl")
    private Boolean enforceAcl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LLMModel")
    private String LLMModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSAccessKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSAccessKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSBucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSBucket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OSSSecretKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String OSSSecretKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RerankModel")
    private String rerankModel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardingSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shardingSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardingStrategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shardingStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateKnowledgeSpaceRequest(Builder builder) {
        super(builder);
        this.DBType = builder.DBType;
        this.description = builder.description;
        this.embeddingDimension = builder.embeddingDimension;
        this.embeddingModel = builder.embeddingModel;
        this.enforceAcl = builder.enforceAcl;
        this.LLMModel = builder.LLMModel;
        this.name = builder.name;
        this.OSSAccessKey = builder.OSSAccessKey;
        this.OSSBucket = builder.OSSBucket;
        this.OSSSecretKey = builder.OSSSecretKey;
        this.regionId = builder.regionId;
        this.rerankModel = builder.rerankModel;
        this.securityGroupId = builder.securityGroupId;
        this.shardingSize = builder.shardingSize;
        this.shardingStrategy = builder.shardingStrategy;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeSpaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return embeddingDimension
     */
    public Integer getEmbeddingDimension() {
        return this.embeddingDimension;
    }

    /**
     * @return embeddingModel
     */
    public String getEmbeddingModel() {
        return this.embeddingModel;
    }

    /**
     * @return enforceAcl
     */
    public Boolean getEnforceAcl() {
        return this.enforceAcl;
    }

    /**
     * @return LLMModel
     */
    public String getLLMModel() {
        return this.LLMModel;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return OSSAccessKey
     */
    public String getOSSAccessKey() {
        return this.OSSAccessKey;
    }

    /**
     * @return OSSBucket
     */
    public String getOSSBucket() {
        return this.OSSBucket;
    }

    /**
     * @return OSSSecretKey
     */
    public String getOSSSecretKey() {
        return this.OSSSecretKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rerankModel
     */
    public String getRerankModel() {
        return this.rerankModel;
    }

    /**
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    /**
     * @return shardingSize
     */
    public Integer getShardingSize() {
        return this.shardingSize;
    }

    /**
     * @return shardingStrategy
     */
    public String getShardingStrategy() {
        return this.shardingStrategy;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateKnowledgeSpaceRequest, Builder> {
        private String DBType; 
        private String description; 
        private Integer embeddingDimension; 
        private String embeddingModel; 
        private Boolean enforceAcl; 
        private String LLMModel; 
        private String name; 
        private String OSSAccessKey; 
        private String OSSBucket; 
        private String OSSSecretKey; 
        private String regionId; 
        private String rerankModel; 
        private String securityGroupId; 
        private Integer shardingSize; 
        private String shardingStrategy; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateKnowledgeSpaceRequest request) {
            super(request);
            this.DBType = request.DBType;
            this.description = request.description;
            this.embeddingDimension = request.embeddingDimension;
            this.embeddingModel = request.embeddingModel;
            this.enforceAcl = request.enforceAcl;
            this.LLMModel = request.LLMModel;
            this.name = request.name;
            this.OSSAccessKey = request.OSSAccessKey;
            this.OSSBucket = request.OSSBucket;
            this.OSSSecretKey = request.OSSSecretKey;
            this.regionId = request.regionId;
            this.rerankModel = request.rerankModel;
            this.securityGroupId = request.securityGroupId;
            this.shardingSize = request.shardingSize;
            this.shardingStrategy = request.shardingStrategy;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1536</p>
         */
        public Builder embeddingDimension(Integer embeddingDimension) {
            this.putQueryParameter("EmbeddingDimension", embeddingDimension);
            this.embeddingDimension = embeddingDimension;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text-embedding-v4</p>
         */
        public Builder embeddingModel(String embeddingModel) {
            this.putQueryParameter("EmbeddingModel", embeddingModel);
            this.embeddingModel = embeddingModel;
            return this;
        }

        /**
         * EnforceAcl.
         */
        public Builder enforceAcl(Boolean enforceAcl) {
            this.putQueryParameter("EnforceAcl", enforceAcl);
            this.enforceAcl = enforceAcl;
            return this;
        }

        /**
         * LLMModel.
         */
        public Builder LLMModel(String LLMModel) {
            this.putQueryParameter("LLMModel", LLMModel);
            this.LLMModel = LLMModel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>OSS AK</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder OSSAccessKey(String OSSAccessKey) {
            this.putQueryParameter("OSSAccessKey", OSSAccessKey);
            this.OSSAccessKey = OSSAccessKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-bucket</p>
         */
        public Builder OSSBucket(String OSSBucket) {
            this.putQueryParameter("OSSBucket", OSSBucket);
            this.OSSBucket = OSSBucket;
            return this;
        }

        /**
         * <p>OSS SK</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder OSSSecretKey(String OSSSecretKey) {
            this.putQueryParameter("OSSSecretKey", OSSSecretKey);
            this.OSSSecretKey = OSSSecretKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * RerankModel.
         */
        public Builder rerankModel(String rerankModel) {
            this.putQueryParameter("RerankModel", rerankModel);
            this.rerankModel = rerankModel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-********************</p>
         */
        public Builder securityGroupId(String securityGroupId) {
            this.putQueryParameter("SecurityGroupId", securityGroupId);
            this.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        public Builder shardingSize(Integer shardingSize) {
            this.putQueryParameter("ShardingSize", shardingSize);
            this.shardingSize = shardingSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hierarchical</p>
         */
        public Builder shardingStrategy(String shardingStrategy) {
            this.putQueryParameter("ShardingStrategy", shardingStrategy);
            this.shardingStrategy = shardingStrategy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*************</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-k</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateKnowledgeSpaceRequest build() {
            return new CreateKnowledgeSpaceRequest(this);
        } 

    } 

}
