// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProjectResponse} extends {@link TeaModel}
 *
 * <p>AddProjectResponse</p>
 */
public class AddProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddProjectResponseBody body;

    private AddProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddProjectResponse create() {
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
    public AddProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddProjectResponseBody body);

        @Override
        AddProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddProjectResponse response) {
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
        public Builder body(AddProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddProjectResponse build() {
            return new AddProjectResponse(this);
        } 

    } 

}
