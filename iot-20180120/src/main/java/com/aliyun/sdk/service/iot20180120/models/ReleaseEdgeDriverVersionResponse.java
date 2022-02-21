// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseEdgeDriverVersionResponse} extends {@link TeaModel}
 *
 * <p>ReleaseEdgeDriverVersionResponse</p>
 */
public class ReleaseEdgeDriverVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseEdgeDriverVersionResponseBody body;

    private ReleaseEdgeDriverVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseEdgeDriverVersionResponse create() {
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
    public ReleaseEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseEdgeDriverVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseEdgeDriverVersionResponseBody body);

        @Override
        ReleaseEdgeDriverVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseEdgeDriverVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseEdgeDriverVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseEdgeDriverVersionResponse response) {
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
        public Builder body(ReleaseEdgeDriverVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseEdgeDriverVersionResponse build() {
            return new ReleaseEdgeDriverVersionResponse(this);
        } 

    } 

}
