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
         * clientToken.
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

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * ramRole.
         */
        public Builder ramRole(String ramRole) {
            this.putBodyParameter("ramRole", ramRole);
            this.ramRole = ramRole;
            return this;
        }

        /**
         * sourcePath.
         */
        public Builder sourcePath(String sourcePath) {
            this.putBodyParameter("sourcePath", sourcePath);
            this.sourcePath = sourcePath;
            return this;
        }

        /**
         * workingDirectory.
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
