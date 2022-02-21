// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreviewMetastoreCrawlerResponse} extends {@link TeaModel}
 *
 * <p>PreviewMetastoreCrawlerResponse</p>
 */
public class PreviewMetastoreCrawlerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PreviewMetastoreCrawlerResponseBody body;

    private PreviewMetastoreCrawlerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PreviewMetastoreCrawlerResponse create() {
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
    public PreviewMetastoreCrawlerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PreviewMetastoreCrawlerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PreviewMetastoreCrawlerResponseBody body);

        @Override
        PreviewMetastoreCrawlerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PreviewMetastoreCrawlerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PreviewMetastoreCrawlerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PreviewMetastoreCrawlerResponse response) {
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
        public Builder body(PreviewMetastoreCrawlerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PreviewMetastoreCrawlerResponse build() {
            return new PreviewMetastoreCrawlerResponse(this);
        } 

    } 

}
