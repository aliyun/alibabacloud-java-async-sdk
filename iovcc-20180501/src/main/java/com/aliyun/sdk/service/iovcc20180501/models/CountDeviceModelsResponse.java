// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CountDeviceModelsResponse} extends {@link TeaModel}
 *
 * <p>CountDeviceModelsResponse</p>
 */
public class CountDeviceModelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CountDeviceModelsResponseBody body;

    private CountDeviceModelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CountDeviceModelsResponse create() {
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
    public CountDeviceModelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CountDeviceModelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CountDeviceModelsResponseBody body);

        @Override
        CountDeviceModelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CountDeviceModelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CountDeviceModelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CountDeviceModelsResponse response) {
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
        public Builder body(CountDeviceModelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CountDeviceModelsResponse build() {
            return new CountDeviceModelsResponse(this);
        } 

    } 

}
