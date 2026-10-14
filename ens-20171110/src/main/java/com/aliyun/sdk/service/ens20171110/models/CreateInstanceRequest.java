// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDisk")
    private java.util.List<DataDisk> dataDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    private String autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostName")
    private String hostName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InternetChargeType")
    private String internetChargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpType")
    private String ipType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicIpIdentification")
    private Boolean publicIpIdentification;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Quantity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quantity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniqueSuffix")
    private Boolean uniqueSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.dataDisk = builder.dataDisk;
        this.systemDisk = builder.systemDisk;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.ensRegionId = builder.ensRegionId;
        this.hostName = builder.hostName;
        this.imageId = builder.imageId;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.ipType = builder.ipType;
        this.keyPairName = builder.keyPairName;
        this.ownerId = builder.ownerId;
        this.password = builder.password;
        this.passwordInherit = builder.passwordInherit;
        this.paymentType = builder.paymentType;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.publicIpIdentification = builder.publicIpIdentification;
        this.quantity = builder.quantity;
        this.uniqueSuffix = builder.uniqueSuffix;
        this.userData = builder.userData;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataDisk
     */
    public java.util.List<DataDisk> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return internetChargeType
     */
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return passwordInherit
     */
    public Boolean getPasswordInherit() {
        return this.passwordInherit;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return publicIpIdentification
     */
    public Boolean getPublicIpIdentification() {
        return this.publicIpIdentification;
    }

    /**
     * @return quantity
     */
    public String getQuantity() {
        return this.quantity;
    }

    /**
     * @return uniqueSuffix
     */
    public Boolean getUniqueSuffix() {
        return this.uniqueSuffix;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private java.util.List<DataDisk> dataDisk; 
        private SystemDisk systemDisk; 
        private String autoRenew; 
        private String autoRenewPeriod; 
        private String ensRegionId; 
        private String hostName; 
        private String imageId; 
        private String instanceName; 
        private String instanceType; 
        private String internetChargeType; 
        private String ipType; 
        private String keyPairName; 
        private Long ownerId; 
        private String password; 
        private Boolean passwordInherit; 
        private String paymentType; 
        private String period; 
        private String privateIpAddress; 
        private Boolean publicIpIdentification; 
        private String quantity; 
        private Boolean uniqueSuffix; 
        private String userData; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.dataDisk = request.dataDisk;
            this.systemDisk = request.systemDisk;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.ensRegionId = request.ensRegionId;
            this.hostName = request.hostName;
            this.imageId = request.imageId;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.internetChargeType = request.internetChargeType;
            this.ipType = request.ipType;
            this.keyPairName = request.keyPairName;
            this.ownerId = request.ownerId;
            this.password = request.password;
            this.passwordInherit = request.passwordInherit;
            this.paymentType = request.paymentType;
            this.period = request.period;
            this.privateIpAddress = request.privateIpAddress;
            this.publicIpIdentification = request.publicIpIdentification;
            this.quantity = request.quantity;
            this.uniqueSuffix = request.uniqueSuffix;
            this.userData = request.userData;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * DataDisk.
         */
        public Builder dataDisk(java.util.List<DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * SystemDisk.
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values: <strong>True</strong> | <strong>False</strong> (default).</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal period. This parameter is required when <strong>AutoRenew</strong> is set to <strong>True</strong>. Valid values: <strong>1</strong> to <strong>12</strong>. Unit: months.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder autoRenewPeriod(String autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The hostname of the instance.
         * General naming conventions: Periods (.) and hyphens (-) cannot be used as the first or last character and cannot be used consecutively.</p>
         * <p>Specific naming conventions:</p>
         * <ul>
         * <li>Windows instances: The hostname must be <strong>2</strong> to <strong>15</strong> characters in length. Periods (.) are not supported. The hostname cannot consist entirely of digits. Uppercase letters, lowercase letters, digits, and hyphens (-) are allowed.</li>
         * <li>Other instances (such as Linux): The hostname must be <strong>2</strong> to <strong>64</strong> characters in length. Multiple periods (.) are supported. Each segment separated by a period can contain uppercase letters, lowercase letters, digits, and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test-HostName</p>
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * <p>The ID of the image that is used to start the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>yourImage ID</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The name of the instance. Naming conventions:</p>
         * <ul>
         * <li>The name must be <strong>2</strong> to <strong>128</strong> characters in length and can contain letters and Chinese characters.</li>
         * <li>The name must start with an uppercase letter, a lowercase letter, or a Chinese character. It cannot start with http:// or https://.</li>
         * <li>The name can contain digits, colons (:), underscores (_), periods (.), or hyphens (-).</li>
         * </ul>
         * <p>If this parameter is not specified, the default value is the InstanceId of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test：Instance_Name.1-2</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * <p>For details about instance types, see <a href="https://help.aliyun.com/document_detail/66124.html">Limits</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ens.se1.tiny</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>This parameter is required when you create an instance for the first time. If you already have instance resources, the existing billing method is used by default. Valid values:</p>
         * <ul>
         * <li><p><strong>BandwidthByDay</strong>: daily peak bandwidth.</p>
         * </li>
         * <li><p><strong>95BandwidthByMonth</strong>: monthly 95th percentile bandwidth.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>95BandwidthByMonth</p>
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * <p>The IP type. Valid values:</p>
         * <ul>
         * <li><p><strong>ipv4</strong> (default): IPv4.</p>
         * </li>
         * <li><p><strong>ipv6</strong>: IPv6.</p>
         * </li>
         * <li><p><strong>ipv4Andipv6</strong>: IPv4 and IPv6.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder ipType(String ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * <p>The name of the key pair. Only a single name is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The password of the instance.</p>
         * <p>The password must be 8 to 30 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. The following special characters are supported: <code>()`~!@#$%^&amp;*-_+=|{}[]:;\\&quot;&lt;&gt;,.?/</code></p>
         * 
         * <strong>example:</strong>
         * <p>yourPassword:1</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>Specifies whether to use the preset password of the image. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The preset password of the image is used. The <strong>Password</strong> parameter must be empty, and you must make sure that the image has a preset password.</li>
         * <li><strong>false</strong>: The preset password of the image is not used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * <p>The payment method. Currently, this is a fixed value of Subscription (subscription instance). Modification is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The subscription duration. Valid values: <strong>1</strong> to <strong>9</strong> and <strong>12</strong>. Unit: months.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The private IP address. If you specify a private IP address, you must also specify the VSwitchId parameter. The vSwitch must be created in advance. Otherwise, an error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.10</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>Specifies whether a public IP address can be assigned to the specified instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): A public IP address can be assigned.</li>
         * <li><strong>false</strong>: A public IP address cannot be assigned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder publicIpIdentification(Boolean publicIpIdentification) {
            this.putQueryParameter("PublicIpIdentification", publicIpIdentification);
            this.publicIpIdentification = publicIpIdentification;
            return this;
        }

        /**
         * <p>The number of instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quantity(String quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * <p>Specifies whether to add sequential suffixes to <strong>HostName</strong> and <strong>InstanceName</strong>. The sequential suffixes start from <strong>001</strong> and cannot exceed <strong>999</strong>.</p>
         * <p>Example: <strong>LocalHost001</strong>, <strong>LocalHost002</strong>, <strong>MyInstance001</strong>, and <strong>MyInstance002</strong>.</p>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder uniqueSuffix(Boolean uniqueSuffix) {
            this.putQueryParameter("UniqueSuffix", uniqueSuffix);
            this.uniqueSuffix = uniqueSuffix;
            return this;
        }

        /**
         * <p>The custom data. The data must start with <code>#!</code>. The maximum length is 256 characters and the maximum size is 16 KB. Only custom data scripts are supported. InstanceMetaData rendering is not supported.</p>
         * <p>You can pass in custom data that is Base64-encoded. When you call the API to initiate a request, the custom data you specify is not encrypted. Do not pass in confidential information such as passwords and private keys in plaintext. If you need to pass in passwords or private keys, encrypt the content first and then Base64-encode it before passing it in. Decrypt the content in the same way inside the instance.</p>
         * <p>For more information, see <a href="https://cloudinit.readthedocs.io/en/latest/topics/format.html">Data format</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/sh  echo &quot;Hello World.  The time is now $(date -R)!&quot; | tee /home/output.txt</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>YourVSwitchId</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class DataDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        private DataDisk(Builder builder) {
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String size; 

            private Builder() {
            } 

            private Builder(DataDisk model) {
                this.size = model.size;
            } 

            /**
             * <p>The size of the first data cloud disk. Unit: GiB. The size must be at least 20 GiB and a multiple of 10.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public DataDisk build() {
                return new DataDisk(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class SystemDisk extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        private SystemDisk(Builder builder) {
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemDisk create() {
            return builder().build();
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        public static final class Builder {
            private String size; 

            private Builder() {
            } 

            private Builder(SystemDisk model) {
                this.size = model.size;
            } 

            /**
             * <p>The size of the system cloud disk. Unit: GiB. The value must be a multiple of 10 and cannot be smaller than the image size. For the valid range, refer to the SystemDiskMinSize and SystemDiskMaxSize values returned by DescribeAvailableResourceInfo. 20 GiB and 40 GiB are common configurations and do not indicate that only these two values are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
}
