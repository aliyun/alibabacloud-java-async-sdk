// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEpnInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateEpnInstanceResponse</p>
 */
public class CreateEpnInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEpnInstanceResponseBody body;

    private CreateEpnInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEpnInstanceResponse create() {
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
    public CreateEpnInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEpnInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEpnInstanceResponseBody body);

        @Override
        CreateEpnInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEpnInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEpnInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEpnInstanceResponse response) {
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
        public Builder body(CreateEpnInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEpnInstanceResponse build() {
            return new CreateEpnInstanceResponse(this);
        } 

    } 

}
