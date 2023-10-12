// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Module} extends {@link TeaModel}
 *
 * <p>Module</p>
 */
public class Module extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Device")
    private Device device;

    @NameInMap("Id")
    private String id;

    @NameInMap("MaxCount")
    private Long maxCount;

    @NameInMap("MinCount")
    private Long minCount;

    @NameInMap("ModuleDetails")
    private java.util.List < ModuleDetails> moduleDetails;

    @NameInMap("ModuleId")
    private String moduleId;

    @NameInMap("ModuleType")
    private String moduleType;

    @NameInMap("Name")
    private String name;

    @NameInMap("ParentModuleId")
    private String parentModuleId;

    @NameInMap("Stack")
    private Boolean stack;

    @NameInMap("UpdateTime")
    private String updateTime;

    private Module(Builder builder) {
        this.createTime = builder.createTime;
        this.device = builder.device;
        this.id = builder.id;
        this.maxCount = builder.maxCount;
        this.minCount = builder.minCount;
        this.moduleDetails = builder.moduleDetails;
        this.moduleId = builder.moduleId;
        this.moduleType = builder.moduleType;
        this.name = builder.name;
        this.parentModuleId = builder.parentModuleId;
        this.stack = builder.stack;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Module create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return device
     */
    public Device getDevice() {
        return this.device;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return maxCount
     */
    public Long getMaxCount() {
        return this.maxCount;
    }

    /**
     * @return minCount
     */
    public Long getMinCount() {
        return this.minCount;
    }

    /**
     * @return moduleDetails
     */
    public java.util.List < ModuleDetails> getModuleDetails() {
        return this.moduleDetails;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleType
     */
    public String getModuleType() {
        return this.moduleType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentModuleId
     */
    public String getParentModuleId() {
        return this.parentModuleId;
    }

    /**
     * @return stack
     */
    public Boolean getStack() {
        return this.stack;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String createTime; 
        private Device device; 
        private String id; 
        private Long maxCount; 
        private Long minCount; 
        private java.util.List < ModuleDetails> moduleDetails; 
        private String moduleId; 
        private String moduleType; 
        private String name; 
        private String parentModuleId; 
        private Boolean stack; 
        private String updateTime; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Device.
         */
        public Builder device(Device device) {
            this.device = device;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * MaxCount.
         */
        public Builder maxCount(Long maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        /**
         * MinCount.
         */
        public Builder minCount(Long minCount) {
            this.minCount = minCount;
            return this;
        }

        /**
         * ModuleDetails.
         */
        public Builder moduleDetails(java.util.List < ModuleDetails> moduleDetails) {
            this.moduleDetails = moduleDetails;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }

        /**
         * ModuleType.
         */
        public Builder moduleType(String moduleType) {
            this.moduleType = moduleType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParentModuleId.
         */
        public Builder parentModuleId(String parentModuleId) {
            this.parentModuleId = parentModuleId;
            return this;
        }

        /**
         * Stack.
         */
        public Builder stack(Boolean stack) {
            this.stack = stack;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Module build() {
            return new Module(this);
        } 

    } 

    public static class Device extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeviceCount")
        private Long deviceCount;

        @NameInMap("DeviceRole")
        private String deviceRole;

        @NameInMap("DeviceX")
        private String deviceX;

        @NameInMap("DeviceY")
        private String deviceY;

        @NameInMap("Id")
        private String id;

        @NameInMap("Role")
        private String role;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("X")
        private String x;

        @NameInMap("Y")
        private String y;

        private Device(Builder builder) {
            this.count = builder.count;
            this.createTime = builder.createTime;
            this.deviceCount = builder.deviceCount;
            this.deviceRole = builder.deviceRole;
            this.deviceX = builder.deviceX;
            this.deviceY = builder.deviceY;
            this.id = builder.id;
            this.role = builder.role;
            this.updateTime = builder.updateTime;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Device create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceCount
         */
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        /**
         * @return deviceRole
         */
        public String getDeviceRole() {
            return this.deviceRole;
        }

        /**
         * @return deviceX
         */
        public String getDeviceX() {
            return this.deviceX;
        }

        /**
         * @return deviceY
         */
        public String getDeviceY() {
            return this.deviceY;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return x
         */
        public String getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public String getY() {
            return this.y;
        }

        public static final class Builder {
            private Long count; 
            private String createTime; 
            private Long deviceCount; 
            private String deviceRole; 
            private String deviceX; 
            private String deviceY; 
            private String id; 
            private String role; 
            private String updateTime; 
            private String x; 
            private String y; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeviceCount.
             */
            public Builder deviceCount(Long deviceCount) {
                this.deviceCount = deviceCount;
                return this;
            }

            /**
             * DeviceRole.
             */
            public Builder deviceRole(String deviceRole) {
                this.deviceRole = deviceRole;
                return this;
            }

            /**
             * DeviceX.
             */
            public Builder deviceX(String deviceX) {
                this.deviceX = deviceX;
                return this;
            }

            /**
             * DeviceY.
             */
            public Builder deviceY(String deviceY) {
                this.deviceY = deviceY;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * X.
             */
            public Builder x(String x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(String y) {
                this.y = y;
                return this;
            }

            public Device build() {
                return new Device(this);
            } 

        } 

    }
    public static class DeviceDetails extends TeaModel {
        @NameInMap("OrderNumber")
        private Long orderNumber;

        private DeviceDetails(Builder builder) {
            this.orderNumber = builder.orderNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceDetails create() {
            return builder().build();
        }

        /**
         * @return orderNumber
         */
        public Long getOrderNumber() {
            return this.orderNumber;
        }

        public static final class Builder {
            private Long orderNumber; 

            /**
             * OrderNumber.
             */
            public Builder orderNumber(Long orderNumber) {
                this.orderNumber = orderNumber;
                return this;
            }

            public DeviceDetails build() {
                return new DeviceDetails(this);
            } 

        } 

    }
    public static class ModuleDetails extends TeaModel {
        @NameInMap("DeviceDetails")
        private java.util.List < DeviceDetails> deviceDetails;

        @NameInMap("OrderNumber")
        private Long orderNumber;

        private ModuleDetails(Builder builder) {
            this.deviceDetails = builder.deviceDetails;
            this.orderNumber = builder.orderNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModuleDetails create() {
            return builder().build();
        }

        /**
         * @return deviceDetails
         */
        public java.util.List < DeviceDetails> getDeviceDetails() {
            return this.deviceDetails;
        }

        /**
         * @return orderNumber
         */
        public Long getOrderNumber() {
            return this.orderNumber;
        }

        public static final class Builder {
            private java.util.List < DeviceDetails> deviceDetails; 
            private Long orderNumber; 

            /**
             * DeviceDetails.
             */
            public Builder deviceDetails(java.util.List < DeviceDetails> deviceDetails) {
                this.deviceDetails = deviceDetails;
                return this;
            }

            /**
             * OrderNumber.
             */
            public Builder orderNumber(Long orderNumber) {
                this.orderNumber = orderNumber;
                return this;
            }

            public ModuleDetails build() {
                return new ModuleDetails(this);
            } 

        } 

    }
}
