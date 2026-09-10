// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link CreateRegistryModuleRequest} extends {@link RequestModel}
 *
 * <p>CreateRegistryModuleRequest</p>
 */
public class CreateRegistryModuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("acl")
    private String acl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("provider")
    private String provider;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateRegistryModuleRequest(Builder builder) {
        super(builder);
        this.acl = builder.acl;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.moduleName = builder.moduleName;
        this.namespaceName = builder.namespaceName;
        this.provider = builder.provider;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRegistryModuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acl
     */
    public String getAcl() {
        return this.acl;
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
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateRegistryModuleRequest, Builder> {
        private String acl; 
        private String clientToken; 
        private String description; 
        private String moduleName; 
        private String namespaceName; 
        private String provider; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateRegistryModuleRequest request) {
            super(request);
            this.acl = request.acl;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.moduleName = request.moduleName;
            this.namespaceName = request.namespaceName;
            this.provider = request.provider;
            this.type = request.type;
        } 

        /**
         * <p>The access permission. Valid values:</p>
         * <ul>
         * <li>private: private.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder acl(String acl) {
            this.putBodyParameter("acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * <p>The idempotence token. Format: [0-9a-zA-Z-]{1,64}. Use a UUID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a65451293e64979ba7a4b573950217fe</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the Registry template.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the Registry template. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 3 to 63 characters in length.</li>
         * <li>The name can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (_), and cannot start or end with a hyphen.</li>
         * <li>The name must be unique within the workspace.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ModuleName</p>
         */
        public Builder moduleName(String moduleName) {
            this.putBodyParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The workspace name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NamespaceName</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putBodyParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The provider type. Valid values:</p>
         * <ul>
         * <li>alicloud: Alibaba Cloud.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>alicloud</p>
         */
        public Builder provider(String provider) {
            this.putBodyParameter("provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * <p>The template type. Valid values:</p>
         * <ul>
         * <li>self: custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateRegistryModuleRequest build() {
            return new CreateRegistryModuleRequest(this);
        } 

    } 

}
