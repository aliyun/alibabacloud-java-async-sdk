// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceEstimateCostResponse} extends {@link TeaModel}
 *
 * <p>GetServiceEstimateCostResponse</p>
 */
public class GetServiceEstimateCostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceEstimateCostResponseBody body;

    private GetServiceEstimateCostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceEstimateCostResponse create() {
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
    public GetServiceEstimateCostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceEstimateCostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceEstimateCostResponseBody body);

        @Override
        GetServiceEstimateCostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceEstimateCostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceEstimateCostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceEstimateCostResponse response) {
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
        public Builder body(GetServiceEstimateCostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceEstimateCostResponse build() {
            return new GetServiceEstimateCostResponse(this);
        } 

    } 

}
