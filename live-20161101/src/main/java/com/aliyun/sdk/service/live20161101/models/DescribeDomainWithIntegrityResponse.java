// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainWithIntegrityResponse} extends {@link TeaModel}
 *
 * <p>DescribeDomainWithIntegrityResponse</p>
 */
public class DescribeDomainWithIntegrityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDomainWithIntegrityResponseBody body;

    private DescribeDomainWithIntegrityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDomainWithIntegrityResponse create() {
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
    public DescribeDomainWithIntegrityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDomainWithIntegrityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDomainWithIntegrityResponseBody body);

        @Override
        DescribeDomainWithIntegrityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDomainWithIntegrityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDomainWithIntegrityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDomainWithIntegrityResponse response) {
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
        public Builder body(DescribeDomainWithIntegrityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDomainWithIntegrityResponse build() {
            return new DescribeDomainWithIntegrityResponse(this);
        } 

    } 

}
