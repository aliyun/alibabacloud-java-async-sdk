// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLiveStreamWatermarkRuleResponse} extends {@link TeaModel}
 *
 * <p>AddLiveStreamWatermarkRuleResponse</p>
 */
public class AddLiveStreamWatermarkRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddLiveStreamWatermarkRuleResponseBody body;

    private AddLiveStreamWatermarkRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddLiveStreamWatermarkRuleResponse create() {
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
    public AddLiveStreamWatermarkRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddLiveStreamWatermarkRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddLiveStreamWatermarkRuleResponseBody body);

        @Override
        AddLiveStreamWatermarkRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddLiveStreamWatermarkRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddLiveStreamWatermarkRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddLiveStreamWatermarkRuleResponse response) {
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
        public Builder body(AddLiveStreamWatermarkRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddLiveStreamWatermarkRuleResponse build() {
            return new AddLiveStreamWatermarkRuleResponse(this);
        } 

    } 

}
