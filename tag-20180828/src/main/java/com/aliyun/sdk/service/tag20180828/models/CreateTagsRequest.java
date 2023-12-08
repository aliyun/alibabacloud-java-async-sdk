// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTagsRequest} extends {@link RequestModel}
 *
 * <p>CreateTagsRequest</p>
 */
public class CreateTagsRequest extends Request {
    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("TagKeyValueParamList")
    @Validation(required = true)
    private java.util.List < TagKeyValueParamList> tagKeyValueParamList;

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
    public java.util.List < TagKeyValueParamList> getTagKeyValueParamList() {
        return this.tagKeyValueParamList;
    }

    public static final class Builder extends Request.Builder<CreateTagsRequest, Builder> {
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private java.util.List < TagKeyValueParamList> tagKeyValueParamList; 

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
         * The region ID.
         * <p>
         * 
         * >  Only `cn-hangzhou` is supported.
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
         * The tag keys and values list.
         */
        public Builder tagKeyValueParamList(java.util.List < TagKeyValueParamList> tagKeyValueParamList) {
            this.putQueryParameter("TagKeyValueParamList", tagKeyValueParamList);
            this.tagKeyValueParamList = tagKeyValueParamList;
            return this;
        }

        @Override
        public CreateTagsRequest build() {
            return new CreateTagsRequest(this);
        } 

    } 

    public static class TagValueParamList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Value")
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
             * The description of the tag value.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The tag value.
             * <p>
             * 
             * The tag value can be a maximum of 128 characters in length. It cannot contain `http://` or `https://` and cannot start with `acs:` or `aliyun`.
             * 
             * Valid values of N: 1 to 10.
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
    public static class TagKeyValueParamList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("TagValueParamList")
        private java.util.List < TagValueParamList> tagValueParamList;

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
        public java.util.List < TagValueParamList> getTagValueParamList() {
            return this.tagValueParamList;
        }

        public static final class Builder {
            private String description; 
            private String key; 
            private java.util.List < TagValueParamList> tagValueParamList; 

            /**
             * The description of the tag key.
             * <p>
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The tag key.
             * <p>
             * 
             * The tag key can be a maximum of 128 characters in length. It cannot contain `http://` or `https://` and cannot start with `acs:` or `aliyun`.
             * 
             * Valid values of N: 1 to 10.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag values list.
             */
            public Builder tagValueParamList(java.util.List < TagValueParamList> tagValueParamList) {
                this.tagValueParamList = tagValueParamList;
                return this;
            }

            public TagKeyValueParamList build() {
                return new TagKeyValueParamList(this);
            } 

        } 

    }
}
