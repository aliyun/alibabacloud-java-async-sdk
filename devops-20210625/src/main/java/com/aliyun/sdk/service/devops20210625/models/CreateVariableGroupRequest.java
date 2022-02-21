// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVariableGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateVariableGroupRequest</p>
 */
public class CreateVariableGroupRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("variables")
    @Validation(required = true)
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

        private Builder(CreateVariableGroupRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.description = response.description;
            this.name = response.name;
            this.variables = response.variables;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如 https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 变量组描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 变量组名称
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 变量信息json字符串 isEncrypted 是否加密 name 变量名称 value 变量值
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
