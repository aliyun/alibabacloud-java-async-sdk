// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVersionPrepublishActiveStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateVersionPrepublishActiveStatusResponse</p>
 */
public class UpdateVersionPrepublishActiveStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVersionPrepublishActiveStatusResponseBody body;

    private UpdateVersionPrepublishActiveStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVersionPrepublishActiveStatusResponse create() {
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
    public UpdateVersionPrepublishActiveStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVersionPrepublishActiveStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVersionPrepublishActiveStatusResponseBody body);

        @Override
        UpdateVersionPrepublishActiveStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVersionPrepublishActiveStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVersionPrepublishActiveStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVersionPrepublishActiveStatusResponse response) {
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
        public Builder body(UpdateVersionPrepublishActiveStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVersionPrepublishActiveStatusResponse build() {
            return new UpdateVersionPrepublishActiveStatusResponse(this);
        } 

    } 

}
