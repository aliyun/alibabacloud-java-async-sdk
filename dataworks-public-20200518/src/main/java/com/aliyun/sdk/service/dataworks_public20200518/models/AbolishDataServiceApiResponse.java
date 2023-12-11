// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbolishDataServiceApiResponse} extends {@link TeaModel}
 *
 * <p>AbolishDataServiceApiResponse</p>
 */
public class AbolishDataServiceApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AbolishDataServiceApiResponseBody body;

    private AbolishDataServiceApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AbolishDataServiceApiResponse create() {
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
    public AbolishDataServiceApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AbolishDataServiceApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AbolishDataServiceApiResponseBody body);

        @Override
        AbolishDataServiceApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AbolishDataServiceApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AbolishDataServiceApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AbolishDataServiceApiResponse response) {
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
        public Builder body(AbolishDataServiceApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AbolishDataServiceApiResponse build() {
            return new AbolishDataServiceApiResponse(this);
        } 

    } 

}
