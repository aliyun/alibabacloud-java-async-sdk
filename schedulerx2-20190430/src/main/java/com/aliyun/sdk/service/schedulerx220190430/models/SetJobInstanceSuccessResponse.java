// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetJobInstanceSuccessResponse} extends {@link TeaModel}
 *
 * <p>SetJobInstanceSuccessResponse</p>
 */
public class SetJobInstanceSuccessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetJobInstanceSuccessResponseBody body;

    private SetJobInstanceSuccessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetJobInstanceSuccessResponse create() {
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
    public SetJobInstanceSuccessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetJobInstanceSuccessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetJobInstanceSuccessResponseBody body);

        @Override
        SetJobInstanceSuccessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetJobInstanceSuccessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetJobInstanceSuccessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetJobInstanceSuccessResponse response) {
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
        public Builder body(SetJobInstanceSuccessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetJobInstanceSuccessResponse build() {
            return new SetJobInstanceSuccessResponse(this);
        } 

    } 

}
