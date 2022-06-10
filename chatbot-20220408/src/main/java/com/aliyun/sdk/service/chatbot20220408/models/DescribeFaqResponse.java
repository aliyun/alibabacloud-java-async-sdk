// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFaqResponse} extends {@link TeaModel}
 *
 * <p>DescribeFaqResponse</p>
 */
public class DescribeFaqResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeFaqResponseBody body;

    private DescribeFaqResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeFaqResponse create() {
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
    public DescribeFaqResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeFaqResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeFaqResponseBody body);

        @Override
        DescribeFaqResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeFaqResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeFaqResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeFaqResponse response) {
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
        public Builder body(DescribeFaqResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeFaqResponse build() {
            return new DescribeFaqResponse(this);
        } 

    } 

}
