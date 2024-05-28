// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRequest</p>
 */
public class CreateWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("codeUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("codeVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filePath")
    private String filePath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestFrom")
    private String requestFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceIdentifier")
    private String resourceIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reuse")
    private Boolean reuse;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceTemplate;

    private CreateWorkspaceRequest(Builder builder) {
        super(builder);
        this.codeUrl = builder.codeUrl;
        this.codeVersion = builder.codeVersion;
        this.filePath = builder.filePath;
        this.name = builder.name;
        this.requestFrom = builder.requestFrom;
        this.resourceIdentifier = builder.resourceIdentifier;
        this.reuse = builder.reuse;
        this.workspaceTemplate = builder.workspaceTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkspaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeUrl
     */
    public String getCodeUrl() {
        return this.codeUrl;
    }

    /**
     * @return codeVersion
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestFrom
     */
    public String getRequestFrom() {
        return this.requestFrom;
    }

    /**
     * @return resourceIdentifier
     */
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * @return reuse
     */
    public Boolean getReuse() {
        return this.reuse;
    }

    /**
     * @return workspaceTemplate
     */
    public String getWorkspaceTemplate() {
        return this.workspaceTemplate;
    }

    public static final class Builder extends Request.Builder<CreateWorkspaceRequest, Builder> {
        private String codeUrl; 
        private String codeVersion; 
        private String filePath; 
        private String name; 
        private String requestFrom; 
        private String resourceIdentifier; 
        private Boolean reuse; 
        private String workspaceTemplate; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkspaceRequest request) {
            super(request);
            this.codeUrl = request.codeUrl;
            this.codeVersion = request.codeVersion;
            this.filePath = request.filePath;
            this.name = request.name;
            this.requestFrom = request.requestFrom;
            this.resourceIdentifier = request.resourceIdentifier;
            this.reuse = request.reuse;
            this.workspaceTemplate = request.workspaceTemplate;
        } 

        /**
         * codeUrl.
         */
        public Builder codeUrl(String codeUrl) {
            this.putBodyParameter("codeUrl", codeUrl);
            this.codeUrl = codeUrl;
            return this;
        }

        /**
         * codeVersion.
         */
        public Builder codeVersion(String codeVersion) {
            this.putBodyParameter("codeVersion", codeVersion);
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * filePath.
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("filePath", filePath);
            this.filePath = filePath;
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
         * requestFrom.
         */
        public Builder requestFrom(String requestFrom) {
            this.putBodyParameter("requestFrom", requestFrom);
            this.requestFrom = requestFrom;
            return this;
        }

        /**
         * resourceIdentifier.
         */
        public Builder resourceIdentifier(String resourceIdentifier) {
            this.putBodyParameter("resourceIdentifier", resourceIdentifier);
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }

        /**
         * reuse.
         */
        public Builder reuse(Boolean reuse) {
            this.putBodyParameter("reuse", reuse);
            this.reuse = reuse;
            return this;
        }

        /**
         * workspaceTemplate.
         */
        public Builder workspaceTemplate(String workspaceTemplate) {
            this.putBodyParameter("workspaceTemplate", workspaceTemplate);
            this.workspaceTemplate = workspaceTemplate;
            return this;
        }

        @Override
        public CreateWorkspaceRequest build() {
            return new CreateWorkspaceRequest(this);
        } 

    } 

}
