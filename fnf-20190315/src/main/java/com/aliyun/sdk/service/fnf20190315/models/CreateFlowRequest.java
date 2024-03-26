// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowRequest</p>
 */
public class CreateFlowRequest extends Request {
    @Body
    @NameInMap("Definition")
    @Validation(required = true)
    private String definition;

    @Body
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("ExecutionMode")
    private String executionMode;

    @Body
    @NameInMap("ExternalStorageLocation")
    private String externalStorageLocation;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("RoleArn")
    private String roleArn;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateFlowRequest(Builder builder) {
        super(builder);
        this.definition = builder.definition;
        this.description = builder.description;
        this.executionMode = builder.executionMode;
        this.externalStorageLocation = builder.externalStorageLocation;
        this.name = builder.name;
        this.roleArn = builder.roleArn;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowRequest create() {
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
     * @return executionMode
     */
    public String getExecutionMode() {
        return this.executionMode;
    }

    /**
     * @return externalStorageLocation
     */
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
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

    public static final class Builder extends Request.Builder<CreateFlowRequest, Builder> {
        private String definition; 
        private String description; 
        private String executionMode; 
        private String externalStorageLocation; 
        private String name; 
        private String roleArn; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowRequest request) {
            super(request);
            this.definition = request.definition;
            this.description = request.description;
            this.executionMode = request.executionMode;
            this.externalStorageLocation = request.externalStorageLocation;
            this.name = request.name;
            this.roleArn = request.roleArn;
            this.type = request.type;
        } 

        /**
         * The definition of the flow. The definition must comply with the flow definition language (FDL) syntax. Considering compatibility, the system supports two flow definition specifications.
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
         * The execution mode. Valid values: Express and Standard. Considering compatibility, an empty string is equivalent to the Standard execution mode.
         */
        public Builder executionMode(String executionMode) {
            this.putBodyParameter("ExecutionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * The path of the external storage.
         */
        public Builder externalStorageLocation(String externalStorageLocation) {
            this.putBodyParameter("ExternalStorageLocation", externalStorageLocation);
            this.externalStorageLocation = externalStorageLocation;
            return this;
        }

        /**
         * The name of the flow. The name is unique within the same region and cannot be modified after the flow is created. Set this parameter based on the following rules:
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
         * The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, CloudFlow assumes the role to call API operations of relevant services.
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * The type of the flow. Set this parameter to **FDL**.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateFlowRequest build() {
            return new CreateFlowRequest(this);
        } 

    } 

}
