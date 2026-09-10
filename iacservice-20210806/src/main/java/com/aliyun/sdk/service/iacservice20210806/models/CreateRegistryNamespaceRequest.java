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
 * {@link CreateRegistryNamespaceRequest} extends {@link RequestModel}
 *
 * <p>CreateRegistryNamespaceRequest</p>
 */
public class CreateRegistryNamespaceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("maintainer")
    private String maintainer;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

    private CreateRegistryNamespaceRequest(Builder builder) {
        super(builder);
        this.acl = builder.acl;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.maintainer = builder.maintainer;
        this.namespaceName = builder.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRegistryNamespaceRequest create() {
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
     * @return maintainer
     */
    public String getMaintainer() {
        return this.maintainer;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    public static final class Builder extends Request.Builder<CreateRegistryNamespaceRequest, Builder> {
        private String acl; 
        private String clientToken; 
        private String description; 
        private String maintainer; 
        private String namespaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRegistryNamespaceRequest request) {
            super(request);
            this.acl = request.acl;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.maintainer = request.maintainer;
            this.namespaceName = request.namespaceName;
        } 

        /**
         * <p>The access permission. Valid values:</p>
         * <ul>
         * <li>private: private access.</li>
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
         * <p>The workspace description.</p>
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
         * <p>The administrator name.</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder maintainer(String maintainer) {
            this.putBodyParameter("maintainer", maintainer);
            this.maintainer = maintainer;
            return this;
        }

        /**
         * <p>The workspace name. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be 3 to 63 characters in length.</li>
         * <li>The name can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (_), and cannot start or end with a hyphen.</li>
         * <li>The name must be unique within the global workspace resources.</li>
         * </ul>
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

        @Override
        public CreateRegistryNamespaceRequest build() {
            return new CreateRegistryNamespaceRequest(this);
        } 

    } 

}
