// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCheckDeviceNamesResponse} extends {@link TeaModel}
 *
 * <p>BatchCheckDeviceNamesResponse</p>
 */
public class BatchCheckDeviceNamesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCheckDeviceNamesResponseBody body;

    private BatchCheckDeviceNamesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCheckDeviceNamesResponse create() {
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
    public BatchCheckDeviceNamesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCheckDeviceNamesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCheckDeviceNamesResponseBody body);

        @Override
        BatchCheckDeviceNamesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCheckDeviceNamesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCheckDeviceNamesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCheckDeviceNamesResponse response) {
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
        public Builder body(BatchCheckDeviceNamesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCheckDeviceNamesResponse build() {
            return new BatchCheckDeviceNamesResponse(this);
        } 

    } 

}
