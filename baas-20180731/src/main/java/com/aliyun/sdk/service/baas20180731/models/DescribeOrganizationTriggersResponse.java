// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOrganizationTriggersResponse} extends {@link TeaModel}
 *
 * <p>DescribeOrganizationTriggersResponse</p>
 */
public class DescribeOrganizationTriggersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeOrganizationTriggersResponseBody body;

    private DescribeOrganizationTriggersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeOrganizationTriggersResponse create() {
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
    public DescribeOrganizationTriggersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOrganizationTriggersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeOrganizationTriggersResponseBody body);

        @Override
        DescribeOrganizationTriggersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOrganizationTriggersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeOrganizationTriggersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOrganizationTriggersResponse response) {
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
        public Builder body(DescribeOrganizationTriggersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOrganizationTriggersResponse build() {
            return new DescribeOrganizationTriggersResponse(this);
        } 

    } 

}
