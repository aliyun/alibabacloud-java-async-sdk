// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMetastoreCrawlerResponse} extends {@link TeaModel}
 *
 * <p>CreateMetastoreCrawlerResponse</p>
 */
public class CreateMetastoreCrawlerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMetastoreCrawlerResponseBody body;

    private CreateMetastoreCrawlerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMetastoreCrawlerResponse create() {
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
    public CreateMetastoreCrawlerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMetastoreCrawlerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMetastoreCrawlerResponseBody body);

        @Override
        CreateMetastoreCrawlerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMetastoreCrawlerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMetastoreCrawlerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMetastoreCrawlerResponse response) {
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
        public Builder body(CreateMetastoreCrawlerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMetastoreCrawlerResponse build() {
            return new CreateMetastoreCrawlerResponse(this);
        } 

    } 

}
