// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20260603.models;

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
 * {@link ListModelDeploymentProfilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelDeploymentProfilesResponseBody</p>
 */
public class ListModelDeploymentProfilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("ModelVersion")
    private String modelVersion;

    @com.aliyun.core.annotation.NameInMap("Profiles")
    private java.util.List<Profiles> profiles;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListModelDeploymentProfilesResponseBody(Builder builder) {
        this.modelId = builder.modelId;
        this.modelVersion = builder.modelVersion;
        this.profiles = builder.profiles;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelDeploymentProfilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return profiles
     */
    public java.util.List<Profiles> getProfiles() {
        return this.profiles;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String modelId; 
        private String modelVersion; 
        private java.util.List<Profiles> profiles; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListModelDeploymentProfilesResponseBody model) {
            this.modelId = model.modelId;
            this.modelVersion = model.modelVersion;
            this.profiles = model.profiles;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * ModelVersion.
         */
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * Profiles.
         */
        public Builder profiles(java.util.List<Profiles> profiles) {
            this.profiles = profiles;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelDeploymentProfilesResponseBody build() {
            return new ListModelDeploymentProfilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelDeploymentProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelDeploymentProfilesResponseBody</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceCategory")
        private String deviceCategory;

        @com.aliyun.core.annotation.NameInMap("DeviceType")
        private String deviceType;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("InstanceTypes")
        private java.util.List<String> instanceTypes;

        private Devices(Builder builder) {
            this.deviceCategory = builder.deviceCategory;
            this.deviceType = builder.deviceType;
            this.displayName = builder.displayName;
            this.instanceTypes = builder.instanceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return deviceCategory
         */
        public String getDeviceCategory() {
            return this.deviceCategory;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return instanceTypes
         */
        public java.util.List<String> getInstanceTypes() {
            return this.instanceTypes;
        }

        public static final class Builder {
            private String deviceCategory; 
            private String deviceType; 
            private String displayName; 
            private java.util.List<String> instanceTypes; 

            private Builder() {
            } 

            private Builder(Devices model) {
                this.deviceCategory = model.deviceCategory;
                this.deviceType = model.deviceType;
                this.displayName = model.displayName;
                this.instanceTypes = model.instanceTypes;
            } 

            /**
             * DeviceCategory.
             */
            public Builder deviceCategory(String deviceCategory) {
                this.deviceCategory = deviceCategory;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * InstanceTypes.
             */
            public Builder instanceTypes(java.util.List<String> instanceTypes) {
                this.instanceTypes = instanceTypes;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelDeploymentProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelDeploymentProfilesResponseBody</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberType")
        private String memberType;

        @com.aliyun.core.annotation.NameInMap("Meta")
        private java.util.Map<String, ?> meta;

        private Members(Builder builder) {
            this.memberType = builder.memberType;
            this.meta = builder.meta;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return memberType
         */
        public String getMemberType() {
            return this.memberType;
        }

        /**
         * @return meta
         */
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public static final class Builder {
            private String memberType; 
            private java.util.Map<String, ?> meta; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.memberType = model.memberType;
                this.meta = model.meta;
            } 

            /**
             * MemberType.
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            /**
             * Meta.
             */
            public Builder meta(java.util.Map<String, ?> meta) {
                this.meta = meta;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelDeploymentProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelDeploymentProfilesResponseBody</p>
     */
    public static class Profiles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Devices")
        private java.util.List<Devices> devices;

        @com.aliyun.core.annotation.NameInMap("Framework")
        private String framework;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.Map<String, String> labels;

        @com.aliyun.core.annotation.NameInMap("Members")
        private java.util.List<Members> members;

        @com.aliyun.core.annotation.NameInMap("Optimizations")
        private java.util.Map<String, String> optimizations;

        @com.aliyun.core.annotation.NameInMap("ProfileId")
        private String profileId;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        private Profiles(Builder builder) {
            this.category = builder.category;
            this.devices = builder.devices;
            this.framework = builder.framework;
            this.labels = builder.labels;
            this.members = builder.members;
            this.optimizations = builder.optimizations;
            this.profileId = builder.profileId;
            this.scenario = builder.scenario;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Profiles create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return devices
         */
        public java.util.List<Devices> getDevices() {
            return this.devices;
        }

        /**
         * @return framework
         */
        public String getFramework() {
            return this.framework;
        }

        /**
         * @return labels
         */
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        /**
         * @return members
         */
        public java.util.List<Members> getMembers() {
            return this.members;
        }

        /**
         * @return optimizations
         */
        public java.util.Map<String, String> getOptimizations() {
            return this.optimizations;
        }

        /**
         * @return profileId
         */
        public String getProfileId() {
            return this.profileId;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        public static final class Builder {
            private String category; 
            private java.util.List<Devices> devices; 
            private String framework; 
            private java.util.Map<String, String> labels; 
            private java.util.List<Members> members; 
            private java.util.Map<String, String> optimizations; 
            private String profileId; 
            private String scenario; 

            private Builder() {
            } 

            private Builder(Profiles model) {
                this.category = model.category;
                this.devices = model.devices;
                this.framework = model.framework;
                this.labels = model.labels;
                this.members = model.members;
                this.optimizations = model.optimizations;
                this.profileId = model.profileId;
                this.scenario = model.scenario;
            } 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Devices.
             */
            public Builder devices(java.util.List<Devices> devices) {
                this.devices = devices;
                return this;
            }

            /**
             * Framework.
             */
            public Builder framework(String framework) {
                this.framework = framework;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.Map<String, String> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Members.
             */
            public Builder members(java.util.List<Members> members) {
                this.members = members;
                return this;
            }

            /**
             * Optimizations.
             */
            public Builder optimizations(java.util.Map<String, String> optimizations) {
                this.optimizations = optimizations;
                return this;
            }

            /**
             * ProfileId.
             */
            public Builder profileId(String profileId) {
                this.profileId = profileId;
                return this;
            }

            /**
             * Scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            public Profiles build() {
                return new Profiles(this);
            } 

        } 

    }
}
