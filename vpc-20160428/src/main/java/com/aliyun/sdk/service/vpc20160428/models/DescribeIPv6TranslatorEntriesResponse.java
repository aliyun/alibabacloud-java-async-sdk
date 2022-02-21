// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIPv6TranslatorEntriesResponse} extends {@link TeaModel}
 *
 * <p>DescribeIPv6TranslatorEntriesResponse</p>
 */
public class DescribeIPv6TranslatorEntriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIPv6TranslatorEntriesResponseBody body;

    private DescribeIPv6TranslatorEntriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIPv6TranslatorEntriesResponse create() {
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
    public DescribeIPv6TranslatorEntriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIPv6TranslatorEntriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIPv6TranslatorEntriesResponseBody body);

        @Override
        DescribeIPv6TranslatorEntriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIPv6TranslatorEntriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIPv6TranslatorEntriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIPv6TranslatorEntriesResponse response) {
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
        public Builder body(DescribeIPv6TranslatorEntriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIPv6TranslatorEntriesResponse build() {
            return new DescribeIPv6TranslatorEntriesResponse(this);
        } 

    } 

}
