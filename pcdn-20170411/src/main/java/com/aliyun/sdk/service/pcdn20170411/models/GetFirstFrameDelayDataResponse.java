// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFirstFrameDelayDataResponse} extends {@link TeaModel}
 *
 * <p>GetFirstFrameDelayDataResponse</p>
 */
public class GetFirstFrameDelayDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFirstFrameDelayDataResponseBody body;

    private GetFirstFrameDelayDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFirstFrameDelayDataResponse create() {
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
    public GetFirstFrameDelayDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFirstFrameDelayDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFirstFrameDelayDataResponseBody body);

        @Override
        GetFirstFrameDelayDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFirstFrameDelayDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFirstFrameDelayDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFirstFrameDelayDataResponse response) {
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
        public Builder body(GetFirstFrameDelayDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFirstFrameDelayDataResponse build() {
            return new GetFirstFrameDelayDataResponse(this);
        } 

    } 

}
