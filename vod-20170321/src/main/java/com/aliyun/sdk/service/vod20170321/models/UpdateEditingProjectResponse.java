// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEditingProjectResponse} extends {@link TeaModel}
 *
 * <p>UpdateEditingProjectResponse</p>
 */
public class UpdateEditingProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEditingProjectResponseBody body;

    private UpdateEditingProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEditingProjectResponse create() {
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
    public UpdateEditingProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEditingProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEditingProjectResponseBody body);

        @Override
        UpdateEditingProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEditingProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEditingProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEditingProjectResponse response) {
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
        public Builder body(UpdateEditingProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEditingProjectResponse build() {
            return new UpdateEditingProjectResponse(this);
        } 

    } 

}
