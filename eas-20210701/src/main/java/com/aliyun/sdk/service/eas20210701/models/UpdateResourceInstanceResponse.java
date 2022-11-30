// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateResourceInstanceResponse} extends {@link TeaModel}
 *
 * <p>UpdateResourceInstanceResponse</p>
 */
public class UpdateResourceInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateResourceInstanceResponseBody body;

    private UpdateResourceInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateResourceInstanceResponse create() {
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
    public UpdateResourceInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateResourceInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateResourceInstanceResponseBody body);

        @Override
        UpdateResourceInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateResourceInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateResourceInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateResourceInstanceResponse response) {
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
        public Builder body(UpdateResourceInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateResourceInstanceResponse build() {
            return new UpdateResourceInstanceResponse(this);
        } 

    } 

}
