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
 * {@link UpdateStackRequest} extends {@link RequestModel}
 *
 * <p>UpdateStackRequest</p>
 */
public class UpdateStackRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("stackId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ramRole")
    private String ramRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourcePath")
    private String sourcePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workingDirectory")
    private String workingDirectory;

    private UpdateStackRequest(Builder builder) {
        super(builder);
        this.stackId = builder.stackId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
        this.ramRole = builder.ramRole;
        this.sourcePath = builder.sourcePath;
        this.workingDirectory = builder.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return sourcePath
     */
    public String getSourcePath() {
        return this.sourcePath;
    }

    /**
     * @return workingDirectory
     */
    public String getWorkingDirectory() {
        return this.workingDirectory;
    }

    public static final class Builder extends Request.Builder<UpdateStackRequest, Builder> {
        private String stackId; 
        private String clientToken; 
        private String description; 
        private String name; 
        private String ramRole; 
        private String sourcePath; 
        private String workingDirectory; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStackRequest request) {
            super(request);
            this.stackId = request.stackId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
            this.ramRole = request.ramRole;
            this.sourcePath = request.sourcePath;
            this.workingDirectory = request.workingDirectory;
        } 

        /**
         * <p>The stack ID. This is the unique identifier generated after the stack is created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqbxxxxx</p>
         */
        public Builder stackId(String stackId) {
            this.putPathParameter("stackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The idempotency token. Format: [0-9a-zA-Z-]{1,64}. We recommend that you use a UUID.</p>
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
         * <p>The description of the stack.</p>
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
         * <p>The name of the stack. The name must be 2 to 128 characters in length and can contain letters, digits, Chinese characters, hyphens (-), underscores (_), and periods (.). The name cannot start or end with a hyphen, underscore, or period.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The RAM role granted to the task. This role is used to automatically continue the execution of scheduled tasks during automatic triggering or offline scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>TestIacRole</p>
         */
        public Builder ramRole(String ramRole) {
            this.putBodyParameter("ramRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * <p>The path of the configuration source. The value can be up to 1,000 characters in length.</p>
         * <ul>
         * <li>If the source is OSS, set this parameter to oss::<file URL>. The file must be a ZIP file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a>.</li>
         * <li>If the source is IAC_SERVICE_MODULE, set this parameter to a template ID. Example: mod-xxxxx.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        public Builder sourcePath(String sourcePath) {
            this.putBodyParameter("sourcePath", sourcePath);
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * <p>The working directory where the configuration files are located. Enter / if the files are in the root directory. Example: config/ or /.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder workingDirectory(String workingDirectory) {
            this.putBodyParameter("workingDirectory", workingDirectory);
            this.workingDirectory = workingDirectory;
            return this;
        }

        @Override
        public UpdateStackRequest build() {
            return new UpdateStackRequest(this);
        } 

    } 

}
