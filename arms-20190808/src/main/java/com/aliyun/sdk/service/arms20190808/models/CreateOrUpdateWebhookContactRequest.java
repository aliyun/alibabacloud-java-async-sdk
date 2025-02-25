// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link CreateOrUpdateWebhookContactRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateWebhookContactRequest</p>
 */
public class CreateOrUpdateWebhookContactRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizHeaders")
    private String bizHeaders;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizParams")
    private String bizParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Body")
    private String body;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecoverBody")
    private String recoverBody;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebhookId")
    private Long webhookId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WebhookName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String webhookName;

    private CreateOrUpdateWebhookContactRequest(Builder builder) {
        super(builder);
        this.bizHeaders = builder.bizHeaders;
        this.bizParams = builder.bizParams;
        this.body = builder.body;
        this.method = builder.method;
        this.recoverBody = builder.recoverBody;
        this.url = builder.url;
        this.webhookId = builder.webhookId;
        this.webhookName = builder.webhookName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateWebhookContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizHeaders
     */
    public String getBizHeaders() {
        return this.bizHeaders;
    }

    /**
     * @return bizParams
     */
    public String getBizParams() {
        return this.bizParams;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return recoverBody
     */
    public String getRecoverBody() {
        return this.recoverBody;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return webhookId
     */
    public Long getWebhookId() {
        return this.webhookId;
    }

    /**
     * @return webhookName
     */
    public String getWebhookName() {
        return this.webhookName;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateWebhookContactRequest, Builder> {
        private String bizHeaders; 
        private String bizParams; 
        private String body; 
        private String method; 
        private String recoverBody; 
        private String url; 
        private Long webhookId; 
        private String webhookName; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateWebhookContactRequest request) {
            super(request);
            this.bizHeaders = request.bizHeaders;
            this.bizParams = request.bizParams;
            this.body = request.body;
            this.method = request.method;
            this.recoverBody = request.recoverBody;
            this.url = request.url;
            this.webhookId = request.webhookId;
            this.webhookName = request.webhookName;
        } 

        /**
         * <p>The HTTP request headers.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Content-Type&quot;:&quot;application/json;charset=utf-8&quot;}]</p>
         */
        public Builder bizHeaders(String bizHeaders) {
            this.putBodyParameter("BizHeaders", bizHeaders);
            this.bizHeaders = bizHeaders;
            return this;
        }

        /**
         * <p>The parameters in the HTTP request.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;content&quot;:&quot;mike&quot;}]</p>
         */
        public Builder bizParams(String bizParams) {
            this.putBodyParameter("BizParams", bizParams);
            this.bizParams = bizParams;
            return this;
        }

        /**
         * <p>The notification template that is sent when an alert is triggered. This parameter is required if the <strong>Method</strong> parameter is set to <strong>Post</strong>. You can use the <code>$content</code> placeholder to specify the notification content. The content cannot exceed 500 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/251834.html">Variable description of a notification template</a>.\</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Alert name&quot;:&quot;{{ .commonLabels.alertname }}{{if .commonLabels.clustername }}&quot;, &quot;Cluster name&quot;:&quot;{{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}&quot;, &quot;Application name&quot;:&quot;{{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}&quot;, &quot;Notification policy&quot;:&quot;{{ .dispatchRuleName }}&quot;, &quot;Alert time&quot;:&quot;{{ .startTime }}&quot;, &quot;Alert content&quot;:&quot;{{ for .alerts }} {{ .annotations.message }} {{ end }}&quot; }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The HTTP request method.</p>
         * <ul>
         * <li>Post</li>
         * <li>Get</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Post</p>
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>The notification template that is sent when an alert is resolved. This parameter is required if the <strong>Method</strong> parameter is set to <strong>Post</strong>. You can use the <code>$content</code> placeholder to specify the notification content. The content cannot exceed 500 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/251834.html">Variable description of a notification template</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Alert name&quot;:&quot;{{ .commonLabels.alertname }}{{if .commonLabels.clustername }}&quot;, &quot;Cluster name&quot;:&quot;{{ .commonLabels.clustername }} {{ end }}{{if eq &quot;app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}&quot;, &quot;Application name&quot;:&quot;{{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}&quot;, &quot;Notification policy&quot;:&quot;{{ .dispatchRuleName }}&quot;, &quot;Recovery time&quot;:&quot;{{ .endTime }}&quot;, &quot;Alert content&quot;:&quot;{{ for .alerts }} {{ .annotations.message }} {{ end }}&quot; }</p>
         */
        public Builder recoverBody(String recoverBody) {
            this.putBodyParameter("RecoverBody", recoverBody);
            this.recoverBody = recoverBody;
            return this;
        }

        /**
         * <p>The URL of the HTTP request <strong>method</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=e1a049121">https://oapi.dingtalk.com/robot/send?access_token=e1a049121</a>******</p>
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * <p>The ID of the webhook alert contact.</p>
         * <ul>
         * <li>If you do not specify this parameter, a new webhook alert contact is created.</li>
         * <li>If you specify this parameter, the specified webhook alert contact is modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder webhookId(Long webhookId) {
            this.putBodyParameter("WebhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        /**
         * <p>The name of the webhook alert contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Webhook alert</p>
         */
        public Builder webhookName(String webhookName) {
            this.putBodyParameter("WebhookName", webhookName);
            this.webhookName = webhookName;
            return this;
        }

        @Override
        public CreateOrUpdateWebhookContactRequest build() {
            return new CreateOrUpdateWebhookContactRequest(this);
        } 

    } 

}
