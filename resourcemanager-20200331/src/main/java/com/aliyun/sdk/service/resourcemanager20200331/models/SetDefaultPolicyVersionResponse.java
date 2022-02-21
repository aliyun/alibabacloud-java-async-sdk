// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDefaultPolicyVersionResponse} extends {@link TeaModel}
 *
 * <p>SetDefaultPolicyVersionResponse</p>
 */
public class SetDefaultPolicyVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetDefaultPolicyVersionResponseBody body;

    private SetDefaultPolicyVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetDefaultPolicyVersionResponse create() {
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
    public SetDefaultPolicyVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetDefaultPolicyVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetDefaultPolicyVersionResponseBody body);

        @Override
        SetDefaultPolicyVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetDefaultPolicyVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetDefaultPolicyVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetDefaultPolicyVersionResponse response) {
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
        public Builder body(SetDefaultPolicyVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetDefaultPolicyVersionResponse build() {
            return new SetDefaultPolicyVersionResponse(this);
        } 

    } 

}
