// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetInstanceUserResponse} extends {@link TeaModel}
 *
 * <p>SetInstanceUserResponse</p>
 */
public class SetInstanceUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetInstanceUserResponseBody body;

    private SetInstanceUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetInstanceUserResponse create() {
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
    public SetInstanceUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetInstanceUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetInstanceUserResponseBody body);

        @Override
        SetInstanceUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetInstanceUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetInstanceUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetInstanceUserResponse response) {
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
        public Builder body(SetInstanceUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetInstanceUserResponse build() {
            return new SetInstanceUserResponse(this);
        } 

    } 

}
