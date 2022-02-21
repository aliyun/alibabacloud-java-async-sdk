// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageQualityResponse} extends {@link TeaModel}
 *
 * <p>GetImageQualityResponse</p>
 */
public class GetImageQualityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetImageQualityResponseBody body;

    private GetImageQualityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetImageQualityResponse create() {
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
    public GetImageQualityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetImageQualityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetImageQualityResponseBody body);

        @Override
        GetImageQualityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetImageQualityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetImageQualityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetImageQualityResponse response) {
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
        public Builder body(GetImageQualityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetImageQualityResponse build() {
            return new GetImageQualityResponse(this);
        } 

    } 

}
