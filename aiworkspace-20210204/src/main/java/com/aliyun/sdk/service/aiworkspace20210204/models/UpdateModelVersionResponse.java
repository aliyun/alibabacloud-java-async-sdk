// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelVersionResponse} extends {@link TeaModel}
 *
 * <p>UpdateModelVersionResponse</p>
 */
public class UpdateModelVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateModelVersionResponseBody body;

    private UpdateModelVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateModelVersionResponse create() {
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
    public UpdateModelVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateModelVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateModelVersionResponseBody body);

        @Override
        UpdateModelVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateModelVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateModelVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateModelVersionResponse response) {
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
        public Builder body(UpdateModelVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateModelVersionResponse build() {
            return new UpdateModelVersionResponse(this);
        } 

    } 

}
