// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyThingModelResponse} extends {@link TeaModel}
 *
 * <p>CopyThingModelResponse</p>
 */
public class CopyThingModelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopyThingModelResponseBody body;

    private CopyThingModelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopyThingModelResponse create() {
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
    public CopyThingModelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopyThingModelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopyThingModelResponseBody body);

        @Override
        CopyThingModelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopyThingModelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopyThingModelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopyThingModelResponse response) {
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
        public Builder body(CopyThingModelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopyThingModelResponse build() {
            return new CopyThingModelResponse(this);
        } 

    } 

}
