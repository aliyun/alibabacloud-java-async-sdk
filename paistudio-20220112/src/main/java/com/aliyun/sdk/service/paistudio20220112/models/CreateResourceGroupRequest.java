// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link CreateResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceGroupRequest</p>
 */
public class CreateResourceGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ComputingResourceProvider")
    private String computingResourceProvider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    private CreateResourceGroupRequest(Builder builder) {
        super(builder);
        this.computingResourceProvider = builder.computingResourceProvider;
        this.description = builder.description;
        this.name = builder.name;
        this.resourceType = builder.resourceType;
        this.tag = builder.tag;
        this.userVpc = builder.userVpc;
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
     * @return computingResourceProvider
     */
    public String getComputingResourceProvider() {
        return this.computingResourceProvider;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static final class Builder extends Request.Builder<CreateResourceGroupRequest, Builder> {
        private String computingResourceProvider; 
        private String description; 
        private String name; 
        private String resourceType; 
        private java.util.List<Tag> tag; 
        private UserVpc userVpc; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceGroupRequest request) {
            super(request);
            this.computingResourceProvider = request.computingResourceProvider;
            this.description = request.description;
            this.name = request.name;
            this.resourceType = request.resourceType;
            this.tag = request.tag;
            this.userVpc = request.userVpc;
        } 

        /**
         * ComputingResourceProvider.
         */
        public Builder computingResourceProvider(String computingResourceProvider) {
            this.putBodyParameter("ComputingResourceProvider", computingResourceProvider);
            this.computingResourceProvider = computingResourceProvider;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        @Override
        public CreateResourceGroupRequest build() {
            return new CreateResourceGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceGroupRequest</p>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
