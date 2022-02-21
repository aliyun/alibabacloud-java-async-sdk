// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListTagResourcesRequest</p>
 */
public class ListTagResourcesRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TagFilter")
    private java.util.List < TagFilter> tagFilter;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceId")
    private java.util.List < String > resourceId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private ListTagResourcesRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tag = builder.tag;
        this.tagFilter = builder.tagFilter;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tagFilter
     */
    public java.util.List < TagFilter> getTagFilter() {
        return this.tagFilter;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public java.util.List < String > getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ListTagResourcesRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private java.util.List < Tag> tag; 
        private java.util.List < TagFilter> tagFilter; 
        private String nextToken; 
        private String regionId; 
        private java.util.List < String > resourceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListTagResourcesRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.tag = response.tag;
            this.tagFilter = response.tagFilter;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.resourceId = response.resourceId;
            this.resourceType = response.resourceType;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TagFilter.
         */
        public Builder tagFilter(java.util.List < TagFilter> tagFilter) {
            this.putQueryParameter("TagFilter", tagFilter);
            this.tagFilter = tagFilter;
            return this;
        }

        /**
         * The start Token of the next query.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * To which the resource belongs geo ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ECS resource ID. Valid values of N: 1 to 50.
         */
        public Builder resourceId(java.util.List < String > resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * Resource type definition. Valid values:
         * <p>
         * 
         * -instance:ECS instance.
         * -disk: disk.
         * -snapshot: snapshot.
         * -image: image.
         * -securitygroup: Security Group.
         * -volume: storage volume.
         * -eni: elastic network card.
         * -ddh: proprietary host.
         * -ddhcluster: proprietary host cluster.
         * -keypair:SSH key pair.
         * -launchtemplate: Start template.
         * -reservedinstance: Reserved Instance.
         * -snapshotpolicy: automatic snapshot policy.
         * -elasticityassurance: elastic security.
         * -capacityreservation: capacity reservation.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ListTagResourcesRequest build() {
            return new ListTagResourcesRequest(this);
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
             * 精确查找ECS资源时使用的标签键。标签键长度的取值范围为1~128。N的取值范围为1~20。
             * <p>
             * 
             * `Tag.N`参数使用说明：
             * 
             * - 方式一：用于精确查找绑定了指定标签的ECS资源，由一个键值对组成。
             * 
             *     - 仅指定`Tag.N.Key`时，则返回关联该标签键的所有资源。
             * 
             *     - 仅指定`Tag.N.Value`，则报错`InvalidParameter.TagValue`。
             * 
             *     - 同时指定多个标签键值对时，仅同时满足所有标签键值对的ECS资源会被查找到。
             * 
             * - 方式二：用于查询非默认资源组内的资源信息。`Key`的取值固定为`acs:rm:rgId`，对应的`Value`取值为资源组ID。
             * 
             *     - 如果`Key`取值为`acs:rm:rgId`，则`Value`的取值只能是非默认资源组ID。如果指定的资源组ID为默认资源组，则会返回错误信息。
             * 
             *     - 如果`Key`取值为`acs:rm:rgId`，则不支持再指定其他标签键值对。如果通过多个`Tag.N`参数同时查询资源组和标签对应的资源，则会返回错误信息。
             * 
             *  
             * 
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 精确查找ECS资源时使用的标签值。标签值长度的取值范围为1~128。N的取值范围为1~20。
             * <p>
             * 
             * > 当`Key=acs:rm:rgId`时，该参数只能传入资源组ID，且资源组ID不能为默认资源组。
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
    public static class TagFilter extends TeaModel {
        @NameInMap("TagValues")
        private java.util.List < String > tagValues;

        @NameInMap("TagKey")
        private String tagKey;

        private TagFilter(Builder builder) {
            this.tagValues = builder.tagValues;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagFilter create() {
            return builder().build();
        }

        /**
         * @return tagValues
         */
        public java.util.List < String > getTagValues() {
            return this.tagValues;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private java.util.List < String > tagValues; 
            private String tagKey; 

            /**
             * 模糊查找ECS资源时使用的标签值。标签值长度的取值范围为1~128。N的取值范围为1~5。具体的参数说明请参见`TagFilter.N.TagKey`参数描述。
             */
            public Builder tagValues(java.util.List < String > tagValues) {
                this.tagValues = tagValues;
                return this;
            }

            /**
             * 模糊查找ECS资源时使用的标签键。标签键长度的取值范围为1~128。N的取值范围为1~5。
             * <p>
             * 
             *  `TagFilter.N`用于模糊查找绑定了指定标签的ECS资源，由一个键和一个或多个值组成。模糊查询可能会有2秒延时，仅支持模糊过滤后资源数小于等于5000的情况。
             * 
             * - 通过标签键（`TagFilter.N.TagKey`）模糊查找ECS资源时，标签值（`TagFilter.N.TagValues.N`）必须为空。例如，模糊搜索标签键为`environment`的ECS资源时，`TagFilter.1.TagKey`可以设置为`env*`（前缀匹配的模糊搜索方式）、`*env*`（两边匹配的模糊搜索方式）或者`env`（精确搜索方式），而`TagFilter.1.TagValues`必须为空。
             * 
             * - 通过标签值（`TagFilter.N.TagValues.N`）模糊查找ECS资源时，标签键（`TagFilter.N.TagKey`）必须设置为精确值。例如，模糊搜索标签键为`env`，标签值为`product`的ECS资源时，`TagFilter.1.TagKey`必须精确设置为`env`，`TagFilter.1.TagValues.1`可以设置为`proc*`（前缀匹配的模糊搜索方式）、`*proc*`（两边匹配的模糊搜索方式）或者`proc`（精确搜索方式）。同一个`TagKey`下只能用同一种搜索方式，如果设置了多个不同的搜索方式，则以第一个方式为准。
             * 
             * - 标签键之间为交集关系，即仅同时满足您指定的所有标签键的ECS资源才会被查找到。
             * 
             * - 同一标签键下的标签值之间为并集关系，即满足您为该标签键指定的任一标签值的ECS资源均会被查找到。
             * 
             * > `TagFilter.N`与`Tag.N`参数不能同时使用，否则会返回错误信息。
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public TagFilter build() {
                return new TagFilter(this);
            } 

        } 

    }
}
