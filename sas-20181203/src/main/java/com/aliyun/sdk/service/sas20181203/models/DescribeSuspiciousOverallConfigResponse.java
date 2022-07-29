// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspiciousOverallConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeSuspiciousOverallConfigResponse</p>
 */
public class DescribeSuspiciousOverallConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSuspiciousOverallConfigResponseBody body;

    private DescribeSuspiciousOverallConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSuspiciousOverallConfigResponse create() {
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
    public DescribeSuspiciousOverallConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSuspiciousOverallConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSuspiciousOverallConfigResponseBody body);

        @Override
        DescribeSuspiciousOverallConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSuspiciousOverallConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSuspiciousOverallConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSuspiciousOverallConfigResponse response) {
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
        public Builder body(DescribeSuspiciousOverallConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSuspiciousOverallConfigResponse build() {
            return new DescribeSuspiciousOverallConfigResponse(this);
        } 

    } 

}
