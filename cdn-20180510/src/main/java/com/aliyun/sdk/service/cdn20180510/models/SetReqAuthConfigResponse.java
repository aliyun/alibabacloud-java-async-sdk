// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetReqAuthConfigResponse} extends {@link TeaModel}
 *
 * <p>SetReqAuthConfigResponse</p>
 */
public class SetReqAuthConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetReqAuthConfigResponseBody body;

    private SetReqAuthConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetReqAuthConfigResponse create() {
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
    public SetReqAuthConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetReqAuthConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetReqAuthConfigResponseBody body);

        @Override
        SetReqAuthConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetReqAuthConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetReqAuthConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetReqAuthConfigResponse response) {
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
        public Builder body(SetReqAuthConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetReqAuthConfigResponse build() {
            return new SetReqAuthConfigResponse(this);
        } 

    } 

}
