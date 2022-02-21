// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactsResponse} extends {@link TeaModel}
 *
 * <p>DescribeContactsResponse</p>
 */
public class DescribeContactsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeContactsResponseBody body;

    private DescribeContactsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeContactsResponse create() {
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
    public DescribeContactsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeContactsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeContactsResponseBody body);

        @Override
        DescribeContactsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeContactsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeContactsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeContactsResponse response) {
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
        public Builder body(DescribeContactsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeContactsResponse build() {
            return new DescribeContactsResponse(this);
        } 

    } 

}
