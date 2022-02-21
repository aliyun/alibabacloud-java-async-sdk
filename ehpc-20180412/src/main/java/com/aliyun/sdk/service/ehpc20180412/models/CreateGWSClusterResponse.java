// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGWSClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateGWSClusterResponse</p>
 */
public class CreateGWSClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGWSClusterResponseBody body;

    private CreateGWSClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGWSClusterResponse create() {
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
    public CreateGWSClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGWSClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGWSClusterResponseBody body);

        @Override
        CreateGWSClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGWSClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGWSClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGWSClusterResponse response) {
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
        public Builder body(CreateGWSClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGWSClusterResponse build() {
            return new CreateGWSClusterResponse(this);
        } 

    } 

}
