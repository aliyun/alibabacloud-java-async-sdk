// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAIAppResponse} extends {@link TeaModel}
 *
 * <p>UpdateAIAppResponse</p>
 */
public class UpdateAIAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAIAppResponseBody body;

    private UpdateAIAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAIAppResponse create() {
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
    public UpdateAIAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAIAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAIAppResponseBody body);

        @Override
        UpdateAIAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAIAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAIAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAIAppResponse response) {
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
        public Builder body(UpdateAIAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAIAppResponse build() {
            return new UpdateAIAppResponse(this);
        } 

    } 

}
