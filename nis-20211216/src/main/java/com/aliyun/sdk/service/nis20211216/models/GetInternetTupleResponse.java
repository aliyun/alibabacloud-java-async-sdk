// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInternetTupleResponse} extends {@link TeaModel}
 *
 * <p>GetInternetTupleResponse</p>
 */
public class GetInternetTupleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetInternetTupleResponseBody body;

    private GetInternetTupleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetInternetTupleResponse create() {
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
    public GetInternetTupleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetInternetTupleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetInternetTupleResponseBody body);

        @Override
        GetInternetTupleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetInternetTupleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetInternetTupleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetInternetTupleResponse response) {
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
        public Builder body(GetInternetTupleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetInternetTupleResponse build() {
            return new GetInternetTupleResponse(this);
        } 

    } 

}
