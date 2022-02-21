// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficMirrorServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>GetTrafficMirrorServiceStatusResponse</p>
 */
public class GetTrafficMirrorServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrafficMirrorServiceStatusResponseBody body;

    private GetTrafficMirrorServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrafficMirrorServiceStatusResponse create() {
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
    public GetTrafficMirrorServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrafficMirrorServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrafficMirrorServiceStatusResponseBody body);

        @Override
        GetTrafficMirrorServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrafficMirrorServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrafficMirrorServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrafficMirrorServiceStatusResponse response) {
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
        public Builder body(GetTrafficMirrorServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrafficMirrorServiceStatusResponse build() {
            return new GetTrafficMirrorServiceStatusResponse(this);
        } 

    } 

}
