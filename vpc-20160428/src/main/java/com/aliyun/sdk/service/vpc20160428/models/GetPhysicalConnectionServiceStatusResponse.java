// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhysicalConnectionServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>GetPhysicalConnectionServiceStatusResponse</p>
 */
public class GetPhysicalConnectionServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPhysicalConnectionServiceStatusResponseBody body;

    private GetPhysicalConnectionServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPhysicalConnectionServiceStatusResponse create() {
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
    public GetPhysicalConnectionServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPhysicalConnectionServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPhysicalConnectionServiceStatusResponseBody body);

        @Override
        GetPhysicalConnectionServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPhysicalConnectionServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPhysicalConnectionServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPhysicalConnectionServiceStatusResponse response) {
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
        public Builder body(GetPhysicalConnectionServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPhysicalConnectionServiceStatusResponse build() {
            return new GetPhysicalConnectionServiceStatusResponse(this);
        } 

    } 

}
