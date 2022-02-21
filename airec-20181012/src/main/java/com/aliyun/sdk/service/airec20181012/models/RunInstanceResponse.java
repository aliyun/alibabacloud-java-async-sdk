// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunInstanceResponse} extends {@link TeaModel}
 *
 * <p>RunInstanceResponse</p>
 */
public class RunInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunInstanceResponseBody body;

    private RunInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunInstanceResponse create() {
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
    public RunInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunInstanceResponseBody body);

        @Override
        RunInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunInstanceResponse response) {
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
        public Builder body(RunInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunInstanceResponse build() {
            return new RunInstanceResponse(this);
        } 

    } 

}
