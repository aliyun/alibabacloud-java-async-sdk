// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link SetServiceSettingsRequest} extends {@link RequestModel}
 *
 * <p>SetServiceSettingsRequest</p>
 */
public class SetServiceSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryOssBucketName")
    private String deliveryOssBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryOssEnabled")
    private Boolean deliveryOssEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryOssKeyPrefix")
    private String deliveryOssKeyPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverySlsEnabled")
    private Boolean deliverySlsEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverySlsProjectName")
    private String deliverySlsProjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdFolderIds")
    private java.util.List<String> rdFolderIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdcEnterpriseId")
    private String rdcEnterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceAccessRdEnabled")
    private Boolean serviceAccessRdEnabled;

    private SetServiceSettingsRequest(Builder builder) {
        super(builder);
        this.deliveryOssBucketName = builder.deliveryOssBucketName;
        this.deliveryOssEnabled = builder.deliveryOssEnabled;
        this.deliveryOssKeyPrefix = builder.deliveryOssKeyPrefix;
        this.deliverySlsEnabled = builder.deliverySlsEnabled;
        this.deliverySlsProjectName = builder.deliverySlsProjectName;
        this.rdFolderIds = builder.rdFolderIds;
        this.rdcEnterpriseId = builder.rdcEnterpriseId;
        this.regionId = builder.regionId;
        this.serviceAccessRdEnabled = builder.serviceAccessRdEnabled;
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
     * @return rdFolderIds
     */
    public java.util.List<String> getRdFolderIds() {
        return this.rdFolderIds;
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

    /**
     * @return serviceAccessRdEnabled
     */
    public Boolean getServiceAccessRdEnabled() {
        return this.serviceAccessRdEnabled;
    }

    public static final class Builder extends Request.Builder<SetServiceSettingsRequest, Builder> {
        private String deliveryOssBucketName; 
        private Boolean deliveryOssEnabled; 
        private String deliveryOssKeyPrefix; 
        private Boolean deliverySlsEnabled; 
        private String deliverySlsProjectName; 
        private java.util.List<String> rdFolderIds; 
        private String rdcEnterpriseId; 
        private String regionId; 
        private Boolean serviceAccessRdEnabled; 

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
            this.rdFolderIds = request.rdFolderIds;
            this.rdcEnterpriseId = request.rdcEnterpriseId;
            this.regionId = request.regionId;
            this.serviceAccessRdEnabled = request.serviceAccessRdEnabled;
        } 

        /**
         * <p>The name of OSS bucket to deliver.</p>
         * 
         * <strong>example:</strong>
         * <p>OssBucketName</p>
         */
        public Builder deliveryOssBucketName(String deliveryOssBucketName) {
            this.putQueryParameter("DeliveryOssBucketName", deliveryOssBucketName);
            this.deliveryOssBucketName = deliveryOssBucketName;
            return this;
        }

        /**
         * <p>Whether to enable OSS delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deliveryOssEnabled(Boolean deliveryOssEnabled) {
            this.putQueryParameter("DeliveryOssEnabled", deliveryOssEnabled);
            this.deliveryOssEnabled = deliveryOssEnabled;
            return this;
        }

        /**
         * <p>The key prefix of OSS to deliver.</p>
         * 
         * <strong>example:</strong>
         * <p>oos/execution</p>
         */
        public Builder deliveryOssKeyPrefix(String deliveryOssKeyPrefix) {
            this.putQueryParameter("DeliveryOssKeyPrefix", deliveryOssKeyPrefix);
            this.deliveryOssKeyPrefix = deliveryOssKeyPrefix;
            return this;
        }

        /**
         * <p>Whether to enable SLS delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deliverySlsEnabled(Boolean deliverySlsEnabled) {
            this.putQueryParameter("DeliverySlsEnabled", deliverySlsEnabled);
            this.deliverySlsEnabled = deliverySlsEnabled;
            return this;
        }

        /**
         * <p>The name of SLS project to deliver.</p>
         * 
         * <strong>example:</strong>
         * <p>SlsProjectName</p>
         */
        public Builder deliverySlsProjectName(String deliverySlsProjectName) {
            this.putQueryParameter("DeliverySlsProjectName", deliverySlsProjectName);
            this.deliverySlsProjectName = deliverySlsProjectName;
            return this;
        }

        /**
         * RdFolderIds.
         */
        public Builder rdFolderIds(java.util.List<String> rdFolderIds) {
            String rdFolderIdsShrink = shrink(rdFolderIds, "RdFolderIds", "json");
            this.putQueryParameter("RdFolderIds", rdFolderIdsShrink);
            this.rdFolderIds = rdFolderIds;
            return this;
        }

        /**
         * <p>The id of RDC Enterprise.</p>
         * 
         * <strong>example:</strong>
         * <p>RdcEnterpriseId</p>
         */
        public Builder rdcEnterpriseId(String rdcEnterpriseId) {
            this.putQueryParameter("RdcEnterpriseId", rdcEnterpriseId);
            this.rdcEnterpriseId = rdcEnterpriseId;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * ServiceAccessRdEnabled.
         */
        public Builder serviceAccessRdEnabled(Boolean serviceAccessRdEnabled) {
            this.putQueryParameter("ServiceAccessRdEnabled", serviceAccessRdEnabled);
            this.serviceAccessRdEnabled = serviceAccessRdEnabled;
            return this;
        }

        @Override
        public SetServiceSettingsRequest build() {
            return new SetServiceSettingsRequest(this);
        } 

    } 

}
