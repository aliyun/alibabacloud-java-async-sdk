// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetUserProfilePathRulesResponse} extends {@link TeaModel}
 *
 * <p>SetUserProfilePathRulesResponse</p>
 */
public class SetUserProfilePathRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetUserProfilePathRulesResponseBody body;

    private SetUserProfilePathRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetUserProfilePathRulesResponse create() {
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
    public SetUserProfilePathRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetUserProfilePathRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetUserProfilePathRulesResponseBody body);

        @Override
        SetUserProfilePathRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetUserProfilePathRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetUserProfilePathRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetUserProfilePathRulesResponse response) {
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
        public Builder body(SetUserProfilePathRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetUserProfilePathRulesResponse build() {
            return new SetUserProfilePathRulesResponse(this);
        } 

    } 

}
