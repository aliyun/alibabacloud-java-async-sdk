// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRegionStatusResponse} extends {@link TeaModel}
 *
 * <p>GetRegionStatusResponse</p>
 */
public class GetRegionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRegionStatusResponseBody body;

    private GetRegionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRegionStatusResponse create() {
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
    public GetRegionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRegionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRegionStatusResponseBody body);

        @Override
        GetRegionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRegionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRegionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRegionStatusResponse response) {
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
        public Builder body(GetRegionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRegionStatusResponse build() {
            return new GetRegionStatusResponse(this);
        } 

    } 

}
