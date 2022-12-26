// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCheckConfigResponse} extends {@link TeaModel}
 *
 * <p>GetCheckConfigResponse</p>
 */
public class GetCheckConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCheckConfigResponseBody body;

    private GetCheckConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCheckConfigResponse create() {
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
    public GetCheckConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCheckConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCheckConfigResponseBody body);

        @Override
        GetCheckConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCheckConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCheckConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCheckConfigResponse response) {
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
        public Builder body(GetCheckConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCheckConfigResponse build() {
            return new GetCheckConfigResponse(this);
        } 

    } 

}
