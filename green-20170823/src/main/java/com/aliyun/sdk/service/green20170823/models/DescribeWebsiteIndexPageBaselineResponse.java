// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteIndexPageBaselineResponse} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteIndexPageBaselineResponse</p>
 */
public class DescribeWebsiteIndexPageBaselineResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeWebsiteIndexPageBaselineResponseBody body;

    private DescribeWebsiteIndexPageBaselineResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeWebsiteIndexPageBaselineResponse create() {
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
    public DescribeWebsiteIndexPageBaselineResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWebsiteIndexPageBaselineResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeWebsiteIndexPageBaselineResponseBody body);

        @Override
        DescribeWebsiteIndexPageBaselineResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWebsiteIndexPageBaselineResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeWebsiteIndexPageBaselineResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWebsiteIndexPageBaselineResponse response) {
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
        public Builder body(DescribeWebsiteIndexPageBaselineResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWebsiteIndexPageBaselineResponse build() {
            return new DescribeWebsiteIndexPageBaselineResponse(this);
        } 

    } 

}
