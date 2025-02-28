// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link CreateFlowRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowRequest</p>
 */
public class CreateFlowRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Definition")
    @com.aliyun.core.annotation.Validation(required = true)
    private String definition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExecutionMode")
    private String executionMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalStorageLocation")
    private String externalStorageLocation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The definition of the workflow. The definition must comply with the flow definition language (FDL) syntax. Considering compatibility, the system supports two flow definition specifications.</p>
         * <blockquote>
         * <p> In the preceding flow definition example, Name:my_flow_name is the workflow name, which must be consistent with the input parameter Name</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>version:&nbsp;v1.0<br/>type:&nbsp;flow<br/>steps:<br/>&nbsp;-&nbsp;type:&nbsp;pass<br/>&nbsp;name:&nbsp;mypass</p>
         */
        public Builder definition(String definition) {
            this.putBodyParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * <p>The description of the flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test flow</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The execution mode. Valid values: Express and Standard. Considering compatibility, an empty string is equivalent to the Standard execution mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder executionMode(String executionMode) {
            this.putBodyParameter("ExecutionMode", executionMode);
            this.executionMode = executionMode;
            return this;
        }

        /**
         * <p>The path of the external storage.</p>
         * 
         * <strong>example:</strong>
         * <p>/path</p>
         */
        public Builder externalStorageLocation(String externalStorageLocation) {
            this.putBodyParameter("ExternalStorageLocation", externalStorageLocation);
            this.externalStorageLocation = externalStorageLocation;
            return this;
        }

        /**
         * <p>The name of the flow. The name is unique within the same region and cannot be modified after the flow is created. Set this parameter based on the following rules:</p>
         * <ul>
         * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
         * <li>The name must start with a letter or an underscore (_).</li>
         * <li>The name is case-sensitive.</li>
         * <li>The name must be 1 to 128 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, CloudFlow assumes the role to call API operations of relevant services.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram:${region}:${accountID}:${role}</p>
         */
        public Builder roleArn(String roleArn) {
            this.putBodyParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * <p>The type of the flow. Set this parameter to <strong>FDL</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FDL</p>
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
