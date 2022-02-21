// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSubSceneResponse} extends {@link TeaModel}
 *
 * <p>AddSubSceneResponse</p>
 */
public class AddSubSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddSubSceneResponseBody body;

    private AddSubSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddSubSceneResponse create() {
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
    public AddSubSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddSubSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddSubSceneResponseBody body);

        @Override
        AddSubSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddSubSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddSubSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddSubSceneResponse response) {
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
        public Builder body(AddSubSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddSubSceneResponse build() {
            return new AddSubSceneResponse(this);
        } 

    } 

}
