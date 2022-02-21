// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEditingProjectResponse} extends {@link TeaModel}
 *
 * <p>AddEditingProjectResponse</p>
 */
public class AddEditingProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddEditingProjectResponseBody body;

    private AddEditingProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddEditingProjectResponse create() {
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
    public AddEditingProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddEditingProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddEditingProjectResponseBody body);

        @Override
        AddEditingProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddEditingProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddEditingProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddEditingProjectResponse response) {
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
        public Builder body(AddEditingProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddEditingProjectResponse build() {
            return new AddEditingProjectResponse(this);
        } 

    } 

}
