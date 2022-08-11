// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishDataServiceApiResponse} extends {@link TeaModel}
 *
 * <p>PublishDataServiceApiResponse</p>
 */
public class PublishDataServiceApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PublishDataServiceApiResponseBody body;

    private PublishDataServiceApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PublishDataServiceApiResponse create() {
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
    public PublishDataServiceApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PublishDataServiceApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PublishDataServiceApiResponseBody body);

        @Override
        PublishDataServiceApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PublishDataServiceApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PublishDataServiceApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PublishDataServiceApiResponse response) {
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
        public Builder body(PublishDataServiceApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PublishDataServiceApiResponse build() {
            return new PublishDataServiceApiResponse(this);
        } 

    } 

}
