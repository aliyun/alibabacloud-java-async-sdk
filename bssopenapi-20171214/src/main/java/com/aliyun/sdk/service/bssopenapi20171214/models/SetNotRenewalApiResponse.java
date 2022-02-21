// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetNotRenewalApiResponse} extends {@link TeaModel}
 *
 * <p>SetNotRenewalApiResponse</p>
 */
public class SetNotRenewalApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetNotRenewalApiResponseBody body;

    private SetNotRenewalApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetNotRenewalApiResponse create() {
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
    public SetNotRenewalApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetNotRenewalApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetNotRenewalApiResponseBody body);

        @Override
        SetNotRenewalApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetNotRenewalApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetNotRenewalApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetNotRenewalApiResponse response) {
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
        public Builder body(SetNotRenewalApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetNotRenewalApiResponse build() {
            return new SetNotRenewalApiResponse(this);
        } 

    } 

}
