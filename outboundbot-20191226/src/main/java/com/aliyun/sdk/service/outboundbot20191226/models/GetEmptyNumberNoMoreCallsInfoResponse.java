// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEmptyNumberNoMoreCallsInfoResponse} extends {@link TeaModel}
 *
 * <p>GetEmptyNumberNoMoreCallsInfoResponse</p>
 */
public class GetEmptyNumberNoMoreCallsInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEmptyNumberNoMoreCallsInfoResponseBody body;

    private GetEmptyNumberNoMoreCallsInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEmptyNumberNoMoreCallsInfoResponse create() {
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
    public GetEmptyNumberNoMoreCallsInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEmptyNumberNoMoreCallsInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEmptyNumberNoMoreCallsInfoResponseBody body);

        @Override
        GetEmptyNumberNoMoreCallsInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEmptyNumberNoMoreCallsInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEmptyNumberNoMoreCallsInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEmptyNumberNoMoreCallsInfoResponse response) {
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
        public Builder body(GetEmptyNumberNoMoreCallsInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEmptyNumberNoMoreCallsInfoResponse build() {
            return new GetEmptyNumberNoMoreCallsInfoResponse(this);
        } 

    } 

}
