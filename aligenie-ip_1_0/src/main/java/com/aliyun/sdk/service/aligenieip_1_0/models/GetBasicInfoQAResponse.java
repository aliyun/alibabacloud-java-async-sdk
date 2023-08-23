// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicInfoQAResponse} extends {@link TeaModel}
 *
 * <p>GetBasicInfoQAResponse</p>
 */
public class GetBasicInfoQAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBasicInfoQAResponseBody body;

    private GetBasicInfoQAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBasicInfoQAResponse create() {
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
    public GetBasicInfoQAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBasicInfoQAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBasicInfoQAResponseBody body);

        @Override
        GetBasicInfoQAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBasicInfoQAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBasicInfoQAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBasicInfoQAResponse response) {
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
        public Builder body(GetBasicInfoQAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBasicInfoQAResponse build() {
            return new GetBasicInfoQAResponse(this);
        } 

    } 

}
