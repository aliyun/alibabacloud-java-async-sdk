// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradePrePayOrderRequest} extends {@link RequestModel}
 *
 * <p>UpgradePrePayOrderRequest</p>
 */
public class UpgradePrePayOrderRequest extends Request {
    @Query
    @NameInMap("DiskSize")
    @Validation(required = true)
    private Integer diskSize;

    @Query
    @NameInMap("EipMax")
    private Integer eipMax;

    @Query
    @NameInMap("EipModel")
    private Boolean eipModel;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

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

    private UpgradePrePayOrderRequest(Builder builder) {
        super(builder);
        this.diskSize = builder.diskSize;
        this.eipMax = builder.eipMax;
        this.eipModel = builder.eipModel;
        this.instanceId = builder.instanceId;
        this.ioMax = builder.ioMax;
        this.ioMaxSpec = builder.ioMaxSpec;
        this.regionId = builder.regionId;
        this.specType = builder.specType;
        this.topicQuota = builder.topicQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradePrePayOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskSize
     */
    public Integer getDiskSize() {
        return this.diskSize;
    }

    /**
     * @return eipMax
     */
    public Integer getEipMax() {
        return this.eipMax;
    }

    /**
     * @return eipModel
     */
    public Boolean getEipModel() {
        return this.eipModel;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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

    public static final class Builder extends Request.Builder<UpgradePrePayOrderRequest, Builder> {
        private Integer diskSize; 
        private Integer eipMax; 
        private Boolean eipModel; 
        private String instanceId; 
        private Integer ioMax; 
        private String ioMaxSpec; 
        private String regionId; 
        private String specType; 
        private Integer topicQuota; 

        private Builder() {
            super();
        } 

        private Builder(UpgradePrePayOrderRequest response) {
            super(response);
            this.diskSize = response.diskSize;
            this.eipMax = response.eipMax;
            this.eipModel = response.eipModel;
            this.instanceId = response.instanceId;
            this.ioMax = response.ioMax;
            this.ioMaxSpec = response.ioMaxSpec;
            this.regionId = response.regionId;
            this.specType = response.specType;
            this.topicQuota = response.topicQuota;
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
         * EipMax.
         */
        public Builder eipMax(Integer eipMax) {
            this.putQueryParameter("EipMax", eipMax);
            this.eipMax = eipMax;
            return this;
        }

        /**
         * EipModel.
         */
        public Builder eipModel(Boolean eipModel) {
            this.putQueryParameter("EipModel", eipModel);
            this.eipModel = eipModel;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public UpgradePrePayOrderRequest build() {
            return new UpgradePrePayOrderRequest(this);
        } 

    } 

}
