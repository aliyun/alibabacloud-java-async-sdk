// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindDevicesIntoProjectResponse} extends {@link TeaModel}
 *
 * <p>BatchBindDevicesIntoProjectResponse</p>
 */
public class BatchBindDevicesIntoProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchBindDevicesIntoProjectResponseBody body;

    private BatchBindDevicesIntoProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchBindDevicesIntoProjectResponse create() {
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
    public BatchBindDevicesIntoProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchBindDevicesIntoProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchBindDevicesIntoProjectResponseBody body);

        @Override
        BatchBindDevicesIntoProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchBindDevicesIntoProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchBindDevicesIntoProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchBindDevicesIntoProjectResponse response) {
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
        public Builder body(BatchBindDevicesIntoProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchBindDevicesIntoProjectResponse build() {
            return new BatchBindDevicesIntoProjectResponse(this);
        } 

    } 

}
