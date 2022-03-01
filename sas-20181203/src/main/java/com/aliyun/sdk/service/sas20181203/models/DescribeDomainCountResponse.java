// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainCountResponse</p>
 */
public class DescribeDomainCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainCountResponseBody body;

    private DescribeDomainCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainCountResponse create() {
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
    public DescribeDomainCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainCountResponseBody body);

        @Override
        DescribeDomainCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainCountResponse response) {
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
        public Builder body(DescribeDomainCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainCountResponse build() {
            return new DescribeDomainCountResponse(this);
        } 

    } 

}
