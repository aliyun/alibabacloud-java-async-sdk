// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribePortRangeListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePortRangeListsResponseBody</p>
 */
public class DescribePortRangeListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PortRangeLists")
    private java.util.List<PortRangeLists> portRangeLists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePortRangeListsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.portRangeLists = builder.portRangeLists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePortRangeListsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return portRangeLists
     */
    public java.util.List<PortRangeLists> getPortRangeLists() {
        return this.portRangeLists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<PortRangeLists> portRangeLists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePortRangeListsResponseBody model) {
            this.nextToken = model.nextToken;
            this.portRangeLists = model.portRangeLists;
            this.requestId = model.requestId;
        } 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PortRangeLists.
         */
        public Builder portRangeLists(java.util.List<PortRangeLists> portRangeLists) {
            this.portRangeLists = portRangeLists;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePortRangeListsResponseBody build() {
            return new DescribePortRangeListsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePortRangeListsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortRangeListsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePortRangeListsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePortRangeListsResponseBody</p>
     */
    public static class PortRangeLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationCount")
        private Integer associationCount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaxEntries")
        private Integer maxEntries;

        @com.aliyun.core.annotation.NameInMap("PortRangeListId")
        private String portRangeListId;

        @com.aliyun.core.annotation.NameInMap("PortRangeListName")
        private String portRangeListName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private PortRangeLists(Builder builder) {
            this.associationCount = builder.associationCount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.maxEntries = builder.maxEntries;
            this.portRangeListId = builder.portRangeListId;
            this.portRangeListName = builder.portRangeListName;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortRangeLists create() {
            return builder().build();
        }

        /**
         * @return associationCount
         */
        public Integer getAssociationCount() {
            return this.associationCount;
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
         * @return maxEntries
         */
        public Integer getMaxEntries() {
            return this.maxEntries;
        }

        /**
         * @return portRangeListId
         */
        public String getPortRangeListId() {
            return this.portRangeListId;
        }

        /**
         * @return portRangeListName
         */
        public String getPortRangeListName() {
            return this.portRangeListName;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Integer associationCount; 
            private String creationTime; 
            private String description; 
            private Integer maxEntries; 
            private String portRangeListId; 
            private String portRangeListName; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(PortRangeLists model) {
                this.associationCount = model.associationCount;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.maxEntries = model.maxEntries;
                this.portRangeListId = model.portRangeListId;
                this.portRangeListName = model.portRangeListName;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
            } 

            /**
             * AssociationCount.
             */
            public Builder associationCount(Integer associationCount) {
                this.associationCount = associationCount;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * MaxEntries.
             */
            public Builder maxEntries(Integer maxEntries) {
                this.maxEntries = maxEntries;
                return this;
            }

            /**
             * PortRangeListId.
             */
            public Builder portRangeListId(String portRangeListId) {
                this.portRangeListId = portRangeListId;
                return this;
            }

            /**
             * PortRangeListName.
             */
            public Builder portRangeListName(String portRangeListName) {
                this.portRangeListName = portRangeListName;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public PortRangeLists build() {
                return new PortRangeLists(this);
            } 

        } 

    }
}
