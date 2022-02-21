// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateThingScriptResponse} extends {@link TeaModel}
 *
 * <p>UpdateThingScriptResponse</p>
 */
public class UpdateThingScriptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateThingScriptResponseBody body;

    private UpdateThingScriptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateThingScriptResponse create() {
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
    public UpdateThingScriptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateThingScriptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateThingScriptResponseBody body);

        @Override
        UpdateThingScriptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateThingScriptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateThingScriptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateThingScriptResponse response) {
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
        public Builder body(UpdateThingScriptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateThingScriptResponse build() {
            return new UpdateThingScriptResponse(this);
        } 

    } 

}
