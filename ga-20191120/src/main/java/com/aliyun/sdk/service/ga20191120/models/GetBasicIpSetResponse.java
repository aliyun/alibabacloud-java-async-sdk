// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicIpSetResponse} extends {@link TeaModel}
 *
 * <p>GetBasicIpSetResponse</p>
 */
public class GetBasicIpSetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBasicIpSetResponseBody body;

    private GetBasicIpSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBasicIpSetResponse create() {
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
    public GetBasicIpSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBasicIpSetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBasicIpSetResponseBody body);

        @Override
        GetBasicIpSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBasicIpSetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBasicIpSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBasicIpSetResponse response) {
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
        public Builder body(GetBasicIpSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBasicIpSetResponse build() {
            return new GetBasicIpSetResponse(this);
        } 

    } 

}
