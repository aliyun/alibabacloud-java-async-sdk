// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link UpdateKVCacheStoreRequest} extends {@link RequestModel}
 *
 * <p>UpdateKVCacheStoreRequest</p>
 */
public class UpdateKVCacheStoreRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Capacity")
    private Long capacity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KvcsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kvcsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private UpdateKVCacheStoreRequest(Builder builder) {
        super(builder);
        this.capacity = builder.capacity;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.kvcsId = builder.kvcsId;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKVCacheStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
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
     * @return kvcsId
     */
    public String getKvcsId() {
        return this.kvcsId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<UpdateKVCacheStoreRequest, Builder> {
        private Long capacity; 
        private String clientToken; 
        private String description; 
        private String kvcsId; 
        private String name; 
        private String regionId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKVCacheStoreRequest request) {
            super(request);
            this.capacity = request.capacity;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.kvcsId = request.kvcsId;
            this.name = request.name;
            this.regionId = request.regionId;
            this.tag = request.tag;
        } 

        /**
         * <p>The new storage capacity in GiB. The value must be a multiple of 300 TiB and greater than the current capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>YOUR_CLIENT_TOKEN</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The new KVCacheStore description. The description must be 2 to 256 characters in length and can contain English and Chinese characters. The description cannot start with http:// or https://. Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>project name pass the check</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The KVCacheStore instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kvcs-your-id</p>
         */
        public Builder kvcsId(String kvcsId) {
            this.putQueryParameter("KvcsId", kvcsId);
            this.kvcsId = kvcsId;
            return this;
        }

        /**
         * <p>The new KVCacheStore name. The name must be 2 to 128 characters in length and can contain characters that are categorized as letter in Unicode (including English and Chinese characters) and digits. The name can contain colons (:), underscores (_), periods (.), and hyphens (-). If this parameter is not specified, the default value is the KVCacheStore ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1633730290118313-HD-m3u8</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID, such as cn-hangzhou.</p>
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
         * <p>The list of resource tag key-value pairs. A maximum of 20 tags are supported.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public UpdateKVCacheStoreRequest build() {
            return new UpdateKVCacheStoreRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKVCacheStoreRequest} extends {@link TeaModel}
     *
     * <p>UpdateKVCacheStoreRequest</p>
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
             * <p>The tag key of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>projectId</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>projectName</p>
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
}
