// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachHostAccountsFromUserResponse} extends {@link TeaModel}
 *
 * <p>DetachHostAccountsFromUserResponse</p>
 */
public class DetachHostAccountsFromUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachHostAccountsFromUserResponseBody body;

    private DetachHostAccountsFromUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachHostAccountsFromUserResponse create() {
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
    public DetachHostAccountsFromUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachHostAccountsFromUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachHostAccountsFromUserResponseBody body);

        @Override
        DetachHostAccountsFromUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachHostAccountsFromUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachHostAccountsFromUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachHostAccountsFromUserResponse response) {
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
        public Builder body(DetachHostAccountsFromUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachHostAccountsFromUserResponse build() {
            return new DetachHostAccountsFromUserResponse(this);
        } 

    } 

}
