// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDIAlarmRuleResponse} extends {@link TeaModel}
 *
 * <p>GetDIAlarmRuleResponse</p>
 */
public class GetDIAlarmRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDIAlarmRuleResponseBody body;

    private GetDIAlarmRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDIAlarmRuleResponse create() {
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
    public GetDIAlarmRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDIAlarmRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDIAlarmRuleResponseBody body);

        @Override
        GetDIAlarmRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDIAlarmRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDIAlarmRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDIAlarmRuleResponse response) {
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
        public Builder body(GetDIAlarmRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDIAlarmRuleResponse build() {
            return new GetDIAlarmRuleResponse(this);
        } 

    } 

}
