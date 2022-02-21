// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainStatusCodeCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainStatusCodeCountResponse</p>
 */
public class DescribeDomainStatusCodeCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainStatusCodeCountResponseBody body;

    private DescribeDomainStatusCodeCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainStatusCodeCountResponse create() {
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
    public DescribeDomainStatusCodeCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainStatusCodeCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainStatusCodeCountResponseBody body);

        @Override
        DescribeDomainStatusCodeCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainStatusCodeCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainStatusCodeCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainStatusCodeCountResponse response) {
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
        public Builder body(DescribeDomainStatusCodeCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainStatusCodeCountResponse build() {
            return new DescribeDomainStatusCodeCountResponse(this);
        } 

    } 

}
