// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstanceSystemCnameResponse} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceSystemCnameResponse</p>
 */
public class DescribeGtmInstanceSystemCnameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeGtmInstanceSystemCnameResponseBody body;

    private DescribeGtmInstanceSystemCnameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeGtmInstanceSystemCnameResponse create() {
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
    public DescribeGtmInstanceSystemCnameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeGtmInstanceSystemCnameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeGtmInstanceSystemCnameResponseBody body);

        @Override
        DescribeGtmInstanceSystemCnameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeGtmInstanceSystemCnameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeGtmInstanceSystemCnameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeGtmInstanceSystemCnameResponse response) {
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
        public Builder body(DescribeGtmInstanceSystemCnameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeGtmInstanceSystemCnameResponse build() {
            return new DescribeGtmInstanceSystemCnameResponse(this);
        } 

    } 

}
