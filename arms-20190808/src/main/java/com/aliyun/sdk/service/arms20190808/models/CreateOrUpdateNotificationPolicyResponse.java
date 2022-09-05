// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateNotificationPolicyResponse} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateNotificationPolicyResponse</p>
 */
public class CreateOrUpdateNotificationPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOrUpdateNotificationPolicyResponseBody body;

    private CreateOrUpdateNotificationPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOrUpdateNotificationPolicyResponse create() {
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
    public CreateOrUpdateNotificationPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOrUpdateNotificationPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOrUpdateNotificationPolicyResponseBody body);

        @Override
        CreateOrUpdateNotificationPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOrUpdateNotificationPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOrUpdateNotificationPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOrUpdateNotificationPolicyResponse response) {
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
        public Builder body(CreateOrUpdateNotificationPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOrUpdateNotificationPolicyResponse build() {
            return new CreateOrUpdateNotificationPolicyResponse(this);
        } 

    } 

}
