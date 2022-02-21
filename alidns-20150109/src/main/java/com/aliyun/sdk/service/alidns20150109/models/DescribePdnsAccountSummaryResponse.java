// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePdnsAccountSummaryResponse} extends {@link TeaModel}
 *
 * <p>DescribePdnsAccountSummaryResponse</p>
 */
public class DescribePdnsAccountSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePdnsAccountSummaryResponseBody body;

    private DescribePdnsAccountSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePdnsAccountSummaryResponse create() {
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
    public DescribePdnsAccountSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePdnsAccountSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePdnsAccountSummaryResponseBody body);

        @Override
        DescribePdnsAccountSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePdnsAccountSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePdnsAccountSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePdnsAccountSummaryResponse response) {
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
        public Builder body(DescribePdnsAccountSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePdnsAccountSummaryResponse build() {
            return new DescribePdnsAccountSummaryResponse(this);
        } 

    } 

}
