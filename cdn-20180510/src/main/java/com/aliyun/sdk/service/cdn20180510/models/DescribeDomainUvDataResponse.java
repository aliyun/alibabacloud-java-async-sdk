// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainUvDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainUvDataResponse</p>
 */
public class DescribeDomainUvDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainUvDataResponseBody body;

    private DescribeDomainUvDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainUvDataResponse create() {
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
    public DescribeDomainUvDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainUvDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainUvDataResponseBody body);

        @Override
        DescribeDomainUvDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainUvDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainUvDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainUvDataResponse response) {
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
        public Builder body(DescribeDomainUvDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainUvDataResponse build() {
            return new DescribeDomainUvDataResponse(this);
        } 

    } 

}
