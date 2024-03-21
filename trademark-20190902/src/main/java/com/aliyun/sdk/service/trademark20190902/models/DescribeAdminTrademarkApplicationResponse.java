// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAdminTrademarkApplicationResponse} extends {@link TeaModel}
 *
 * <p>DescribeAdminTrademarkApplicationResponse</p>
 */
public class DescribeAdminTrademarkApplicationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeAdminTrademarkApplicationResponseBody body;

    private DescribeAdminTrademarkApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAdminTrademarkApplicationResponse create() {
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
    public DescribeAdminTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAdminTrademarkApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAdminTrademarkApplicationResponseBody body);

        @Override
        DescribeAdminTrademarkApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAdminTrademarkApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeAdminTrademarkApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAdminTrademarkApplicationResponse response) {
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
        public Builder body(DescribeAdminTrademarkApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAdminTrademarkApplicationResponse build() {
            return new DescribeAdminTrademarkApplicationResponse(this);
        } 

    } 

}
