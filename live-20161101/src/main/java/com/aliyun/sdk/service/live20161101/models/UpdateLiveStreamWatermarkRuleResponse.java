// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveStreamWatermarkRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateLiveStreamWatermarkRuleResponse</p>
 */
public class UpdateLiveStreamWatermarkRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateLiveStreamWatermarkRuleResponseBody body;

    private UpdateLiveStreamWatermarkRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateLiveStreamWatermarkRuleResponse create() {
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
    public UpdateLiveStreamWatermarkRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateLiveStreamWatermarkRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateLiveStreamWatermarkRuleResponseBody body);

        @Override
        UpdateLiveStreamWatermarkRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateLiveStreamWatermarkRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateLiveStreamWatermarkRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateLiveStreamWatermarkRuleResponse response) {
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
        public Builder body(UpdateLiveStreamWatermarkRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateLiveStreamWatermarkRuleResponse build() {
            return new UpdateLiveStreamWatermarkRuleResponse(this);
        } 

    } 

}
