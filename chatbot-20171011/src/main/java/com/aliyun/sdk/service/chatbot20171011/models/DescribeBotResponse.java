// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBotResponse} extends {@link TeaModel}
 *
 * <p>DescribeBotResponse</p>
 */
public class DescribeBotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBotResponseBody body;

    private DescribeBotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBotResponse create() {
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
    public DescribeBotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBotResponseBody body);

        @Override
        DescribeBotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBotResponse response) {
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
        public Builder body(DescribeBotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBotResponse build() {
            return new DescribeBotResponse(this);
        } 

    } 

}
