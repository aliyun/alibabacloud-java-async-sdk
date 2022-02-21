// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTagResponse} extends {@link TeaModel}
 *
 * <p>UpdateTagResponse</p>
 */
public class UpdateTagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTagResponseBody body;

    private UpdateTagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTagResponse create() {
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
    public UpdateTagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTagResponseBody body);

        @Override
        UpdateTagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTagResponse response) {
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
        public Builder body(UpdateTagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTagResponse build() {
            return new UpdateTagResponse(this);
        } 

    } 

}
