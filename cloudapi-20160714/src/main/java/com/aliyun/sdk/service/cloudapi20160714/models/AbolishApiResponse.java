// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbolishApiResponse} extends {@link TeaModel}
 *
 * <p>AbolishApiResponse</p>
 */
public class AbolishApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AbolishApiResponseBody body;

    private AbolishApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AbolishApiResponse create() {
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
    public AbolishApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AbolishApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AbolishApiResponseBody body);

        @Override
        AbolishApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AbolishApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AbolishApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AbolishApiResponse response) {
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
        public Builder body(AbolishApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AbolishApiResponse build() {
            return new AbolishApiResponse(this);
        } 

    } 

}
