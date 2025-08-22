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
 * {@link UpdateRegistryNamespaceAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateRegistryNamespaceAttributeRequest</p>
 */
public class UpdateRegistryNamespaceAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("namespaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceName;

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

    private UpdateRegistryNamespaceAttributeRequest(Builder builder) {
        super(builder);
        this.namespaceName = builder.namespaceName;
        this.acl = builder.acl;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRegistryNamespaceAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
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

    public static final class Builder extends Request.Builder<UpdateRegistryNamespaceAttributeRequest, Builder> {
        private String namespaceName; 
        private String acl; 
        private String clientToken; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRegistryNamespaceAttributeRequest request) {
            super(request);
            this.namespaceName = request.namespaceName;
            this.acl = request.acl;
            this.clientToken = request.clientToken;
            this.description = request.description;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putPathParameter("namespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * acl.
         */
        public Builder acl(String acl) {
            this.putBodyParameter("acl", acl);
            this.acl = acl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public UpdateRegistryNamespaceAttributeRequest build() {
            return new UpdateRegistryNamespaceAttributeRequest(this);
        } 

    } 

}
