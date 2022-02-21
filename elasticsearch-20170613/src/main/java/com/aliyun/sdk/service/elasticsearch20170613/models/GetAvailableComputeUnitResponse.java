// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvailableComputeUnitResponse} extends {@link TeaModel}
 *
 * <p>GetAvailableComputeUnitResponse</p>
 */
public class GetAvailableComputeUnitResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAvailableComputeUnitResponseBody body;

    private GetAvailableComputeUnitResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAvailableComputeUnitResponse create() {
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
    public GetAvailableComputeUnitResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAvailableComputeUnitResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAvailableComputeUnitResponseBody body);

        @Override
        GetAvailableComputeUnitResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAvailableComputeUnitResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAvailableComputeUnitResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAvailableComputeUnitResponse response) {
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
        public Builder body(GetAvailableComputeUnitResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAvailableComputeUnitResponse build() {
            return new GetAvailableComputeUnitResponse(this);
        } 

    } 

}
