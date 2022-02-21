// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllIspResponse} extends {@link TeaModel}
 *
 * <p>GetAllIspResponse</p>
 */
public class GetAllIspResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAllIspResponseBody body;

    private GetAllIspResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAllIspResponse create() {
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
    public GetAllIspResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAllIspResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAllIspResponseBody body);

        @Override
        GetAllIspResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAllIspResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAllIspResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAllIspResponse response) {
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
        public Builder body(GetAllIspResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAllIspResponse build() {
            return new GetAllIspResponse(this);
        } 

    } 

}
