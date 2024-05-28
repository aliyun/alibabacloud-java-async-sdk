// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateIdentifier;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.customCode = builder.customCode;
        this.name = builder.name;
        this.scope = builder.scope;
        this.templateIdentifier = builder.templateIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
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
     * @return customCode
     */
    public String getCustomCode() {
        return this.customCode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scope
     */
    public String getScope() {
        return this.scope;
    }

    /**
     * @return templateIdentifier
     */
    public String getTemplateIdentifier() {
        return this.templateIdentifier;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String organizationId; 
        private String customCode; 
        private String name; 
        private String scope; 
        private String templateIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.customCode = request.customCode;
            this.name = request.name;
            this.scope = request.scope;
            this.templateIdentifier = request.templateIdentifier;
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
         * customCode.
         */
        public Builder customCode(String customCode) {
            this.putBodyParameter("customCode", customCode);
            this.customCode = customCode;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
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
         * templateIdentifier.
         */
        public Builder templateIdentifier(String templateIdentifier) {
            this.putBodyParameter("templateIdentifier", templateIdentifier);
            this.templateIdentifier = templateIdentifier;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

}
