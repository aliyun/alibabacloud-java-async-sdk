// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckProgressListResponse} extends {@link TeaModel}
 *
 * <p>DescribePreCheckProgressListResponse</p>
 */
public class DescribePreCheckProgressListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePreCheckProgressListResponseBody body;

    private DescribePreCheckProgressListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePreCheckProgressListResponse create() {
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
    public DescribePreCheckProgressListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePreCheckProgressListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePreCheckProgressListResponseBody body);

        @Override
        DescribePreCheckProgressListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePreCheckProgressListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePreCheckProgressListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePreCheckProgressListResponse response) {
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
        public Builder body(DescribePreCheckProgressListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePreCheckProgressListResponse build() {
            return new DescribePreCheckProgressListResponse(this);
        } 

    } 

}
