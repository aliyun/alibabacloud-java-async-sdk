// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCoreWordResponse} extends {@link TeaModel}
 *
 * <p>DescribeCoreWordResponse</p>
 */
public class DescribeCoreWordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCoreWordResponseBody body;

    private DescribeCoreWordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCoreWordResponse create() {
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
    public DescribeCoreWordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCoreWordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCoreWordResponseBody body);

        @Override
        DescribeCoreWordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCoreWordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCoreWordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCoreWordResponse response) {
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
        public Builder body(DescribeCoreWordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCoreWordResponse build() {
            return new DescribeCoreWordResponse(this);
        } 

    } 

}
