// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescAccountSummaryResponse} extends {@link TeaModel}
 *
 * <p>DescAccountSummaryResponse</p>
 */
public class DescAccountSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescAccountSummaryResponseBody body;

    private DescAccountSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescAccountSummaryResponse create() {
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
    public DescAccountSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescAccountSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescAccountSummaryResponseBody body);

        @Override
        DescAccountSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescAccountSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescAccountSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescAccountSummaryResponse response) {
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
        public Builder body(DescAccountSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescAccountSummaryResponse build() {
            return new DescAccountSummaryResponse(this);
        } 

    } 

}
