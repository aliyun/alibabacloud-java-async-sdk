// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateVariableGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateVariableGroupRequest</p>
 */
public class CreateVariableGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variables")
    @com.aliyun.core.annotation.Validation(required = true)
    private String variables;

    private CreateVariableGroupRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.description = builder.description;
        this.name = builder.name;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVariableGroupRequest create() {
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
     * @return variables
     */
    public String getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<CreateVariableGroupRequest, Builder> {
        private String organizationId; 
        private String description; 
        private String name; 
        private String variables; 

        private Builder() {
            super();
        } 

        private Builder(CreateVariableGroupRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.description = request.description;
            this.name = request.name;
            this.variables = request.variables;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>变量组</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;isEncrypted&quot;:true,&quot;name&quot;:&quot;name1&quot;,&quot;value&quot;:&quot;vaue1&quot;}]</p>
         */
        public Builder variables(String variables) {
            this.putBodyParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public CreateVariableGroupRequest build() {
            return new CreateVariableGroupRequest(this);
        } 

    } 

}
