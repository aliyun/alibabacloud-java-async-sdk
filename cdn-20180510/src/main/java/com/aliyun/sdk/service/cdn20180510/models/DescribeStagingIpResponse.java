// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStagingIpResponse} extends {@link TeaModel}
 *
 * <p>DescribeStagingIpResponse</p>
 */
public class DescribeStagingIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStagingIpResponseBody body;

    private DescribeStagingIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStagingIpResponse create() {
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
    public DescribeStagingIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStagingIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStagingIpResponseBody body);

        @Override
        DescribeStagingIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStagingIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStagingIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStagingIpResponse response) {
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
        public Builder body(DescribeStagingIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStagingIpResponse build() {
            return new DescribeStagingIpResponse(this);
        } 

    } 

}
