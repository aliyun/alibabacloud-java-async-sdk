// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFileResponse} extends {@link TeaModel}
 *
 * <p>UpdateFileResponse</p>
 */
public class UpdateFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFileResponseBody body;

    private UpdateFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFileResponse create() {
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
    public UpdateFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFileResponseBody body);

        @Override
        UpdateFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFileResponse response) {
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
        public Builder body(UpdateFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFileResponse build() {
            return new UpdateFileResponse(this);
        } 

    } 

}
