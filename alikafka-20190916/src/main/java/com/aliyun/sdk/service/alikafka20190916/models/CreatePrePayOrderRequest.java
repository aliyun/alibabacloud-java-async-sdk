// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrePayOrderRequest} extends {@link RequestModel}
 *
 * <p>CreatePrePayOrderRequest</p>
 */
public class CreatePrePayOrderRequest extends Request {
    @Query
    @NameInMap("DeployType")
    @Validation(required = true)
    private Integer deployType;

    @Query
    @NameInMap("DiskSize")
    @Validation(required = true)
    private Integer diskSize;

    @Query
    @NameInMap("DiskType")
    @Validation(required = true)
    private String diskType;

    @Query
    @NameInMap("EipMax")
    private Integer eipMax;

    @Query
    @NameInMap("IoMax")
    private Integer ioMax;

    @Query
    @NameInMap("IoMaxSpec")
    private String ioMaxSpec;

    @Query
    @NameInMap("PartitionNum")
    private Integer partitionNum;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SpecType")
    private String specType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TopicQuota")
    private Integer topicQuota;

    private CreatePrePayOrderRequest(Builder builder) {
        super(builder);
        this.deployType = builder.deployType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.eipMax = builder.eipMax;
        this.ioMax = builder.ioMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.partitionNum = builder.partitionNum;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.specType = builder.specType;
        this.tag = builder.tag;
        this.topicQuota = builder.topicQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrePayOrderRequest create() {
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
     * @return ioMax
     */
    public Integer getIoMax() {
        return this.ioMax;
    }

    /**
     * @return ioMaxSpec
     */
    public String getIoMaxSpec() {
        return this.ioMaxSpec;
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
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return topicQuota
     */
    public Integer getTopicQuota() {
        return this.topicQuota;
    }

    public static final class Builder extends Request.Builder<CreatePrePayOrderRequest, Builder> {
        private Integer deployType; 
        private Integer diskSize; 
        private String diskType; 
        private Integer eipMax; 
        private Integer ioMax; 
        private String ioMaxSpec; 
        private Integer partitionNum; 
        private String regionId; 
        private String resourceGroupId; 
        private String specType; 
        private java.util.List < Tag> tag; 
        private Integer topicQuota; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrePayOrderRequest request) {
            super(request);
            this.deployType = request.deployType;
            this.diskSize = request.diskSize;
            this.diskType = request.diskType;
            this.eipMax = request.eipMax;
            this.ioMax = request.ioMax;
            this.ioMaxSpec = request.ioMaxSpec;
            this.partitionNum = request.partitionNum;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.specType = request.specType;
            this.tag = request.tag;
            this.topicQuota = request.topicQuota;
        } 

        /**
         * The deployment mode of the instance. Valid values:
         * <p>
         * 
         * *   **4**: deploys the instance that allows access from the Internet and a VPC.
         * *   **5**: deploys the instance that allows access only from a VPC.
         */
        public Builder deployType(Integer deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * The disk size. Unit: GB.
         * <p>
         * 
         * For more information about the valid values, see [Billing](~~84737~~).
         */
        public Builder diskSize(Integer diskSize) {
            this.putQueryParameter("DiskSize", diskSize);
            this.diskSize = diskSize;
            return this;
        }

        /**
         * The disk type. Valid values:
         * <p>
         * 
         * *   **0**: ultra disk
         * *   **1**: standard SSD
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * The Internet traffic for the instance.
         * <p>
         * 
         * *   This parameter is required if the **DeployType** parameter is set to **4**.
         * *   For more information about the valid values, see [Pay-as-you-go](~~72142~~).
         */
        public Builder eipMax(Integer eipMax) {
            this.putQueryParameter("EipMax", eipMax);
            this.eipMax = eipMax;
            return this;
        }

        /**
         * The maximum traffic for the instance. We recommend that you do not configure this parameter.
         * <p>
         * 
         * *   You must configure at least one of the **IoMax** and **IoMaxSpec** parameters. If both parameters are configured, the value of the **IoMaxSpec** parameter takes effect. We recommend that you configure only the **IoMaxSpec** parameter.
         * *   For more information about the valid values, see [Billing](~~84737~~).
         */
        public Builder ioMax(Integer ioMax) {
            this.putQueryParameter("IoMax", ioMax);
            this.ioMax = ioMax;
            return this;
        }

        /**
         * The traffic specification of the instance. We recommend that you configure this parameter.
         * <p>
         * 
         * *   You must configure at least one of the **IoMax** and **IoMaxSpec** parameters. If both parameters are configured, the value of the **IoMaxSpec** parameter takes effect. We recommend that you configure only the **IoMaxSpec** parameter.
         * *   For more information about the valid values, see [Billing](~~84737~~).
         */
        public Builder ioMaxSpec(String ioMaxSpec) {
            this.putQueryParameter("IoMaxSpec", ioMaxSpec);
            this.ioMaxSpec = ioMaxSpec;
            return this;
        }

        /**
         * The number of partitions. We recommend that you configure this parameter.
         * <p>
         * 
         * *   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.
         * *   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.
         * *   For more information about the valid values, see [Billing](~~84737~~).
         */
        public Builder partitionNum(Integer partitionNum) {
            this.putQueryParameter("PartitionNum", partitionNum);
            this.partitionNum = partitionNum;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         * <p>
         * 
         * If this parameter is left empty, the default resource group is used. You can view the resource group ID on the Resource Group page in the Resource Management console.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The edition of the instance. Valid values:
         * <p>
         * 
         * *   **normal**: Standard Edition (High Write)
         * *   **professional**: Professional Edition (High Write)
         * *   **professionalForHighRead**: Professional Edition (High Read)
         * 
         * For more information, see [Billing](~~84737~~).
         */
        public Builder specType(String specType) {
            this.putQueryParameter("SpecType", specType);
            this.specType = specType;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The number of topics. We recommend that you do not configure this parameter.
         * <p>
         * 
         * *   You must specify at least one of the PartitionNum and TopicQuota parameters. We recommend that you configure only the PartitionNum parameter.
         * *   If you specify both parameters, the topic-based sales model is used to check whether the PartitionNum value and the TopicQuota value are the same. If they are not the same, a failure response is returned. If they are the same, the order is placed based on the PartitionNum value.
         * *   The default value of the TopicQuota parameter varies based on the value of the IoMaxSpec parameter. If the number of topics that you consume exceeds the default value, you are charged additional fees.
         * *   For more information about the valid values, see [Billing](~~84737~~).
         */
        public Builder topicQuota(Integer topicQuota) {
            this.putQueryParameter("TopicQuota", topicQuota);
            this.topicQuota = topicQuota;
            return this;
        }

        @Override
        public CreatePrePayOrderRequest build() {
            return new CreatePrePayOrderRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
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
             * The key of tag N.
             * <p>
             * 
             * *   Valid values of N: 1 to 20.
             * *   If this parameter is left empty, the keys of all tags are matched.
             * *   The tag key can be up to 128 characters in length and cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N.
             * <p>
             * 
             * *   Valid values of N: 1 to 20.
             * *   This parameter can be left empty.
             * *   The tag value can be 1 to 128 characters in length and cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)
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
