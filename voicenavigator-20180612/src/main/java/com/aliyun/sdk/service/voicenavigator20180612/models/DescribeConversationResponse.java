// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConversationResponse} extends {@link TeaModel}
 *
 * <p>DescribeConversationResponse</p>
 */
public class DescribeConversationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConversationResponseBody body;

    private DescribeConversationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConversationResponse create() {
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
    public DescribeConversationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConversationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConversationResponseBody body);

        @Override
        DescribeConversationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConversationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConversationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConversationResponse response) {
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
        public Builder body(DescribeConversationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConversationResponse build() {
            return new DescribeConversationResponse(this);
        } 

    } 

}
