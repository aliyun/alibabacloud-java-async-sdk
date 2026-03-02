// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link UpdateProfileRequest} extends {@link RequestModel}
 *
 * <p>UpdateProfileRequest</p>
 */
public class UpdateProfileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttributesOperations")
    private java.util.List<AttributesOperations> attributesOperations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserDefinedId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userDefinedId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateProfileRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.attributesOperations = builder.attributesOperations;
        this.description = builder.description;
        this.name = builder.name;
        this.userDefinedId = builder.userDefinedId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProfileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return attributesOperations
     */
    public java.util.List<AttributesOperations> getAttributesOperations() {
        return this.attributesOperations;
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
     * @return userDefinedId
     */
    public String getUserDefinedId() {
        return this.userDefinedId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateProfileRequest, Builder> {
        private String appId; 
        private java.util.List<AttributesOperations> attributesOperations; 
        private String description; 
        private String name; 
        private String userDefinedId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProfileRequest request) {
            super(request);
            this.appId = request.appId;
            this.attributesOperations = request.attributesOperations;
            this.description = request.description;
            this.name = request.name;
            this.userDefinedId = request.userDefinedId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mm_bfaf7e110b6d4359977d1686a3f8</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * AttributesOperations.
         */
        public Builder attributesOperations(java.util.List<AttributesOperations> attributesOperations) {
            String attributesOperationsShrink = shrink(attributesOperations, "AttributesOperations", "json");
            this.putQueryParameter("AttributesOperations", attributesOperationsShrink);
            this.attributesOperations = attributesOperations;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10b6d435</p>
         */
        public Builder userDefinedId(String userDefinedId) {
            this.putQueryParameter("UserDefinedId", userDefinedId);
            this.userDefinedId = userDefinedId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-jb5sabg80b4ts71g</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateProfileRequest build() {
            return new UpdateProfileRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateProfileRequest} extends {@link TeaModel}
     *
     * <p>UpdateProfileRequest</p>
     */
    public static class AttributesOperations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeId")
        private String attributeId;

        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Op")
        private String op;

        private AttributesOperations(Builder builder) {
            this.attributeId = builder.attributeId;
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.name = builder.name;
            this.op = builder.op;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributesOperations create() {
            return builder().build();
        }

        /**
         * @return attributeId
         */
        public String getAttributeId() {
            return this.attributeId;
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
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
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        public static final class Builder {
            private String attributeId; 
            private String defaultValue; 
            private String description; 
            private String name; 
            private String op; 

            private Builder() {
            } 

            private Builder(AttributesOperations model) {
                this.attributeId = model.attributeId;
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.name = model.name;
                this.op = model.op;
            } 

            /**
             * AttributeId.
             */
            public Builder attributeId(String attributeId) {
                this.attributeId = attributeId;
                return this;
            }

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            public AttributesOperations build() {
                return new AttributesOperations(this);
            } 

        } 

    }
}
