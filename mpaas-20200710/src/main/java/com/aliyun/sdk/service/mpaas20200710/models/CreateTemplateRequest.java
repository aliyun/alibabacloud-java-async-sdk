// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20200710.models;

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
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DescInfo")
    private String descInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IconUrls")
    private String iconUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUrls")
    private String imageUrls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JumpAction")
    private Integer jumpAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PushStyle")
    private Integer pushStyle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowStyle")
    private Long showStyle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Variables")
    private String variables;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.content = builder.content;
        this.descInfo = builder.descInfo;
        this.iconUrls = builder.iconUrls;
        this.imageUrls = builder.imageUrls;
        this.jumpAction = builder.jumpAction;
        this.pushStyle = builder.pushStyle;
        this.showStyle = builder.showStyle;
        this.templateName = builder.templateName;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
        this.uri = builder.uri;
        this.variables = builder.variables;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return descInfo
     */
    public String getDescInfo() {
        return this.descInfo;
    }

    /**
     * @return iconUrls
     */
    public String getIconUrls() {
        return this.iconUrls;
    }

    /**
     * @return imageUrls
     */
    public String getImageUrls() {
        return this.imageUrls;
    }

    /**
     * @return jumpAction
     */
    public Integer getJumpAction() {
        return this.jumpAction;
    }

    /**
     * @return pushStyle
     */
    public Integer getPushStyle() {
        return this.pushStyle;
    }

    /**
     * @return showStyle
     */
    public Long getShowStyle() {
        return this.showStyle;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return variables
     */
    public String getVariables() {
        return this.variables;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String appId; 
        private String content; 
        private String descInfo; 
        private String iconUrls; 
        private String imageUrls; 
        private Integer jumpAction; 
        private Integer pushStyle; 
        private Long showStyle; 
        private String templateName; 
        private String tenantId; 
        private String title; 
        private String uri; 
        private String variables; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.appId = request.appId;
            this.content = request.content;
            this.descInfo = request.descInfo;
            this.iconUrls = request.iconUrls;
            this.imageUrls = request.imageUrls;
            this.jumpAction = request.jumpAction;
            this.pushStyle = request.pushStyle;
            this.showStyle = request.showStyle;
            this.templateName = request.templateName;
            this.tenantId = request.tenantId;
            this.title = request.title;
            this.uri = request.uri;
            this.variables = request.variables;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DescInfo.
         */
        public Builder descInfo(String descInfo) {
            this.putBodyParameter("DescInfo", descInfo);
            this.descInfo = descInfo;
            return this;
        }

        /**
         * IconUrls.
         */
        public Builder iconUrls(String iconUrls) {
            this.putBodyParameter("IconUrls", iconUrls);
            this.iconUrls = iconUrls;
            return this;
        }

        /**
         * ImageUrls.
         */
        public Builder imageUrls(String imageUrls) {
            this.putBodyParameter("ImageUrls", imageUrls);
            this.imageUrls = imageUrls;
            return this;
        }

        /**
         * JumpAction.
         */
        public Builder jumpAction(Integer jumpAction) {
            this.putBodyParameter("JumpAction", jumpAction);
            this.jumpAction = jumpAction;
            return this;
        }

        /**
         * PushStyle.
         */
        public Builder pushStyle(Integer pushStyle) {
            this.putBodyParameter("PushStyle", pushStyle);
            this.pushStyle = pushStyle;
            return this;
        }

        /**
         * ShowStyle.
         */
        public Builder showStyle(Long showStyle) {
            this.putBodyParameter("ShowStyle", showStyle);
            this.showStyle = showStyle;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * Uri.
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        /**
         * Variables.
         */
        public Builder variables(String variables) {
            this.putBodyParameter("Variables", variables);
            this.variables = variables;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

}
