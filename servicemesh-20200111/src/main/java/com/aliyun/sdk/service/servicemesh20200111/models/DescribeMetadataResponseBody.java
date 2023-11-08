// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetadataResponseBody</p>
 */
public class DescribeMetadataResponseBody extends TeaModel {
    @NameInMap("MetaData")
    private MetaData metaData;

    @NameInMap("RequestId")
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

        /**
         * The metadata of ASM, which contains basic information about ASM.
         */
        public Builder metaData(MetaData metaData) {
            this.metaData = metaData;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMetadataResponseBody build() {
            return new DescribeMetadataResponseBody(this);
        } 

    } 

    public static class ProEdition extends TeaModel {
        @NameInMap("CurrentVersion")
        private String currentVersion;

        @NameInMap("VersionCrds")
        private java.util.List < java.util.Map<String, ?>> versionCrds;

        @NameInMap("VersionRegistry")
        private java.util.List < java.util.Map<String, ?>> versionRegistry;

        @NameInMap("Versions")
        private java.util.List < String > versions;

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
        public java.util.List < java.util.Map<String, ?>> getVersionCrds() {
            return this.versionCrds;
        }

        /**
         * @return versionRegistry
         */
        public java.util.List < java.util.Map<String, ?>> getVersionRegistry() {
            return this.versionRegistry;
        }

        /**
         * @return versions
         */
        public java.util.List < String > getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String currentVersion; 
            private java.util.List < java.util.Map<String, ?>> versionCrds; 
            private java.util.List < java.util.Map<String, ?>> versionRegistry; 
            private java.util.List < String > versions; 

            /**
             * The current version.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The CRDs of all ASM versions.
             */
            public Builder versionCrds(java.util.List < java.util.Map<String, ?>> versionCrds) {
                this.versionCrds = versionCrds;
                return this;
            }

            /**
             * The Istio versions corresponding to the ASM versions.
             */
            public Builder versionRegistry(java.util.List < java.util.Map<String, ?>> versionRegistry) {
                this.versionRegistry = versionRegistry;
                return this;
            }

            /**
             * The list of ASM versions.
             */
            public Builder versions(java.util.List < String > versions) {
                this.versions = versions;
                return this;
            }

            public ProEdition build() {
                return new ProEdition(this);
            } 

        } 

    }
    public static class MetaData extends TeaModel {
        @NameInMap("CurrentVersion")
        private String currentVersion;

        @NameInMap("ProEdition")
        private ProEdition proEdition;

        @NameInMap("Regions")
        private java.util.List < String > regions;

        @NameInMap("VersionCrds")
        private java.util.List < java.util.Map<String, ?>> versionCrds;

        @NameInMap("VersionRegistry")
        private java.util.List < java.util.Map<String, ?>> versionRegistry;

        @NameInMap("Versions")
        private java.util.List < String > versions;

        private MetaData(Builder builder) {
            this.currentVersion = builder.currentVersion;
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
         * @return currentVersion
         */
        public String getCurrentVersion() {
            return this.currentVersion;
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
        public java.util.List < String > getRegions() {
            return this.regions;
        }

        /**
         * @return versionCrds
         */
        public java.util.List < java.util.Map<String, ?>> getVersionCrds() {
            return this.versionCrds;
        }

        /**
         * @return versionRegistry
         */
        public java.util.List < java.util.Map<String, ?>> getVersionRegistry() {
            return this.versionRegistry;
        }

        /**
         * @return versions
         */
        public java.util.List < String > getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String currentVersion; 
            private ProEdition proEdition; 
            private java.util.List < String > regions; 
            private java.util.List < java.util.Map<String, ?>> versionCrds; 
            private java.util.List < java.util.Map<String, ?>> versionRegistry; 
            private java.util.List < String > versions; 

            /**
             * The current version.
             */
            public Builder currentVersion(String currentVersion) {
                this.currentVersion = currentVersion;
                return this;
            }

            /**
             * The version information about ASM of a commercial edition.
             */
            public Builder proEdition(ProEdition proEdition) {
                this.proEdition = proEdition;
                return this;
            }

            /**
             * The regions where ASM instances can be created.
             */
            public Builder regions(java.util.List < String > regions) {
                this.regions = regions;
                return this;
            }

            /**
             * The custom resource definitions (CRDs) of all ASM versions.
             */
            public Builder versionCrds(java.util.List < java.util.Map<String, ?>> versionCrds) {
                this.versionCrds = versionCrds;
                return this;
            }

            /**
             * The Istio versions corresponding to the ASM versions.
             */
            public Builder versionRegistry(java.util.List < java.util.Map<String, ?>> versionRegistry) {
                this.versionRegistry = versionRegistry;
                return this;
            }

            /**
             * The list of ASM versions.
             */
            public Builder versions(java.util.List < String > versions) {
                this.versions = versions;
                return this;
            }

            public MetaData build() {
                return new MetaData(this);
            } 

        } 

    }
}
