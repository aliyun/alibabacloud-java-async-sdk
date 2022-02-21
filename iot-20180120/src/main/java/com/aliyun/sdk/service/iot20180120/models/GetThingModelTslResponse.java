// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThingModelTslResponse} extends {@link TeaModel}
 *
 * <p>GetThingModelTslResponse</p>
 */
public class GetThingModelTslResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetThingModelTslResponseBody body;

    private GetThingModelTslResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetThingModelTslResponse create() {
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
    public GetThingModelTslResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetThingModelTslResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetThingModelTslResponseBody body);

        @Override
        GetThingModelTslResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetThingModelTslResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetThingModelTslResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetThingModelTslResponse response) {
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
        public Builder body(GetThingModelTslResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetThingModelTslResponse build() {
            return new GetThingModelTslResponse(this);
        } 

    } 

}
