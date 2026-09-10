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
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 5 to 50. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The path of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/data</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>The PolarFS instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        /**
         * <p>The details of the rules.</p>
         */
        public Builder policyItems(java.util.List<PolicyItems> policyItems) {
            this.policyItems = policyItems;
            return this;
        }

        /**
         * <p>The quota information.</p>
         */
        public Builder quotaItems(java.util.List<QuotaItems> quotaItems) {
            this.quotaItems = quotaItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FED790E-FB61-4721-8C1C-07C627******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
             * <p>The TTL of the access time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder accessTTL(Long accessTTL) {
                this.accessTTL = accessTTL;
                return this;
            }

            /**
             * <p>The TTL of the change time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder changeTTL(Long changeTTL) {
                this.changeTTL = changeTTL;
                return this;
            }

            /**
             * <p>The rule description.</p>
             * 
             * <strong>example:</strong>
             * <p>NULL</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the rule is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The rule takes effect immediately for new events. This is the default value.</p>
             * </li>
             * <li><p><strong>false</strong>: The rule does not take effect for new events.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The glob pattern of paths to exclude.</p>
             * <ul>
             * <li>The pattern must start with <code>/</code> and supports glob syntax, including <code>*</code>, <code>?</code>, and <code>**</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NULL</p>
             */
            public Builder exclude(String exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>The maximum number of files in the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>77</p>
             */
            public Builder fileCountLimit(Long fileCountLimit) {
                this.fileCountLimit = fileCountLimit;
                return this;
            }

            /**
             * <p>The rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The glob pattern for paths to include.</p>
             * <ul>
             * <li>The pattern must start with <code>/</code> and supports glob syntax, including <code>*</code>, <code>?</code>, and <code>**</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>/a*</p>
             */
            public Builder include(String include) {
                this.include = include;
                return this;
            }

            /**
             * <p>The rule name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxx</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The priority of the quota rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The maximum total size of files in the directory. Unit: GB.</p>
             * <ul>
             * <li>The value must be greater than or equal to 1.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <p>The capacity. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1073741824</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The total number of inodes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder inodes(Long inodes) {
                this.inodes = inodes;
                return this;
            }

            /**
             * <p>The directory path.</p>
             * 
             * <strong>example:</strong>
             * <p>/data</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The used capacity. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>104857600</p>
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            /**
             * <p>The number of used inodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
