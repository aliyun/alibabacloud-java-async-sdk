// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDcdnSpecificStagingConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteDcdnSpecificStagingConfigResponse</p>
 */
public class DeleteDcdnSpecificStagingConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDcdnSpecificStagingConfigResponseBody body;

    private DeleteDcdnSpecificStagingConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDcdnSpecificStagingConfigResponse create() {
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
    public DeleteDcdnSpecificStagingConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDcdnSpecificStagingConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDcdnSpecificStagingConfigResponseBody body);

        @Override
        DeleteDcdnSpecificStagingConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDcdnSpecificStagingConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDcdnSpecificStagingConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDcdnSpecificStagingConfigResponse response) {
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
        public Builder body(DeleteDcdnSpecificStagingConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDcdnSpecificStagingConfigResponse build() {
            return new DeleteDcdnSpecificStagingConfigResponse(this);
        } 

    } 

}
