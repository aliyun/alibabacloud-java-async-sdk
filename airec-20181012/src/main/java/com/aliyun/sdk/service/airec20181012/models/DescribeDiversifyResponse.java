// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiversifyResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiversifyResponse</p>
 */
public class DescribeDiversifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiversifyResponseBody body;

    private DescribeDiversifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiversifyResponse create() {
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
    public DescribeDiversifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiversifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiversifyResponseBody body);

        @Override
        DescribeDiversifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiversifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiversifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiversifyResponse response) {
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
        public Builder body(DescribeDiversifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiversifyResponse build() {
            return new DescribeDiversifyResponse(this);
        } 

    } 

}
