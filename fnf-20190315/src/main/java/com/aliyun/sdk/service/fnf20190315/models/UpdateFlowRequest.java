// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFlowRequest} extends {@link RequestModel}
 *
 * <p>UpdateFlowRequest</p>
 */
public class UpdateFlowRequest extends Request {
    @Body
    @NameInMap("Definition")
    private String definition;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("RoleArn")
    private String roleArn;

    @Body
    @NameInMap("Type")
    private String type;

    private UpdateFlowRequest(Builder builder) {
        super(builder);
        this.definition = builder.definition;
        this.description = builder.description;
        this.name = builder.name;
        this.roleArn = builder.roleArn;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
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
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateFlowRequest, Builder> {
        private String definition; 
        private String description; 
        private String name; 
        private String roleArn; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFlowRequest request) {
            super(request);
            this.definition = request.definition;
            this.description = request.description;
            this.name = request.name;
            this.roleArn = request.roleArn;
            this.type = request.type;
        } 

        /**
         * The flow definition, which follows the flow definition language (FDL) syntax standard. Considering compatibility, the system supports the two flow definition specifications.
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * The description of the flow.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the flow. The name must be unique within the region and cannot be modified after the flow is created. The name must meet the following conventions:
         * <p>
         * 
         * *   The name can contain letters, digits, underscores (\_), and hyphens (-).
         * *   The name must start with a letter or an underscore (\_).
         * *   The name is case-sensitive.
         * *   The name must be 1 to 128 characters in length.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, the flow execution engine assumes the role to call API operations of relevant services.
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The type of the flow. Valid value: **FDL**.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateFlowRequest build() {
            return new UpdateFlowRequest(this);
        } 

    } 

}
