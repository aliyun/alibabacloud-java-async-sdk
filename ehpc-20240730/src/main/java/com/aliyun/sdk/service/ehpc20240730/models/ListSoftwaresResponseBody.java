// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
 *
 * <p>ListSoftwaresResponseBody</p>
 */
public class ListSoftwaresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalPackages")
    private AdditionalPackages additionalPackages;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListSoftwaresResponseBody(Builder builder) {
        this.additionalPackages = builder.additionalPackages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwaresResponseBody create() {
        return builder().build();
    }

    /**
     * @return additionalPackages
     */
    public AdditionalPackages getAdditionalPackages() {
        return this.additionalPackages;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AdditionalPackages additionalPackages; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 
        private String totalCount; 

        /**
         * The information about the software that can be installed in the cluster.
         */
        public Builder additionalPackages(AdditionalPackages additionalPackages) {
            this.additionalPackages = additionalPackages;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSoftwaresResponseBody build() {
            return new ListSoftwaresResponseBody(this);
        } 

    } 

    public static class SupportOsInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Architecture")
        private String architecture;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        private SupportOsInfos(Builder builder) {
            this.architecture = builder.architecture;
            this.osTag = builder.osTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportOsInfos create() {
            return builder().build();
        }

        /**
         * @return architecture
         */
        public String getArchitecture() {
            return this.architecture;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        public static final class Builder {
            private String architecture; 
            private String osTag; 

            /**
             * The OS architecture. Valid values:
             * <p>
             * 
             * *   x86\_64
             * *   arm64
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * The image tag.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            public SupportOsInfos build() {
                return new SupportOsInfos(this);
            } 

        } 

    }
    public static class SupportOs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportOsInfos")
        private java.util.List < SupportOsInfos> supportOsInfos;

        private SupportOs(Builder builder) {
            this.supportOsInfos = builder.supportOsInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportOs create() {
            return builder().build();
        }

        /**
         * @return supportOsInfos
         */
        public java.util.List < SupportOsInfos> getSupportOsInfos() {
            return this.supportOsInfos;
        }

        public static final class Builder {
            private java.util.List < SupportOsInfos> supportOsInfos; 

            /**
             * SupportOsInfos.
             */
            public Builder supportOsInfos(java.util.List < SupportOsInfos> supportOsInfos) {
                this.supportOsInfos = supportOsInfos;
                return this;
            }

            public SupportOs build() {
                return new SupportOs(this);
            } 

        } 

    }
    public static class VersionInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Latest")
        private String latest;

        @com.aliyun.core.annotation.NameInMap("SupportOs")
        private SupportOs supportOs;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private VersionInfos(Builder builder) {
            this.latest = builder.latest;
            this.supportOs = builder.supportOs;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionInfos create() {
            return builder().build();
        }

        /**
         * @return latest
         */
        public String getLatest() {
            return this.latest;
        }

        /**
         * @return supportOs
         */
        public SupportOs getSupportOs() {
            return this.supportOs;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String latest; 
            private SupportOs supportOs; 
            private String version; 

            /**
             * Indicates whether the version is the latest.
             */
            public Builder latest(String latest) {
                this.latest = latest;
                return this;
            }

            /**
             * The information about the supported OSs.
             */
            public Builder supportOs(SupportOs supportOs) {
                this.supportOs = supportOs;
                return this;
            }

            /**
             * The software version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionInfos build() {
                return new VersionInfos(this);
            } 

        } 

    }
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionInfos")
        private java.util.List < VersionInfos> versionInfos;

        private Versions(Builder builder) {
            this.versionInfos = builder.versionInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return versionInfos
         */
        public java.util.List < VersionInfos> getVersionInfos() {
            return this.versionInfos;
        }

        public static final class Builder {
            private java.util.List < VersionInfos> versionInfos; 

            /**
             * VersionInfos.
             */
            public Builder versionInfos(java.util.List < VersionInfos> versionInfos) {
                this.versionInfos = versionInfos;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    public static class AdditionalPackageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private Versions versions;

        private AdditionalPackageInfos(Builder builder) {
            this.category = builder.category;
            this.description = builder.description;
            this.icon = builder.icon;
            this.name = builder.name;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalPackageInfos create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return versions
         */
        public Versions getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String category; 
            private String description; 
            private String icon; 
            private String name; 
            private Versions versions; 

            /**
             * The application category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The software description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The URL of the software icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * The software name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The information about the software versions that can be installed in the cluster.
             */
            public Builder versions(Versions versions) {
                this.versions = versions;
                return this;
            }

            public AdditionalPackageInfos build() {
                return new AdditionalPackageInfos(this);
            } 

        } 

    }
    public static class AdditionalPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalPackageInfos")
        private java.util.List < AdditionalPackageInfos> additionalPackageInfos;

        private AdditionalPackages(Builder builder) {
            this.additionalPackageInfos = builder.additionalPackageInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdditionalPackages create() {
            return builder().build();
        }

        /**
         * @return additionalPackageInfos
         */
        public java.util.List < AdditionalPackageInfos> getAdditionalPackageInfos() {
            return this.additionalPackageInfos;
        }

        public static final class Builder {
            private java.util.List < AdditionalPackageInfos> additionalPackageInfos; 

            /**
             * AdditionalPackageInfos.
             */
            public Builder additionalPackageInfos(java.util.List < AdditionalPackageInfos> additionalPackageInfos) {
                this.additionalPackageInfos = additionalPackageInfos;
                return this;
            }

            public AdditionalPackages build() {
                return new AdditionalPackages(this);
            } 

        } 

    }
}
