// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConnectionResponse} extends {@link TeaModel}
 *
 * <p>UpdateConnectionResponse</p>
 */
public class UpdateConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateConnectionResponseBody body;

    private UpdateConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateConnectionResponse create() {
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
    public UpdateConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateConnectionResponseBody body);

        @Override
        UpdateConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateConnectionResponse response) {
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
        public Builder body(UpdateConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateConnectionResponse build() {
            return new UpdateConnectionResponse(this);
        } 

    } 

}
