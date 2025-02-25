// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeInstanceForIsvResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceForIsvResponseBody</p>
 */
public class DescribeInstanceForIsvResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActiveAddress")
    private String activeAddress;

    @com.aliyun.core.annotation.NameInMap("AppJson")
    private String appJson;

    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private String autoRenewal;

    @com.aliyun.core.annotation.NameInMap("BeganOn")
    private Long beganOn;

    @com.aliyun.core.annotation.NameInMap("ComponentJson")
    private String componentJson;

    @com.aliyun.core.annotation.NameInMap("CreatedOn")
    private Long createdOn;

    @com.aliyun.core.annotation.NameInMap("EndOn")
    private Long endOn;

    @com.aliyun.core.annotation.NameInMap("ExtendJson")
    private String extendJson;

    @com.aliyun.core.annotation.NameInMap("HostJson")
    private String hostJson;

    @com.aliyun.core.annotation.NameInMap("ImageJson")
    private String imageJson;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.NameInMap("IsTrial")
    private Boolean isTrial;

    @com.aliyun.core.annotation.NameInMap("LicenseCode")
    private String licenseCode;

    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("ProductName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("ProductSkuCode")
    private String productSkuCode;

    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.NameInMap("RelationalData")
    private RelationalData relationalData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupplierName")
    private String supplierName;

    private DescribeInstanceForIsvResponseBody(Builder builder) {
        this.activeAddress = builder.activeAddress;
        this.appJson = builder.appJson;
        this.autoRenewal = builder.autoRenewal;
        this.beganOn = builder.beganOn;
        this.componentJson = builder.componentJson;
        this.createdOn = builder.createdOn;
        this.endOn = builder.endOn;
        this.extendJson = builder.extendJson;
        this.hostJson = builder.hostJson;
        this.imageJson = builder.imageJson;
        this.instanceId = builder.instanceId;
        this.isTrial = builder.isTrial;
        this.licenseCode = builder.licenseCode;
        this.orderId = builder.orderId;
        this.productCode = builder.productCode;
        this.productName = builder.productName;
        this.productSkuCode = builder.productSkuCode;
        this.productType = builder.productType;
        this.relationalData = builder.relationalData;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.supplierName = builder.supplierName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceForIsvResponseBody create() {
        return builder().build();
    }

    /**
     * @return activeAddress
     */
    public String getActiveAddress() {
        return this.activeAddress;
    }

    /**
     * @return appJson
     */
    public String getAppJson() {
        return this.appJson;
    }

    /**
     * @return autoRenewal
     */
    public String getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return beganOn
     */
    public Long getBeganOn() {
        return this.beganOn;
    }

    /**
     * @return componentJson
     */
    public String getComponentJson() {
        return this.componentJson;
    }

    /**
     * @return createdOn
     */
    public Long getCreatedOn() {
        return this.createdOn;
    }

    /**
     * @return endOn
     */
    public Long getEndOn() {
        return this.endOn;
    }

    /**
     * @return extendJson
     */
    public String getExtendJson() {
        return this.extendJson;
    }

    /**
     * @return hostJson
     */
    public String getHostJson() {
        return this.hostJson;
    }

    /**
     * @return imageJson
     */
    public String getImageJson() {
        return this.imageJson;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isTrial
     */
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    /**
     * @return licenseCode
     */
    public String getLicenseCode() {
        return this.licenseCode;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return productSkuCode
     */
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return relationalData
     */
    public RelationalData getRelationalData() {
        return this.relationalData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supplierName
     */
    public String getSupplierName() {
        return this.supplierName;
    }

    public static final class Builder {
        private String activeAddress; 
        private String appJson; 
        private String autoRenewal; 
        private Long beganOn; 
        private String componentJson; 
        private Long createdOn; 
        private Long endOn; 
        private String extendJson; 
        private String hostJson; 
        private String imageJson; 
        private Long instanceId; 
        private Boolean isTrial; 
        private String licenseCode; 
        private Long orderId; 
        private String productCode; 
        private String productName; 
        private String productSkuCode; 
        private String productType; 
        private RelationalData relationalData; 
        private String requestId; 
        private String status; 
        private String supplierName; 

        /**
         * ActiveAddress.
         */
        public Builder activeAddress(String activeAddress) {
            this.activeAddress = activeAddress;
            return this;
        }

        /**
         * AppJson.
         */
        public Builder appJson(String appJson) {
            this.appJson = appJson;
            return this;
        }

        /**
         * AutoRenewal.
         */
        public Builder autoRenewal(String autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * BeganOn.
         */
        public Builder beganOn(Long beganOn) {
            this.beganOn = beganOn;
            return this;
        }

        /**
         * ComponentJson.
         */
        public Builder componentJson(String componentJson) {
            this.componentJson = componentJson;
            return this;
        }

        /**
         * CreatedOn.
         */
        public Builder createdOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * EndOn.
         */
        public Builder endOn(Long endOn) {
            this.endOn = endOn;
            return this;
        }

        /**
         * ExtendJson.
         */
        public Builder extendJson(String extendJson) {
            this.extendJson = extendJson;
            return this;
        }

        /**
         * HostJson.
         */
        public Builder hostJson(String hostJson) {
            this.hostJson = hostJson;
            return this;
        }

        /**
         * ImageJson.
         */
        public Builder imageJson(String imageJson) {
            this.imageJson = imageJson;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsTrial.
         */
        public Builder isTrial(Boolean isTrial) {
            this.isTrial = isTrial;
            return this;
        }

        /**
         * LicenseCode.
         */
        public Builder licenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * ProductSkuCode.
         */
        public Builder productSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * RelationalData.
         */
        public Builder relationalData(RelationalData relationalData) {
            this.relationalData = relationalData;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SupplierName.
         */
        public Builder supplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }

        public DescribeInstanceForIsvResponseBody build() {
            return new DescribeInstanceForIsvResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceForIsvResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceForIsvResponseBody</p>
     */
    public static class RelationalData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        private RelationalData(Builder builder) {
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationalData create() {
            return builder().build();
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private String serviceStatus; 

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public RelationalData build() {
                return new RelationalData(this);
            } 

        } 

    }
}
