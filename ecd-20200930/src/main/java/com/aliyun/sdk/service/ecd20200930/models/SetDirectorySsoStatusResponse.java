// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDirectorySsoStatusResponse} extends {@link TeaModel}
 *
 * <p>SetDirectorySsoStatusResponse</p>
 */
public class SetDirectorySsoStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDirectorySsoStatusResponseBody body;

    private SetDirectorySsoStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDirectorySsoStatusResponse create() {
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
    public SetDirectorySsoStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDirectorySsoStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDirectorySsoStatusResponseBody body);

        @Override
        SetDirectorySsoStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDirectorySsoStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDirectorySsoStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDirectorySsoStatusResponse response) {
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
        public Builder body(SetDirectorySsoStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDirectorySsoStatusResponse build() {
            return new SetDirectorySsoStatusResponse(this);
        } 

    } 

}
