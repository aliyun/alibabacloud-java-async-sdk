// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceConnectionRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceConnectionRequest</p>
 */
public class CreateServiceConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("connectionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("connectionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("serviceAuthId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceAuthId;

    private CreateServiceConnectionRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.authType = builder.authType;
        this.connectionName = builder.connectionName;
        this.connectionType = builder.connectionType;
        this.scope = builder.scope;
        this.serviceAuthId = builder.serviceAuthId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return connectionName
     */
    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * @return connectionType
     */
    public String getConnectionType() {
        return this.connectionType;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return serviceAuthId
     */
    public Long getServiceAuthId() {
        return this.serviceAuthId;
    }

    public static final class Builder extends Request.Builder<CreateServiceConnectionRequest, Builder> {
        private String organizationId; 
        private String authType; 
        private String connectionName; 
        private String connectionType; 
        private String scope; 
        private Long serviceAuthId; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceConnectionRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.authType = request.authType;
            this.connectionName = request.connectionName;
            this.connectionType = request.connectionType;
            this.scope = request.scope;
            this.serviceAuthId = request.serviceAuthId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * authType.
         */
        public Builder authType(String authType) {
            this.putBodyParameter("authType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * connectionName.
         */
        public Builder connectionName(String connectionName) {
            this.putBodyParameter("connectionName", connectionName);
            this.connectionName = connectionName;
            return this;
        }

        /**
         * connectionType.
         */
        public Builder connectionType(String connectionType) {
            this.putBodyParameter("connectionType", connectionType);
            this.connectionType = connectionType;
            return this;
        }

        /**
         * scope.
         */
        public Builder scope(String scope) {
            this.putBodyParameter("scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * serviceAuthId.
         */
        public Builder serviceAuthId(Long serviceAuthId) {
            this.putBodyParameter("serviceAuthId", serviceAuthId);
            this.serviceAuthId = serviceAuthId;
            return this;
        }

        @Override
        public CreateServiceConnectionRequest build() {
            return new CreateServiceConnectionRequest(this);
        } 

    } 

}
