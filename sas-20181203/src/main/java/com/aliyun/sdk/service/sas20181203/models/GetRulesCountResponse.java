// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRulesCountResponse} extends {@link TeaModel}
 *
 * <p>GetRulesCountResponse</p>
 */
public class GetRulesCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRulesCountResponseBody body;

    private GetRulesCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRulesCountResponse create() {
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
    public GetRulesCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRulesCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRulesCountResponseBody body);

        @Override
        GetRulesCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRulesCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRulesCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRulesCountResponse response) {
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
        public Builder body(GetRulesCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRulesCountResponse build() {
            return new GetRulesCountResponse(this);
        } 

    } 

}
