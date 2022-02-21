// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoLiveStreamRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeAutoLiveStreamRuleResponse</p>
 */
public class DescribeAutoLiveStreamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeAutoLiveStreamRuleResponseBody body;

    private DescribeAutoLiveStreamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeAutoLiveStreamRuleResponse create() {
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
    public DescribeAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAutoLiveStreamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeAutoLiveStreamRuleResponseBody body);

        @Override
        DescribeAutoLiveStreamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAutoLiveStreamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeAutoLiveStreamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAutoLiveStreamRuleResponse response) {
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
        public Builder body(DescribeAutoLiveStreamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAutoLiveStreamRuleResponse build() {
            return new DescribeAutoLiveStreamRuleResponse(this);
        } 

    } 

}
