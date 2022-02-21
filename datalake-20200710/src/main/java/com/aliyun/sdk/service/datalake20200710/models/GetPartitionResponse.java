// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPartitionResponse} extends {@link TeaModel}
 *
 * <p>GetPartitionResponse</p>
 */
public class GetPartitionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPartitionResponseBody body;

    private GetPartitionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPartitionResponse create() {
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
    public GetPartitionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPartitionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPartitionResponseBody body);

        @Override
        GetPartitionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPartitionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPartitionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPartitionResponse response) {
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
        public Builder body(GetPartitionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPartitionResponse build() {
            return new GetPartitionResponse(this);
        } 

    } 

}
