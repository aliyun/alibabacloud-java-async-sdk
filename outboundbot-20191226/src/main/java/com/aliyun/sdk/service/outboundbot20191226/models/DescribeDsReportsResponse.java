// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDsReportsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDsReportsResponse</p>
 */
public class DescribeDsReportsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDsReportsResponseBody body;

    private DescribeDsReportsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDsReportsResponse create() {
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
    public DescribeDsReportsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDsReportsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDsReportsResponseBody body);

        @Override
        DescribeDsReportsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDsReportsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDsReportsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDsReportsResponse response) {
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
        public Builder body(DescribeDsReportsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDsReportsResponse build() {
            return new DescribeDsReportsResponse(this);
        } 

    } 

}
