// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThingScriptResponse} extends {@link TeaModel}
 *
 * <p>GetThingScriptResponse</p>
 */
public class GetThingScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetThingScriptResponseBody body;

    private GetThingScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetThingScriptResponse create() {
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
    public GetThingScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetThingScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetThingScriptResponseBody body);

        @Override
        GetThingScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetThingScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetThingScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetThingScriptResponse response) {
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
        public Builder body(GetThingScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetThingScriptResponse build() {
            return new GetThingScriptResponse(this);
        } 

    } 

}
