// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchSurveyResponse} extends {@link TeaModel}
 *
 * <p>LaunchSurveyResponse</p>
 */
public class LaunchSurveyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LaunchSurveyResponseBody body;

    private LaunchSurveyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LaunchSurveyResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public LaunchSurveyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LaunchSurveyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LaunchSurveyResponseBody body);

        @Override
        LaunchSurveyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LaunchSurveyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LaunchSurveyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LaunchSurveyResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(LaunchSurveyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LaunchSurveyResponse build() {
            return new LaunchSurveyResponse(this);
        } 

    } 

}
