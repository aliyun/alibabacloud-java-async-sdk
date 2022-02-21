// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunInstancesRequest} extends {@link RequestModel}
 *
 * <p>RunInstancesRequest</p>
 */
public class RunInstancesRequest extends Request {
    @Query
    @NameInMap("Amount")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Long amount;

    @Query
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Query
    @NameInMap("Carrier")
    private String carrier;

    @Query
    @NameInMap("DataDisk")
    private java.util.List < DataDisk> dataDisk;

    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("InstanceChargeType")
    @Validation(required = true)
    private String instanceChargeType;

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
    @NameInMap("InternetMaxBandwidthOut")
    @Validation(required = true)
    private Long internetMaxBandwidthOut;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    @Query
    @NameInMap("NetDistrictCode")
    private String netDistrictCode;

    @Query
    @NameInMap("NetWorkId")
    private String netWorkId;

    @Query
    @NameInMap("Password")
    private String password;

    @Query
    @NameInMap("Period")
    private Long period;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("ScheduleAreaLevel")
    @Validation(required = true)
    private String scheduleAreaLevel;

    @Query
    @NameInMap("SchedulingPriceStrategy")
    private String schedulingPriceStrategy;

    @Query
    @NameInMap("SchedulingStrategy")
    private String schedulingStrategy;

    @Query
    @NameInMap("SecurityId")
    private String securityId;

    @Query
    @NameInMap("SystemDisk")
    @Validation(required = true)
    private SystemDisk systemDisk;

    @Query
    @NameInMap("UniqueSuffix")
    private Boolean uniqueSuffix;

    @Query
    @NameInMap("UserData")
    private String userData;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    private RunInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoRenew = builder.autoRenew;
        this.carrier = builder.carrier;
        this.dataDisk = builder.dataDisk;
        this.ensRegionId = builder.ensRegionId;
        this.hostName = builder.hostName;
        this.imageId = builder.imageId;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.keyPairName = builder.keyPairName;
        this.netDistrictCode = builder.netDistrictCode;
        this.netWorkId = builder.netWorkId;
        this.password = builder.password;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.scheduleAreaLevel = builder.scheduleAreaLevel;
        this.schedulingPriceStrategy = builder.schedulingPriceStrategy;
        this.schedulingStrategy = builder.schedulingStrategy;
        this.securityId = builder.securityId;
        this.systemDisk = builder.systemDisk;
        this.uniqueSuffix = builder.uniqueSuffix;
        this.userData = builder.userData;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Long getAmount() {
        return this.amount;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return carrier
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * @return dataDisk
     */
    public java.util.List < DataDisk> getDataDisk() {
        return this.dataDisk;
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
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
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
     * @return internetMaxBandwidthOut
     */
    public Long getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return netDistrictCode
     */
    public String getNetDistrictCode() {
        return this.netDistrictCode;
    }

    /**
     * @return netWorkId
     */
    public String getNetWorkId() {
        return this.netWorkId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return period
     */
    public Long getPeriod() {
        return this.period;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return scheduleAreaLevel
     */
    public String getScheduleAreaLevel() {
        return this.scheduleAreaLevel;
    }

    /**
     * @return schedulingPriceStrategy
     */
    public String getSchedulingPriceStrategy() {
        return this.schedulingPriceStrategy;
    }

    /**
     * @return schedulingStrategy
     */
    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * @return securityId
     */
    public String getSecurityId() {
        return this.securityId;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
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

    public static final class Builder extends Request.Builder<RunInstancesRequest, Builder> {
        private Long amount; 
        private Boolean autoRenew; 
        private String carrier; 
        private java.util.List < DataDisk> dataDisk; 
        private String ensRegionId; 
        private String hostName; 
        private String imageId; 
        private String instanceChargeType; 
        private String instanceName; 
        private String instanceType; 
        private String internetChargeType; 
        private Long internetMaxBandwidthOut; 
        private String keyPairName; 
        private String netDistrictCode; 
        private String netWorkId; 
        private String password; 
        private Long period; 
        private String privateIpAddress; 
        private String scheduleAreaLevel; 
        private String schedulingPriceStrategy; 
        private String schedulingStrategy; 
        private String securityId; 
        private SystemDisk systemDisk; 
        private Boolean uniqueSuffix; 
        private String userData; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(RunInstancesRequest response) {
            super(response);
            this.amount = response.amount;
            this.autoRenew = response.autoRenew;
            this.carrier = response.carrier;
            this.dataDisk = response.dataDisk;
            this.ensRegionId = response.ensRegionId;
            this.hostName = response.hostName;
            this.imageId = response.imageId;
            this.instanceChargeType = response.instanceChargeType;
            this.instanceName = response.instanceName;
            this.instanceType = response.instanceType;
            this.internetChargeType = response.internetChargeType;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.keyPairName = response.keyPairName;
            this.netDistrictCode = response.netDistrictCode;
            this.netWorkId = response.netWorkId;
            this.password = response.password;
            this.period = response.period;
            this.privateIpAddress = response.privateIpAddress;
            this.scheduleAreaLevel = response.scheduleAreaLevel;
            this.schedulingPriceStrategy = response.schedulingPriceStrategy;
            this.schedulingStrategy = response.schedulingStrategy;
            this.securityId = response.securityId;
            this.systemDisk = response.systemDisk;
            this.uniqueSuffix = response.uniqueSuffix;
            this.userData = response.userData;
            this.vSwitchId = response.vSwitchId;
        } 

        /**
         * 数量
         */
        public Builder amount(Long amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * 是否自动续费，默认为false
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * 运营商
         */
        public Builder carrier(String carrier) {
            this.putQueryParameter("Carrier", carrier);
            this.carrier = carrier;
            return this;
        }

        /**
         * 数据盘规格
         */
        public Builder dataDisk(java.util.List < DataDisk> dataDisk) {
            this.putQueryParameter("DataDisk", dataDisk);
            this.dataDisk = dataDisk;
            return this;
        }

        /**
         * 节点id
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * 主机名称
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * 镜像id
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * 实例付费方式，PrePaid:预付费，包年包月 PostPaid:按量付费
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * 实例名称。长度为2~128个字符，必须以大小字母或中文开头，不能以http://和https://开头。可以包含中文、英文、数字、半角冒号（:）、下划线（_）、点号（.）或者连字符（-）。默认值为实例的InstanceId
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 实例规格
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * 带宽计费方式
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * 公网最大带宽，如果参数InternetMaxBandwidthOut的值大于0，则自动为实例分配公网IP。
         */
        public Builder internetMaxBandwidthOut(Long internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * 密钥对名称
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * 地区code
         */
        public Builder netDistrictCode(String netDistrictCode) {
            this.putQueryParameter("NetDistrictCode", netDistrictCode);
            this.netDistrictCode = netDistrictCode;
            return this;
        }

        /**
         * 网络id
         */
        public Builder netWorkId(String netWorkId) {
            this.putQueryParameter("NetWorkId", netWorkId);
            this.netWorkId = netWorkId;
            return this;
        }

        /**
         * 实例密码
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * 购买资源的时长，单位为：月
         */
        public Builder period(Long period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * 私网ip
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * 调度层级
         */
        public Builder scheduleAreaLevel(String scheduleAreaLevel) {
            this.putQueryParameter("ScheduleAreaLevel", scheduleAreaLevel);
            this.scheduleAreaLevel = scheduleAreaLevel;
            return this;
        }

        /**
         * 调度价格策略
         */
        public Builder schedulingPriceStrategy(String schedulingPriceStrategy) {
            this.putQueryParameter("SchedulingPriceStrategy", schedulingPriceStrategy);
            this.schedulingPriceStrategy = schedulingPriceStrategy;
            return this;
        }

        /**
         * 调度策略
         */
        public Builder schedulingStrategy(String schedulingStrategy) {
            this.putQueryParameter("SchedulingStrategy", schedulingStrategy);
            this.schedulingStrategy = schedulingStrategy;
            return this;
        }

        /**
         * 安全组id
         */
        public Builder securityId(String securityId) {
            this.putQueryParameter("SecurityId", securityId);
            this.securityId = securityId;
            return this;
        }

        /**
         * 系统盘规格
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.putQueryParameter("SystemDisk", systemDisk);
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * 是否为HostName和InstanceName添加有序后缀，有序后缀从001开始递增，最大不能超过999
         */
        public Builder uniqueSuffix(Boolean uniqueSuffix) {
            this.putQueryParameter("UniqueSuffix", uniqueSuffix);
            this.uniqueSuffix = uniqueSuffix;
            return this;
        }

        /**
         * 用户自定义数据，最大支持16KB 您可传入UserData信息。UserData以Base64的方式编码
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        /**
         * 交换机id
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public RunInstancesRequest build() {
            return new RunInstancesRequest(this);
        } 

    } 

    public static class DataDisk extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Size")
        private Long size;

        private DataDisk(Builder builder) {
            this.category = builder.category;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataDisk create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String category; 
            private Long size; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
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
        @Validation(required = true)
        private Long size;

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
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private Long size; 

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public SystemDisk build() {
                return new SystemDisk(this);
            } 

        } 

    }
}
