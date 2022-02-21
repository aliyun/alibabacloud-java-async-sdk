// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DelThesaurusForApiResponse} extends {@link TeaModel}
 *
 * <p>DelThesaurusForApiResponse</p>
 */
public class DelThesaurusForApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DelThesaurusForApiResponseBody body;

    private DelThesaurusForApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DelThesaurusForApiResponse create() {
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
    public DelThesaurusForApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DelThesaurusForApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DelThesaurusForApiResponseBody body);

        @Override
        DelThesaurusForApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DelThesaurusForApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DelThesaurusForApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DelThesaurusForApiResponse response) {
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
        public Builder body(DelThesaurusForApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DelThesaurusForApiResponse build() {
            return new DelThesaurusForApiResponse(this);
        } 

    } 

}
