// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpPatentResponse} extends {@link TeaModel}
 *
 * <p>GetOcIpPatentResponse</p>
 */
public class GetOcIpPatentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIpPatentResponseBody body;

    private GetOcIpPatentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIpPatentResponse create() {
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
    public GetOcIpPatentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIpPatentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIpPatentResponseBody body);

        @Override
        GetOcIpPatentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIpPatentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIpPatentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIpPatentResponse response) {
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
        public Builder body(GetOcIpPatentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIpPatentResponse build() {
            return new GetOcIpPatentResponse(this);
        } 

    } 

}
