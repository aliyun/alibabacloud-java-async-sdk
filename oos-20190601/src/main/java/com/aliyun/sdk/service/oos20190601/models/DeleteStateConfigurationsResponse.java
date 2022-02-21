// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteStateConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>DeleteStateConfigurationsResponse</p>
 */
public class DeleteStateConfigurationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteStateConfigurationsResponseBody body;

    private DeleteStateConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteStateConfigurationsResponse create() {
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
    public DeleteStateConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteStateConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteStateConfigurationsResponseBody body);

        @Override
        DeleteStateConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteStateConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteStateConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteStateConfigurationsResponse response) {
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
        public Builder body(DeleteStateConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteStateConfigurationsResponse build() {
            return new DeleteStateConfigurationsResponse(this);
        } 

    } 

}
