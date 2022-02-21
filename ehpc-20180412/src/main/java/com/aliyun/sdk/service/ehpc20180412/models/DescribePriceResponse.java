// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePriceResponse} extends {@link TeaModel}
 *
 * <p>DescribePriceResponse</p>
 */
public class DescribePriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePriceResponseBody body;

    private DescribePriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePriceResponse create() {
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
    public DescribePriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePriceResponseBody body);

        @Override
        DescribePriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePriceResponse response) {
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
        public Builder body(DescribePriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePriceResponse build() {
            return new DescribePriceResponse(this);
        } 

    } 

}
