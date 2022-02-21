// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStackResponse} extends {@link TeaModel}
 *
 * <p>UpdateStackResponse</p>
 */
public class UpdateStackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateStackResponseBody body;

    private UpdateStackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateStackResponse create() {
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
    public UpdateStackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateStackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateStackResponseBody body);

        @Override
        UpdateStackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateStackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateStackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateStackResponse response) {
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
        public Builder body(UpdateStackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateStackResponse build() {
            return new UpdateStackResponse(this);
        } 

    } 

}
