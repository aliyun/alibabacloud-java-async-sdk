// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlertRulesResponse} extends {@link TeaModel}
 *
 * <p>GetAlertRulesResponse</p>
 */
public class GetAlertRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAlertRulesResponseBody body;

    private GetAlertRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAlertRulesResponse create() {
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
    public GetAlertRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAlertRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAlertRulesResponseBody body);

        @Override
        GetAlertRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAlertRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAlertRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAlertRulesResponse response) {
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
        public Builder body(GetAlertRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAlertRulesResponse build() {
            return new GetAlertRulesResponse(this);
        } 

    } 

}
