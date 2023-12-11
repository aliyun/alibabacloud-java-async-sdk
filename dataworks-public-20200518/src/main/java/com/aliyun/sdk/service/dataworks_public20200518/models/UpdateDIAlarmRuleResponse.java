// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDIAlarmRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateDIAlarmRuleResponse</p>
 */
public class UpdateDIAlarmRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateDIAlarmRuleResponseBody body;

    private UpdateDIAlarmRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateDIAlarmRuleResponse create() {
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
    public UpdateDIAlarmRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateDIAlarmRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateDIAlarmRuleResponseBody body);

        @Override
        UpdateDIAlarmRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateDIAlarmRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateDIAlarmRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateDIAlarmRuleResponse response) {
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
        public Builder body(UpdateDIAlarmRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateDIAlarmRuleResponse build() {
            return new UpdateDIAlarmRuleResponse(this);
        } 

    } 

}
