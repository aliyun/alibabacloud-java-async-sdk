// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageRecordingRuleResponse} extends {@link TeaModel}
 *
 * <p>ManageRecordingRuleResponse</p>
 */
public class ManageRecordingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ManageRecordingRuleResponseBody body;

    private ManageRecordingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ManageRecordingRuleResponse create() {
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
    public ManageRecordingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ManageRecordingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ManageRecordingRuleResponseBody body);

        @Override
        ManageRecordingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ManageRecordingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ManageRecordingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ManageRecordingRuleResponse response) {
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
        public Builder body(ManageRecordingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ManageRecordingRuleResponse build() {
            return new ManageRecordingRuleResponse(this);
        } 

    } 

}
