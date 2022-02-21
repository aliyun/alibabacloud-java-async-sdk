// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConversationContextResponse} extends {@link TeaModel}
 *
 * <p>DescribeConversationContextResponse</p>
 */
public class DescribeConversationContextResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeConversationContextResponseBody body;

    private DescribeConversationContextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeConversationContextResponse create() {
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
    public DescribeConversationContextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeConversationContextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeConversationContextResponseBody body);

        @Override
        DescribeConversationContextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeConversationContextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeConversationContextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeConversationContextResponse response) {
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
        public Builder body(DescribeConversationContextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeConversationContextResponse build() {
            return new DescribeConversationContextResponse(this);
        } 

    } 

}
