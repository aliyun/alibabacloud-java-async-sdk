// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlarmRulesResponse} extends {@link TeaModel}
 *
 * <p>ListAlarmRulesResponse</p>
 */
public class ListAlarmRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlarmRulesResponseBody body;

    private ListAlarmRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlarmRulesResponse create() {
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
    public ListAlarmRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlarmRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlarmRulesResponseBody body);

        @Override
        ListAlarmRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlarmRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlarmRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlarmRulesResponse response) {
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
        public Builder body(ListAlarmRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlarmRulesResponse build() {
            return new ListAlarmRulesResponse(this);
        } 

    } 

}
