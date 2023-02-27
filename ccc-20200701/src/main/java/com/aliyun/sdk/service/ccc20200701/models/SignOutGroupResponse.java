// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SignOutGroupResponse} extends {@link TeaModel}
 *
 * <p>SignOutGroupResponse</p>
 */
public class SignOutGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SignOutGroupResponseBody body;

    private SignOutGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SignOutGroupResponse create() {
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
    public SignOutGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SignOutGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SignOutGroupResponseBody body);

        @Override
        SignOutGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SignOutGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SignOutGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SignOutGroupResponse response) {
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
        public Builder body(SignOutGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SignOutGroupResponse build() {
            return new SignOutGroupResponse(this);
        } 

    } 

}
