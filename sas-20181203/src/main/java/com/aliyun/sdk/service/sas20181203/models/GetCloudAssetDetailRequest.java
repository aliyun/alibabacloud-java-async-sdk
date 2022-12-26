// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAssetDetailRequest</p>
 */
public class GetCloudAssetDetailRequest extends Request {
    @Query
    @NameInMap("AssetSubType")
    private Integer assetSubType;

    @Query
    @NameInMap("AssetType")
    private Integer assetType;

    @Query
    @NameInMap("CloudAssetInstances")
    private java.util.List < CloudAssetInstances> cloudAssetInstances;

    @Query
    @NameInMap("Vendor")
    private Integer vendor;

    private GetCloudAssetDetailRequest(Builder builder) {
        super(builder);
        this.assetSubType = builder.assetSubType;
        this.assetType = builder.assetType;
        this.cloudAssetInstances = builder.cloudAssetInstances;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAssetDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetSubType
     */
    public Integer getAssetSubType() {
        return this.assetSubType;
    }

    /**
     * @return assetType
     */
    public Integer getAssetType() {
        return this.assetType;
    }

    /**
     * @return cloudAssetInstances
     */
    public java.util.List < CloudAssetInstances> getCloudAssetInstances() {
        return this.cloudAssetInstances;
    }

    /**
     * @return vendor
     */
    public Integer getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<GetCloudAssetDetailRequest, Builder> {
        private Integer assetSubType; 
        private Integer assetType; 
        private java.util.List < CloudAssetInstances> cloudAssetInstances; 
        private Integer vendor; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAssetDetailRequest request) {
            super(request);
            this.assetSubType = request.assetSubType;
            this.assetType = request.assetType;
            this.cloudAssetInstances = request.cloudAssetInstances;
            this.vendor = request.vendor;
        } 

        /**
         * AssetSubType.
         */
        public Builder assetSubType(Integer assetSubType) {
            this.putQueryParameter("AssetSubType", assetSubType);
            this.assetSubType = assetSubType;
            return this;
        }

        /**
         * AssetType.
         */
        public Builder assetType(Integer assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * CloudAssetInstances.
         */
        public Builder cloudAssetInstances(java.util.List < CloudAssetInstances> cloudAssetInstances) {
            this.putQueryParameter("CloudAssetInstances", cloudAssetInstances);
            this.cloudAssetInstances = cloudAssetInstances;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(Integer vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public GetCloudAssetDetailRequest build() {
            return new GetCloudAssetDetailRequest(this);
        } 

    } 

    public static class CloudAssetInstances extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RegionId")
        private String regionId;

        private CloudAssetInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAssetInstances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public CloudAssetInstances build() {
                return new CloudAssetInstances(this);
            } 

        } 

    }
}
