// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineCallActionResponse} extends {@link TeaModel}
 *
 * <p>GetHotlineCallActionResponse</p>
 */
public class GetHotlineCallActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotlineCallActionResponseBody body;

    private GetHotlineCallActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotlineCallActionResponse create() {
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
    public GetHotlineCallActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotlineCallActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotlineCallActionResponseBody body);

        @Override
        GetHotlineCallActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotlineCallActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotlineCallActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotlineCallActionResponse response) {
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
        public Builder body(GetHotlineCallActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotlineCallActionResponse build() {
            return new GetHotlineCallActionResponse(this);
        } 

    } 

}
