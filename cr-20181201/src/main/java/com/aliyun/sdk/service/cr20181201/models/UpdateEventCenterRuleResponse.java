// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEventCenterRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateEventCenterRuleResponse</p>
 */
public class UpdateEventCenterRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEventCenterRuleResponseBody body;

    private UpdateEventCenterRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEventCenterRuleResponse create() {
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
    public UpdateEventCenterRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEventCenterRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEventCenterRuleResponseBody body);

        @Override
        UpdateEventCenterRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEventCenterRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEventCenterRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEventCenterRuleResponse response) {
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
        public Builder body(UpdateEventCenterRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEventCenterRuleResponse build() {
            return new UpdateEventCenterRuleResponse(this);
        } 

    } 

}
