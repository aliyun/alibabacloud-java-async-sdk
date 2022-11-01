// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaResourceIdResponse} extends {@link TeaModel}
 *
 * <p>GetMediaResourceIdResponse</p>
 */
public class GetMediaResourceIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMediaResourceIdResponseBody body;

    private GetMediaResourceIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMediaResourceIdResponse create() {
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
    public GetMediaResourceIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMediaResourceIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMediaResourceIdResponseBody body);

        @Override
        GetMediaResourceIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMediaResourceIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMediaResourceIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMediaResourceIdResponse response) {
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
        public Builder body(GetMediaResourceIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMediaResourceIdResponse build() {
            return new GetMediaResourceIdResponse(this);
        } 

    } 

}
