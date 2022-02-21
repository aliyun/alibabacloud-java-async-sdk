// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateThingModelResponse} extends {@link TeaModel}
 *
 * <p>UpdateThingModelResponse</p>
 */
public class UpdateThingModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateThingModelResponseBody body;

    private UpdateThingModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateThingModelResponse create() {
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
    public UpdateThingModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateThingModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateThingModelResponseBody body);

        @Override
        UpdateThingModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateThingModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateThingModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateThingModelResponse response) {
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
        public Builder body(UpdateThingModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateThingModelResponse build() {
            return new UpdateThingModelResponse(this);
        } 

    } 

}
