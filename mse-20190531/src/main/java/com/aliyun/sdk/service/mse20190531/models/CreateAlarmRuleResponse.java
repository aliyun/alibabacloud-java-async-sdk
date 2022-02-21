// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlarmRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateAlarmRuleResponse</p>
 */
public class CreateAlarmRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAlarmRuleResponseBody body;

    private CreateAlarmRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAlarmRuleResponse create() {
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
    public CreateAlarmRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAlarmRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAlarmRuleResponseBody body);

        @Override
        CreateAlarmRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAlarmRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAlarmRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAlarmRuleResponse response) {
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
        public Builder body(CreateAlarmRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAlarmRuleResponse build() {
            return new CreateAlarmRuleResponse(this);
        } 

    } 

}
