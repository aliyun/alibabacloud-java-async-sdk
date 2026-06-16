// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link NotifyAppNotificationForAdminResponse} extends {@link TeaModel}
 *
 * <p>NotifyAppNotificationForAdminResponse</p>
 */
public class NotifyAppNotificationForAdminResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private NotifyAppNotificationForAdminResponseBody body;

    private NotifyAppNotificationForAdminResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static NotifyAppNotificationForAdminResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public NotifyAppNotificationForAdminResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<NotifyAppNotificationForAdminResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(NotifyAppNotificationForAdminResponseBody body);

        @Override
        NotifyAppNotificationForAdminResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<NotifyAppNotificationForAdminResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private NotifyAppNotificationForAdminResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(NotifyAppNotificationForAdminResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(NotifyAppNotificationForAdminResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public NotifyAppNotificationForAdminResponse build() {
            return new NotifyAppNotificationForAdminResponse(this);
        } 

    } 

}
