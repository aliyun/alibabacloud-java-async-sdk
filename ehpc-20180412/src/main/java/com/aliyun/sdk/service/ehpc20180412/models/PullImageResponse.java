// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PullImageResponse} extends {@link TeaModel}
 *
 * <p>PullImageResponse</p>
 */
public class PullImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PullImageResponseBody body;

    private PullImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PullImageResponse create() {
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
    public PullImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PullImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PullImageResponseBody body);

        @Override
        PullImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PullImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PullImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PullImageResponse response) {
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
        public Builder body(PullImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PullImageResponse build() {
            return new PullImageResponse(this);
        } 

    } 

}
