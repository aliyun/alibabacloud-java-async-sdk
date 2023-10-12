// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSetupProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSetupProjectsResponseBody</p>
 */
public class ListSetupProjectsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SetupProject")
    private java.util.List < SetupProject> setupProject;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListSetupProjectsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.setupProject = builder.setupProject;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSetupProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public Integer getNextToken() {
        return this.nextToken;
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
    public java.util.List < SetupProject> getSetupProject() {
        return this.setupProject;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long maxResults; 
        private Integer nextToken; 
        private String requestId; 
        private java.util.List < SetupProject> setupProject; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

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
        public Builder setupProject(java.util.List < SetupProject> setupProject) {
            this.setupProject = setupProject;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSetupProjectsResponseBody build() {
            return new ListSetupProjectsResponseBody(this);
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
    public static class SetupProject extends TeaModel {
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
            this.archVersion = builder.archVersion;
            this.architectureId = builder.architectureId;
            this.createTime = builder.createTime;
            this.deliveryTime = builder.deliveryTime;
            this.description = builder.description;
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
            private String archVersion; 
            private String architectureId; 
            private String createTime; 
            private String deliveryTime; 
            private String description; 
            private String nodes; 
            private java.util.List < Packages> packages; 
            private String progress; 
            private String setupProjectId; 
            private String spaceId; 
            private String spaceName; 
            private String spaceType; 

            /**
             * 架构id
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
