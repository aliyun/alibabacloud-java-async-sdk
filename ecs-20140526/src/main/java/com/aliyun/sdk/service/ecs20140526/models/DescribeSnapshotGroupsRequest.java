// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnapshotGroupsRequest</p>
 */
public class DescribeSnapshotGroupsRequest extends Request {
    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("AdditionalAttributes")
    private java.util.List < String > additionalAttributes;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("SnapshotGroupId")
    private java.util.List < String > snapshotGroupId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 500, minimum = 1)
    private Integer maxResults;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("Status")
    private java.util.List < String > status;

    private DescribeSnapshotGroupsRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.additionalAttributes = builder.additionalAttributes;
        this.regionId = builder.regionId;
        this.nextToken = builder.nextToken;
        this.snapshotGroupId = builder.snapshotGroupId;
        this.resourceGroupId = builder.resourceGroupId;
        this.maxResults = builder.maxResults;
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.tag = builder.tag;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return additionalAttributes
     */
    public java.util.List < String > getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return snapshotGroupId
     */
    public java.util.List < String > getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeSnapshotGroupsRequest, Builder> {
        private Long resourceOwnerId; 
        private java.util.List < String > additionalAttributes; 
        private String regionId; 
        private String nextToken; 
        private java.util.List < String > snapshotGroupId; 
        private String resourceGroupId; 
        private Integer maxResults; 
        private String instanceId; 
        private String name; 
        private java.util.List < Tag> tag; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnapshotGroupsRequest request) {
            super(request);
            this.resourceOwnerId = request.resourceOwnerId;
            this.additionalAttributes = request.additionalAttributes;
            this.regionId = request.regionId;
            this.nextToken = request.nextToken;
            this.snapshotGroupId = request.snapshotGroupId;
            this.resourceGroupId = request.resourceGroupId;
            this.maxResults = request.maxResults;
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.tag = request.tag;
            this.status = request.status;
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
         * AdditionalAttributes.
         */
        public Builder additionalAttributes(java.util.List < String > additionalAttributes) {
            this.putQueryParameter("AdditionalAttributes", additionalAttributes);
            this.additionalAttributes = additionalAttributes;
            return this;
        }

        /**
         * The ID of the region to which the instance belongs. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The Token of the query. The value is the NextToken parameter returned by the last API call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the specified snapshot consistency group. Valid values of N: 1 to 10.
         */
        public Builder snapshotGroupId(java.util.List < String > snapshotGroupId) {
            this.putQueryParameter("SnapshotGroupId", snapshotGroupId);
            this.snapshotGroupId = snapshotGroupId;
            return this;
        }

        /**
         * The ID of the resource group to which the snapshot consistency group belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Maximum Value: 100.
         * 
         * Default value: 10.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the snapshot consistency group.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The key-value pair of the snapshot consistency group.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The status of the snapshot consistency group. Valid values of N: 1 to 3. Valid values:
         * <p>
         * 
         * -progressing: creating.
         * 
         * -accomplished: successfully created.
         * 
         * -failed: failed to be created.
         */
        public Builder status(java.util.List < String > status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeSnapshotGroupsRequest build() {
            return new DescribeSnapshotGroupsRequest(this);
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
             * 快照一致性组的标签键。N的取值范围为1~20。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 快照一致性组的标签值。N的取值范围为1~20。
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
}
