// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDSEntityResponse} extends {@link TeaModel}
 *
 * <p>DescribeDSEntityResponse</p>
 */
public class DescribeDSEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDSEntityResponseBody body;

    private DescribeDSEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDSEntityResponse create() {
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
    public DescribeDSEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDSEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDSEntityResponseBody body);

        @Override
        DescribeDSEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDSEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDSEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDSEntityResponse response) {
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
        public Builder body(DescribeDSEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDSEntityResponse build() {
            return new DescribeDSEntityResponse(this);
        } 

    } 

}
