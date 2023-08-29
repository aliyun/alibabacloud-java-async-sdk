// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnFullDomainsBlockIPHistoryResponse} extends {@link TeaModel}
 *
 * <p>DescribeDcdnFullDomainsBlockIPHistoryResponse</p>
 */
public class DescribeDcdnFullDomainsBlockIPHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDcdnFullDomainsBlockIPHistoryResponseBody body;

    private DescribeDcdnFullDomainsBlockIPHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDcdnFullDomainsBlockIPHistoryResponse create() {
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
    public DescribeDcdnFullDomainsBlockIPHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDcdnFullDomainsBlockIPHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDcdnFullDomainsBlockIPHistoryResponseBody body);

        @Override
        DescribeDcdnFullDomainsBlockIPHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDcdnFullDomainsBlockIPHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDcdnFullDomainsBlockIPHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDcdnFullDomainsBlockIPHistoryResponse response) {
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
        public Builder body(DescribeDcdnFullDomainsBlockIPHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDcdnFullDomainsBlockIPHistoryResponse build() {
            return new DescribeDcdnFullDomainsBlockIPHistoryResponse(this);
        } 

    } 

}
