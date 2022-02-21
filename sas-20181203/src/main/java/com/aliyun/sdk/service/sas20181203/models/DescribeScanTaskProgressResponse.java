// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScanTaskProgressResponse} extends {@link TeaModel}
 *
 * <p>DescribeScanTaskProgressResponse</p>
 */
public class DescribeScanTaskProgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeScanTaskProgressResponseBody body;

    private DescribeScanTaskProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeScanTaskProgressResponse create() {
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
    public DescribeScanTaskProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScanTaskProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeScanTaskProgressResponseBody body);

        @Override
        DescribeScanTaskProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScanTaskProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeScanTaskProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScanTaskProgressResponse response) {
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
        public Builder body(DescribeScanTaskProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScanTaskProgressResponse build() {
            return new DescribeScanTaskProgressResponse(this);
        } 

    } 

}
