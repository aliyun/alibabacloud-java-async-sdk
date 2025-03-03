// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link CreateServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceLinkedRoleRequest</p>
 */
public class CreateServiceLinkedRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSuffix")
    private String customSuffix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    private CreateServiceLinkedRoleRequest(Builder builder) {
        super(builder);
        this.customSuffix = builder.customSuffix;
        this.description = builder.description;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customSuffix
     */
    public String getCustomSuffix() {
        return this.customSuffix;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<CreateServiceLinkedRoleRequest, Builder> {
        private String customSuffix; 
        private String description; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceLinkedRoleRequest request) {
            super(request);
            this.customSuffix = request.customSuffix;
            this.description = request.description;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>The suffix of the role name.</p>
         * <p>The role name (including its suffix) must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
         * <p>For example, if the suffix is <code>Example</code>, the role name is <code>ServiceLinkedRoleName_Example</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Example</p>
         */
        public Builder customSuffix(String customSuffix) {
            this.putQueryParameter("CustomSuffix", customSuffix);
            this.customSuffix = customSuffix;
            return this;
        }

        /**
         * <p>The description of the service-linked role.</p>
         * <p>You must configure this parameter for service-linked roles that support custom suffixes. Otherwise, the preset value is used and cannot be modified.</p>
         * <p>The description must be 1 to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Service Linked Role for PolarDB. PolarDB will use this role to access your resources in other services.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the service.</p>
         * <p>For more information about the service name, see <a href="https://help.aliyun.com/document_detail/461722.html">Alibaba Cloud services that support service-linked roles</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb.aliyuncs.com</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public CreateServiceLinkedRoleRequest build() {
            return new CreateServiceLinkedRoleRequest(this);
        } 

    } 

}
