// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscodeSummaryResponse} extends {@link TeaModel}
 *
 * <p>GetTranscodeSummaryResponse</p>
 */
public class GetTranscodeSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTranscodeSummaryResponseBody body;

    private GetTranscodeSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTranscodeSummaryResponse create() {
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
    public GetTranscodeSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTranscodeSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTranscodeSummaryResponseBody body);

        @Override
        GetTranscodeSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTranscodeSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTranscodeSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTranscodeSummaryResponse response) {
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
        public Builder body(GetTranscodeSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTranscodeSummaryResponse build() {
            return new GetTranscodeSummaryResponse(this);
        } 

    } 

}
