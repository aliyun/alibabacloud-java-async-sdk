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
 * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePrefixListsResponseBody</p>
 */
public class DescribePrefixListsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PrefixLists")
    private PrefixLists prefixLists;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePrefixListsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.prefixLists = builder.prefixLists;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePrefixListsResponseBody create() {
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
     * @return prefixLists
     */
    public PrefixLists getPrefixLists() {
        return this.prefixLists;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private PrefixLists prefixLists; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePrefixListsResponseBody model) {
            this.nextToken = model.nextToken;
            this.prefixLists = model.prefixLists;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The query token that is returned in this call. If the return value is empty, no more data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Details about the prefix lists.</p>
         */
        public Builder prefixLists(PrefixLists prefixLists) {
            this.prefixLists = prefixLists;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>38793DB8-A4B2-4AEC-BFD3-111234E9188D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePrefixListsResponseBody build() {
            return new DescribePrefixListsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrefixListsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag value. A prefix list can have 1 to 20 tags. The tag value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http:// or https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag key. A prefix list can have 1 to 20 tags. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
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
     * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrefixListsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

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
     * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrefixListsResponseBody</p>
     */
    public static class PrefixList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressFamily")
        private String addressFamily;

        @com.aliyun.core.annotation.NameInMap("AssociationCount")
        private Integer associationCount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaxEntries")
        private Integer maxEntries;

        @com.aliyun.core.annotation.NameInMap("PrefixListId")
        private String prefixListId;

        @com.aliyun.core.annotation.NameInMap("PrefixListName")
        private String prefixListName;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private PrefixList(Builder builder) {
            this.addressFamily = builder.addressFamily;
            this.associationCount = builder.associationCount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.maxEntries = builder.maxEntries;
            this.prefixListId = builder.prefixListId;
            this.prefixListName = builder.prefixListName;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixList create() {
            return builder().build();
        }

        /**
         * @return addressFamily
         */
        public String getAddressFamily() {
            return this.addressFamily;
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
         * @return prefixListId
         */
        public String getPrefixListId() {
            return this.prefixListId;
        }

        /**
         * @return prefixListName
         */
        public String getPrefixListName() {
            return this.prefixListName;
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
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String addressFamily; 
            private Integer associationCount; 
            private String creationTime; 
            private String description; 
            private Integer maxEntries; 
            private String prefixListId; 
            private String prefixListName; 
            private String resourceGroupId; 
            private Tags tags; 

            private Builder() {
            } 

            private Builder(PrefixList model) {
                this.addressFamily = model.addressFamily;
                this.associationCount = model.associationCount;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.maxEntries = model.maxEntries;
                this.prefixListId = model.prefixListId;
                this.prefixListName = model.prefixListName;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
            } 

            /**
             * <p>The IP address family of the prefix list. Valid values:</p>
             * <ul>
             * <li>IPv4</li>
             * <li>IPv6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * <p>The number of associated resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder associationCount(Integer associationCount) {
                this.associationCount = associationCount;
                return this;
            }

            /**
             * <p>The time when the prefix list was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-20T07:11Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The maximum number of entries that the prefix list can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder maxEntries(Integer maxEntries) {
                this.maxEntries = maxEntries;
                return this;
            }

            /**
             * <p>The ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-x1j1k5ykzqlixdcy****</p>
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * <p>The name of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>PrefixListNameSample</p>
             */
            public Builder prefixListName(String prefixListName) {
                this.prefixListName = prefixListName;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the prefix list belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags of the prefix list.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public PrefixList build() {
                return new PrefixList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePrefixListsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePrefixListsResponseBody</p>
     */
    public static class PrefixLists extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrefixList")
        private java.util.List<PrefixList> prefixList;

        private PrefixLists(Builder builder) {
            this.prefixList = builder.prefixList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixLists create() {
            return builder().build();
        }

        /**
         * @return prefixList
         */
        public java.util.List<PrefixList> getPrefixList() {
            return this.prefixList;
        }

        public static final class Builder {
            private java.util.List<PrefixList> prefixList; 

            private Builder() {
            } 

            private Builder(PrefixLists model) {
                this.prefixList = model.prefixList;
            } 

            /**
             * PrefixList.
             */
            public Builder prefixList(java.util.List<PrefixList> prefixList) {
                this.prefixList = prefixList;
                return this;
            }

            public PrefixLists build() {
                return new PrefixLists(this);
            } 

        } 

    }
}
