// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomDomainResponse} extends {@link TeaModel}
 *
 * <p>UpdateCustomDomainResponse</p>
 */
public class UpdateCustomDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCustomDomainResponseBody body;

    private UpdateCustomDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCustomDomainResponse create() {
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
    public UpdateCustomDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCustomDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCustomDomainResponseBody body);

        @Override
        UpdateCustomDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCustomDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCustomDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCustomDomainResponse response) {
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
        public Builder body(UpdateCustomDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomDomainResponse build() {
            return new UpdateCustomDomainResponse(this);
        } 

    } 

}
