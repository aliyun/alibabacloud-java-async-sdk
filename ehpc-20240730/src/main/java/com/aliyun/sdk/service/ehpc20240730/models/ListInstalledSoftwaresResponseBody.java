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
         * <p>The list of installed software.</p>
         */
        public Builder additionalPackages(AdditionalPackages additionalPackages) {
            this.additionalPackages = additionalPackages;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
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
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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

        public ListInstalledSoftwaresResponseBody build() {
            return new ListInstalledSoftwaresResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstalledSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstalledSoftwaresResponseBody</p>
     */
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
             * <p>The category into which the software falls.</p>
             * 
             * <strong>example:</strong>
             * <p>NWP</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The time when the software was installed.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 18:24:08</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * <p>The installation status of the software.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Installed</li>
             * <li>Uninstalled</li>
             * <li>Installing</li>
             * <li>Exception</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Installed</p>
             */
            public Builder status(String status) {
                this.status = status;
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

            public AdditionalPackageInfos build() {
                return new AdditionalPackageInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstalledSoftwaresResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstalledSoftwaresResponseBody</p>
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
