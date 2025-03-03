// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupResponseBody</p>
 */
public class GetResourceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private ResourceGroup resourceGroup;

    private GetResourceGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroup = builder.resourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroup
     */
    public ResourceGroup getResourceGroup() {
        return this.resourceGroup;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceGroup resourceGroup; 

        /**
         * <p>The information of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>2D69A58F-345C-4FDE-88E4-BF5189484043</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The display name of the resource group.</p>
         */
        public Builder resourceGroup(ResourceGroup resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public GetResourceGroupResponseBody build() {
            return new GetResourceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
     */
    public static class RegionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RegionStatus(Builder builder) {
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionStatus create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String regionId; 
            private String status; 

            /**
             * <p>The ID of the Alibaba Cloud account to which the resource group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RegionStatus build() {
                return new RegionStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
     */
    public static class RegionStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionStatus")
        private java.util.List<RegionStatus> regionStatus;

        private RegionStatuses(Builder builder) {
            this.regionStatus = builder.regionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionStatuses create() {
            return builder().build();
        }

        /**
         * @return regionStatus
         */
        public java.util.List<RegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

        public static final class Builder {
            private java.util.List<RegionStatus> regionStatus; 

            /**
             * RegionStatus.
             */
            public Builder regionStatus(java.util.List<RegionStatus> regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            public RegionStatuses build() {
                return new RegionStatuses(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceGroupResponseBody</p>
     */
    public static class ResourceGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionStatuses")
        private RegionStatuses regionStatuses;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private ResourceGroup(Builder builder) {
            this.accountId = builder.accountId;
            this.createDate = builder.createDate;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.name = builder.name;
            this.regionStatuses = builder.regionStatuses;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroup create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionStatuses
         */
        public RegionStatuses getRegionStatuses() {
            return this.regionStatuses;
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
            private String accountId; 
            private String createDate; 
            private String displayName; 
            private String id; 
            private String name; 
            private RegionStatuses regionStatuses; 
            private String status; 
            private Tags tags; 

            /**
             * <p>The identifier of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The status of the resource group. Valid values:</p>
             * <ul>
             * <li>Creating: The resource group is being created.</li>
             * <li>OK: The resource group is created.</li>
             * <li>PendingDelete: The resource group is waiting to be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>my-project</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The tags that are added to the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-9gLOoK****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the resource group was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>my-project</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the resource group. Valid values:</p>
             * <ul>
             * <li>Creating: The resource group is being created.</li>
             * <li>OK: The resource group is created.</li>
             * <li>PendingDelete: The resource group is waiting to be deleted.</li>
             * <li>Deleting: The resource group is being deleted.</li>
             * </ul>
             */
            public Builder regionStatuses(RegionStatuses regionStatuses) {
                this.regionStatuses = regionStatuses;
                return this;
            }

            /**
             * <p>The status of the resource group in all regions.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tag key.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public ResourceGroup build() {
                return new ResourceGroup(this);
            } 

        } 

    }
}
