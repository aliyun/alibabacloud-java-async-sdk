// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
         * <p>The information about the software that can be installed in the cluster.</p>
         */
        public Builder additionalPackages(AdditionalPackages additionalPackages) {
            this.additionalPackages = additionalPackages;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSoftwaresResponseBody build() {
            return new ListSoftwaresResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
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
             * <p>The OS architecture. Valid values:</p>
             * <ul>
             * <li>x86_64</li>
             * <li>arm64</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>x86_64</p>
             */
            public Builder architecture(String architecture) {
                this.architecture = architecture;
                return this;
            }

            /**
             * <p>The image tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Linux  3.2104 LTS 64 bit ARM Edition</p>
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
    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
    public static class SupportOs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SupportOsInfos")
        private java.util.List<SupportOsInfos> supportOsInfos;

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
        public java.util.List<SupportOsInfos> getSupportOsInfos() {
            return this.supportOsInfos;
        }

        public static final class Builder {
            private java.util.List<SupportOsInfos> supportOsInfos; 

            /**
             * SupportOsInfos.
             */
            public Builder supportOsInfos(java.util.List<SupportOsInfos> supportOsInfos) {
                this.supportOsInfos = supportOsInfos;
                return this;
            }

            public SupportOs build() {
                return new SupportOs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
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
             * <p>Indicates whether the version is the latest.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder latest(String latest) {
                this.latest = latest;
                return this;
            }

            /**
             * <p>The information about the supported OSs.</p>
             */
            public Builder supportOs(SupportOs supportOs) {
                this.supportOs = supportOs;
                return this;
            }

            /**
             * <p>The software version.</p>
             * 
             * <strong>example:</strong>
             * <p>2024.1</p>
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
    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionInfos")
        private java.util.List<VersionInfos> versionInfos;

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
        public java.util.List<VersionInfos> getVersionInfos() {
            return this.versionInfos;
        }

        public static final class Builder {
            private java.util.List<VersionInfos> versionInfos; 

            /**
             * VersionInfos.
             */
            public Builder versionInfos(java.util.List<VersionInfos> versionInfos) {
                this.versionInfos = versionInfos;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
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
             * <p>The application category.</p>
             * 
             * <strong>example:</strong>
             * <p>NWP</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The software description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The URL of the software icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://gw.alicdn.com/imgextra/i2/O1CN01FIkxZ81LmE0fvrAyR_!!6000000001341-55-tps-6349-1603.svg">https://gw.alicdn.com/imgextra/i2/O1CN01FIkxZ81LmE0fvrAyR_!!6000000001341-55-tps-6349-1603.svg</a></p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>The software name.</p>
             * 
             * <strong>example:</strong>
             * <p>gromacs</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The information about the software versions that can be installed in the cluster.</p>
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
    /**
     * 
     * {@link ListSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListSoftwaresResponseBody</p>
     */
    public static class AdditionalPackages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdditionalPackageInfos")
        private java.util.List<AdditionalPackageInfos> additionalPackageInfos;

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
        public java.util.List<AdditionalPackageInfos> getAdditionalPackageInfos() {
            return this.additionalPackageInfos;
        }

        public static final class Builder {
            private java.util.List<AdditionalPackageInfos> additionalPackageInfos; 

            /**
             * AdditionalPackageInfos.
             */
            public Builder additionalPackageInfos(java.util.List<AdditionalPackageInfos> additionalPackageInfos) {
                this.additionalPackageInfos = additionalPackageInfos;
                return this;
            }

            public AdditionalPackages build() {
                return new AdditionalPackages(this);
            } 

        } 

    }
}
