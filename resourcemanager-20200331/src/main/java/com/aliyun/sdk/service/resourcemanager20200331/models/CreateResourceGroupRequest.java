// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceGroupRequest</p>
 */
public class CreateResourceGroupRequest extends Request {
    @Query
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateResourceGroupRequest(Builder builder) {
        super(builder);
        this.displayName = builder.displayName;
        this.name = builder.name;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
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

    public static final class Builder extends Request.Builder<CreateResourceGroupRequest, Builder> {
        private String displayName; 
        private String name; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceGroupRequest request) {
            super(request);
            this.displayName = request.displayName;
            this.name = request.name;
            this.tag = request.tag;
        } 

        /**
         * The display name of the resource group.
         * <p>
         * 
         * The name must be 1 to 50 characters in length.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The unique identifier of the resource group.
         * <p>
         * 
         * The identifier must be 3 to 50 characters in length and can contain letters, digits, and hyphens (-). The identifier must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateResourceGroupRequest build() {
            return new CreateResourceGroupRequest(this);
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
             * The key of the tag. 
             * <p>
             * 
             * The tag key can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. 
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `acs:` or `aliyun`.
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
