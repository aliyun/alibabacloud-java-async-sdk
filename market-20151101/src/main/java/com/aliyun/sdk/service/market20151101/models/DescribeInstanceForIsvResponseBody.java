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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceForIsvResponseBody model) {
            this.activeAddress = model.activeAddress;
            this.appJson = model.appJson;
            this.autoRenewal = model.autoRenewal;
            this.beganOn = model.beganOn;
            this.componentJson = model.componentJson;
            this.createdOn = model.createdOn;
            this.endOn = model.endOn;
            this.extendJson = model.extendJson;
            this.hostJson = model.hostJson;
            this.imageJson = model.imageJson;
            this.instanceId = model.instanceId;
            this.isTrial = model.isTrial;
            this.licenseCode = model.licenseCode;
            this.orderId = model.orderId;
            this.productCode = model.productCode;
            this.productName = model.productName;
            this.productSkuCode = model.productSkuCode;
            this.productType = model.productType;
            this.relationalData = model.relationalData;
            this.requestId = model.requestId;
            this.status = model.status;
            this.supplierName = model.supplierName;
        } 

        /**
         * <p>The activation URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://*****.com</p>
         */
        public Builder activeAddress(String activeAddress) {
            this.activeAddress = activeAddress;
            return this;
        }

        /**
         * <p>The application information. The metric description of the parameters in the example is as follows:</p>
         * <p>username: the username.
         * passowrd: the password.
         * frontEndUrl: the frontend URL.
         * adminUrl: the administration URL.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;frontEndUrl&quot;:&quot;https://<em><em><strong>.aliyundoc.com&quot;,&quot;password&quot;:&quot;Sjtv</strong></em>&quot;,&quot;adminUrl&quot;:&quot;https://</em><em><strong>.aliyundoc.com&quot;,&quot;username&quot;:&quot;aliyun</strong></em>&quot;}</p>
         */
        public Builder appJson(String appJson) {
            this.appJson = appJson;
            return this;
        }

        /**
         * <p>The automatic payment information for epoch-based products. A non-empty value indicates that you enable auto-renewal.
         * autoRenewCycle: Day, Month, or Year.
         * autoRenewDuration: the renewal epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;autoRenewCycle&quot;:&quot;Year&quot;,&quot;autoRenewDuration&quot;:1}</p>
         */
        public Builder autoRenewal(String autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>The time when the instance was activated (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1570634021000</p>
         */
        public Builder beganOn(Long beganOn) {
            this.beganOn = beganOn;
            return this;
        }

        /**
         * <p>The business module. The metric description of the parameters in the example is as follows:</p>
         * <ul>
         * <li>package_version: the version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;package_version&quot;:&quot;yuncode000111&quot;}</p>
         */
        public Builder componentJson(String componentJson) {
            this.componentJson = componentJson;
            return this;
        }

        /**
         * <p>The creation time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1570634018000</p>
         */
        public Builder createdOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }

        /**
         * <p>The expiration time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1602259200000</p>
         */
        public Builder endOn(Long endOn) {
            this.endOn = endOn;
            return this;
        }

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;description&quot;: &quot;If you have any problems, contact us...&quot;}</p>
         */
        public Builder extendJson(String extendJson) {
            this.extendJson = extendJson;
            return this;
        }

        /**
         * <p>The host information. The metric description of the parameters in the example is as follows:</p>
         * <p>username: the username.
         * passowrd: the password.
         * ip: the host IP address.
         * innerIp: the internal network IP address of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;password&quot;:&quot;<em><strong>&quot;,&quot;ip&quot;:&quot;118.31.</strong></em>.41&quot;,&quot;innerIp&quot;:&quot;118.31.<em><strong>.41&quot;,&quot;region&quot;:&quot;&quot;,&quot;username&quot;:&quot;</strong></em>&quot;,&quot;beianInfo&quot;:&quot;&quot;}</p>
         */
        public Builder hostJson(String hostJson) {
            this.hostJson = hostJson;
            return this;
        }

        /**
         * <p>The image instance information.
         * imageId: the image ID.
         * instanceId: the instance ID.
         * ecsInstanceId: the ECS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;imageId&quot;:&quot;m-*******&quot;,&quot;instanceId&quot;:********}</p>
         */
        public Builder imageJson(String imageJson) {
            this.imageJson = imageJson;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1551111111</p>
         */
        public Builder instanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Indicates whether the instance is a trial instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTrial(Boolean isTrial) {
            this.isTrial = isTrial;
            return this;
        }

        /**
         * <p>The activation code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder licenseCode(String licenseCode) {
            this.licenseCode = licenseCode;
            return this;
        }

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>204211111111111</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj00**11</p>
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <p>***Collaborative Office</p>
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * <p>The SKU code.</p>
         * 
         * <strong>example:</strong>
         * <p>cmgj00**11-prepay</p>
         */
        public Builder productSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }

        /**
         * <p>The product type. Valid values:</p>
         * <ul>
         * <li>APP: application.</li>
         * <li>SERVIC: service.</li>
         * <li>MIRROR: image.</li>
         * <li>DOWNLOAD: download.</li>
         * <li>API_SERVICE: API.</li>
         * <li>DOCKER: Docker.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        public Builder productType(String productType) {
            this.productType = productType;
            return this;
        }

        /**
         * <p>The relational information.</p>
         */
        public Builder relationalData(RelationalData relationalData) {
            this.relationalData = relationalData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF60BEC-<strong><strong>-</strong></strong>-****-270359FB54A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The business status. Different values are set based on the product type.</p>
         * <p>When ProductType is set to MIRROR:</p>
         * <ul>
         * <li>PRODUCE: being provisioned.</li>
         * <li>USING: in use.</li>
         * <li>UNUSED: not in use.</li>
         * <li>EXPIRED: expired.</li>
         * <li>CLOSED: released.</li>
         * </ul>
         * <p>When ProductType is set to SERVICE:</p>
         * <ul>
         * <li>READYING: not started.</li>
         * <li>STARTED: in service.</li>
         * <li>CONFIRM: completed.</li>
         * <li>EXPIRED: expired.</li>
         * <li>CLOSED: released.</li>
         * </ul>
         * <p>When ProductType is set to APP, DOWNLOAD, API_SERVICE, or DOCKER:</p>
         * <ul>
         * <li>OPENING: being activated.</li>
         * <li>OPENED: activated.</li>
         * <li>EXPIRED: expired.</li>
         * <li>CLOSED: released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPENED</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The service provider name.</p>
         * 
         * <strong>example:</strong>
         * <p>***** Co., Ltd.</p>
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

            private Builder() {
            } 

            private Builder(RelationalData model) {
                this.serviceStatus = model.serviceStatus;
            } 

            /**
             * <p>The service status. Valid values:</p>
             * <ul>
             * <li>READYING: not started.</li>
             * <li>STARTED: in service.</li>
             * <li>CONFIRM: completed.</li>
             * <li>EXPIRED: expired.</li>
             * <li>CLOSED: released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STARTED</p>
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
