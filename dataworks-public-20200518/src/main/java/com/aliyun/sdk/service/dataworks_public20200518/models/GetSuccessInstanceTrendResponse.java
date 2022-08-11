// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSuccessInstanceTrendResponse} extends {@link TeaModel}
 *
 * <p>GetSuccessInstanceTrendResponse</p>
 */
public class GetSuccessInstanceTrendResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSuccessInstanceTrendResponseBody body;

    private GetSuccessInstanceTrendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSuccessInstanceTrendResponse create() {
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
    public GetSuccessInstanceTrendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSuccessInstanceTrendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSuccessInstanceTrendResponseBody body);

        @Override
        GetSuccessInstanceTrendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSuccessInstanceTrendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSuccessInstanceTrendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSuccessInstanceTrendResponse response) {
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
        public Builder body(GetSuccessInstanceTrendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSuccessInstanceTrendResponse build() {
            return new GetSuccessInstanceTrendResponse(this);
        } 

    } 

}
