// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainHttpCodeDataByLayerResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainHttpCodeDataByLayerResponse</p>
 */
public class DescribeDomainHttpCodeDataByLayerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainHttpCodeDataByLayerResponseBody body;

    private DescribeDomainHttpCodeDataByLayerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainHttpCodeDataByLayerResponse create() {
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
    public DescribeDomainHttpCodeDataByLayerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainHttpCodeDataByLayerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainHttpCodeDataByLayerResponseBody body);

        @Override
        DescribeDomainHttpCodeDataByLayerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainHttpCodeDataByLayerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainHttpCodeDataByLayerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainHttpCodeDataByLayerResponse response) {
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
        public Builder body(DescribeDomainHttpCodeDataByLayerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainHttpCodeDataByLayerResponse build() {
            return new DescribeDomainHttpCodeDataByLayerResponse(this);
        } 

    } 

}
