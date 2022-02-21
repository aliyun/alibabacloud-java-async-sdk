// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAutoLiveStreamRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateAutoLiveStreamRuleResponse</p>
 */
public class CreateAutoLiveStreamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAutoLiveStreamRuleResponseBody body;

    private CreateAutoLiveStreamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAutoLiveStreamRuleResponse create() {
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
    public CreateAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAutoLiveStreamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAutoLiveStreamRuleResponseBody body);

        @Override
        CreateAutoLiveStreamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAutoLiveStreamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAutoLiveStreamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAutoLiveStreamRuleResponse response) {
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
        public Builder body(CreateAutoLiveStreamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAutoLiveStreamRuleResponse build() {
            return new CreateAutoLiveStreamRuleResponse(this);
        } 

    } 

}
