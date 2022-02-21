// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStsGrantStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeStsGrantStatusResponse</p>
 */
public class DescribeStsGrantStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeStsGrantStatusResponseBody body;

    private DescribeStsGrantStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeStsGrantStatusResponse create() {
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
    public DescribeStsGrantStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeStsGrantStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeStsGrantStatusResponseBody body);

        @Override
        DescribeStsGrantStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeStsGrantStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeStsGrantStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeStsGrantStatusResponse response) {
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
        public Builder body(DescribeStsGrantStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeStsGrantStatusResponse build() {
            return new DescribeStsGrantStatusResponse(this);
        } 

    } 

}
