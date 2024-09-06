// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstalledSoftwaresResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstalledSoftwaresResponseBody</p>
 */
public class ListInstalledSoftwaresResponseBody extends TeaModel {
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

    private ListInstalledSoftwaresResponseBody(Builder builder) {
        this.additionalPackages = builder.additionalPackages;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstalledSoftwaresResponseBody create() {
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
         * The list of installed software.
         */
        public Builder additionalPackages(AdditionalPackages additionalPackages) {
            this.additionalPackages = additionalPackages;
            return this;
        }

        /**
         * The page number of the returned page.
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

        public ListInstalledSoftwaresResponseBody build() {
            return new ListInstalledSoftwaresResponseBody(this);
        } 

    } 

    public static class AdditionalPackageInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private AdditionalPackageInfos(Builder builder) {
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.icon = builder.icon;
            this.name = builder.name;
            this.status = builder.status;
            this.version = builder.version;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String category; 
            private String createTime; 
            private String description; 
            private String icon; 
            private String name; 
            private String status; 
            private String version; 

            /**
             * The category into which the software falls.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the software was installed.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * The installation status of the software.
             * <p>
             * 
             * Valid values:
             * 
             * *   Installed
             * *   Uninstalled
             * *   Installing
             * *   Exception
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The software version.
             */
            public Builder version(String version) {
                this.version = version;
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
