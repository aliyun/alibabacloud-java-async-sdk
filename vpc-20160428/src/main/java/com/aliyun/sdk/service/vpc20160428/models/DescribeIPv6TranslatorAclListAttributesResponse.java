// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIPv6TranslatorAclListAttributesResponse} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorAclListAttributesResponse</p>
 */
public class DescribeIPv6TranslatorAclListAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIPv6TranslatorAclListAttributesResponseBody body;

    private DescribeIPv6TranslatorAclListAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeIPv6TranslatorAclListAttributesResponse create() {
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
    public DescribeIPv6TranslatorAclListAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIPv6TranslatorAclListAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeIPv6TranslatorAclListAttributesResponseBody body);

        @Override
        DescribeIPv6TranslatorAclListAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIPv6TranslatorAclListAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeIPv6TranslatorAclListAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIPv6TranslatorAclListAttributesResponse response) {
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
        public Builder body(DescribeIPv6TranslatorAclListAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIPv6TranslatorAclListAttributesResponse build() {
            return new DescribeIPv6TranslatorAclListAttributesResponse(this);
        } 

    } 

}
