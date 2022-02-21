// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateComponentIndexResponse} extends {@link TeaModel}
 *
 * <p>UpdateComponentIndexResponse</p>
 */
public class UpdateComponentIndexResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateComponentIndexResponseBody body;

    private UpdateComponentIndexResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateComponentIndexResponse create() {
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
    public UpdateComponentIndexResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateComponentIndexResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateComponentIndexResponseBody body);

        @Override
        UpdateComponentIndexResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateComponentIndexResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateComponentIndexResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateComponentIndexResponse response) {
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
        public Builder body(UpdateComponentIndexResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateComponentIndexResponse build() {
            return new UpdateComponentIndexResponse(this);
        } 

    } 

}
