// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStyleOnlineResponse} extends {@link TeaModel}
 *
 * <p>GetStyleOnlineResponse</p>
 */
public class GetStyleOnlineResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStyleOnlineResponseBody body;

    private GetStyleOnlineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStyleOnlineResponse create() {
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
    public GetStyleOnlineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStyleOnlineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStyleOnlineResponseBody body);

        @Override
        GetStyleOnlineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStyleOnlineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStyleOnlineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStyleOnlineResponse response) {
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
        public Builder body(GetStyleOnlineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStyleOnlineResponse build() {
            return new GetStyleOnlineResponse(this);
        } 

    } 

}
