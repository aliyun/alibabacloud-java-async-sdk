// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBusinessResponse} extends {@link TeaModel}
 *
 * <p>UpdateBusinessResponse</p>
 */
public class UpdateBusinessResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBusinessResponseBody body;

    private UpdateBusinessResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBusinessResponse create() {
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
    public UpdateBusinessResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBusinessResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBusinessResponseBody body);

        @Override
        UpdateBusinessResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBusinessResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBusinessResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBusinessResponse response) {
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
        public Builder body(UpdateBusinessResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBusinessResponse build() {
            return new UpdateBusinessResponse(this);
        } 

    } 

}
