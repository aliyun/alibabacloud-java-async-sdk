// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateChainResponse} extends {@link TeaModel}
 *
 * <p>UpdateChainResponse</p>
 */
public class UpdateChainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateChainResponseBody body;

    private UpdateChainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateChainResponse create() {
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
    public UpdateChainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateChainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateChainResponseBody body);

        @Override
        UpdateChainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateChainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateChainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateChainResponse response) {
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
        public Builder body(UpdateChainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateChainResponse build() {
            return new UpdateChainResponse(this);
        } 

    } 

}
