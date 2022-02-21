// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodVerifyContentResponse} extends {@link TeaModel}
 *
 * <p>DescribeVodVerifyContentResponse</p>
 */
public class DescribeVodVerifyContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVodVerifyContentResponseBody body;

    private DescribeVodVerifyContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVodVerifyContentResponse create() {
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
    public DescribeVodVerifyContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVodVerifyContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVodVerifyContentResponseBody body);

        @Override
        DescribeVodVerifyContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVodVerifyContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVodVerifyContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVodVerifyContentResponse response) {
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
        public Builder body(DescribeVodVerifyContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVodVerifyContentResponse build() {
            return new DescribeVodVerifyContentResponse(this);
        } 

    } 

}
