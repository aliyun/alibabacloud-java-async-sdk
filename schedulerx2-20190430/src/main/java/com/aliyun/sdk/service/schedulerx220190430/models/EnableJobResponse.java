// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableJobResponse} extends {@link TeaModel}
 *
 * <p>EnableJobResponse</p>
 */
public class EnableJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableJobResponseBody body;

    private EnableJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableJobResponse create() {
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
    public EnableJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableJobResponseBody body);

        @Override
        EnableJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableJobResponse response) {
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
        public Builder body(EnableJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableJobResponse build() {
            return new EnableJobResponse(this);
        } 

    } 

}
