// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDVOrderResultResponse} extends {@link TeaModel}
 *
 * <p>DescribeDVOrderResultResponse</p>
 */
public class DescribeDVOrderResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDVOrderResultResponseBody body;

    private DescribeDVOrderResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDVOrderResultResponse create() {
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
    public DescribeDVOrderResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDVOrderResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDVOrderResultResponseBody body);

        @Override
        DescribeDVOrderResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDVOrderResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDVOrderResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDVOrderResultResponse response) {
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
        public Builder body(DescribeDVOrderResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDVOrderResultResponse build() {
            return new DescribeDVOrderResultResponse(this);
        } 

    } 

}
