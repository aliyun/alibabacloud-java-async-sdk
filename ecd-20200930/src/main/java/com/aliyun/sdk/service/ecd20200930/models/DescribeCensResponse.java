// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCensResponse} extends {@link TeaModel}
 *
 * <p>DescribeCensResponse</p>
 */
public class DescribeCensResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCensResponseBody body;

    private DescribeCensResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCensResponse create() {
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
    public DescribeCensResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCensResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCensResponseBody body);

        @Override
        DescribeCensResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCensResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCensResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCensResponse response) {
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
        public Builder body(DescribeCensResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCensResponse build() {
            return new DescribeCensResponse(this);
        } 

    } 

}
