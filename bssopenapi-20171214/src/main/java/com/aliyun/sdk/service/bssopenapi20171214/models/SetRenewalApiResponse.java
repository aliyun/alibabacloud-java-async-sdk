// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetRenewalApiResponse} extends {@link TeaModel}
 *
 * <p>SetRenewalApiResponse</p>
 */
public class SetRenewalApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetRenewalApiResponseBody body;

    private SetRenewalApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetRenewalApiResponse create() {
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
    public SetRenewalApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetRenewalApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetRenewalApiResponseBody body);

        @Override
        SetRenewalApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetRenewalApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetRenewalApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetRenewalApiResponse response) {
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
        public Builder body(SetRenewalApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetRenewalApiResponse build() {
            return new SetRenewalApiResponse(this);
        } 

    } 

}
