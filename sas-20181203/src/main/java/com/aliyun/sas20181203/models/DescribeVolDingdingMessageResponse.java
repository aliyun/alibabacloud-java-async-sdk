// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVolDingdingMessageResponse} extends {@link TeaModel}
 *
 * <p>DescribeVolDingdingMessageResponse</p>
 */
public class DescribeVolDingdingMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeVolDingdingMessageResponseBody body;

    private DescribeVolDingdingMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeVolDingdingMessageResponse create() {
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
    public DescribeVolDingdingMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVolDingdingMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeVolDingdingMessageResponseBody body);

        @Override
        DescribeVolDingdingMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVolDingdingMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeVolDingdingMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVolDingdingMessageResponse response) {
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
        public Builder body(DescribeVolDingdingMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVolDingdingMessageResponse build() {
            return new DescribeVolDingdingMessageResponse(this);
        } 

    } 

}
