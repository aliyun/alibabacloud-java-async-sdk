// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSetupProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetSetupProjectResponseBody</p>
 */
public class GetSetupProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetupProject")
    private SetupProject setupProject;

    private GetSetupProjectResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.setupProject = builder.setupProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSetupProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return setupProject
     */
    public SetupProject getSetupProject() {
        return this.setupProject;
    }

    public static final class Builder {
        private String requestId; 
        private SetupProject setupProject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SetupProject.
         */
        public Builder setupProject(SetupProject setupProject) {
            this.setupProject = setupProject;
            return this;
        }

        public GetSetupProjectResponseBody build() {
            return new GetSetupProjectResponseBody(this);
        } 

    } 

    public static class Packages extends TeaModel {
        @NameInMap("DeviceNumber")
        private String deviceNumber;

        @NameInMap("Model")
        private String model;

        @NameInMap("Role")
        private String role;

        @NameInMap("Vendor")
        private String vendor;

        private Packages(Builder builder) {
            this.deviceNumber = builder.deviceNumber;
            this.model = builder.model;
            this.role = builder.role;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Packages create() {
            return builder().build();
        }

        /**
         * @return deviceNumber
         */
        public String getDeviceNumber() {
            return this.deviceNumber;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String deviceNumber; 
            private String model; 
            private String role; 
            private String vendor; 

            /**
             * 设备号
             */
            public Builder deviceNumber(String deviceNumber) {
                this.deviceNumber = deviceNumber;
                return this;
            }

            /**
             * 型号
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * 角色
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 厂商
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Packages build() {
                return new Packages(this);
            } 

        } 

    }
    public static class SetupProject extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeliveryTime")
        private String deliveryTime;

        @NameInMap("Nodes")
        private String nodes;

        @NameInMap("Packages")
        private java.util.List < Packages> packages;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("SetupProjectId")
        private String setupProjectId;

        @NameInMap("SpaceId")
        private String spaceId;

        @NameInMap("SpaceName")
        private String spaceName;

        @NameInMap("SpaceType")
        private String spaceType;

        private SetupProject(Builder builder) {
            this.createTime = builder.createTime;
            this.deliveryTime = builder.deliveryTime;
            this.nodes = builder.nodes;
            this.packages = builder.packages;
            this.progress = builder.progress;
            this.setupProjectId = builder.setupProjectId;
            this.spaceId = builder.spaceId;
            this.spaceName = builder.spaceName;
            this.spaceType = builder.spaceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SetupProject create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deliveryTime
         */
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        /**
         * @return nodes
         */
        public String getNodes() {
            return this.nodes;
        }

        /**
         * @return packages
         */
        public java.util.List < Packages> getPackages() {
            return this.packages;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return setupProjectId
         */
        public String getSetupProjectId() {
            return this.setupProjectId;
        }

        /**
         * @return spaceId
         */
        public String getSpaceId() {
            return this.spaceId;
        }

        /**
         * @return spaceName
         */
        public String getSpaceName() {
            return this.spaceName;
        }

        /**
         * @return spaceType
         */
        public String getSpaceType() {
            return this.spaceType;
        }

        public static final class Builder {
            private String createTime; 
            private String deliveryTime; 
            private String nodes; 
            private java.util.List < Packages> packages; 
            private String progress; 
            private String setupProjectId; 
            private String spaceId; 
            private String spaceName; 
            private String spaceType; 

            /**
             * 代表创建时间的资源属性字段
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 预计交付时间
             */
            public Builder deliveryTime(String deliveryTime) {
                this.deliveryTime = deliveryTime;
                return this;
            }

            /**
             * 节点
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * 套餐
             */
            public Builder packages(java.util.List < Packages> packages) {
                this.packages = packages;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder setupProjectId(String setupProjectId) {
                this.setupProjectId = setupProjectId;
                return this;
            }

            /**
             * 物理空间uId
             */
            public Builder spaceId(String spaceId) {
                this.spaceId = spaceId;
                return this;
            }

            /**
             * SpaceName.
             */
            public Builder spaceName(String spaceName) {
                this.spaceName = spaceName;
                return this;
            }

            /**
             * SpaceType.
             */
            public Builder spaceType(String spaceType) {
                this.spaceType = spaceType;
                return this;
            }

            public SetupProject build() {
                return new SetupProject(this);
            } 

        } 

    }
}
