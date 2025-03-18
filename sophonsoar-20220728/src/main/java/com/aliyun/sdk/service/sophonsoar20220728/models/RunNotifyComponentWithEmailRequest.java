// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link RunNotifyComponentWithEmailRequest} extends {@link RequestModel}
 *
 * <p>RunNotifyComponentWithEmailRequest</p>
 */
public class RunNotifyComponentWithEmailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer assetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Receivers")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> receivers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subject;

    private RunNotifyComponentWithEmailRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.assetId = builder.assetId;
        this.componentName = builder.componentName;
        this.content = builder.content;
        this.lang = builder.lang;
        this.nodeName = builder.nodeName;
        this.playbookUuid = builder.playbookUuid;
        this.receivers = builder.receivers;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.subject = builder.subject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunNotifyComponentWithEmailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionName
     */
    public String getActionName() {
        return this.actionName;
    }

    /**
     * @return assetId
     */
    public Integer getAssetId() {
        return this.assetId;
    }

    /**
     * @return componentName
     */
    public String getComponentName() {
        return this.componentName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    /**
     * @return receivers
     */
    public java.util.List<String> getReceivers() {
        return this.receivers;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public String getRoleType() {
        return this.roleType;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    public static final class Builder extends Request.Builder<RunNotifyComponentWithEmailRequest, Builder> {
        private String actionName; 
        private Integer assetId; 
        private String componentName; 
        private String content; 
        private String lang; 
        private String nodeName; 
        private String playbookUuid; 
        private java.util.List<String> receivers; 
        private Long roleFor; 
        private String roleType; 
        private String subject; 

        private Builder() {
            super();
        } 

        private Builder(RunNotifyComponentWithEmailRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.assetId = request.assetId;
            this.componentName = request.componentName;
            this.content = request.content;
            this.lang = request.lang;
            this.nodeName = request.nodeName;
            this.playbookUuid = request.playbookUuid;
            this.receivers = request.receivers;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.subject = request.subject;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notifyByCustom</p>
         */
        public Builder actionName(String actionName) {
            this.putQueryParameter("ActionName", actionName);
            this.actionName = actionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder assetId(Integer assetId) {
            this.putQueryParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NotifyMessage</p>
         */
        public Builder componentName(String componentName) {
            this.putQueryParameter("ComponentName", componentName);
            this.componentName = componentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>email content</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notify_message_1</p>
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e99dab31-499b-4307-9248-xxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder receivers(java.util.List<String> receivers) {
            this.putQueryParameter("Receivers", receivers);
            this.receivers = receivers;
            return this;
        }

        /**
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putQueryParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * RoleType.
         */
        public Builder roleType(String roleType) {
            this.putQueryParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        @Override
        public RunNotifyComponentWithEmailRequest build() {
            return new RunNotifyComponentWithEmailRequest(this);
        } 

    } 

}
