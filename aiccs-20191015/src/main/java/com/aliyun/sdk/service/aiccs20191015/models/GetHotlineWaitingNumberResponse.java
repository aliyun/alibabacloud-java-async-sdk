// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotlineWaitingNumberResponse} extends {@link TeaModel}
 *
 * <p>GetHotlineWaitingNumberResponse</p>
 */
public class GetHotlineWaitingNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotlineWaitingNumberResponseBody body;

    private GetHotlineWaitingNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotlineWaitingNumberResponse create() {
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
    public GetHotlineWaitingNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotlineWaitingNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotlineWaitingNumberResponseBody body);

        @Override
        GetHotlineWaitingNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotlineWaitingNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotlineWaitingNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotlineWaitingNumberResponse response) {
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
        public Builder body(GetHotlineWaitingNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotlineWaitingNumberResponse build() {
            return new GetHotlineWaitingNumberResponse(this);
        } 

    } 

}
