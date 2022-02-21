// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainResourceResponse</p>
 */
public class DescribeDomainResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainResourceResponseBody body;

    private DescribeDomainResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainResourceResponse create() {
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
    public DescribeDomainResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainResourceResponseBody body);

        @Override
        DescribeDomainResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainResourceResponse response) {
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
        public Builder body(DescribeDomainResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainResourceResponse build() {
            return new DescribeDomainResourceResponse(this);
        } 

    } 

}
