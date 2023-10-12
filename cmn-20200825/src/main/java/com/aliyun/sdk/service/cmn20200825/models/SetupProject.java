// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetupProject} extends {@link TeaModel}
 *
 * <p>SetupProject</p>
 */
public class SetupProject extends TeaModel {
    @NameInMap("ArchId")
    private String archId;

    @NameInMap("ArchVersion")
    private String archVersion;

    @NameInMap("ArchitectureId")
    private String architectureId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DeliveryTime")
    private String deliveryTime;

    @NameInMap("Description")
    private String description;

    @NameInMap("Nodes")
    private String nodes;

    @NameInMap("Packages")
    private java.util.List < Packages> packages;

    @NameInMap("SetupProjectId")
    private String setupProjectId;

    @NameInMap("SetupProjectName")
    private String setupProjectName;

    @NameInMap("SpaceId")
    private String spaceId;

    @NameInMap("SpaceName")
    private String spaceName;

    @NameInMap("SpaceType")
    private String spaceType;

    @NameInMap("Status")
    private String status;

    private SetupProject(Builder builder) {
        this.archId = builder.archId;
        this.archVersion = builder.archVersion;
        this.architectureId = builder.architectureId;
        this.createTime = builder.createTime;
        this.deliveryTime = builder.deliveryTime;
        this.description = builder.description;
        this.nodes = builder.nodes;
        this.packages = builder.packages;
        this.setupProjectId = builder.setupProjectId;
        this.setupProjectName = builder.setupProjectName;
        this.spaceId = builder.spaceId;
        this.spaceName = builder.spaceName;
        this.spaceType = builder.spaceType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetupProject create() {
        return builder().build();
    }

    /**
     * @return archId
     */
    public String getArchId() {
        return this.archId;
    }

    /**
     * @return archVersion
     */
    public String getArchVersion() {
        return this.archVersion;
    }

    /**
     * @return architectureId
     */
    public String getArchitectureId() {
        return this.architectureId;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return setupProjectId
     */
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    /**
     * @return setupProjectName
     */
    public String getSetupProjectName() {
        return this.setupProjectName;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String archId; 
        private String archVersion; 
        private String architectureId; 
        private String createTime; 
        private String deliveryTime; 
        private String description; 
        private String nodes; 
        private java.util.List < Packages> packages; 
        private String setupProjectId; 
        private String setupProjectName; 
        private String spaceId; 
        private String spaceName; 
        private String spaceType; 
        private String status; 

        /**
         * ArchId.
         */
        public Builder archId(String archId) {
            this.archId = archId;
            return this;
        }

        /**
         * ArchVersion.
         */
        public Builder archVersion(String archVersion) {
            this.archVersion = archVersion;
            return this;
        }

        /**
         * ArchitectureId.
         */
        public Builder architectureId(String architectureId) {
            this.architectureId = architectureId;
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
         * DeliveryTime.
         */
        public Builder deliveryTime(String deliveryTime) {
            this.deliveryTime = deliveryTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(String nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * Packages.
         */
        public Builder packages(java.util.List < Packages> packages) {
            this.packages = packages;
            return this;
        }

        /**
         * SetupProjectId.
         */
        public Builder setupProjectId(String setupProjectId) {
            this.setupProjectId = setupProjectId;
            return this;
        }

        /**
         * SetupProjectName.
         */
        public Builder setupProjectName(String setupProjectName) {
            this.setupProjectName = setupProjectName;
            return this;
        }

        /**
         * SpaceId.
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SetupProject build() {
            return new SetupProject(this);
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
             * DeviceNumber.
             */
            public Builder deviceNumber(String deviceNumber) {
                this.deviceNumber = deviceNumber;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
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
             * Vendor.
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
}
