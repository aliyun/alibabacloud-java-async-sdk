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
 * {@link CreateStackRequest} extends {@link RequestModel}
 *
 * <p>CreateStackRequest</p>
 */
public class CreateStackRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("source")
    @com.aliyun.core.annotation.Validation(required = true)
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourcePath")
    private String sourcePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workingDirectory")
    private String workingDirectory;

    private CreateStackRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.name = builder.name;
        this.ramRole = builder.ramRole;
        this.source = builder.source;
        this.sourcePath = builder.sourcePath;
        this.workingDirectory = builder.workingDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStackRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return source
     */
    public String getSource() {
        return this.source;
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

    public static final class Builder extends Request.Builder<CreateStackRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String name; 
        private String ramRole; 
        private String source; 
        private String sourcePath; 
        private String workingDirectory; 

        private Builder() {
            super();
        } 

        private Builder(CreateStackRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.name = request.name;
            this.ramRole = request.ramRole;
            this.source = request.source;
            this.sourcePath = request.sourcePath;
            this.workingDirectory = request.workingDirectory;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("source", source);
            this.source = source;
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
        public CreateStackRequest build() {
            return new CreateStackRequest(this);
        } 

    } 

}
