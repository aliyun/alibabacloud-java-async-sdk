// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomResponse} extends {@link TeaModel}
 *
 * <p>UpdateCustomResponse</p>
 */
public class UpdateCustomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCustomResponseBody body;

    private UpdateCustomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCustomResponse create() {
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
    public UpdateCustomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCustomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCustomResponseBody body);

        @Override
        UpdateCustomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCustomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCustomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCustomResponse response) {
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
        public Builder body(UpdateCustomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomResponse build() {
            return new UpdateCustomResponse(this);
        } 

    } 

}
