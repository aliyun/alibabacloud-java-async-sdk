// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetadataResponseBody</p>
 */
public class DescribeMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MetaData")
    private MetaData metaData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeMetadataResponseBody(Builder builder) {
        this.metaData = builder.metaData;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetadataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metaData
     */
    public MetaData getMetaData() {
        return this.metaData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MetaData metaData; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeMetadataResponseBody model) {
            this.metaData = model.metaData;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ASM metadata, including the basic information about ASM.</p>
         */
        public Builder metaData(MetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F93DDAD7-6E04-5AC3-86F4-852708******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMetadataResponseBody build() {
            return new DescribeMetadataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetadataResponseBody</p>
     */
    public static class PlaygroundScene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("observability")
        private java.util.List<String> observability;

        @com.aliyun.core.annotation.NameInMap("other")
        private java.util.List<String> other;

        @com.aliyun.core.annotation.NameInMap("security")
        private java.util.List<String> security;

        @com.aliyun.core.annotation.NameInMap("trafficManagement")
        private java.util.List<String> trafficManagement;

        private PlaygroundScene(Builder builder) {
            this.observability = builder.observability;
            this.other = builder.other;
            this.security = builder.security;
            this.trafficManagement = builder.trafficManagement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlaygroundScene create() {
            return builder().build();
        }

        /**
         * @return observability
         */
        public java.util.List<String> getObservability() {
            return this.observability;
        }

        /**
         * @return other
         */
        public java.util.List<String> getOther() {
            return this.other;
        }

        /**
         * @return security
         */
        public java.util.List<String> getSecurity() {
            return this.security;
        }

        /**
         * @return trafficManagement
         */
        public java.util.List<String> getTrafficManagement() {
            return this.trafficManagement;
        }

        public static final class Builder {
            private java.util.List<String> observability; 
            private java.util.List<String> other; 
            private java.util.List<String> security; 
            private java.util.List<String> trafficManagement; 

            private Builder() {
            } 

            private Builder(PlaygroundScene model) {
                this.observability = model.observability;
                this.other = model.other;
                this.security = model.security;
                this.trafficManagement = model.trafficManagement;
            } 

            /**
             * <p>The observability scenarios.</p>
             */
            public Builder observability(java.util.List<String> observability) {
                this.observability = observability;
                return this;
            }

            /**
             * <p>Other scenarios.</p>
             */
            public Builder other(java.util.List<String> other) {
                this.other = other;
                return this;
            }

            /**
             * <p>The security scenarios.</p>
             */
            public Builder security(java.util.List<String> security) {
                this.security = security;
                return this;
            }

            /**
             * <p>The traffic management scenarios.</p>
             */
            public Builder trafficManagement(java.util.List<String> trafficManagement) {
                this.trafficManagement = trafficManagement;
                return this;
            }

            public PlaygroundScene build() {
                return new PlaygroundScene(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetadataResponseBody</p>
     */
    public static class ProEdition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("VersionCrds")
        private java.util.List<java.util.Map<String, ?>> versionCrds;

        @com.aliyun.core.annotation.NameInMap("VersionRegistry")
        private java.util.List<java.util.Map<String, ?>> versionRegistry;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<String> versions;

        private ProEdition(Builder builder) {
            this.currentVersion = builder.currentVersion;
            this.versionCrds = builder.versionCrds;
            this.versionRegistry = builder.versionRegistry;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProEdition create() {
            return builder().build();
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return versionCrds
         */
        public java.util.List<java.util.Map<String, ?>> getVersionCrds() {
            return this.versionCrds;
        }

        /**
         * @return versionRegistry
         */
        public java.util.List<java.util.Map<String, ?>> getVersionRegistry() {
            return this.versionRegistry;
        }

        /**
         * @return versions
         */
        public java.util.List<String> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String currentVersion; 
            private java.util.List<java.util.Map<String, ?>> versionCrds; 
            private java.util.List<java.util.Map<String, ?>> versionRegistry; 
            private java.util.List<String> versions; 

            private Builder() {
            } 

            private Builder(ProEdition model) {
                this.currentVersion = model.currentVersion;
                this.versionCrds = model.versionCrds;
                this.versionRegistry = model.versionRegistry;
                this.versions = model.versions;
            } 

            /**
             * <p>The current version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.14.3.87-g96cf7305-aliyun</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The CRDs of all ASM versions.</p>
             */
            public Builder versionCrds(java.util.List<java.util.Map<String, ?>> versionCrds) {
                this.versionCrds = versionCrds;
                return this;
            }

            /**
             * <p>The Istio versions corresponding to the ASM versions.</p>
             */
            public Builder versionRegistry(java.util.List<java.util.Map<String, ?>> versionRegistry) {
                this.versionRegistry = versionRegistry;
                return this;
            }

            /**
             * <p>The list of ASM versions.</p>
             */
            public Builder versions(java.util.List<String> versions) {
                this.versions = versions;
                return this;
            }

            public ProEdition build() {
                return new ProEdition(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetadataResponseBody</p>
     */
    public static class MetaData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompatibilityInfoList")
        private java.util.List<java.util.Map<String, ?>> compatibilityInfoList;

        @com.aliyun.core.annotation.NameInMap("CurrentVersion")
        private String currentVersion;

        @com.aliyun.core.annotation.NameInMap("PlaygroundScene")
        private PlaygroundScene playgroundScene;

        @com.aliyun.core.annotation.NameInMap("ProEdition")
        private ProEdition proEdition;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private java.util.List<String> regions;

        @com.aliyun.core.annotation.NameInMap("VersionCrds")
        private java.util.List<java.util.Map<String, ?>> versionCrds;

        @com.aliyun.core.annotation.NameInMap("VersionRegistry")
        private java.util.List<java.util.Map<String, ?>> versionRegistry;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<String> versions;

        private MetaData(Builder builder) {
            this.compatibilityInfoList = builder.compatibilityInfoList;
            this.currentVersion = builder.currentVersion;
            this.playgroundScene = builder.playgroundScene;
            this.proEdition = builder.proEdition;
            this.regions = builder.regions;
            this.versionCrds = builder.versionCrds;
            this.versionRegistry = builder.versionRegistry;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaData create() {
            return builder().build();
        }

        /**
         * @return compatibilityInfoList
         */
        public java.util.List<java.util.Map<String, ?>> getCompatibilityInfoList() {
            return this.compatibilityInfoList;
        }

        /**
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        /**
         * @return playgroundScene
         */
        public PlaygroundScene getPlaygroundScene() {
            return this.playgroundScene;
        }

        /**
         * @return proEdition
         */
        public ProEdition getProEdition() {
            return this.proEdition;
        }

        /**
         * @return regions
         */
        public java.util.List<String> getRegions() {
            return this.regions;
        }

        /**
         * @return versionCrds
         */
        public java.util.List<java.util.Map<String, ?>> getVersionCrds() {
            return this.versionCrds;
        }

        /**
         * @return versionRegistry
         */
        public java.util.List<java.util.Map<String, ?>> getVersionRegistry() {
            return this.versionRegistry;
        }

        /**
         * @return versions
         */
        public java.util.List<String> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> compatibilityInfoList; 
            private String currentVersion; 
            private PlaygroundScene playgroundScene; 
            private ProEdition proEdition; 
            private java.util.List<String> regions; 
            private java.util.List<java.util.Map<String, ?>> versionCrds; 
            private java.util.List<java.util.Map<String, ?>> versionRegistry; 
            private java.util.List<String> versions; 

            private Builder() {
            } 

            private Builder(MetaData model) {
                this.compatibilityInfoList = model.compatibilityInfoList;
                this.currentVersion = model.currentVersion;
                this.playgroundScene = model.playgroundScene;
                this.proEdition = model.proEdition;
                this.regions = model.regions;
                this.versionCrds = model.versionCrds;
                this.versionRegistry = model.versionRegistry;
                this.versions = model.versions;
            } 

            /**
             * <p>The Kubernetes versions compatible with ASM.</p>
             */
            public Builder compatibilityInfoList(java.util.List<java.util.Map<String, ?>> compatibilityInfoList) {
                this.compatibilityInfoList = compatibilityInfoList;
                return this;
            }

            /**
             * <p>The current version.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.14.3.87-g96cf7305-aliyun</p>
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * <p>The data of the ASM Playground.</p>
             */
            public Builder playgroundScene(PlaygroundScene playgroundScene) {
                this.playgroundScene = playgroundScene;
                return this;
            }

            /**
             * <p>The version information about ASM of a commercial edition.</p>
             */
            public Builder proEdition(ProEdition proEdition) {
                this.proEdition = proEdition;
                return this;
            }

            /**
             * <p>The regions where ASM instances can be created.</p>
             */
            public Builder regions(java.util.List<String> regions) {
                this.regions = regions;
                return this;
            }

            /**
             * <p>The custom resource definitions (CRDs) of all ASM versions.</p>
             */
            public Builder versionCrds(java.util.List<java.util.Map<String, ?>> versionCrds) {
                this.versionCrds = versionCrds;
                return this;
            }

            /**
             * <p>The Istio versions corresponding to the ASM versions.</p>
             */
            public Builder versionRegistry(java.util.List<java.util.Map<String, ?>> versionRegistry) {
                this.versionRegistry = versionRegistry;
                return this;
            }

            /**
             * <p>The list of ASM versions.</p>
             */
            public Builder versions(java.util.List<String> versions) {
                this.versions = versions;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
}
