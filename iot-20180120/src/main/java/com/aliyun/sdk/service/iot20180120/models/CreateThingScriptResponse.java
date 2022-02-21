// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateThingScriptResponse} extends {@link TeaModel}
 *
 * <p>CreateThingScriptResponse</p>
 */
public class CreateThingScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateThingScriptResponseBody body;

    private CreateThingScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateThingScriptResponse create() {
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
    public CreateThingScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateThingScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateThingScriptResponseBody body);

        @Override
        CreateThingScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateThingScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateThingScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateThingScriptResponse response) {
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
        public Builder body(CreateThingScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateThingScriptResponse build() {
            return new CreateThingScriptResponse(this);
        } 

    } 

}
