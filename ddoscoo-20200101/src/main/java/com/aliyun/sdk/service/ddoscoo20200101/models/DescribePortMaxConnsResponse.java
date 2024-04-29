// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePortMaxConnsResponse} extends {@link TeaModel}
 *
 * <p>DescribePortMaxConnsResponse</p>
 */
public class DescribePortMaxConnsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribePortMaxConnsResponseBody body;

    private DescribePortMaxConnsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribePortMaxConnsResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribePortMaxConnsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePortMaxConnsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribePortMaxConnsResponseBody body);

        @Override
        DescribePortMaxConnsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePortMaxConnsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribePortMaxConnsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePortMaxConnsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribePortMaxConnsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePortMaxConnsResponse build() {
            return new DescribePortMaxConnsResponse(this);
        } 

    } 

}
