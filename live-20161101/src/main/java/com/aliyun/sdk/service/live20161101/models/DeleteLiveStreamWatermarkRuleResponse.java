// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveStreamWatermarkRuleResponse} extends {@link TeaModel}
 *
 * <p>DeleteLiveStreamWatermarkRuleResponse</p>
 */
public class DeleteLiveStreamWatermarkRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLiveStreamWatermarkRuleResponseBody body;

    private DeleteLiveStreamWatermarkRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLiveStreamWatermarkRuleResponse create() {
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
    public DeleteLiveStreamWatermarkRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLiveStreamWatermarkRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLiveStreamWatermarkRuleResponseBody body);

        @Override
        DeleteLiveStreamWatermarkRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLiveStreamWatermarkRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLiveStreamWatermarkRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLiveStreamWatermarkRuleResponse response) {
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
        public Builder body(DeleteLiveStreamWatermarkRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLiveStreamWatermarkRuleResponse build() {
            return new DeleteLiveStreamWatermarkRuleResponse(this);
        } 

    } 

}
