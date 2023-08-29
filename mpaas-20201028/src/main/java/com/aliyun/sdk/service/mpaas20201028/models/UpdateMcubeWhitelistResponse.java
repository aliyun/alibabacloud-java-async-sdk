// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateMcubeWhitelistResponse} extends {@link TeaModel}
 *
 * <p>UpdateMcubeWhitelistResponse</p>
 */
public class UpdateMcubeWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateMcubeWhitelistResponseBody body;

    private UpdateMcubeWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateMcubeWhitelistResponse create() {
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
    public UpdateMcubeWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateMcubeWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateMcubeWhitelistResponseBody body);

        @Override
        UpdateMcubeWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateMcubeWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateMcubeWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateMcubeWhitelistResponse response) {
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
        public Builder body(UpdateMcubeWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateMcubeWhitelistResponse build() {
            return new UpdateMcubeWhitelistResponse(this);
        } 

    } 

}
