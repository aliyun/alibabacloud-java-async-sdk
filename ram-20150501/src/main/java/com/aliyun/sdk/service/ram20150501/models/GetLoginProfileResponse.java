// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLoginProfileResponse} extends {@link TeaModel}
 *
 * <p>GetLoginProfileResponse</p>
 */
public class GetLoginProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLoginProfileResponseBody body;

    private GetLoginProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLoginProfileResponse create() {
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
    public GetLoginProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLoginProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLoginProfileResponseBody body);

        @Override
        GetLoginProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLoginProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLoginProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLoginProfileResponse response) {
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
        public Builder body(GetLoginProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLoginProfileResponse build() {
            return new GetLoginProfileResponse(this);
        } 

    } 

}
