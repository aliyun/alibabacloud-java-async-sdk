// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link UpdateUserInformationRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserInformationRequest</p>
 */
public class UpdateUserInformationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverySettings")
    private DeliverySettings deliverySettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateUserInformationRequest(Builder builder) {
        super(builder);
        this.deliverySettings = builder.deliverySettings;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserInformationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliverySettings
     */
    public DeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateUserInformationRequest, Builder> {
        private DeliverySettings deliverySettings; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserInformationRequest request) {
            super(request);
            this.deliverySettings = request.deliverySettings;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The modified delivery settings.</p>
         */
        public Builder deliverySettings(DeliverySettings deliverySettings) {
            this.putQueryParameter("DeliverySettings", deliverySettings);
            this.deliverySettings = deliverySettings;
            return this;
        }

        /**
         * <p>The region ID.</p>
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

        @Override
        public UpdateUserInformationRequest build() {
            return new UpdateUserInformationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateUserInformationRequest} extends {@link TeaModel}
     *
     * <p>UpdateUserInformationRequest</p>
     */
    public static class DeliverySettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiontrailDeliveryToOssEnabled")
        private Boolean actiontrailDeliveryToOssEnabled;

        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssEnabled")
        private Boolean ossEnabled;

        @com.aliyun.core.annotation.NameInMap("OssExpirationDays")
        private Long ossExpirationDays;

        @com.aliyun.core.annotation.NameInMap("OssPath")
        private String ossPath;

        private DeliverySettings(Builder builder) {
            this.actiontrailDeliveryToOssEnabled = builder.actiontrailDeliveryToOssEnabled;
            this.ossBucketName = builder.ossBucketName;
            this.ossEnabled = builder.ossEnabled;
            this.ossExpirationDays = builder.ossExpirationDays;
            this.ossPath = builder.ossPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliverySettings create() {
            return builder().build();
        }

        /**
         * @return actiontrailDeliveryToOssEnabled
         */
        public Boolean getActiontrailDeliveryToOssEnabled() {
            return this.actiontrailDeliveryToOssEnabled;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossEnabled
         */
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        /**
         * @return ossExpirationDays
         */
        public Long getOssExpirationDays() {
            return this.ossExpirationDays;
        }

        /**
         * @return ossPath
         */
        public String getOssPath() {
            return this.ossPath;
        }

        public static final class Builder {
            private Boolean actiontrailDeliveryToOssEnabled; 
            private String ossBucketName; 
            private Boolean ossEnabled; 
            private Long ossExpirationDays; 
            private String ossPath; 

            private Builder() {
            } 

            private Builder(DeliverySettings model) {
                this.actiontrailDeliveryToOssEnabled = model.actiontrailDeliveryToOssEnabled;
                this.ossBucketName = model.ossBucketName;
                this.ossEnabled = model.ossEnabled;
                this.ossExpirationDays = model.ossExpirationDays;
                this.ossPath = model.ossPath;
            } 

            /**
             * <p>Specifies whether to enable screencast delivery to OSS. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder actiontrailDeliveryToOssEnabled(Boolean actiontrailDeliveryToOssEnabled) {
                this.actiontrailDeliveryToOssEnabled = actiontrailDeliveryToOssEnabled;
                return this;
            }

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;mybucket&quot;</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>Specifies whether to enable screencast delivery to Object Storage Service (OSS). Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ossEnabled(Boolean ossEnabled) {
                this.ossEnabled = ossEnabled;
                return this;
            }

            /**
             * <p>The number of days for which the screencasts are saved.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder ossExpirationDays(Long ossExpirationDays) {
                this.ossExpirationDays = ossExpirationDays;
                return this;
            }

            /**
             * <p>The OSS path.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;path1/path2/&quot;</p>
             */
            public Builder ossPath(String ossPath) {
                this.ossPath = ossPath;
                return this;
            }

            public DeliverySettings build() {
                return new DeliverySettings(this);
            } 

        } 

    }
}
