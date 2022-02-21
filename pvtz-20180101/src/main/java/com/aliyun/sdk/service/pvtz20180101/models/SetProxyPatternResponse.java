// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetProxyPatternResponse} extends {@link TeaModel}
 *
 * <p>SetProxyPatternResponse</p>
 */
public class SetProxyPatternResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetProxyPatternResponseBody body;

    private SetProxyPatternResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetProxyPatternResponse create() {
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
    public SetProxyPatternResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetProxyPatternResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetProxyPatternResponseBody body);

        @Override
        SetProxyPatternResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetProxyPatternResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetProxyPatternResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetProxyPatternResponse response) {
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
        public Builder body(SetProxyPatternResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetProxyPatternResponse build() {
            return new SetProxyPatternResponse(this);
        } 

    } 

}
