// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link CreateTagsRequest} extends {@link RequestModel}
 *
 * <p>CreateTagsRequest</p>
 */
public class CreateTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagKeyValueParamList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TagKeyValueParamList> tagKeyValueParamList;

    private CreateTagsRequest(Builder builder) {
        super(builder);
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.tagKeyValueParamList = builder.tagKeyValueParamList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTagsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return tagKeyValueParamList
     */
    public java.util.List<TagKeyValueParamList> getTagKeyValueParamList() {
        return this.tagKeyValueParamList;
    }

    public static final class Builder extends Request.Builder<CreateTagsRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private java.util.List<TagKeyValueParamList> tagKeyValueParamList; 

        private Builder() {
            super();
        } 

        private Builder(CreateTagsRequest request) {
            super(request);
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.tagKeyValueParamList = request.tagKeyValueParamList;
        } 

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>Only <code>cn-hangzhou</code> is supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * <p>The information about the tags.</p>
         * <p>This parameter is required.</p>
         */
        public Builder tagKeyValueParamList(java.util.List<TagKeyValueParamList> tagKeyValueParamList) {
            this.putQueryParameter("TagKeyValueParamList", tagKeyValueParamList);
            this.tagKeyValueParamList = tagKeyValueParamList;
            return this;
        }

        @Override
        public CreateTagsRequest build() {
            return new CreateTagsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTagsRequest} extends {@link TeaModel}
     *
     * <p>CreateTagsRequest</p>
     */
    public static class TagValueParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagValueParamList(Builder builder) {
            this.description = builder.description;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagValueParamList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String value; 

            /**
             * <p>The description of the value for tag N.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>Test environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * <p>The tag value can be up to 128 characters in length and cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagValueParamList build() {
                return new TagValueParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTagsRequest} extends {@link TeaModel}
     *
     * <p>CreateTagsRequest</p>
     */
    public static class TagKeyValueParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("TagValueParamList")
        private java.util.List<TagValueParamList> tagValueParamList;

        private TagKeyValueParamList(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
            this.tagValueParamList = builder.tagValueParamList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagKeyValueParamList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return tagValueParamList
         */
        public java.util.List<TagValueParamList> getTagValueParamList() {
            return this.tagValueParamList;
        }

        public static final class Builder {
            private String description; 
            private String key; 
            private java.util.List<TagValueParamList> tagValueParamList; 

            /**
             * <p>The description of the key for tag N.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>Business environment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The value of tag N.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * <p>Valid values of N: 1 to 10.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Environment</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The information about the tag values.</p>
             */
            public Builder tagValueParamList(java.util.List<TagValueParamList> tagValueParamList) {
                this.tagValueParamList = tagValueParamList;
                return this;
            }

            public TagKeyValueParamList build() {
                return new TagKeyValueParamList(this);
            } 

        } 

    }
}
