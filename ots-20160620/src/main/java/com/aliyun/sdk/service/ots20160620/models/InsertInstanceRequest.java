// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertInstanceRequest} extends {@link RequestModel}
 *
 * <p>InsertInstanceRequest</p>
 */
public class InsertInstanceRequest extends Request {
    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("Network")
    private String network;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TagInfo")
    private java.util.List < TagInfo> tagInfo;

    private InsertInstanceRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.description = builder.description;
        this.instanceName = builder.instanceName;
        this.network = builder.network;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tagInfo = builder.tagInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return network
     */
    public String getNetwork() {
        return this.network;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return tagInfo
     */
    public java.util.List < TagInfo> getTagInfo() {
        return this.tagInfo;
    }

    public static final class Builder extends Request.Builder<InsertInstanceRequest, Builder> {
        private String clusterType; 
        private String description; 
        private String instanceName; 
        private String network; 
        private Long resourceOwnerId; 
        private java.util.List < TagInfo> tagInfo; 

        private Builder() {
            super();
        } 

        private Builder(InsertInstanceRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.description = request.description;
            this.instanceName = request.instanceName;
            this.network = request.network;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tagInfo = request.tagInfo;
        } 

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Network.
         */
        public Builder network(String network) {
            this.putQueryParameter("Network", network);
            this.network = network;
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
         * TagInfo.
         */
        public Builder tagInfo(java.util.List < TagInfo> tagInfo) {
            this.putQueryParameter("TagInfo", tagInfo);
            this.tagInfo = tagInfo;
            return this;
        }

        @Override
        public InsertInstanceRequest build() {
            return new InsertInstanceRequest(this);
        } 

    } 

    public static class TagInfo extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private TagInfo(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
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

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
}
