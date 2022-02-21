// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WordPosResponse} extends {@link TeaModel}
 *
 * <p>WordPosResponse</p>
 */
public class WordPosResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private WordPosResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static WordPosResponse create() {
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

    public interface Builder extends Response.Builder<WordPosResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        WordPosResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<WordPosResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(WordPosResponse response) {
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
        public WordPosResponse build() {
            return new WordPosResponse(this);
        } 

    } 

}
