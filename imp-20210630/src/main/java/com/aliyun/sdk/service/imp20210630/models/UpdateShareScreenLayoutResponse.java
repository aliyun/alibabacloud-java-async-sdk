// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateShareScreenLayoutResponse} extends {@link TeaModel}
 *
 * <p>UpdateShareScreenLayoutResponse</p>
 */
public class UpdateShareScreenLayoutResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateShareScreenLayoutResponseBody body;

    private UpdateShareScreenLayoutResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateShareScreenLayoutResponse create() {
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
    public UpdateShareScreenLayoutResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateShareScreenLayoutResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateShareScreenLayoutResponseBody body);

        @Override
        UpdateShareScreenLayoutResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateShareScreenLayoutResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateShareScreenLayoutResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateShareScreenLayoutResponse response) {
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
        public Builder body(UpdateShareScreenLayoutResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateShareScreenLayoutResponse build() {
            return new UpdateShareScreenLayoutResponse(this);
        } 

    } 

}
