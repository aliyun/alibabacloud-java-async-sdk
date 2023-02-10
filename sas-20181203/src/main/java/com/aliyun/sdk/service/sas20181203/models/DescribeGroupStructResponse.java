// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupStructResponse} extends {@link TeaModel}
 *
 * <p>DescribeGroupStructResponse</p>
 */
public class DescribeGroupStructResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGroupStructResponseBody body;

    private DescribeGroupStructResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGroupStructResponse create() {
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
    public DescribeGroupStructResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGroupStructResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGroupStructResponseBody body);

        @Override
        DescribeGroupStructResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGroupStructResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGroupStructResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGroupStructResponse response) {
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
        public Builder body(DescribeGroupStructResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGroupStructResponse build() {
            return new DescribeGroupStructResponse(this);
        } 

    } 

}
