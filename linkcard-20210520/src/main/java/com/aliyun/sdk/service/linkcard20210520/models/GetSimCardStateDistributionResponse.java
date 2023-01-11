// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSimCardStateDistributionResponse} extends {@link TeaModel}
 *
 * <p>GetSimCardStateDistributionResponse</p>
 */
public class GetSimCardStateDistributionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSimCardStateDistributionResponseBody body;

    private GetSimCardStateDistributionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSimCardStateDistributionResponse create() {
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
    public GetSimCardStateDistributionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSimCardStateDistributionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSimCardStateDistributionResponseBody body);

        @Override
        GetSimCardStateDistributionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSimCardStateDistributionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSimCardStateDistributionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSimCardStateDistributionResponse response) {
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
        public Builder body(GetSimCardStateDistributionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSimCardStateDistributionResponse build() {
            return new GetSimCardStateDistributionResponse(this);
        } 

    } 

}
