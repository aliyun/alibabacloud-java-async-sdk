// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCensResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCensResponseBody</p>
 */
public class DescribeCensResponseBody extends TeaModel {
    @NameInMap("Cens")
    private Cens cens;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public Cens getCens() {
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
        private Cens cens; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The value of the tag.
         */
        public Builder cens(Cens cens) {
            this.cens = cens;
            return this;
        }

        /**
         * The level of CIDR block overlapping.
         * <p>
         * 
         * **REDUCED**: Overlapped CIDR blocks are allowed. This value specifies that CIDR blocks can overlap but CIDR blocks cannot be duplicates.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The status of the CEN instance.
         * <p>
         * 
         * *   **Creating**: The CEN instance is being created.
         * *   **Active**: The CEN instance is running.
         * *   **Deleting**: The instance is being deleted.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group to which the CEN instance belongs.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The IDs of the bandwidth plans that are associated with the CEN instance.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCensResponseBody build() {
            return new DescribeCensResponseBody(this);
        } 

    } 

    public static class CenBandwidthPackageIds extends TeaModel {
        @NameInMap("CenBandwidthPackageId")
        private java.util.List < String > cenBandwidthPackageId;

        private CenBandwidthPackageIds(Builder builder) {
            this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CenBandwidthPackageIds create() {
            return builder().build();
        }

        /**
         * @return cenBandwidthPackageId
         */
        public java.util.List < String > getCenBandwidthPackageId() {
            return this.cenBandwidthPackageId;
        }

        public static final class Builder {
            private java.util.List < String > cenBandwidthPackageId; 

            /**
             * CenBandwidthPackageId.
             */
            public Builder cenBandwidthPackageId(java.util.List < String > cenBandwidthPackageId) {
                this.cenBandwidthPackageId = cenBandwidthPackageId;
                return this;
            }

            public CenBandwidthPackageIds build() {
                return new CenBandwidthPackageIds(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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
             * Queries detailed information about Cloud Enterprise Network (CEN) instances within the current Alibaba Cloud account.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Cen extends TeaModel {
        @NameInMap("CenBandwidthPackageIds")
        private CenBandwidthPackageIds cenBandwidthPackageIds;

        @NameInMap("CenId")
        private String cenId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Ipv6Level")
        private String ipv6Level;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProtectionLevel")
        private String protectionLevel;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        private Cen(Builder builder) {
            this.cenBandwidthPackageIds = builder.cenBandwidthPackageIds;
            this.cenId = builder.cenId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.ipv6Level = builder.ipv6Level;
            this.name = builder.name;
            this.protectionLevel = builder.protectionLevel;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cen create() {
            return builder().build();
        }

        /**
         * @return cenBandwidthPackageIds
         */
        public CenBandwidthPackageIds getCenBandwidthPackageIds() {
            return this.cenBandwidthPackageIds;
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
         * @return protectionLevel
         */
        public String getProtectionLevel() {
            return this.protectionLevel;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private CenBandwidthPackageIds cenBandwidthPackageIds; 
            private String cenId; 
            private String creationTime; 
            private String description; 
            private String ipv6Level; 
            private String name; 
            private String protectionLevel; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 

            /**
             * CenBandwidthPackageIds.
             */
            public Builder cenBandwidthPackageIds(CenBandwidthPackageIds cenBandwidthPackageIds) {
                this.cenBandwidthPackageIds = cenBandwidthPackageIds;
                return this;
            }

            /**
             * The filter condition. Valid values:
             * <p>
             * 
             * *   **CenId**: the ID of a CEN instance.
             * *   **Name**: the name of a CEN instance.
             * 
             * By default, the logical operator among filter conditions is **AND**. Information about a CEN instance is returned only if the CEN instance matches all filter conditions.
             * 
             * You can specify at most five filter conditions in each call.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The tags.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The number of the page returned.
             */
            public Builder ipv6Level(String ipv6Level) {
                this.ipv6Level = ipv6Level;
                return this;
            }

            /**
             * The ID of the CEN instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * The values of the filter condition.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether IPv6 is enabled for the CEN instance.
             * <p>
             * 
             * *   **ENABLE**: enabled
             * *   **DISABLED**: disabled
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tag keys of the resources.
             * <p>
             * 
             * The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
             * 
             * You can specify at most 20 tag keys.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public Cen build() {
                return new Cen(this);
            } 

        } 

    }
    public static class Cens extends TeaModel {
        @NameInMap("Cen")
        private java.util.List < Cen> cen;

        private Cens(Builder builder) {
            this.cen = builder.cen;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cens create() {
            return builder().build();
        }

        /**
         * @return cen
         */
        public java.util.List < Cen> getCen() {
            return this.cen;
        }

        public static final class Builder {
            private java.util.List < Cen> cen; 

            /**
             * Cen.
             */
            public Builder cen(java.util.List < Cen> cen) {
                this.cen = cen;
                return this;
            }

            public Cens build() {
                return new Cens(this);
            } 

        } 

    }
}
