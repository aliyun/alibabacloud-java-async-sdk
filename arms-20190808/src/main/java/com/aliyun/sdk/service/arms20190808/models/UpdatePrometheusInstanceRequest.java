// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrometheusInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusInstanceRequest</p>
 */
public class UpdatePrometheusInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchiveDuration")
    private Integer archiveDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageDuration")
    private Integer storageDuration;

    private UpdatePrometheusInstanceRequest(Builder builder) {
        super(builder);
        this.archiveDuration = builder.archiveDuration;
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.storageDuration = builder.storageDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return archiveDuration
     */
    public Integer getArchiveDuration() {
        return this.archiveDuration;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return storageDuration
     */
    public Integer getStorageDuration() {
        return this.storageDuration;
    }

    public static final class Builder extends Request.Builder<UpdatePrometheusInstanceRequest, Builder> {
        private Integer archiveDuration; 
        private String clusterId; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer storageDuration; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusInstanceRequest request) {
            super(request);
            this.archiveDuration = request.archiveDuration;
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.storageDuration = request.storageDuration;
        } 

        /**
         * The number of days for automatic archiving after storage expiration (optional values: 60, 90, 180, 365). 0 means not archive.
         */
        public Builder archiveDuration(Integer archiveDuration) {
            this.putQueryParameter("ArchiveDuration", archiveDuration);
            this.archiveDuration = archiveDuration;
            return this;
        }

        /**
         * The ID of the Prometheus instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Storage duration (days).
         */
        public Builder storageDuration(Integer storageDuration) {
            this.putQueryParameter("StorageDuration", storageDuration);
            this.storageDuration = storageDuration;
            return this;
        }

        @Override
        public UpdatePrometheusInstanceRequest build() {
            return new UpdatePrometheusInstanceRequest(this);
        } 

    } 

}
