// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    private String regionId;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("SnapshotGroupId")
    private java.util.List < String > snapshotGroupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Status")
    private java.util.List < String > status;

    private DescribeSnapshotGroupsRequest(Builder builder) {
        super(builder);
        this.resourceOwnerId = builder.resourceOwnerId;
        this.additionalAttributes = builder.additionalAttributes;
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.resourceGroupId = builder.resourceGroupId;
        this.name = builder.name;
        this.snapshotGroupId = builder.snapshotGroupId;
        this.instanceId = builder.instanceId;
        this.tag = builder.tag;
        this.nextToken = builder.nextToken;
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return snapshotGroupId
     */
    public java.util.List < String > getSnapshotGroupId() {
        return this.snapshotGroupId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer maxResults; 
        private String resourceGroupId; 
        private String name; 
        private java.util.List < String > snapshotGroupId; 
        private String instanceId; 
        private java.util.List < Tag> tag; 
        private String nextToken; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnapshotGroupsRequest response) {
            super(response);
            this.resourceOwnerId = response.resourceOwnerId;
            this.additionalAttributes = response.additionalAttributes;
            this.regionId = response.regionId;
            this.maxResults = response.maxResults;
            this.resourceGroupId = response.resourceGroupId;
            this.name = response.name;
            this.snapshotGroupId = response.snapshotGroupId;
            this.instanceId = response.instanceId;
            this.tag = response.tag;
            this.nextToken = response.nextToken;
            this.status = response.status;
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
         * Belongs geo ID. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the resource group to which the snapshot consistency group belongs.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The ID of the specified snapshot consistency group. Valid values of N: 1 to 10.
         */
        public Builder snapshotGroupId(java.util.List < String > snapshotGroupId) {
            this.putQueryParameter("SnapshotGroupId", snapshotGroupId);
            this.snapshotGroupId = snapshotGroupId;
            return this;
        }

        /**
         * The specified instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Snapshot of the consistency group label key-value pairs.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * Query credentials (Token), value as the last API call returned NextToken parameter value.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Snapshot of the consistency group state. N value range is 1~3. Valid values:
         * <p>
         * 
         * -progressing: create.
         * 
         * -accomplished: created successfully.
         * 
         * -failed: Create failed.
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
