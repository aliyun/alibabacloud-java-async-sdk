// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkspaceRequest</p>
 */
public class CreateWorkspaceRequest extends Request {
    @Body
    @NameInMap("codeUrl")
    @Validation(required = true)
    private String codeUrl;

    @Body
    @NameInMap("codeVersion")
    @Validation(required = true)
    private String codeVersion;

    @Body
    @NameInMap("filePath")
    private String filePath;

    @Body
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("requestFrom")
    private String requestFrom;

    @Body
    @NameInMap("resourceIdentifier")
    private String resourceIdentifier;

    @Body
    @NameInMap("reuse")
    private Boolean reuse;

    @Body
    @NameInMap("workspaceTemplate")
    @Validation(required = true)
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
         * 代码来源URL（当前仅支持云效 Codeup 来源）
         */
        public Builder codeUrl(String codeUrl) {
            this.putBodyParameter("codeUrl", codeUrl);
            this.codeUrl = codeUrl;
            return this;
        }

        /**
         * 代码版本，支持 commitSHA、分支、标签
         */
        public Builder codeVersion(String codeVersion) {
            this.putBodyParameter("codeVersion", codeVersion);
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * 打开空间默认打开的文件相对路径
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("filePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * 工作空间名称
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 请求来源（用于统计，云产品集成时需要传入）
         */
        public Builder requestFrom(String requestFrom) {
            this.putBodyParameter("requestFrom", requestFrom);
            this.requestFrom = requestFrom;
            return this;
        }

        /**
         * 资源标识，提供给非标代码源作为空间复用的唯一标识
         */
        public Builder resourceIdentifier(String resourceIdentifier) {
            this.putBodyParameter("resourceIdentifier", resourceIdentifier);
            this.resourceIdentifier = resourceIdentifier;
            return this;
        }

        /**
         * 工作空间复用标识，按照"用户+技术栈+代码地址+版本"进行复用 true - 复用 false - 不复用，每次均为新创建
         */
        public Builder reuse(Boolean reuse) {
            this.putBodyParameter("reuse", reuse);
            this.reuse = reuse;
            return this;
        }

        /**
         * 技术栈
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
