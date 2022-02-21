// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetThingResponse} extends {@link TeaModel}
 *
 * <p>ResetThingResponse</p>
 */
public class ResetThingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetThingResponseBody body;

    private ResetThingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetThingResponse create() {
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
    public ResetThingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetThingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetThingResponseBody body);

        @Override
        ResetThingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetThingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetThingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetThingResponse response) {
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
        public Builder body(ResetThingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetThingResponse build() {
            return new ResetThingResponse(this);
        } 

    } 

}
