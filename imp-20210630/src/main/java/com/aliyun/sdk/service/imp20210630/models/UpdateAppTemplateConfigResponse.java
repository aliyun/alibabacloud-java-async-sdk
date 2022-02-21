// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppTemplateConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateAppTemplateConfigResponse</p>
 */
public class UpdateAppTemplateConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAppTemplateConfigResponseBody body;

    private UpdateAppTemplateConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAppTemplateConfigResponse create() {
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
    public UpdateAppTemplateConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAppTemplateConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAppTemplateConfigResponseBody body);

        @Override
        UpdateAppTemplateConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAppTemplateConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAppTemplateConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAppTemplateConfigResponse response) {
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
        public Builder body(UpdateAppTemplateConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAppTemplateConfigResponse build() {
            return new UpdateAppTemplateConfigResponse(this);
        } 

    } 

}
