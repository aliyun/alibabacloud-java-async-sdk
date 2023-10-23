// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTagsRequest} extends {@link RequestModel}
 *
 * <p>DeleteTagsRequest</p>
 */
public class DeleteTagsRequest extends Request {
    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TagInfo")
    private java.util.List < TagInfo> tagInfo;

    private DeleteTagsRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.tagInfo = builder.tagInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
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

    public static final class Builder extends Request.Builder<DeleteTagsRequest, Builder> {
        private String instanceName; 
        private Long resourceOwnerId; 
        private java.util.List < TagInfo> tagInfo; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTagsRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.resourceOwnerId = request.resourceOwnerId;
            this.tagInfo = request.tagInfo;
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
        public DeleteTagsRequest build() {
            return new DeleteTagsRequest(this);
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
