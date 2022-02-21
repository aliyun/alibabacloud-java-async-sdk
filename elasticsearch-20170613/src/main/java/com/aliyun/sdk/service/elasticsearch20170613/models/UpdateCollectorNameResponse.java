// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCollectorNameResponse} extends {@link TeaModel}
 *
 * <p>UpdateCollectorNameResponse</p>
 */
public class UpdateCollectorNameResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCollectorNameResponseBody body;

    private UpdateCollectorNameResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCollectorNameResponse create() {
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
    public UpdateCollectorNameResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCollectorNameResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCollectorNameResponseBody body);

        @Override
        UpdateCollectorNameResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCollectorNameResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCollectorNameResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCollectorNameResponse response) {
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
        public Builder body(UpdateCollectorNameResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCollectorNameResponse build() {
            return new UpdateCollectorNameResponse(this);
        } 

    } 

}
