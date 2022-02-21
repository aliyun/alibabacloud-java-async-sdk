// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEdgeDriverVersionResponse} extends {@link TeaModel}
 *
 * <p>GetEdgeDriverVersionResponse</p>
 */
public class GetEdgeDriverVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEdgeDriverVersionResponseBody body;

    private GetEdgeDriverVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEdgeDriverVersionResponse create() {
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
    public GetEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEdgeDriverVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEdgeDriverVersionResponseBody body);

        @Override
        GetEdgeDriverVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEdgeDriverVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEdgeDriverVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEdgeDriverVersionResponse response) {
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
        public Builder body(GetEdgeDriverVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEdgeDriverVersionResponse build() {
            return new GetEdgeDriverVersionResponse(this);
        } 

    } 

}
