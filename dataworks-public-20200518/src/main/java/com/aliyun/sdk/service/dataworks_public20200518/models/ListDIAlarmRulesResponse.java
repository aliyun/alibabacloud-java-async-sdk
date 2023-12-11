// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIAlarmRulesResponse} extends {@link TeaModel}
 *
 * <p>ListDIAlarmRulesResponse</p>
 */
public class ListDIAlarmRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDIAlarmRulesResponseBody body;

    private ListDIAlarmRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDIAlarmRulesResponse create() {
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
    public ListDIAlarmRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDIAlarmRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDIAlarmRulesResponseBody body);

        @Override
        ListDIAlarmRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDIAlarmRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDIAlarmRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDIAlarmRulesResponse response) {
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
        public Builder body(ListDIAlarmRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDIAlarmRulesResponse build() {
            return new ListDIAlarmRulesResponse(this);
        } 

    } 

}
