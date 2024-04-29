// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCensResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCensResponseBody</p>
 */
public class DescribeCensResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cens")
    private java.util.List < Cens> cens;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCensResponseBody(Builder builder) {
        this.cens = builder.cens;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCensResponseBody create() {
        return builder().build();
    }

    /**
     * @return cens
     */
    public java.util.List < Cens> getCens() {
        return this.cens;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Cens> cens; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details of the CEN instances.
         */
        public Builder cens(java.util.List < Cens> cens) {
            this.cens = cens;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
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
         * The total number of CEN instances returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCensResponseBody build() {
            return new DescribeCensResponseBody(this);
        } 

    } 

    public static class PackageIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageId")
        private String packageId;

        private PackageIds(Builder builder) {
            this.packageId = builder.packageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackageIds create() {
            return builder().build();
        }

        /**
         * @return packageId
         */
        public String getPackageId() {
            return this.packageId;
        }

        public static final class Builder {
            private String packageId; 

            /**
             * The ID of the bandwidth plan that is bound to the CEN instance.
             */
            public Builder packageId(String packageId) {
                this.packageId = packageId;
                return this;
            }

            public PackageIds build() {
                return new PackageIds(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Cens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CenId")
        private String cenId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Ipv6Level")
        private String ipv6Level;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PackageIds")
        private java.util.List < PackageIds> packageIds;

        @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
        private String protectionLevel;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Cens(Builder builder) {
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ipv6Level = builder.ipv6Level;
            this.name = builder.name;
            this.packageIds = builder.packageIds;
            this.protectionLevel = builder.protectionLevel;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cens create() {
            return builder().build();
        }

        /**
         * @return cenId
         */
        public String getCenId() {
            return this.cenId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ipv6Level
         */
        public String getIpv6Level() {
            return this.ipv6Level;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return packageIds
         */
        public java.util.List < PackageIds> getPackageIds() {
            return this.packageIds;
        }

        /**
         * @return protectionLevel
         */
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String cenId; 
            private String creationTime; 
            private String description; 
            private String ipv6Level; 
            private String name; 
            private java.util.List < PackageIds> packageIds; 
            private String protectionLevel; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * The ID of the CEN instance.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The time when the CEN instance was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the CEN instance.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The IPv6 level.
             * <p>
             * 
             * >  IPv6 is not supported.
             * 
             * Valid value:
             * 
             * *   DISABLED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder ipv6Level(String ipv6Level) {
                this.ipv6Level = ipv6Level;
                return this;
            }

            /**
             * The name of the CEN instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The bandwidth plans that are bound to the CEN instance.
             */
            public Builder packageIds(java.util.List < PackageIds> packageIds) {
                this.packageIds = packageIds;
                return this;
            }

            /**
             * The tolerated level of CIDR block conflict.
             * <p>
             * 
             * Valid value:
             * 
             * *   REDUCED: CIDR block conflicts are allowed, but the conflicting CIDR blocks cannot be identical.
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * The status of the CEN instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   Creating
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Active
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   Deleting
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags of the CEN instance.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Cens build() {
                return new Cens(this);
            } 

        } 

    }
}
