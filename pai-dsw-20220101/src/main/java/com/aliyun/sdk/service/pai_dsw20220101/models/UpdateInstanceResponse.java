// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateInstanceResponse} extends {@link TeaModel}
 *
 * <p>UpdateInstanceResponse</p>
 */
public class UpdateInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateInstanceResponseBody body;

    private UpdateInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateInstanceResponse create() {
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
    public UpdateInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateInstanceResponseBody body);

        @Override
        UpdateInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateInstanceResponse response) {
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
        public Builder body(UpdateInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateInstanceResponse build() {
            return new UpdateInstanceResponse(this);
        } 

    } 

}
