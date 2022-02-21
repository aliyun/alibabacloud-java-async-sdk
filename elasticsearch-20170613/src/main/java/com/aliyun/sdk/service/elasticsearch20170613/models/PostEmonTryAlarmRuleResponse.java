// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostEmonTryAlarmRuleResponse} extends {@link TeaModel}
 *
 * <p>PostEmonTryAlarmRuleResponse</p>
 */
public class PostEmonTryAlarmRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PostEmonTryAlarmRuleResponseBody body;

    private PostEmonTryAlarmRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PostEmonTryAlarmRuleResponse create() {
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
    public PostEmonTryAlarmRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PostEmonTryAlarmRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PostEmonTryAlarmRuleResponseBody body);

        @Override
        PostEmonTryAlarmRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PostEmonTryAlarmRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PostEmonTryAlarmRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PostEmonTryAlarmRuleResponse response) {
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
        public Builder body(PostEmonTryAlarmRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PostEmonTryAlarmRuleResponse build() {
            return new PostEmonTryAlarmRuleResponse(this);
        } 

    } 

}
