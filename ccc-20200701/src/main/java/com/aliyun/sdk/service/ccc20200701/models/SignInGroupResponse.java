// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SignInGroupResponse} extends {@link TeaModel}
 *
 * <p>SignInGroupResponse</p>
 */
public class SignInGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SignInGroupResponseBody body;

    private SignInGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SignInGroupResponse create() {
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
    public SignInGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SignInGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SignInGroupResponseBody body);

        @Override
        SignInGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SignInGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SignInGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SignInGroupResponse response) {
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
        public Builder body(SignInGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SignInGroupResponse build() {
            return new SignInGroupResponse(this);
        } 

    } 

}
