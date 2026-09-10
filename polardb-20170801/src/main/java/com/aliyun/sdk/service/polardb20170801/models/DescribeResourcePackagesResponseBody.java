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
 * {@link DescribeResourcePackagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourcePackagesResponseBody</p>
 */
public class DescribeResourcePackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourcePackageList")
    private java.util.List<ResourcePackageList> resourcePackageList;

    private DescribeResourcePackagesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourcePackageList = builder.resourcePackageList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourcePackagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourcePackageList
     */
    public java.util.List<ResourcePackageList> getResourcePackageList() {
        return this.resourcePackageList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResourcePackageList> resourcePackageList; 

        private Builder() {
        } 

        private Builder(DescribeResourcePackagesResponseBody model) {
            this.requestId = model.requestId;
            this.resourcePackageList = model.resourcePackageList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E56531A4-E552-40BA-9C58-137B80******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of cross-cloud resource plans.</p>
         */
        public Builder resourcePackageList(java.util.List<ResourcePackageList> resourcePackageList) {
            this.resourcePackageList = resourcePackageList;
            return this;
        }

        public DescribeResourcePackagesResponseBody build() {
            return new DescribeResourcePackagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResourcePackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackagesResponseBody</p>
     */
    public static class ResourcePackageQuotaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocatedCapacity")
        private Long allocatedCapacity;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Long usedCapacity;

        private ResourcePackageQuotaList(Builder builder) {
            this.allocatedCapacity = builder.allocatedCapacity;
            this.projectId = builder.projectId;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePackageQuotaList create() {
            return builder().build();
        }

        /**
         * @return allocatedCapacity
         */
        public Long getAllocatedCapacity() {
            return this.allocatedCapacity;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private Long allocatedCapacity; 
            private String projectId; 
            private Long usedCapacity; 

            private Builder() {
            } 

            private Builder(ResourcePackageQuotaList model) {
                this.allocatedCapacity = model.allocatedCapacity;
                this.projectId = model.projectId;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>The capacity allocated to the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder allocatedCapacity(Long allocatedCapacity) {
                this.allocatedCapacity = allocatedCapacity;
                return this;
            }

            /**
             * <p>The ID of the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pj-87681rbcef6******</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The used capacity of the resource pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public ResourcePackageQuotaList build() {
                return new ResourcePackageQuotaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeResourcePackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackagesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>Value</p>
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
    /**
     * 
     * {@link DescribeResourcePackagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResourcePackagesResponseBody</p>
     */
    public static class ResourcePackageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoQuota")
        private Boolean autoQuota;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("ResourcePackageId")
        private String resourcePackageId;

        @com.aliyun.core.annotation.NameInMap("ResourcePackageQuotaList")
        private java.util.List<ResourcePackageQuotaList> resourcePackageQuotaList;

        @com.aliyun.core.annotation.NameInMap("ResourcePackageType")
        private String resourcePackageType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private Long totalCapacity;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Long usedCapacity;

        private ResourcePackageList(Builder builder) {
            this.autoQuota = builder.autoQuota;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.resourcePackageId = builder.resourcePackageId;
            this.resourcePackageQuotaList = builder.resourcePackageQuotaList;
            this.resourcePackageType = builder.resourcePackageType;
            this.status = builder.status;
            this.tags = builder.tags;
            this.totalCapacity = builder.totalCapacity;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePackageList create() {
            return builder().build();
        }

        /**
         * @return autoQuota
         */
        public Boolean getAutoQuota() {
            return this.autoQuota;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return resourcePackageId
         */
        public String getResourcePackageId() {
            return this.resourcePackageId;
        }

        /**
         * @return resourcePackageQuotaList
         */
        public java.util.List<ResourcePackageQuotaList> getResourcePackageQuotaList() {
            return this.resourcePackageQuotaList;
        }

        /**
         * @return resourcePackageType
         */
        public String getResourcePackageType() {
            return this.resourcePackageType;
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
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return totalCapacity
         */
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return usedCapacity
         */
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private Boolean autoQuota; 
            private Long createTime; 
            private Long expireTime; 
            private String resourcePackageId; 
            private java.util.List<ResourcePackageQuotaList> resourcePackageQuotaList; 
            private String resourcePackageType; 
            private String status; 
            private java.util.List<Tags> tags; 
            private Long totalCapacity; 
            private Long usedCapacity; 

            private Builder() {
            } 

            private Builder(ResourcePackageList model) {
                this.autoQuota = model.autoQuota;
                this.createTime = model.createTime;
                this.expireTime = model.expireTime;
                this.resourcePackageId = model.resourcePackageId;
                this.resourcePackageQuotaList = model.resourcePackageQuotaList;
                this.resourcePackageType = model.resourcePackageType;
                this.status = model.status;
                this.tags = model.tags;
                this.totalCapacity = model.totalCapacity;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>Indicates whether automatic quota allocation is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoQuota(Boolean autoQuota) {
                this.autoQuota = autoQuota;
                return this;
            }

            /**
             * <p>The time when the resource plan was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1744621511000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the resource plan expires.</p>
             * 
             * <strong>example:</strong>
             * <p>1747238400000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the cross-cloud resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>pm-bp11b0i9389******</p>
             */
            public Builder resourcePackageId(String resourcePackageId) {
                this.resourcePackageId = resourcePackageId;
                return this;
            }

            /**
             * <p>The quota allocation details.</p>
             */
            public Builder resourcePackageQuotaList(java.util.List<ResourcePackageQuotaList> resourcePackageQuotaList) {
                this.resourcePackageQuotaList = resourcePackageQuotaList;
                return this;
            }

            /**
             * <p>The type of the cross-cloud resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder resourcePackageType(String resourcePackageType) {
                this.resourcePackageType = resourcePackageType;
                return this;
            }

            /**
             * <p>The status of the cross-cloud resource plan. Valid values:</p>
             * <ul>
             * <li><p>Normal: Normal.</p>
             * </li>
             * <li><p>Maintaining: Under maintenance.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The total capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalCapacity(Long totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * <p>The used capacity.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder usedCapacity(Long usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public ResourcePackageList build() {
                return new ResourcePackageList(this);
            } 

        } 

    }
}
