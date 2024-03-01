// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvadeEventListResponse} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEventListResponse</p>
 */
public class DescribeInvadeEventListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeInvadeEventListResponseBody body;

    private DescribeInvadeEventListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeInvadeEventListResponse create() {
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
    public DescribeInvadeEventListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInvadeEventListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeInvadeEventListResponseBody body);

        @Override
        DescribeInvadeEventListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInvadeEventListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeInvadeEventListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInvadeEventListResponse response) {
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
        public Builder body(DescribeInvadeEventListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInvadeEventListResponse build() {
            return new DescribeInvadeEventListResponse(this);
        } 

    } 

}
