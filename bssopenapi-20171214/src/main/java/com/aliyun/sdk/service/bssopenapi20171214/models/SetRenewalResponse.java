// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRenewalResponse} extends {@link TeaModel}
 *
 * <p>SetRenewalResponse</p>
 */
public class SetRenewalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRenewalResponseBody body;

    private SetRenewalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRenewalResponse create() {
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
    public SetRenewalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRenewalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRenewalResponseBody body);

        @Override
        SetRenewalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRenewalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRenewalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRenewalResponse response) {
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
        public Builder body(SetRenewalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRenewalResponse build() {
            return new SetRenewalResponse(this);
        } 

    } 

}
