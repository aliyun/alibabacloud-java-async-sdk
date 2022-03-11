// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachHostGroupAccountsFromUserResponse} extends {@link TeaModel}
 *
 * <p>DetachHostGroupAccountsFromUserResponse</p>
 */
public class DetachHostGroupAccountsFromUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachHostGroupAccountsFromUserResponseBody body;

    private DetachHostGroupAccountsFromUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachHostGroupAccountsFromUserResponse create() {
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
    public DetachHostGroupAccountsFromUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachHostGroupAccountsFromUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachHostGroupAccountsFromUserResponseBody body);

        @Override
        DetachHostGroupAccountsFromUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachHostGroupAccountsFromUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachHostGroupAccountsFromUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachHostGroupAccountsFromUserResponse response) {
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
        public Builder body(DetachHostGroupAccountsFromUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachHostGroupAccountsFromUserResponse build() {
            return new DetachHostGroupAccountsFromUserResponse(this);
        } 

    } 

}
