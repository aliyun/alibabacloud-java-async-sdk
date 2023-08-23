// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCustomQAResponse} extends {@link TeaModel}
 *
 * <p>UpdateCustomQAResponse</p>
 */
public class UpdateCustomQAResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCustomQAResponseBody body;

    private UpdateCustomQAResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCustomQAResponse create() {
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
    public UpdateCustomQAResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCustomQAResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCustomQAResponseBody body);

        @Override
        UpdateCustomQAResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCustomQAResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCustomQAResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCustomQAResponse response) {
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
        public Builder body(UpdateCustomQAResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCustomQAResponse build() {
            return new UpdateCustomQAResponse(this);
        } 

    } 

}
