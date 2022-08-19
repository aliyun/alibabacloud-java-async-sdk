// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpnAttachmentsResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpnAttachmentsResponse</p>
 */
public class DescribeVpnAttachmentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVpnAttachmentsResponseBody body;

    private DescribeVpnAttachmentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVpnAttachmentsResponse create() {
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
    public DescribeVpnAttachmentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpnAttachmentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVpnAttachmentsResponseBody body);

        @Override
        DescribeVpnAttachmentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpnAttachmentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVpnAttachmentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpnAttachmentsResponse response) {
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
        public Builder body(DescribeVpnAttachmentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpnAttachmentsResponse build() {
            return new DescribeVpnAttachmentsResponse(this);
        } 

    } 

}
