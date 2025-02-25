// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link CreatePostPayInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreatePostPayInstanceRequest</p>
 */
public class CreatePostPayInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeployType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer deployType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskSize")
    private Integer diskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipMax")
    private Integer eipMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoMaxSpec")
    private String ioMaxSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaidType")
    private Integer paidType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionNum")
    private Integer partitionNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpecType")
    private String specType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreatePostPayInstanceRequest(Builder builder) {
        super(builder);
        this.deployType = builder.deployType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.eipMax = builder.eipMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.paidType = builder.paidType;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverlessConfig = builder.serverlessConfig;
        this.specType = builder.specType;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePostPayInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deployType
     */
    public Integer getDeployType() {
        return this.deployType;
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return eipMax
     */
    public Integer getEipMax() {
        return this.eipMax;
    }

    /**
     * @return ioMaxSpec
     */
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
    }

    /**
     * @return paidType
     */
    public Integer getPaidType() {
        return this.paidType;
    }

    /**
     * @return partitionNum
     */
    public Integer getPartitionNum() {
        return this.partitionNum;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serverlessConfig
     */
    public ServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreatePostPayInstanceRequest, Builder> {
        private Integer deployType; 
        private Integer diskSize; 
        private String diskType; 
        private Integer eipMax; 
        private String ioMaxSpec; 
        private Integer paidType; 
        private Integer partitionNum; 
        private String regionId; 
        private String resourceGroupId; 
        private ServerlessConfig serverlessConfig; 
        private String specType; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreatePostPayInstanceRequest request) {
            super(request);
            this.deployType = request.deployType;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.eipMax = request.eipMax;
            this.ioMaxSpec = request.ioMaxSpec;
            this.paidType = request.paidType;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.serverlessConfig = request.serverlessConfig;
            this.specType = request.specType;
            this.tag = request.tag;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder deployType(Integer deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * DiskSize.
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * DiskType.
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * EipMax.
         */
        public Builder eipMax(Integer eipMax) {
            this.putQueryParameter("EipMax", eipMax);
            this.eipMax = eipMax;
            return this;
        }

        /**
         * IoMaxSpec.
         */
        public Builder ioMaxSpec(String ioMaxSpec) {
            this.putQueryParameter("IoMaxSpec", ioMaxSpec);
            this.ioMaxSpec = ioMaxSpec;
            return this;
        }

        /**
         * PaidType.
         */
        public Builder paidType(Integer paidType) {
            this.putQueryParameter("PaidType", paidType);
            this.paidType = paidType;
            return this;
        }

        /**
         * PartitionNum.
         */
        public Builder partitionNum(Integer partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ServerlessConfig.
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * SpecType.
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreatePostPayInstanceRequest build() {
            return new CreatePostPayInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePostPayInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreatePostPayInstanceRequest</p>
     */
    public static class ServerlessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReservedPublishCapacity")
        private Long reservedPublishCapacity;

        @com.aliyun.core.annotation.NameInMap("ReservedSubscribeCapacity")
        private Long reservedSubscribeCapacity;

        private ServerlessConfig(Builder builder) {
            this.reservedPublishCapacity = builder.reservedPublishCapacity;
            this.reservedSubscribeCapacity = builder.reservedSubscribeCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfig create() {
            return builder().build();
        }

        /**
         * @return reservedPublishCapacity
         */
        public Long getReservedPublishCapacity() {
            return this.reservedPublishCapacity;
        }

        /**
         * @return reservedSubscribeCapacity
         */
        public Long getReservedSubscribeCapacity() {
            return this.reservedSubscribeCapacity;
        }

        public static final class Builder {
            private Long reservedPublishCapacity; 
            private Long reservedSubscribeCapacity; 

            /**
             * ReservedPublishCapacity.
             */
            public Builder reservedPublishCapacity(Long reservedPublishCapacity) {
                this.reservedPublishCapacity = reservedPublishCapacity;
                return this;
            }

            /**
             * ReservedSubscribeCapacity.
             */
            public Builder reservedSubscribeCapacity(Long reservedSubscribeCapacity) {
                this.reservedSubscribeCapacity = reservedSubscribeCapacity;
                return this;
            }

            public ServerlessConfig build() {
                return new ServerlessConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePostPayInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreatePostPayInstanceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
