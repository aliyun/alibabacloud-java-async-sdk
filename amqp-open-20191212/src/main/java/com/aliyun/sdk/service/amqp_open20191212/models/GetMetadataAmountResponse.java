// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetadataAmountResponse} extends {@link TeaModel}
 *
 * <p>GetMetadataAmountResponse</p>
 */
public class GetMetadataAmountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMetadataAmountResponseBody body;

    private GetMetadataAmountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMetadataAmountResponse create() {
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
    public GetMetadataAmountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMetadataAmountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMetadataAmountResponseBody body);

        @Override
        GetMetadataAmountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMetadataAmountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMetadataAmountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMetadataAmountResponse response) {
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
        public Builder body(GetMetadataAmountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMetadataAmountResponse build() {
            return new GetMetadataAmountResponse(this);
        } 

    } 

}
