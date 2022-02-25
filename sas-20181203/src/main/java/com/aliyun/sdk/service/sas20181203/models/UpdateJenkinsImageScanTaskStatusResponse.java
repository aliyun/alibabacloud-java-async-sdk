// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJenkinsImageScanTaskStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateJenkinsImageScanTaskStatusResponse</p>
 */
public class UpdateJenkinsImageScanTaskStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateJenkinsImageScanTaskStatusResponseBody body;

    private UpdateJenkinsImageScanTaskStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateJenkinsImageScanTaskStatusResponse create() {
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
    public UpdateJenkinsImageScanTaskStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateJenkinsImageScanTaskStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateJenkinsImageScanTaskStatusResponseBody body);

        @Override
        UpdateJenkinsImageScanTaskStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateJenkinsImageScanTaskStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateJenkinsImageScanTaskStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateJenkinsImageScanTaskStatusResponse response) {
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
        public Builder body(UpdateJenkinsImageScanTaskStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateJenkinsImageScanTaskStatusResponse build() {
            return new UpdateJenkinsImageScanTaskStatusResponse(this);
        } 

    } 

}
