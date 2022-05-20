// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIpProtectionResponse} extends {@link TeaModel}
 *
 * <p>GetIpProtectionResponse</p>
 */
public class GetIpProtectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIpProtectionResponseBody body;

    private GetIpProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIpProtectionResponse create() {
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
    public GetIpProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIpProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIpProtectionResponseBody body);

        @Override
        GetIpProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIpProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIpProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIpProtectionResponse response) {
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
        public Builder body(GetIpProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIpProtectionResponse build() {
            return new GetIpProtectionResponse(this);
        } 

    } 

}
