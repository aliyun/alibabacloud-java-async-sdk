// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
    private java.util.List < DataDisk> dataDisk;

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
    public java.util.List < DataDisk> getDataDisk() {
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
        private java.util.List < DataDisk> dataDisk; 
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
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
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
         * <p>Specifies whether to enable the auto-renewal feature. Valid values: <strong>True</strong> and <strong>False</strong>. Default value: False.</p>
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
         * <p>The auto-renewal period for the instance. This parameter is required when the <strong>AutoRenew</strong> parameter is set to <strong>True</strong>. Valid values: <strong>1</strong> to <strong>12</strong>. Unit: months.</p>
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
         * <p>The hostname of the Elastic Compute Service (ECS) instance. General naming rules: The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).</p>
         * <p>Naming rules for specific instances:</p>
         * <ul>
         * <li>For Windows instances, the hostname must be <strong>2</strong> to <strong>15</strong> characters in length and cannot contain periods (.) or contain only digits. The hostname cannot contain periods (.) or contain only digits.</li>
         * <li>For instances that run one of other operating systems such as Linux, the hostname must be <strong>2</strong> to <strong>64</strong> characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).</li>
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
         * <p>The ID of the image file that you select when creating the instance.</p>
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
         * <p>The name of the instance. The name must conform to the following naming conventions:</p>
         * <ul>
         * <li>The name must be <strong>2</strong> to <strong>128</strong> characters in length.</li>
         * <li>It must start with a letter but cannot start with http:// or https://.</li>
         * <li>The name can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).</li>
         * </ul>
         * <p>If you do not specify this parameter, the instance ID is used as the instance name by default.</p>
         * 
         * <strong>example:</strong>
         * <p>test:Instance_Name.1-2</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The type of the instance.</p>
         * <p>For more information, see <a href="~~66124~~"></a>.</p>
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
         * <p>This parameter is required if you create the instance for the first time. The existing billing method is used by default if you have created an instance. Valid values:</p>
         * <ul>
         * <li><strong>BandwidthByDay</strong>: Pay by daily peak bandwidth.</li>
         * <li><strong>95BandwidthByMonth</strong>: Pay by monthly 95th percentile bandwidth.</li>
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
         * <p>The type of the IP address. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong> (default)</li>
         * <li><strong>ipv6</strong></li>
         * <li><strong>ipv4Andipv6</strong></li>
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
         * <p>The name of the key pair. You can specify only one name.</p>
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
         * <p>The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: <code>()`~!@#$%^&amp;*-_+=|{}[]:;\&quot;&lt;&gt;,.?/</code></p>
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
         * <li><p><strong>true</strong>: The password preset in the image is used, and the <strong>Password</strong> parameter must be null. For secure access, make sure that the selected image has a password configured.</p>
         * </li>
         * <li><p><strong>false</strong>: does not use the password preset in the image.</p>
         * </li>
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
         * <p>The billing method of the instance. Set the value to Subscription.</p>
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
         * <p>The subscription period of the instance. Valid values: <strong>1</strong> to <strong>9</strong> and <strong>12</strong>. Unit: months.</p>
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
         * <p>The internal IP address. If this parameter is specified, you must specify the vSwitch ID. The vSwitch must be created first. Otherwise, an error is returned.</p>
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
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
         * <p>Specifies whether to automatically append sequential suffixes to the hostnames specified by the <strong>HostName</strong> parameter and instance names specified by the <strong>InstanceName</strong> parameter. The sequential suffixes range from <strong>001</strong> to <strong>999</strong>.</p>
         * <p>Examples: <strong>LocalHost001</strong> and <strong>LocalHost002</strong>, and <strong>MyInstance001</strong> and <strong>MyInstance002</strong>.</p>
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
         * <p>Custom data. The data starts with <code>#!</code>. The data can be at most 256 characters in length and 16 KB in size. Only custom scripts are supported and cannot be rendered by InstanceMetaData.</p>
         * <p>You can specify custom data. The data is encoded in Base64. The system does not encrypt your custom data when API requests are initiated. We recommend that you do not pass in confidential information such as passwords and private keys in plaintext. If you want to provide sensitive data such as passwords and private keys, encrypt the data and then encode it in Base64. The data is decrypted on the instance in the way it is encrypted.</p>
         * <p>For more information, see <a href="https://cloudinit.readthedocs.io/en/latest/topics/format.html">User data formats</a>.</p>
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
         * <p>The ID of the vSwitch.</p>
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

            /**
             * <p>The capacity of the first data disk. Unit: GiB. The capacity is at least 20 GiB and is a multiple of 10 GiB.</p>
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

            /**
             * <p>The size of the system disk. Unit: GiB. Valid values: <strong>20</strong> and <strong>40</strong>. The value cannot be smaller than the size of the image and must be a multiple of 10 GiB.</p>
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
