// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIPv6TranslatorAclListsResponse} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorAclListsResponse</p>
 */
public class DescribeIPv6TranslatorAclListsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIPv6TranslatorAclListsResponseBody body;

    private DescribeIPv6TranslatorAclListsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIPv6TranslatorAclListsResponse create() {
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
    public DescribeIPv6TranslatorAclListsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIPv6TranslatorAclListsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIPv6TranslatorAclListsResponseBody body);

        @Override
        DescribeIPv6TranslatorAclListsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIPv6TranslatorAclListsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIPv6TranslatorAclListsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIPv6TranslatorAclListsResponse response) {
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
        public Builder body(DescribeIPv6TranslatorAclListsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIPv6TranslatorAclListsResponse build() {
            return new DescribeIPv6TranslatorAclListsResponse(this);
        } 

    } 

}
