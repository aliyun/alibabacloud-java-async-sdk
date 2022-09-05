// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageGetRecordingRuleResponse} extends {@link TeaModel}
 *
 * <p>ManageGetRecordingRuleResponse</p>
 */
public class ManageGetRecordingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ManageGetRecordingRuleResponseBody body;

    private ManageGetRecordingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ManageGetRecordingRuleResponse create() {
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
    public ManageGetRecordingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ManageGetRecordingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ManageGetRecordingRuleResponseBody body);

        @Override
        ManageGetRecordingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ManageGetRecordingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ManageGetRecordingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ManageGetRecordingRuleResponse response) {
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
        public Builder body(ManageGetRecordingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ManageGetRecordingRuleResponse build() {
            return new ManageGetRecordingRuleResponse(this);
        } 

    } 

}
