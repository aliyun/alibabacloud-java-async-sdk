// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenGeographicSpansResponse} extends {@link TeaModel}
 *
 * <p>DescribeCenGeographicSpansResponse</p>
 */
public class DescribeCenGeographicSpansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCenGeographicSpansResponseBody body;

    private DescribeCenGeographicSpansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCenGeographicSpansResponse create() {
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
    public DescribeCenGeographicSpansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCenGeographicSpansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCenGeographicSpansResponseBody body);

        @Override
        DescribeCenGeographicSpansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCenGeographicSpansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCenGeographicSpansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCenGeographicSpansResponse response) {
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
        public Builder body(DescribeCenGeographicSpansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCenGeographicSpansResponse build() {
            return new DescribeCenGeographicSpansResponse(this);
        } 

    } 

}
