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
 * {@link RunNotifyComponentWithWebhookRequest} extends {@link RequestModel}
 *
 * <p>RunNotifyComponentWithWebhookRequest</p>
 */
public class RunNotifyComponentWithWebhookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetId")
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
    @com.aliyun.core.annotation.NameInMap("MsgType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String msgType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private String roleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Secret")
    private String secret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Webhook")
    @com.aliyun.core.annotation.Validation(required = true)
    private String webhook;

    private RunNotifyComponentWithWebhookRequest(Builder builder) {
        super(builder);
        this.actionName = builder.actionName;
        this.assetId = builder.assetId;
        this.componentName = builder.componentName;
        this.content = builder.content;
        this.lang = builder.lang;
        this.msgType = builder.msgType;
        this.nodeName = builder.nodeName;
        this.playbookUuid = builder.playbookUuid;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.secret = builder.secret;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunNotifyComponentWithWebhookRequest create() {
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
     * @return msgType
     */
    public String getMsgType() {
        return this.msgType;
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
     * @return secret
     */
    public String getSecret() {
        return this.secret;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder extends Request.Builder<RunNotifyComponentWithWebhookRequest, Builder> {
        private String actionName; 
        private Integer assetId; 
        private String componentName; 
        private String content; 
        private String lang; 
        private String msgType; 
        private String nodeName; 
        private String playbookUuid; 
        private Long roleFor; 
        private String roleType; 
        private String secret; 
        private String webhook; 

        private Builder() {
            super();
        } 

        private Builder(RunNotifyComponentWithWebhookRequest request) {
            super(request);
            this.actionName = request.actionName;
            this.assetId = request.assetId;
            this.componentName = request.componentName;
            this.content = request.content;
            this.lang = request.lang;
            this.msgType = request.msgType;
            this.nodeName = request.nodeName;
            this.playbookUuid = request.playbookUuid;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.secret = request.secret;
            this.webhook = request.webhook;
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
         * AssetId.
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
         * <p>{
         *     &quot;at&quot;: {
         *         &quot;atMobiles&quot;:[
         *             &quot;180xxxxxx&quot;
         *         ],
         *         &quot;atUserIds&quot;:[
         *             &quot;user123&quot;
         *         ],
         *         &quot;isAtAll&quot;: false
         *     },
         *     &quot;text&quot;: {
         *         &quot;content&quot;:&quot;1234&quot;
         *     },
         *     &quot;msgtype&quot;:&quot;text&quot;
         * }</p>
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
         * <p>text</p>
         */
        public Builder msgType(String msgType) {
            this.putQueryParameter("MsgType", msgType);
            this.msgType = msgType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notify_message_node</p>
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
         * <p>94bc318c-<strong><strong>-4cba-</strong></strong>-801ccb0d739f</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putQueryParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
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
         * Secret.
         */
        public Builder secret(String secret) {
            this.putQueryParameter("Secret", secret);
            this.secret = secret;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;10651&quot;]</p>
         */
        public Builder webhook(String webhook) {
            this.putQueryParameter("Webhook", webhook);
            this.webhook = webhook;
            return this;
        }

        @Override
        public RunNotifyComponentWithWebhookRequest build() {
            return new RunNotifyComponentWithWebhookRequest(this);
        } 

    } 

}
