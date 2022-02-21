// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSceneResponse} extends {@link TeaModel}
 *
 * <p>AddSceneResponse</p>
 */
public class AddSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSceneResponseBody body;

    private AddSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSceneResponse create() {
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
    public AddSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSceneResponseBody body);

        @Override
        AddSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSceneResponse response) {
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
        public Builder body(AddSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSceneResponse build() {
            return new AddSceneResponse(this);
        } 

    } 

}
