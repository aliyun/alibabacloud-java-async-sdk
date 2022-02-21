// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShadowSchemaDeviceModelsResponse} extends {@link TeaModel}
 *
 * <p>ListShadowSchemaDeviceModelsResponse</p>
 */
public class ListShadowSchemaDeviceModelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListShadowSchemaDeviceModelsResponseBody body;

    private ListShadowSchemaDeviceModelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListShadowSchemaDeviceModelsResponse create() {
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
    public ListShadowSchemaDeviceModelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListShadowSchemaDeviceModelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListShadowSchemaDeviceModelsResponseBody body);

        @Override
        ListShadowSchemaDeviceModelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListShadowSchemaDeviceModelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListShadowSchemaDeviceModelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListShadowSchemaDeviceModelsResponse response) {
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
        public Builder body(ListShadowSchemaDeviceModelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListShadowSchemaDeviceModelsResponse build() {
            return new ListShadowSchemaDeviceModelsResponse(this);
        } 

    } 

}
