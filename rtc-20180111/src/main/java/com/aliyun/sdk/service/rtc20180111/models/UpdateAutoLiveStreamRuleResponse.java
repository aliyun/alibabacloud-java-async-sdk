// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoLiveStreamRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateAutoLiveStreamRuleResponse</p>
 */
public class UpdateAutoLiveStreamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAutoLiveStreamRuleResponseBody body;

    private UpdateAutoLiveStreamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAutoLiveStreamRuleResponse create() {
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
    public UpdateAutoLiveStreamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAutoLiveStreamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAutoLiveStreamRuleResponseBody body);

        @Override
        UpdateAutoLiveStreamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAutoLiveStreamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAutoLiveStreamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAutoLiveStreamRuleResponse response) {
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
        public Builder body(UpdateAutoLiveStreamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAutoLiveStreamRuleResponse build() {
            return new UpdateAutoLiveStreamRuleResponse(this);
        } 

    } 

}
