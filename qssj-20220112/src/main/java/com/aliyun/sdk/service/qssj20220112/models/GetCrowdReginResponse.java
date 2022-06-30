// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdReginResponse} extends {@link TeaModel}
 *
 * <p>GetCrowdReginResponse</p>
 */
public class GetCrowdReginResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCrowdReginResponseBody body;

    private GetCrowdReginResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCrowdReginResponse create() {
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
    public GetCrowdReginResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCrowdReginResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCrowdReginResponseBody body);

        @Override
        GetCrowdReginResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCrowdReginResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCrowdReginResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCrowdReginResponse response) {
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
        public Builder body(GetCrowdReginResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCrowdReginResponse build() {
            return new GetCrowdReginResponse(this);
        } 

    } 

}
