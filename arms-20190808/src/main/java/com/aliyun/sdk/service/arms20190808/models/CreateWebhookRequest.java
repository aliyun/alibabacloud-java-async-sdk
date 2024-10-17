// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateWebhookRequest} extends {@link RequestModel}
 *
 * <p>CreateWebhookRequest</p>
 */
public class CreateWebhookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    @com.aliyun.core.annotation.Validation(required = true)
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpHeaders")
    private String httpHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HttpParams")
    private String httpParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Method")
    @com.aliyun.core.annotation.Validation(required = true)
    private String method;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoverBody")
    private String recoverBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private CreateWebhookRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.contactName = builder.contactName;
        this.httpHeaders = builder.httpHeaders;
        this.httpParams = builder.httpParams;
        this.method = builder.method;
        this.recoverBody = builder.recoverBody;
        this.regionId = builder.regionId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebhookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return httpHeaders
     */
    public String getHttpHeaders() {
        return this.httpHeaders;
    }

    /**
     * @return httpParams
     */
    public String getHttpParams() {
        return this.httpParams;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CreateWebhookRequest, Builder> {
        private String body; 
        private String contactName; 
        private String httpHeaders; 
        private String httpParams; 
        private String method; 
        private String recoverBody; 
        private String regionId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebhookRequest request) {
            super(request);
            this.body = request.body;
            this.contactName = request.contactName;
            this.httpHeaders = request.httpHeaders;
            this.httpParams = request.httpParams;
            this.method = request.method;
            this.recoverBody = request.recoverBody;
            this.regionId = request.regionId;
            this.url = request.url;
        } 

        /**
         * <p>The notification template that is sent when an alert is triggered. This parameter is required if the <strong>Method</strong> parameter is set to <strong>Post</strong>. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Alert Name&quot;: &quot;{{ .commonLabels.alertname }}{{if .commonLabels.clustername }}&quot;, &quot;Cluster Name&quot;: &quot;{{ .commonLabels.clustername }} {{ end }}{{if eq &quot; app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}&quot;, &quot;Application Name&quot;: &quot;{{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}&quot;, &quot;Notification Policy&quot;: &quot;{{ .dispatchRuleName }}&quot;, &quot;Alarm Time&quot;: &quot;{{ .startTime }}&quot;, &quot;Alert Content&quot;: &quot;{{ for .alerts }} {{ .annotations.message }} {{ end }}&quot; }</p>
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * <p>The name of the contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WebhookAlert</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>The HTTP request header.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Content-Type&quot;:&quot;application/json&quot;}]</p>
         */
        public Builder httpHeaders(String httpHeaders) {
            this.putQueryParameter("HttpHeaders", httpHeaders);
            this.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * <p>The parameters in the HTTP request.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;name&quot;:&quot;mike&quot;}]</p>
         */
        public Builder httpParams(String httpParams) {
            this.putQueryParameter("HttpParams", httpParams);
            this.httpParams = httpParams;
            return this;
        }

        /**
         * <p>The HTTP request method.</p>
         * <ul>
         * <li><code>Get</code></li>
         * <li><code>Post</code></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Post</p>
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>The notification template that is sent when an alert is resolved. This parameter is required if the <strong>Method</strong> parameter is set to <strong>Post</strong>. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Alert Name&quot;: &quot;{{ .commonLabels.alertname }}{{if .commonLabels.clustername }}&quot;, &quot;Cluster Name&quot;: &quot;{{ .commonLabels.clustername }} {{ end }}{{if eq &quot; app&quot; .commonLabels._aliyun_arms_involvedObject_kind }}&quot;, &quot;Application Name&quot;: &quot;{{ .commonLabels._aliyun_arms_involvedObject_name }} {{ end }}&quot;, &quot;Notification Policy&quot;: &quot;{{ .dispatchRuleName }}&quot;, &quot;Alarm Time&quot;: &quot;{{ .startTime }}&quot;, &quot;Alert Content&quot;: &quot;{{ for .alerts }} {{ .annotations.message }} {{ end }}&quot; }</p>
         */
        public Builder recoverBody(String recoverBody) {
            this.putQueryParameter("RecoverBody", recoverBody);
            this.recoverBody = recoverBody;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The URL of the request <strong>method</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=e1a049121ddbfce1ca963d115ef88cc7219583c4fb79fe6e398fbfb688">https://oapi.dingtalk.com/robot/send?access_token=e1a049121ddbfce1ca963d115ef88cc7219583c4fb79fe6e398fbfb688</a>******</p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CreateWebhookRequest build() {
            return new CreateWebhookRequest(this);
        } 

    } 

}
