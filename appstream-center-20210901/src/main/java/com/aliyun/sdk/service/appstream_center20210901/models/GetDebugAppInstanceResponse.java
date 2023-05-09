// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDebugAppInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetDebugAppInstanceResponse</p>
 */
public class GetDebugAppInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDebugAppInstanceResponseBody body;

    private GetDebugAppInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDebugAppInstanceResponse create() {
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
    public GetDebugAppInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDebugAppInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDebugAppInstanceResponseBody body);

        @Override
        GetDebugAppInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDebugAppInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDebugAppInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDebugAppInstanceResponse response) {
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
        public Builder body(GetDebugAppInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDebugAppInstanceResponse build() {
            return new GetDebugAppInstanceResponse(this);
        } 

    } 

}
