// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMaxAttemptsPerDayResponse} extends {@link TeaModel}
 *
 * <p>GetMaxAttemptsPerDayResponse</p>
 */
public class GetMaxAttemptsPerDayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMaxAttemptsPerDayResponseBody body;

    private GetMaxAttemptsPerDayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMaxAttemptsPerDayResponse create() {
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
    public GetMaxAttemptsPerDayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMaxAttemptsPerDayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMaxAttemptsPerDayResponseBody body);

        @Override
        GetMaxAttemptsPerDayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMaxAttemptsPerDayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMaxAttemptsPerDayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMaxAttemptsPerDayResponse response) {
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
        public Builder body(GetMaxAttemptsPerDayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMaxAttemptsPerDayResponse build() {
            return new GetMaxAttemptsPerDayResponse(this);
        } 

    } 

}
