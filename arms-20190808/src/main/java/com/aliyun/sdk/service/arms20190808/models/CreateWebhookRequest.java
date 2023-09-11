// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebhookRequest} extends {@link RequestModel}
 *
 * <p>CreateWebhookRequest</p>
 */
public class CreateWebhookRequest extends Request {
    @Query
    @NameInMap("Body")
    @Validation(required = true)
    private String body;

    @Query
    @NameInMap("ContactName")
    @Validation(required = true)
    private String contactName;

    @Query
    @NameInMap("HttpHeaders")
    private String httpHeaders;

    @Query
    @NameInMap("HttpParams")
    private String httpParams;

    @Query
    @NameInMap("Method")
    @Validation(required = true)
    private String method;

    @Query
    @NameInMap("RecoverBody")
    private String recoverBody;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
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
         * The notification template that is sent when an alert is triggered. This parameter is required if the **Method** parameter is set to **Post**. You can use the $content placeholder to specify the notification content. The content cannot exceed 500 characters in length.
         */
        public Builder body(String body) {
            this.putQueryParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * The name of the contact.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * The HTTP request header.
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
         * The HTTP request method.
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
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The URL of the request **method**.
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
