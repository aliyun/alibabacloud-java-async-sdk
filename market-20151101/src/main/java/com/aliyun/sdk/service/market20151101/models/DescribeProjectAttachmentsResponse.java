// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProjectAttachmentsResponse} extends {@link TeaModel}
 *
 * <p>DescribeProjectAttachmentsResponse</p>
 */
public class DescribeProjectAttachmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeProjectAttachmentsResponseBody body;

    private DescribeProjectAttachmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeProjectAttachmentsResponse create() {
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
    public DescribeProjectAttachmentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProjectAttachmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeProjectAttachmentsResponseBody body);

        @Override
        DescribeProjectAttachmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProjectAttachmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeProjectAttachmentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProjectAttachmentsResponse response) {
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
        public Builder body(DescribeProjectAttachmentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProjectAttachmentsResponse build() {
            return new DescribeProjectAttachmentsResponse(this);
        } 

    } 

}
