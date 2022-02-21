// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SentimentResponse} extends {@link TeaModel}
 *
 * <p>SentimentResponse</p>
 */
public class SentimentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private SentimentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static SentimentResponse create() {
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

    public interface Builder extends Response.Builder<SentimentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        SentimentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SentimentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SentimentResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public SentimentResponse build() {
            return new SentimentResponse(this);
        } 

    } 

}
