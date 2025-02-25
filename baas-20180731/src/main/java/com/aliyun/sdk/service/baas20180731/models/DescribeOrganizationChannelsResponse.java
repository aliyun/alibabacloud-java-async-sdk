// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrganizationChannelsResponse} extends {@link TeaModel}
 *
 * <p>DescribeOrganizationChannelsResponse</p>
 */
public class DescribeOrganizationChannelsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeOrganizationChannelsResponseBody body;

    private DescribeOrganizationChannelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeOrganizationChannelsResponse create() {
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
    public DescribeOrganizationChannelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOrganizationChannelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeOrganizationChannelsResponseBody body);

        @Override
        DescribeOrganizationChannelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOrganizationChannelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeOrganizationChannelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOrganizationChannelsResponse response) {
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
        public Builder body(DescribeOrganizationChannelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOrganizationChannelsResponse build() {
            return new DescribeOrganizationChannelsResponse(this);
        } 

    } 

}
