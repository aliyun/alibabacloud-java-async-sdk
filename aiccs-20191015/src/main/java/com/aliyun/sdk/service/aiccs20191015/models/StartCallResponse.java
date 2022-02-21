// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCallResponse} extends {@link TeaModel}
 *
 * <p>StartCallResponse</p>
 */
public class StartCallResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartCallResponseBody body;

    private StartCallResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartCallResponse create() {
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
    public StartCallResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartCallResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartCallResponseBody body);

        @Override
        StartCallResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartCallResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartCallResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartCallResponse response) {
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
        public Builder body(StartCallResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartCallResponse build() {
            return new StartCallResponse(this);
        } 

    } 

}
