// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBlueprintInstanceResponse} extends {@link TeaModel}
 *
 * <p>UpdateBlueprintInstanceResponse</p>
 */
public class UpdateBlueprintInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBlueprintInstanceResponseBody body;

    private UpdateBlueprintInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBlueprintInstanceResponse create() {
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
    public UpdateBlueprintInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBlueprintInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBlueprintInstanceResponseBody body);

        @Override
        UpdateBlueprintInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBlueprintInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBlueprintInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBlueprintInstanceResponse response) {
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
        public Builder body(UpdateBlueprintInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBlueprintInstanceResponse build() {
            return new UpdateBlueprintInstanceResponse(this);
        } 

    } 

}
