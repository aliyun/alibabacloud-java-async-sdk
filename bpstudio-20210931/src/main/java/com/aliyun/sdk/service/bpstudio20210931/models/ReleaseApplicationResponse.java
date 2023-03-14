// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bpstudio20210931.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseApplicationResponse} extends {@link TeaModel}
 *
 * <p>ReleaseApplicationResponse</p>
 */
public class ReleaseApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseApplicationResponseBody body;

    private ReleaseApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseApplicationResponse create() {
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
    public ReleaseApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseApplicationResponseBody body);

        @Override
        ReleaseApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseApplicationResponse response) {
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
        public Builder body(ReleaseApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseApplicationResponse build() {
            return new ReleaseApplicationResponse(this);
        } 

    } 

}
