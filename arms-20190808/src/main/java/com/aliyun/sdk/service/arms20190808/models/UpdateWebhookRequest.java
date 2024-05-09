// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWebhookRequest} extends {@link RequestModel}
 *
 * <p>UpdateWebhookRequest</p>
 */
public class UpdateWebhookRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Body")
    @com.aliyun.core.annotation.Validation(required = true)
    private String body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contactId;

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

    private UpdateWebhookRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.contactId = builder.contactId;
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

    public static UpdateWebhookRequest create() {
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
     * @return contactId
     */
    public Long getContactId() {
        return this.contactId;
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

    public static final class Builder extends Request.Builder<UpdateWebhookRequest, Builder> {
        private String body; 
        private Long contactId; 
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

        private Builder(UpdateWebhookRequest request) {
            super(request);
            this.body = request.body;
            this.contactId = request.contactId;
            this.contactName = request.contactName;
            this.httpHeaders = request.httpHeaders;
            this.httpParams = request.httpParams;
            this.method = request.method;
            this.recoverBody = request.recoverBody;
            this.regionId = request.regionId;
            this.url = request.url;
        } 

        /**
         * The notification template that is sent when an alert is triggered. This parameter is required if the **Method** parameter is set to **Post**. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * The ID of the webhook alert contact. You can call the **SearchAlertContact** operation to obtain the ID.
         */
        public Builder contactId(Long contactId) {
            this.putQueryParameter("ContactId", contactId);
            this.contactId = contactId;
            return this;
        }

        /**
         * The name of the webhook alert contact.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * The HTTP request headers.
         */
        public Builder httpHeaders(String httpHeaders) {
            this.putQueryParameter("HttpHeaders", httpHeaders);
            this.httpHeaders = httpHeaders;
            return this;
        }

        /**
         * The parameters in the HTTP request.
         */
        public Builder httpParams(String httpParams) {
            this.putQueryParameter("HttpParams", httpParams);
            this.httpParams = httpParams;
            return this;
        }

        /**
         * The HTTP request method. Valid values:
         * <p>
         * 
         * *   `Get`
         * *   `Post`
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * The notification template that is sent when an alert is resolved. This parameter is required if the **Method** parameter is set to **Post**. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.
         */
        public Builder recoverBody(String recoverBody) {
            this.putQueryParameter("RecoverBody", recoverBody);
            this.recoverBody = recoverBody;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The URL of the HTTP request method.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public UpdateWebhookRequest build() {
            return new UpdateWebhookRequest(this);
        } 

    } 

}
