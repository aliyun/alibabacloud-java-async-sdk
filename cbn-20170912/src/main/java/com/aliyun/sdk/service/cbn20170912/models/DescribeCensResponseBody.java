// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
    private Cens cens;

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
         * The information about the CEN instance.
         */
        public Builder cens(Cens cens) {
            this.cens = cens;
            return this;
        }

        /**
         * The number of the page returned.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The total number of entries returned.
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
        @com.aliyun.core.annotation.NameInMap("CenBandwidthPackageId")
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
        @com.aliyun.core.annotation.NameInMap("Tag")
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
        @com.aliyun.core.annotation.NameInMap("CenBandwidthPackageIds")
        private CenBandwidthPackageIds cenBandwidthPackageIds;

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

        @com.aliyun.core.annotation.NameInMap("ProtectionLevel")
        private String protectionLevel;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
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
             * The IDs of the bandwidth plans that are associated with the CEN instance.
             */
            public Builder cenBandwidthPackageIds(CenBandwidthPackageIds cenBandwidthPackageIds) {
                this.cenBandwidthPackageIds = cenBandwidthPackageIds;
                return this;
            }

            /**
             * The CEN instance ID.
             */
            public Builder cenId(String cenId) {
                this.cenId = cenId;
                return this;
            }

            /**
             * The time when the CEN instance was created.
             * <p>
             * 
             * The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.
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
             * Indicates whether IPv6 is enabled for the CEN instance.
             * <p>
             * 
             * *   **ENABLE**
             * *   **DISABLED**
             */
            public Builder ipv6Level(String ipv6Level) {
                this.ipv6Level = ipv6Level;
                return this;
            }

            /**
             * The CEN instance name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The level of CIDR block overlapping.
             * <p>
             * 
             * **REDUCED**: Overlapped CIDR blocks are allowed. This value specifies that CIDR blocks can overlap but CIDR blocks cannot be duplicates.
             */
            public Builder protectionLevel(String protectionLevel) {
                this.protectionLevel = protectionLevel;
                return this;
            }

            /**
             * The ID of the resource group to which the CEN instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the CEN instance.
             * <p>
             * 
             * *   **Creating**
             * *   **Active**
             * *   **Deleting**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The IDs of the tags that are added to the CEN instance.
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
        @com.aliyun.core.annotation.NameInMap("Cen")
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
