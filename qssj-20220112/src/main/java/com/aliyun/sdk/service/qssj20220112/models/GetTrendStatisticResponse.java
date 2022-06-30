// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendStatisticResponse} extends {@link TeaModel}
 *
 * <p>GetTrendStatisticResponse</p>
 */
public class GetTrendStatisticResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrendStatisticResponseBody body;

    private GetTrendStatisticResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrendStatisticResponse create() {
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
    public GetTrendStatisticResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrendStatisticResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrendStatisticResponseBody body);

        @Override
        GetTrendStatisticResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrendStatisticResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrendStatisticResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrendStatisticResponse response) {
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
        public Builder body(GetTrendStatisticResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrendStatisticResponse build() {
            return new GetTrendStatisticResponse(this);
        } 

    } 

}
