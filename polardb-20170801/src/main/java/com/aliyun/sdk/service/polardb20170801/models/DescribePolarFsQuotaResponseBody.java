// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarFsQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarFsQuotaResponseBody</p>
 */
public class DescribePolarFsQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    @com.aliyun.core.annotation.NameInMap("PolicyItems")
    private java.util.List<PolicyItems> policyItems;

    @com.aliyun.core.annotation.NameInMap("QuotaItems")
    private java.util.List<QuotaItems> quotaItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribePolarFsQuotaResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.polarFsInstanceId = builder.polarFsInstanceId;
        this.policyItems = builder.policyItems;
        this.quotaItems = builder.quotaItems;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    /**
     * @return policyItems
     */
    public java.util.List<PolicyItems> getPolicyItems() {
        return this.policyItems;
    }

    /**
     * @return quotaItems
     */
    public java.util.List<QuotaItems> getQuotaItems() {
        return this.quotaItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageRecordCount; 
        private String pageSize; 
        private String path; 
        private String polarFsInstanceId; 
        private java.util.List<PolicyItems> policyItems; 
        private java.util.List<QuotaItems> quotaItems; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribePolarFsQuotaResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.path = model.path;
            this.polarFsInstanceId = model.polarFsInstanceId;
            this.policyItems = model.policyItems;
            this.quotaItems = model.quotaItems;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * PolicyItems.
         */
        public Builder policyItems(java.util.List<PolicyItems> policyItems) {
            this.policyItems = policyItems;
            return this;
        }

        /**
         * QuotaItems.
         */
        public Builder quotaItems(java.util.List<QuotaItems> quotaItems) {
            this.quotaItems = quotaItems;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePolarFsQuotaResponseBody build() {
            return new DescribePolarFsQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarFsQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsQuotaResponseBody</p>
     */
    public static class PolicyItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessTTL")
        private Long accessTTL;

        @com.aliyun.core.annotation.NameInMap("ChangeTTL")
        private Long changeTTL;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Exclude")
        private String exclude;

        @com.aliyun.core.annotation.NameInMap("FileCountLimit")
        private Long fileCountLimit;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Include")
        private String include;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("SizeLimit")
        private Long sizeLimit;

        private PolicyItems(Builder builder) {
            this.accessTTL = builder.accessTTL;
            this.changeTTL = builder.changeTTL;
            this.description = builder.description;
            this.enabled = builder.enabled;
            this.exclude = builder.exclude;
            this.fileCountLimit = builder.fileCountLimit;
            this.id = builder.id;
            this.include = builder.include;
            this.name = builder.name;
            this.priority = builder.priority;
            this.sizeLimit = builder.sizeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyItems create() {
            return builder().build();
        }

        /**
         * @return accessTTL
         */
        public Long getAccessTTL() {
            return this.accessTTL;
        }

        /**
         * @return changeTTL
         */
        public Long getChangeTTL() {
            return this.changeTTL;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return exclude
         */
        public String getExclude() {
            return this.exclude;
        }

        /**
         * @return fileCountLimit
         */
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return include
         */
        public String getInclude() {
            return this.include;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return sizeLimit
         */
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

        public static final class Builder {
            private Long accessTTL; 
            private Long changeTTL; 
            private String description; 
            private Boolean enabled; 
            private String exclude; 
            private Long fileCountLimit; 
            private Long id; 
            private String include; 
            private String name; 
            private Integer priority; 
            private Long sizeLimit; 

            private Builder() {
            } 

            private Builder(PolicyItems model) {
                this.accessTTL = model.accessTTL;
                this.changeTTL = model.changeTTL;
                this.description = model.description;
                this.enabled = model.enabled;
                this.exclude = model.exclude;
                this.fileCountLimit = model.fileCountLimit;
                this.id = model.id;
                this.include = model.include;
                this.name = model.name;
                this.priority = model.priority;
                this.sizeLimit = model.sizeLimit;
            } 

            /**
             * AccessTTL.
             */
            public Builder accessTTL(Long accessTTL) {
                this.accessTTL = accessTTL;
                return this;
            }

            /**
             * ChangeTTL.
             */
            public Builder changeTTL(Long changeTTL) {
                this.changeTTL = changeTTL;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Exclude.
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * FileCountLimit.
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Include.
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * SizeLimit.
             */
            public Builder sizeLimit(Long sizeLimit) {
                this.sizeLimit = sizeLimit;
                return this;
            }

            public PolicyItems build() {
                return new PolicyItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePolarFsQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsQuotaResponseBody</p>
     */
    public static class QuotaItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("Inodes")
        private Long inodes;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Long usedCapacity;

        @com.aliyun.core.annotation.NameInMap("UsedInodes")
        private Long usedInodes;

        private QuotaItems(Builder builder) {
            this.capacity = builder.capacity;
            this.inodes = builder.inodes;
            this.path = builder.path;
            this.usedCapacity = builder.usedCapacity;
            this.usedInodes = builder.usedInodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaItems create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return inodes
         */
        public Long getInodes() {
            return this.inodes;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        /**
         * @return usedInodes
         */
        public Long getUsedInodes() {
            return this.usedInodes;
        }

        public static final class Builder {
            private Long capacity; 
            private Long inodes; 
            private String path; 
            private Long usedCapacity; 
            private Long usedInodes; 

            private Builder() {
            } 

            private Builder(QuotaItems model) {
                this.capacity = model.capacity;
                this.inodes = model.inodes;
                this.path = model.path;
                this.usedCapacity = model.usedCapacity;
                this.usedInodes = model.usedInodes;
            } 

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * Inodes.
             */
            public Builder inodes(Long inodes) {
                this.inodes = inodes;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * UsedCapacity.
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            /**
             * UsedInodes.
             */
            public Builder usedInodes(Long usedInodes) {
                this.usedInodes = usedInodes;
                return this;
            }

            public QuotaItems build() {
                return new QuotaItems(this);
            } 

        } 

    }
}
