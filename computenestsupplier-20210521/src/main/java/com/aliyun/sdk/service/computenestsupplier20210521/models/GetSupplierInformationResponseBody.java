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
 * {@link GetSupplierInformationResponseBody} extends {@link TeaModel}
 *
 * <p>GetSupplierInformationResponseBody</p>
 */
public class GetSupplierInformationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliverySettings")
    private DeliverySettings deliverySettings;

    @com.aliyun.core.annotation.NameInMap("EnableReseller")
    private Boolean enableReseller;

    @com.aliyun.core.annotation.NameInMap("OperationIp")
    private String operationIp;

    @com.aliyun.core.annotation.NameInMap("OperationMfaPresent")
    private Boolean operationMfaPresent;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupplierDesc")
    private String supplierDesc;

    @com.aliyun.core.annotation.NameInMap("SupplierLogo")
    private String supplierLogo;

    @com.aliyun.core.annotation.NameInMap("SupplierName")
    private String supplierName;

    @com.aliyun.core.annotation.NameInMap("SupplierUrl")
    private String supplierUrl;

    private GetSupplierInformationResponseBody(Builder builder) {
        this.deliverySettings = builder.deliverySettings;
        this.enableReseller = builder.enableReseller;
        this.operationIp = builder.operationIp;
        this.operationMfaPresent = builder.operationMfaPresent;
        this.requestId = builder.requestId;
        this.supplierDesc = builder.supplierDesc;
        this.supplierLogo = builder.supplierLogo;
        this.supplierName = builder.supplierName;
        this.supplierUrl = builder.supplierUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSupplierInformationResponseBody create() {
        return builder().build();
    }

    /**
     * @return deliverySettings
     */
    public DeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    /**
     * @return enableReseller
     */
    public Boolean getEnableReseller() {
        return this.enableReseller;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return supplierName
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    /**
     * @return supplierUrl
     */
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public static final class Builder {
        private DeliverySettings deliverySettings; 
        private Boolean enableReseller; 
        private String operationIp; 
        private Boolean operationMfaPresent; 
        private String requestId; 
        private String supplierDesc; 
        private String supplierLogo; 
        private String supplierName; 
        private String supplierUrl; 

        /**
         * <p>The delivery settings.</p>
         */
        public Builder deliverySettings(DeliverySettings deliverySettings) {
            this.deliverySettings = deliverySettings;
            return this;
        }

        /**
         * <p>Whether to enable reseller</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableReseller(Boolean enableReseller) {
            this.enableReseller = enableReseller;
            return this;
        }

        /**
         * <p>The Ip of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>10.xxx.xxx.xxx/101</p>
         */
        public Builder operationIp(String operationIp) {
            this.operationIp = operationIp;
            return this;
        }

        /**
         * <p>The MFA of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder operationMfaPresent(Boolean operationMfaPresent) {
            this.operationMfaPresent = operationMfaPresent;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The description of service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Test supplier</p>
         */
        public Builder supplierDesc(String supplierDesc) {
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
            this.supplierLogo = supplierLogo;
            return this;
        }

        /**
         * <p>The name of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud</p>
         */
        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        /**
         * <p>The URL of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.xxx.xxx.cn">http://www.xxx.xxx.cn</a></p>
         */
        public Builder supplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }

        public GetSupplierInformationResponseBody build() {
            return new GetSupplierInformationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSupplierInformationResponseBody} extends {@link TeaModel}
     *
     * <p>GetSupplierInformationResponseBody</p>
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
             * <p>Indicates whether screencast delivery to Object Storage Service (OSS) is enabled. Valid values:</p>
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
