// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

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
    @NameInMap("AllocatePublicAddress")
    private String allocatePublicAddress;

    @Query
    @NameInMap("AppList")
    private java.util.List < AppList> appList;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("InternetChargeType")
    private String internetChargeType;

    @Query
    @NameInMap("InternetMaxBandwidthIn")
    @Validation(maximum = 100, minimum = 1)
    private Integer internetMaxBandwidthIn;

    @Query
    @NameInMap("InternetMaxBandwidthOut")
    @Validation(maximum = 100)
    private Integer internetMaxBandwidthOut;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("PeriodUnit")
    private String periodUnit;

    @Query
    @NameInMap("SystemDiskCategory")
    @Validation(required = true)
    private String systemDiskCategory;

    @Query
    @NameInMap("SystemDiskSize")
    @Validation(required = true, maximum = 500, minimum = 20)
    private Integer systemDiskSize;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("WorkMode")
    @Validation(required = true)
    private String workMode;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.allocatePublicAddress = builder.allocatePublicAddress;
        this.appList = builder.appList;
        this.autoRenew = builder.autoRenew;
        this.clusterId = builder.clusterId;
        this.imageId = builder.imageId;
        this.instanceChargeType = builder.instanceChargeType;
        this.instanceType = builder.instanceType;
        this.internetChargeType = builder.internetChargeType;
        this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
        this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
        this.name = builder.name;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.systemDiskCategory = builder.systemDiskCategory;
        this.systemDiskSize = builder.systemDiskSize;
        this.vSwitchId = builder.vSwitchId;
        this.workMode = builder.workMode;
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
     * @return allocatePublicAddress
     */
    public String getAllocatePublicAddress() {
        return this.allocatePublicAddress;
    }

    /**
     * @return appList
     */
    public java.util.List < AppList> getAppList() {
        return this.appList;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return internetMaxBandwidthIn
     */
    public Integer getInternetMaxBandwidthIn() {
        return this.internetMaxBandwidthIn;
    }

    /**
     * @return internetMaxBandwidthOut
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return systemDiskCategory
     */
    public String getSystemDiskCategory() {
        return this.systemDiskCategory;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return workMode
     */
    public String getWorkMode() {
        return this.workMode;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String allocatePublicAddress; 
        private java.util.List < AppList> appList; 
        private String autoRenew; 
        private String clusterId; 
        private String imageId; 
        private String instanceChargeType; 
        private String instanceType; 
        private String internetChargeType; 
        private Integer internetMaxBandwidthIn; 
        private Integer internetMaxBandwidthOut; 
        private String name; 
        private Integer period; 
        private String periodUnit; 
        private String systemDiskCategory; 
        private Integer systemDiskSize; 
        private String vSwitchId; 
        private String workMode; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest response) {
            super(response);
            this.allocatePublicAddress = response.allocatePublicAddress;
            this.appList = response.appList;
            this.autoRenew = response.autoRenew;
            this.clusterId = response.clusterId;
            this.imageId = response.imageId;
            this.instanceChargeType = response.instanceChargeType;
            this.instanceType = response.instanceType;
            this.internetChargeType = response.internetChargeType;
            this.internetMaxBandwidthIn = response.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = response.internetMaxBandwidthOut;
            this.name = response.name;
            this.period = response.period;
            this.periodUnit = response.periodUnit;
            this.systemDiskCategory = response.systemDiskCategory;
            this.systemDiskSize = response.systemDiskSize;
            this.vSwitchId = response.vSwitchId;
            this.workMode = response.workMode;
        } 

        /**
         * AllocatePublicAddress.
         */
        public Builder allocatePublicAddress(String allocatePublicAddress) {
            this.putQueryParameter("AllocatePublicAddress", allocatePublicAddress);
            this.allocatePublicAddress = allocatePublicAddress;
            return this;
        }

        /**
         * AppList.
         */
        public Builder appList(java.util.List < AppList> appList) {
            this.putQueryParameter("AppList", appList);
            this.appList = appList;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * InstanceChargeType.
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.putQueryParameter("InstanceChargeType", instanceChargeType);
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * InternetChargeType.
         */
        public Builder internetChargeType(String internetChargeType) {
            this.putQueryParameter("InternetChargeType", internetChargeType);
            this.internetChargeType = internetChargeType;
            return this;
        }

        /**
         * InternetMaxBandwidthIn.
         */
        public Builder internetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.putQueryParameter("InternetMaxBandwidthIn", internetMaxBandwidthIn);
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }

        /**
         * InternetMaxBandwidthOut.
         */
        public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putQueryParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * SystemDiskCategory.
         */
        public Builder systemDiskCategory(String systemDiskCategory) {
            this.putQueryParameter("SystemDiskCategory", systemDiskCategory);
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }

        /**
         * SystemDiskSize.
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putQueryParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * WorkMode.
         */
        public Builder workMode(String workMode) {
            this.putQueryParameter("WorkMode", workMode);
            this.workMode = workMode;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class AppList extends TeaModel {
        @NameInMap("AppArgs")
        private String appArgs;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppPath")
        private String appPath;

        private AppList(Builder builder) {
            this.appArgs = builder.appArgs;
            this.appName = builder.appName;
            this.appPath = builder.appPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return appArgs
         */
        public String getAppArgs() {
            return this.appArgs;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appPath
         */
        public String getAppPath() {
            return this.appPath;
        }

        public static final class Builder {
            private String appArgs; 
            private String appName; 
            private String appPath; 

            /**
             * AppArgs.
             */
            public Builder appArgs(String appArgs) {
                this.appArgs = appArgs;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppPath.
             */
            public Builder appPath(String appPath) {
                this.appPath = appPath;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
}
