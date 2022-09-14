// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetJobUserResponse} extends {@link TeaModel}
 *
 * <p>SetJobUserResponse</p>
 */
public class SetJobUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetJobUserResponseBody body;

    private SetJobUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetJobUserResponse create() {
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
    public SetJobUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetJobUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetJobUserResponseBody body);

        @Override
        SetJobUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetJobUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetJobUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetJobUserResponse response) {
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
        public Builder body(SetJobUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetJobUserResponse build() {
            return new SetJobUserResponse(this);
        } 

    } 

}
