// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDIAlarmRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateDIAlarmRuleResponse</p>
 */
public class CreateDIAlarmRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDIAlarmRuleResponseBody body;

    private CreateDIAlarmRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDIAlarmRuleResponse create() {
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
    public CreateDIAlarmRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDIAlarmRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDIAlarmRuleResponseBody body);

        @Override
        CreateDIAlarmRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDIAlarmRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDIAlarmRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDIAlarmRuleResponse response) {
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
        public Builder body(CreateDIAlarmRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDIAlarmRuleResponse build() {
            return new CreateDIAlarmRuleResponse(this);
        } 

    } 

}
