// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link CreateDiskReplicaGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateDiskReplicaGroupRequest</p>
 */
public class CreateDiskReplicaGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Long bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destinationZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 2)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RPO")
    private Long RPO;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateDiskReplicaGroupRequest(Builder builder) {
        super(builder);
        this.bandwidth = builder.bandwidth;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.destinationRegionId = builder.destinationRegionId;
        this.destinationZoneId = builder.destinationZoneId;
        this.groupName = builder.groupName;
        this.RPO = builder.RPO;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceZoneId = builder.sourceZoneId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiskReplicaGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidth
     */
    public Long getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationRegionId
     */
    public String getDestinationRegionId() {
        return this.destinationRegionId;
    }

    /**
     * @return destinationZoneId
     */
    public String getDestinationZoneId() {
        return this.destinationZoneId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return RPO
     */
    public Long getRPO() {
        return this.RPO;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceZoneId
     */
    public String getSourceZoneId() {
        return this.sourceZoneId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateDiskReplicaGroupRequest, Builder> {
        private Long bandwidth; 
        private String clientToken; 
        private String description; 
        private String destinationRegionId; 
        private String destinationZoneId; 
        private String groupName; 
        private Long RPO; 
        private String regionId; 
        private String resourceGroupId; 
        private String sourceZoneId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiskReplicaGroupRequest request) {
            super(request);
            this.bandwidth = request.bandwidth;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.destinationRegionId = request.destinationRegionId;
            this.destinationZoneId = request.destinationZoneId;
            this.groupName = request.groupName;
            this.RPO = request.RPO;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceZoneId = request.sourceZoneId;
            this.tag = request.tag;
        } 

        /**
         * <p>The bandwidth value. Unit: Mbit/s.</p>
         * <blockquote>
         * <p> This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder bandwidth(Long bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the replication pair-consistent group. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The region ID of the secondary site.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder destinationRegionId(String destinationRegionId) {
            this.putQueryParameter("DestinationRegionId", destinationRegionId);
            this.destinationRegionId = destinationRegionId;
            return this;
        }

        /**
         * <p>The zone ID of the secondary site.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        public Builder destinationZoneId(String destinationZoneId) {
            this.putQueryParameter("DestinationZoneId", destinationZoneId);
            this.destinationZoneId = destinationZoneId;
            return this;
        }

        /**
         * <p>The name of the replication pair-consistent group. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>myreplicagrouptest</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The RPO of the replication pair-consistent group. Unit: seconds. Valid value: 900.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder RPO(Long RPO) {
            this.putQueryParameter("RPO", RPO);
            this.RPO = RPO;
            return this;
        }

        /**
         * <p>The ID of the region in which to create the replication pair-consistent group. The primary site is deployed in the specified region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the replication pair-consistent group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmvs*******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The zone ID of the primary site.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-f</p>
         */
        public Builder sourceZoneId(String sourceZoneId) {
            this.putQueryParameter("SourceZoneId", sourceZoneId);
            this.sourceZoneId = sourceZoneId;
            return this;
        }

        /**
         * <p>The tags. Up to 20 tags are supported.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateDiskReplicaGroupRequest build() {
            return new CreateDiskReplicaGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDiskReplicaGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateDiskReplicaGroupRequest</p>
     */
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
             * <p>The key of tag N of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N of the replication pair-consistent group.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-value</p>
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
