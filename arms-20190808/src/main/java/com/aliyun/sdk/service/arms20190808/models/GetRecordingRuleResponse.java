// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecordingRuleResponse} extends {@link TeaModel}
 *
 * <p>GetRecordingRuleResponse</p>
 */
public class GetRecordingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRecordingRuleResponseBody body;

    private GetRecordingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRecordingRuleResponse create() {
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
    public GetRecordingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRecordingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRecordingRuleResponseBody body);

        @Override
        GetRecordingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRecordingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRecordingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRecordingRuleResponse response) {
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
        public Builder body(GetRecordingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRecordingRuleResponse build() {
            return new GetRecordingRuleResponse(this);
        } 

    } 

}
