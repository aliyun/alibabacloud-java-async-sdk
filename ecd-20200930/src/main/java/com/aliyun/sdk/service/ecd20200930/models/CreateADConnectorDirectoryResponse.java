// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateADConnectorDirectoryResponse} extends {@link TeaModel}
 *
 * <p>CreateADConnectorDirectoryResponse</p>
 */
public class CreateADConnectorDirectoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateADConnectorDirectoryResponseBody body;

    private CreateADConnectorDirectoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateADConnectorDirectoryResponse create() {
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
    public CreateADConnectorDirectoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateADConnectorDirectoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateADConnectorDirectoryResponseBody body);

        @Override
        CreateADConnectorDirectoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateADConnectorDirectoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateADConnectorDirectoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateADConnectorDirectoryResponse response) {
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
        public Builder body(CreateADConnectorDirectoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateADConnectorDirectoryResponse build() {
            return new CreateADConnectorDirectoryResponse(this);
        } 

    } 

}
