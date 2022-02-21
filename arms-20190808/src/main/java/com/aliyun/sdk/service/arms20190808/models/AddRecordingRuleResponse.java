// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRecordingRuleResponse} extends {@link TeaModel}
 *
 * <p>AddRecordingRuleResponse</p>
 */
public class AddRecordingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRecordingRuleResponseBody body;

    private AddRecordingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRecordingRuleResponse create() {
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
    public AddRecordingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRecordingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRecordingRuleResponseBody body);

        @Override
        AddRecordingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRecordingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRecordingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRecordingRuleResponse response) {
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
        public Builder body(AddRecordingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRecordingRuleResponse build() {
            return new AddRecordingRuleResponse(this);
        } 

    } 

}
