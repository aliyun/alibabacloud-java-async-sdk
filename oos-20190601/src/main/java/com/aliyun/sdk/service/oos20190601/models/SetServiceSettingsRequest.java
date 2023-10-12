// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetServiceSettingsRequest} extends {@link RequestModel}
 *
 * <p>SetServiceSettingsRequest</p>
 */
public class SetServiceSettingsRequest extends Request {
    @Query
    @NameInMap("DeliveryOssBucketName")
    private String deliveryOssBucketName;

    @Query
    @NameInMap("DeliveryOssEnabled")
    private Boolean deliveryOssEnabled;

    @Query
    @NameInMap("DeliveryOssKeyPrefix")
    private String deliveryOssKeyPrefix;

    @Query
    @NameInMap("DeliverySlsEnabled")
    private Boolean deliverySlsEnabled;

    @Query
    @NameInMap("DeliverySlsProjectName")
    private String deliverySlsProjectName;

    @Query
    @NameInMap("RdcEnterpriseId")
    private String rdcEnterpriseId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private SetServiceSettingsRequest(Builder builder) {
        super(builder);
        this.deliveryOssBucketName = builder.deliveryOssBucketName;
        this.deliveryOssEnabled = builder.deliveryOssEnabled;
        this.deliveryOssKeyPrefix = builder.deliveryOssKeyPrefix;
        this.deliverySlsEnabled = builder.deliverySlsEnabled;
        this.deliverySlsProjectName = builder.deliverySlsProjectName;
        this.rdcEnterpriseId = builder.rdcEnterpriseId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetServiceSettingsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryOssBucketName
     */
    public String getDeliveryOssBucketName() {
        return this.deliveryOssBucketName;
    }

    /**
     * @return deliveryOssEnabled
     */
    public Boolean getDeliveryOssEnabled() {
        return this.deliveryOssEnabled;
    }

    /**
     * @return deliveryOssKeyPrefix
     */
    public String getDeliveryOssKeyPrefix() {
        return this.deliveryOssKeyPrefix;
    }

    /**
     * @return deliverySlsEnabled
     */
    public Boolean getDeliverySlsEnabled() {
        return this.deliverySlsEnabled;
    }

    /**
     * @return deliverySlsProjectName
     */
    public String getDeliverySlsProjectName() {
        return this.deliverySlsProjectName;
    }

    /**
     * @return rdcEnterpriseId
     */
    public String getRdcEnterpriseId() {
        return this.rdcEnterpriseId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetServiceSettingsRequest, Builder> {
        private String deliveryOssBucketName; 
        private Boolean deliveryOssEnabled; 
        private String deliveryOssKeyPrefix; 
        private Boolean deliverySlsEnabled; 
        private String deliverySlsProjectName; 
        private String rdcEnterpriseId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetServiceSettingsRequest request) {
            super(request);
            this.deliveryOssBucketName = request.deliveryOssBucketName;
            this.deliveryOssEnabled = request.deliveryOssEnabled;
            this.deliveryOssKeyPrefix = request.deliveryOssKeyPrefix;
            this.deliverySlsEnabled = request.deliverySlsEnabled;
            this.deliverySlsProjectName = request.deliverySlsProjectName;
            this.rdcEnterpriseId = request.rdcEnterpriseId;
            this.regionId = request.regionId;
        } 

        /**
         * The name of OSS bucket to deliver.
         */
        public Builder deliveryOssBucketName(String deliveryOssBucketName) {
            this.putQueryParameter("DeliveryOssBucketName", deliveryOssBucketName);
            this.deliveryOssBucketName = deliveryOssBucketName;
            return this;
        }

        /**
         * Whether to enable OSS delivery.
         */
        public Builder deliveryOssEnabled(Boolean deliveryOssEnabled) {
            this.putQueryParameter("DeliveryOssEnabled", deliveryOssEnabled);
            this.deliveryOssEnabled = deliveryOssEnabled;
            return this;
        }

        /**
         * The key prefix of OSS to deliver.
         */
        public Builder deliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
            this.putQueryParameter("DeliveryOssKeyPrefix", deliveryOssKeyPrefix);
            this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
            return this;
        }

        /**
         * Whether to enable SLS delivery.
         */
        public Builder deliverySlsEnabled(Boolean deliverySlsEnabled) {
            this.putQueryParameter("DeliverySlsEnabled", deliverySlsEnabled);
            this.deliverySlsEnabled = deliverySlsEnabled;
            return this;
        }

        /**
         * The name of SLS project to deliver.
         */
        public Builder deliverySlsProjectName(String deliverySlsProjectName) {
            this.putQueryParameter("DeliverySlsProjectName", deliverySlsProjectName);
            this.deliverySlsProjectName = deliverySlsProjectName;
            return this;
        }

        /**
         * The id of RDC Enterprise.
         */
        public Builder rdcEnterpriseId(String rdcEnterpriseId) {
            this.putQueryParameter("RdcEnterpriseId", rdcEnterpriseId);
            this.rdcEnterpriseId = rdcEnterpriseId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetServiceSettingsRequest build() {
            return new SetServiceSettingsRequest(this);
        } 

    } 

}
