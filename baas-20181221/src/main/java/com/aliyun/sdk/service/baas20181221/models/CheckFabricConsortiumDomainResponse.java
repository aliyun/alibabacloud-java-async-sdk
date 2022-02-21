// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFabricConsortiumDomainResponse} extends {@link TeaModel}
 *
 * <p>CheckFabricConsortiumDomainResponse</p>
 */
public class CheckFabricConsortiumDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckFabricConsortiumDomainResponseBody body;

    private CheckFabricConsortiumDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckFabricConsortiumDomainResponse create() {
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
    public CheckFabricConsortiumDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckFabricConsortiumDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckFabricConsortiumDomainResponseBody body);

        @Override
        CheckFabricConsortiumDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckFabricConsortiumDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckFabricConsortiumDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckFabricConsortiumDomainResponse response) {
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
        public Builder body(CheckFabricConsortiumDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckFabricConsortiumDomainResponse build() {
            return new CheckFabricConsortiumDomainResponse(this);
        } 

    } 

}
