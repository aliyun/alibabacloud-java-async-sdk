// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSetupProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateSetupProjectRequest</p>
 */
public class UpdateSetupProjectRequest extends Request {
    @Body
    @NameInMap("ArchitectureId")
    @Validation(required = true)
    private String architectureId;

    @Body
    @NameInMap("DeliveryTime")
    @Validation(required = true)
    private String deliveryTime;

    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("Nodes")
    @Validation(required = true)
    private String nodes;

    @Body
    @NameInMap("Packages")
    @Validation(required = true)
    private java.util.List < Packages> packages;

    @Body
    @NameInMap("SetupProjectId")
    @Validation(required = true)
    private String setupProjectId;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private UpdateSetupProjectRequest(Builder builder) {
        super(builder);
        this.architectureId = builder.architectureId;
        this.deliveryTime = builder.deliveryTime;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.nodes = builder.nodes;
        this.packages = builder.packages;
        this.setupProjectId = builder.setupProjectId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSetupProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return architectureId
     */
    public String getArchitectureId() {
        return this.architectureId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<UpdateSetupProjectRequest, Builder> {
        private String architectureId; 
        private String deliveryTime; 
        private String description; 
        private String instanceId; 
        private String nodes; 
        private java.util.List < Packages> packages; 
        private String setupProjectId; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSetupProjectRequest request) {
            super(request);
            this.architectureId = request.architectureId;
            this.deliveryTime = request.deliveryTime;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.nodes = request.nodes;
            this.packages = request.packages;
            this.setupProjectId = request.setupProjectId;
            this.spaceId = request.spaceId;
        } 

        /**
         * 架构id
         */
        public Builder architectureId(String architectureId) {
            this.putBodyParameter("ArchitectureId", architectureId);
            this.architectureId = architectureId;
            return this;
        }

        /**
         * 预计交付时间
         */
        public Builder deliveryTime(String deliveryTime) {
            this.putBodyParameter("DeliveryTime", deliveryTime);
            this.deliveryTime = deliveryTime;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 节点
         */
        public Builder nodes(String nodes) {
            this.putBodyParameter("Nodes", nodes);
            this.nodes = nodes;
            return this;
        }

        /**
         * 套餐
         */
        public Builder packages(java.util.List < Packages> packages) {
            String packagesShrink = shrink(packages, "Packages", "json");
            this.putBodyParameter("Packages", packagesShrink);
            this.packages = packages;
            return this;
        }

        /**
         * 代表资源一级ID的资源属性字段
         */
        public Builder setupProjectId(String setupProjectId) {
            this.putBodyParameter("SetupProjectId", setupProjectId);
            this.setupProjectId = setupProjectId;
            return this;
        }

        /**
         * 物理空间uId
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public UpdateSetupProjectRequest build() {
            return new UpdateSetupProjectRequest(this);
        } 

    } 

    public static class Packages extends TeaModel {
        @NameInMap("DeviceNumber")
        private Long deviceNumber;

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
        public Long getDeviceNumber() {
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
            private Long deviceNumber; 
            private String model; 
            private String role; 
            private String vendor; 

            /**
             * 设备号
             */
            public Builder deviceNumber(Long deviceNumber) {
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
}
