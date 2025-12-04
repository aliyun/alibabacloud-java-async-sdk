// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link CreateEmbodiedAIPlatformRequest} extends {@link RequestModel}
 *
 * <p>CreateEmbodiedAIPlatformRequest</p>
 */
public class CreateEmbodiedAIPlatformRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platformName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RayConfig")
    private RayConfig rayConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebserverSpecName")
    private String webserverSpecName;

    private CreateEmbodiedAIPlatformRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.platformName = builder.platformName;
        this.rayConfig = builder.rayConfig;
        this.regionId = builder.regionId;
        this.webserverSpecName = builder.webserverSpecName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEmbodiedAIPlatformRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return platformName
     */
    public String getPlatformName() {
        return this.platformName;
    }

    /**
     * @return rayConfig
     */
    public RayConfig getRayConfig() {
        return this.rayConfig;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return webserverSpecName
     */
    public String getWebserverSpecName() {
        return this.webserverSpecName;
    }

    public static final class Builder extends Request.Builder<CreateEmbodiedAIPlatformRequest, Builder> {
        private String DBClusterId; 
        private String platformName; 
        private RayConfig rayConfig; 
        private String regionId; 
        private String webserverSpecName; 

        private Builder() {
            super();
        } 

        private Builder(CreateEmbodiedAIPlatformRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.platformName = request.platformName;
            this.rayConfig = request.rayConfig;
            this.regionId = request.regionId;
            this.webserverSpecName = request.webserverSpecName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-bp11q28kvl688****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>platform1</p>
         */
        public Builder platformName(String platformName) {
            this.putQueryParameter("PlatformName", platformName);
            this.platformName = platformName;
            return this;
        }

        /**
         * RayConfig.
         */
        public Builder rayConfig(RayConfig rayConfig) {
            String rayConfigShrink = shrink(rayConfig, "RayConfig", "json");
            this.putQueryParameter("RayConfig", rayConfigShrink);
            this.rayConfig = rayConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * WebserverSpecName.
         */
        public Builder webserverSpecName(String webserverSpecName) {
            this.putQueryParameter("WebserverSpecName", webserverSpecName);
            this.webserverSpecName = webserverSpecName;
            return this;
        }

        @Override
        public CreateEmbodiedAIPlatformRequest build() {
            return new CreateEmbodiedAIPlatformRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateEmbodiedAIPlatformRequest} extends {@link TeaModel}
     *
     * <p>CreateEmbodiedAIPlatformRequest</p>
     */
    public static class WorkerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocateUnit")
        private String allocateUnit;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("MaxWorkerQuantity")
        private Integer maxWorkerQuantity;

        @com.aliyun.core.annotation.NameInMap("MinWorkerQuantity")
        private Integer minWorkerQuantity;

        @com.aliyun.core.annotation.NameInMap("WorkerDiskCapacity")
        private String workerDiskCapacity;

        @com.aliyun.core.annotation.NameInMap("WorkerSpecName")
        private String workerSpecName;

        @com.aliyun.core.annotation.NameInMap("WorkerSpecType")
        private String workerSpecType;

        private WorkerGroups(Builder builder) {
            this.allocateUnit = builder.allocateUnit;
            this.groupName = builder.groupName;
            this.maxWorkerQuantity = builder.maxWorkerQuantity;
            this.minWorkerQuantity = builder.minWorkerQuantity;
            this.workerDiskCapacity = builder.workerDiskCapacity;
            this.workerSpecName = builder.workerSpecName;
            this.workerSpecType = builder.workerSpecType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerGroups create() {
            return builder().build();
        }

        /**
         * @return allocateUnit
         */
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return maxWorkerQuantity
         */
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        /**
         * @return minWorkerQuantity
         */
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        /**
         * @return workerDiskCapacity
         */
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        /**
         * @return workerSpecName
         */
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        /**
         * @return workerSpecType
         */
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

        public static final class Builder {
            private String allocateUnit; 
            private String groupName; 
            private Integer maxWorkerQuantity; 
            private Integer minWorkerQuantity; 
            private String workerDiskCapacity; 
            private String workerSpecName; 
            private String workerSpecType; 

            private Builder() {
            } 

            private Builder(WorkerGroups model) {
                this.allocateUnit = model.allocateUnit;
                this.groupName = model.groupName;
                this.maxWorkerQuantity = model.maxWorkerQuantity;
                this.minWorkerQuantity = model.minWorkerQuantity;
                this.workerDiskCapacity = model.workerDiskCapacity;
                this.workerSpecName = model.workerSpecName;
                this.workerSpecType = model.workerSpecType;
            } 

            /**
             * AllocateUnit.
             */
            public Builder allocateUnit(String allocateUnit) {
                this.allocateUnit = allocateUnit;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * MaxWorkerQuantity.
             */
            public Builder maxWorkerQuantity(Integer maxWorkerQuantity) {
                this.maxWorkerQuantity = maxWorkerQuantity;
                return this;
            }

            /**
             * MinWorkerQuantity.
             */
            public Builder minWorkerQuantity(Integer minWorkerQuantity) {
                this.minWorkerQuantity = minWorkerQuantity;
                return this;
            }

            /**
             * WorkerDiskCapacity.
             */
            public Builder workerDiskCapacity(String workerDiskCapacity) {
                this.workerDiskCapacity = workerDiskCapacity;
                return this;
            }

            /**
             * WorkerSpecName.
             */
            public Builder workerSpecName(String workerSpecName) {
                this.workerSpecName = workerSpecName;
                return this;
            }

            /**
             * WorkerSpecType.
             */
            public Builder workerSpecType(String workerSpecType) {
                this.workerSpecType = workerSpecType;
                return this;
            }

            public WorkerGroups build() {
                return new WorkerGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateEmbodiedAIPlatformRequest} extends {@link TeaModel}
     *
     * <p>CreateEmbodiedAIPlatformRequest</p>
     */
    public static class RayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("HeadSpec")
        private String headSpec;

        @com.aliyun.core.annotation.NameInMap("WorkerGroups")
        private java.util.List<WorkerGroups> workerGroups;

        private RayConfig(Builder builder) {
            this.category = builder.category;
            this.headSpec = builder.headSpec;
            this.workerGroups = builder.workerGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RayConfig create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return headSpec
         */
        public String getHeadSpec() {
            return this.headSpec;
        }

        /**
         * @return workerGroups
         */
        public java.util.List<WorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

        public static final class Builder {
            private String category; 
            private String headSpec; 
            private java.util.List<WorkerGroups> workerGroups; 

            private Builder() {
            } 

            private Builder(RayConfig model) {
                this.category = model.category;
                this.headSpec = model.headSpec;
                this.workerGroups = model.workerGroups;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * HeadSpec.
             */
            public Builder headSpec(String headSpec) {
                this.headSpec = headSpec;
                return this;
            }

            /**
             * WorkerGroups.
             */
            public Builder workerGroups(java.util.List<WorkerGroups> workerGroups) {
                this.workerGroups = workerGroups;
                return this;
            }

            public RayConfig build() {
                return new RayConfig(this);
            } 

        } 

    }
}
