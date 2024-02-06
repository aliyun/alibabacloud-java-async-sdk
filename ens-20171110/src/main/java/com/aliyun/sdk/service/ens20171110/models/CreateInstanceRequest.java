// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("AutoRenewPeriod")
    private String autoRenewPeriod;

    @Query
    @NameInMap("EnsRegionId")
    @Validation(required = true)
    private String ensRegionId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("IpType")
    private String ipType;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("PasswordInherit")
    private Boolean passwordInherit;

    @Query
    @NameInMap("PaymentType")
    private String paymentType;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private String period;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("PublicIpIdentification")
    private Boolean publicIpIdentification;

    @Query
    @NameInMap("Quantity")
    @Validation(required = true)
    private String quantity;

    @Query
    @NameInMap("UniqueSuffix")
    private Boolean uniqueSuffix;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VSwitchId")
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
         * Specifies whether to enable the auto-renewal feature. Valid values: **True** and **False**. Default value: False.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The auto-renewal period for the instance. This parameter is required when the **AutoRenew** parameter is set to **True**. Valid values: **1** to **12**. Unit: months.
         */
        public Builder autoRenewPeriod(String autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The hostname of the Elastic Compute Service (ECS) instance. General naming rules: The hostname cannot start or end with a period (.) or hyphen (-). It cannot contain consecutive periods (.) or hyphens (-).
         * <p>
         * 
         * Naming rules for specific instances:
         * 
         * *   For Windows instances, the hostname must be **2** to **15** characters in length and cannot contain periods (.) or contain only digits. The hostname cannot contain periods (.) or contain only digits.
         * *   For instances that run one of other operating systems such as Linux, the hostname must be **2** to **64** characters in length. You can use periods (.) to separate the hostname into multiple segments. Each segment can contain letters, digits, and hyphens (-).
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * The ID of the image file that you select when creating the instance.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * The name of the instance. The name must conform to the following naming conventions:
         * <p>
         * 
         * *   The name must be **2** to **128** characters in length.
         * *   It must start with a letter but cannot start with http:// or https://.
         * *   The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).
         * 
         * If you do not specify this parameter, the instance ID is used as the instance name by default.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The type of the instance.
         * <p>
         * 
         * For more information, see [](~~66124~~).
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * This parameter is required if you create the instance for the first time. The existing billing method is used by default if you have created an instance. Valid values:
         * <p>
         * 
         * *   **BandwidthByDay**: Pay by daily peak bandwidth.
         * *   **95BandwidthByMonth**: Pay by monthly 95th percentile bandwidth.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * The type of IP address. Valid values:
         * <p>
         * 
         * *   **ipv4**: IPv4. This is the default value.
         * *   **ipv6**: IPv6.
         * *   **ipv4Andipv6**: IPv4 and IPv6.
         */
        public Builder ipType(String ipType) {
            this.putQueryParameter("IpType", ipType);
            this.ipType = ipType;
            return this;
        }

        /**
         * The name of the key pair. You can specify only one name.
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
         * The password of the instance.
         * <p>
         * 
         * The password must be 8 to 30 characters in length and contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include: ``()`~!@#$%^&*-_+=|{}[]:;\"<>,.?/``
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * Specifies whether to use the preset password of the image. Valid values:
         * <p>
         * 
         * - **true**: The password preset in the image is used, and the **Password** parameter must be null. For secure access, make sure that the selected image has a password configured.
         * 
         * - **false**: does not use the password preset in the image.
         */
        public Builder passwordInherit(Boolean passwordInherit) {
            this.putQueryParameter("PasswordInherit", passwordInherit);
            this.passwordInherit = passwordInherit;
            return this;
        }

        /**
         * The billing method of the instance. The value is set to Subscription.
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("PaymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * The subscription period of the instance. Valid values: **1** to **9** and **12**. Unit: months.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The internal IP address. If this parameter is specified, you must specify the vSwitch ID. The vSwitch must be created first. Otherwise, an error is returned.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * Specifies whether a public IP address can be assigned to the specified instance. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder publicIpIdentification(Boolean publicIpIdentification) {
            this.putQueryParameter("PublicIpIdentification", publicIpIdentification);
            this.publicIpIdentification = publicIpIdentification;
            return this;
        }

        /**
         * The number of instances.
         */
        public Builder quantity(String quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * Specifies whether to automatically append sequential suffixes to the hostnames specified by the **HostName** parameter and instance names specified by the **InstanceName** parameter. The sequential numbers in the suffix range from **001** to **999**.
         * <p>
         * 
         * Examples: **LocalHost001** and **LocalHost002**, and **MyInstance001** and **MyInstance002**.
         * 
         * Default value: **false**.
         */
        public Builder uniqueSuffix(Boolean uniqueSuffix) {
            this.putQueryParameter("UniqueSuffix", uniqueSuffix);
            this.uniqueSuffix = uniqueSuffix;
            return this;
        }

        /**
         * Custom data. The data starts with `#!`. The data can be at most 256 characters in length and 16 KB in size. Only custom scripts are supported and cannot be rendered by InstanceMetaData.
         * <p>
         * 
         * You can specify custom data. The data is encoded in Base64. The system does not encrypt your custom data when API requests are initiated. We recommend that you do not pass in confidential information such as passwords and private keys in plaintext. If you want to provide sensitive data such as passwords and private keys, encrypt the data and then encode it in Base64. The data is decrypted on the instance in the way it is encrypted.
         * 
         * For more information, see [User data formats](https://cloudinit.readthedocs.io/en/latest/topics/format.html).
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * The ID of the vSwitch.
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

    public static class DataDisk extends TeaModel {
        @NameInMap("Size")
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
             * The capacity of the first data disk. Unit: GiB. The capacity is at least 20 GiB and is a multiple of 10 GiB.
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
    public static class SystemDisk extends TeaModel {
        @NameInMap("Size")
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
             * The size of the system disk. Unit: GiB. Valid values: **20** and **40**. The value cannot be smaller than the size of the image and must be a multiple of 10 GiB.
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
