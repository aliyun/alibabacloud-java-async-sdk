// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateExtendConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateExtendConfigResponse</p>
 */
public class UpdateExtendConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateExtendConfigResponseBody body;

    private UpdateExtendConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateExtendConfigResponse create() {
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
    public UpdateExtendConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateExtendConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateExtendConfigResponseBody body);

        @Override
        UpdateExtendConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateExtendConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateExtendConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateExtendConfigResponse response) {
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
        public Builder body(UpdateExtendConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateExtendConfigResponse build() {
            return new UpdateExtendConfigResponse(this);
        } 

    } 

}
