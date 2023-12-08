// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnterpriseDataResponse} extends {@link TeaModel}
 *
 * <p>DeleteEnterpriseDataResponse</p>
 */
public class DeleteEnterpriseDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEnterpriseDataResponseBody body;

    private DeleteEnterpriseDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEnterpriseDataResponse create() {
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
    public DeleteEnterpriseDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEnterpriseDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEnterpriseDataResponseBody body);

        @Override
        DeleteEnterpriseDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEnterpriseDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEnterpriseDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEnterpriseDataResponse response) {
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
        public Builder body(DeleteEnterpriseDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEnterpriseDataResponse build() {
            return new DeleteEnterpriseDataResponse(this);
        } 

    } 

}
