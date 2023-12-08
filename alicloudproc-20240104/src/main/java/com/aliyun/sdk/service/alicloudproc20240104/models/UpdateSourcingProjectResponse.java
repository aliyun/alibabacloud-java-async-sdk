// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSourcingProjectResponse} extends {@link TeaModel}
 *
 * <p>UpdateSourcingProjectResponse</p>
 */
public class UpdateSourcingProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSourcingProjectResponseBody body;

    private UpdateSourcingProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSourcingProjectResponse create() {
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
    public UpdateSourcingProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSourcingProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSourcingProjectResponseBody body);

        @Override
        UpdateSourcingProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSourcingProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSourcingProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSourcingProjectResponse response) {
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
        public Builder body(UpdateSourcingProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSourcingProjectResponse build() {
            return new UpdateSourcingProjectResponse(this);
        } 

    } 

}
