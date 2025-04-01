// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link UpdateSupplierInformationRequest} extends {@link RequestModel}
 *
 * <p>UpdateSupplierInformationRequest</p>
 */
public class UpdateSupplierInformationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliverySettings")
    private DeliverySettings deliverySettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationIp")
    private String operationIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationMfaPresent")
    private Boolean operationMfaPresent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierDesc")
    private String supplierDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierLogo")
    private String supplierLogo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupplierUrl")
    private String supplierUrl;

    private UpdateSupplierInformationRequest(Builder builder) {
        super(builder);
        this.deliverySettings = builder.deliverySettings;
        this.operationIp = builder.operationIp;
        this.operationMfaPresent = builder.operationMfaPresent;
        this.regionId = builder.regionId;
        this.supplierDesc = builder.supplierDesc;
        this.supplierLogo = builder.supplierLogo;
        this.supplierUrl = builder.supplierUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSupplierInformationRequest create() {
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
     * @return operationIp
     */
    public String getOperationIp() {
        return this.operationIp;
    }

    /**
     * @return operationMfaPresent
     */
    public Boolean getOperationMfaPresent() {
        return this.operationMfaPresent;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return supplierDesc
     */
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    /**
     * @return supplierLogo
     */
    public String getSupplierLogo() {
        return this.supplierLogo;
    }

    /**
     * @return supplierUrl
     */
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public static final class Builder extends Request.Builder<UpdateSupplierInformationRequest, Builder> {
        private DeliverySettings deliverySettings; 
        private String operationIp; 
        private Boolean operationMfaPresent; 
        private String regionId; 
        private String supplierDesc; 
        private String supplierLogo; 
        private String supplierUrl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSupplierInformationRequest request) {
            super(request);
            this.deliverySettings = request.deliverySettings;
            this.operationIp = request.operationIp;
            this.operationMfaPresent = request.operationMfaPresent;
            this.regionId = request.regionId;
            this.supplierDesc = request.supplierDesc;
            this.supplierLogo = request.supplierLogo;
            this.supplierUrl = request.supplierUrl;
        } 

        /**
         * <p>The delivery settings.</p>
         */
        public Builder deliverySettings(DeliverySettings deliverySettings) {
            this.putQueryParameter("DeliverySettings", deliverySettings);
            this.deliverySettings = deliverySettings;
            return this;
        }

        /**
         * <p>The Ip of operation.</p>
         * 
         * <strong>example:</strong>
         * <p>192.xxx.xxx.xxx/16,192.xxx.xxx.xxx</p>
         */
        public Builder operationIp(String operationIp) {
            this.putQueryParameter("OperationIp", operationIp);
            this.operationIp = operationIp;
            return this;
        }

        /**
         * <p>The MFA of operation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder operationMfaPresent(Boolean operationMfaPresent) {
            this.putQueryParameter("OperationMfaPresent", operationMfaPresent);
            this.operationMfaPresent = operationMfaPresent;
            return this;
        }

        /**
         * <p>Region ID.</p>
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
         * <p>The description of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Test supplier</p>
         */
        public Builder supplierDesc(String supplierDesc) {
            this.putQueryParameter("SupplierDesc", supplierDesc);
            this.supplierDesc = supplierDesc;
            return this;
        }

        /**
         * <p>The Logo of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.aliyundoc.com/cover/34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/34DB-4F4C-9373-003AA060****.png</a></p>
         */
        public Builder supplierLogo(String supplierLogo) {
            this.putQueryParameter("SupplierLogo", supplierLogo);
            this.supplierLogo = supplierLogo;
            return this;
        }

        /**
         * <p>The URL of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.xxx.xxx.cn">http://www.xxx.xxx.cn</a></p>
         */
        public Builder supplierUrl(String supplierUrl) {
            this.putQueryParameter("SupplierUrl", supplierUrl);
            this.supplierUrl = supplierUrl;
            return this;
        }

        @Override
        public UpdateSupplierInformationRequest build() {
            return new UpdateSupplierInformationRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateSupplierInformationRequest} extends {@link TeaModel}
     *
     * <p>UpdateSupplierInformationRequest</p>
     */
    public static class DeliverySettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssEnabled")
        private Boolean ossEnabled;

        @com.aliyun.core.annotation.NameInMap("OssExpirationDays")
        private Long ossExpirationDays;

        @com.aliyun.core.annotation.NameInMap("OssPath")
        private String ossPath;

        private DeliverySettings(Builder builder) {
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
            private String ossBucketName; 
            private Boolean ossEnabled; 
            private Long ossExpirationDays; 
            private String ossPath; 

            private Builder() {
            } 

            private Builder(DeliverySettings model) {
                this.ossBucketName = model.ossBucketName;
                this.ossEnabled = model.ossEnabled;
                this.ossExpirationDays = model.ossExpirationDays;
                this.ossPath = model.ossPath;
            } 

            /**
             * <p>The name of the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>mybucket</p>
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
             * <p>false</p>
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
             * <p>path1/path2/</p>
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
