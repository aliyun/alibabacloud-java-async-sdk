// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessLogEmptyCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessLogEmptyCountResponse</p>
 */
public class DescribeWebAccessLogEmptyCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeWebAccessLogEmptyCountResponseBody body;

    private DescribeWebAccessLogEmptyCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeWebAccessLogEmptyCountResponse create() {
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
    public DescribeWebAccessLogEmptyCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebAccessLogEmptyCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeWebAccessLogEmptyCountResponseBody body);

        @Override
        DescribeWebAccessLogEmptyCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebAccessLogEmptyCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeWebAccessLogEmptyCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebAccessLogEmptyCountResponse response) {
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
        public Builder body(DescribeWebAccessLogEmptyCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebAccessLogEmptyCountResponse build() {
            return new DescribeWebAccessLogEmptyCountResponse(this);
        } 

    } 

}
