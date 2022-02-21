// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBlueprintInstanceResponse} extends {@link TeaModel}
 *
 * <p>DeleteBlueprintInstanceResponse</p>
 */
public class DeleteBlueprintInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBlueprintInstanceResponseBody body;

    private DeleteBlueprintInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBlueprintInstanceResponse create() {
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
    public DeleteBlueprintInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBlueprintInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBlueprintInstanceResponseBody body);

        @Override
        DeleteBlueprintInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBlueprintInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBlueprintInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBlueprintInstanceResponse response) {
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
        public Builder body(DeleteBlueprintInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBlueprintInstanceResponse build() {
            return new DeleteBlueprintInstanceResponse(this);
        } 

    } 

}
