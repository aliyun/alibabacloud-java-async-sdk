// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteInstanceIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteInstanceIdResponse</p>
 */
public class DescribeWebsiteInstanceIdResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeWebsiteInstanceIdResponseBody body;

    private DescribeWebsiteInstanceIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeWebsiteInstanceIdResponse create() {
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
    public DescribeWebsiteInstanceIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebsiteInstanceIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeWebsiteInstanceIdResponseBody body);

        @Override
        DescribeWebsiteInstanceIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebsiteInstanceIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeWebsiteInstanceIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebsiteInstanceIdResponse response) {
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
        public Builder body(DescribeWebsiteInstanceIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebsiteInstanceIdResponse build() {
            return new DescribeWebsiteInstanceIdResponse(this);
        } 

    } 

}
