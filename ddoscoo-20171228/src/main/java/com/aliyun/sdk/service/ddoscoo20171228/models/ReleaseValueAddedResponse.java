// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseValueAddedResponse} extends {@link TeaModel}
 *
 * <p>ReleaseValueAddedResponse</p>
 */
public class ReleaseValueAddedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseValueAddedResponseBody body;

    private ReleaseValueAddedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseValueAddedResponse create() {
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
    public ReleaseValueAddedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseValueAddedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseValueAddedResponseBody body);

        @Override
        ReleaseValueAddedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseValueAddedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseValueAddedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseValueAddedResponse response) {
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
        public Builder body(ReleaseValueAddedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseValueAddedResponse build() {
            return new ReleaseValueAddedResponse(this);
        } 

    } 

}
