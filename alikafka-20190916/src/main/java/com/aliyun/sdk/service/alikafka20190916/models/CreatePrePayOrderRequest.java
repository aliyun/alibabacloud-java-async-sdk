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
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SpecType")
    private String specType;

    @Query
    @NameInMap("TopicQuota")
    @Validation(required = true)
    private Integer topicQuota;

    private CreatePrePayOrderRequest(Builder builder) {
        super(builder);
        this.deployType = builder.deployType;
        this.diskSize = builder.diskSize;
        this.diskType = builder.diskType;
        this.eipMax = builder.eipMax;
        this.ioMax = builder.ioMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.regionId = builder.regionId;
        this.specType = builder.specType;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return specType
     */
    public String getSpecType() {
        return this.specType;
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
        private String regionId; 
        private String specType; 
        private Integer topicQuota; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrePayOrderRequest response) {
            super(response);
            this.deployType = response.deployType;
            this.diskSize = response.diskSize;
            this.diskType = response.diskType;
            this.eipMax = response.eipMax;
            this.ioMax = response.ioMax;
            this.ioMaxSpec = response.ioMaxSpec;
            this.regionId = response.regionId;
            this.specType = response.specType;
            this.topicQuota = response.topicQuota;
        } 

        /**
         * DeployType.
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
         * IoMax.
         */
        public Builder ioMax(Integer ioMax) {
            this.putQueryParameter("IoMax", ioMax);
            this.ioMax = ioMax;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * TopicQuota.
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

}
