// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadDeviceRecordResponse} extends {@link TeaModel}
 *
 * <p>UploadDeviceRecordResponse</p>
 */
public class UploadDeviceRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadDeviceRecordResponseBody body;

    private UploadDeviceRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadDeviceRecordResponse create() {
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
    public UploadDeviceRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadDeviceRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadDeviceRecordResponseBody body);

        @Override
        UploadDeviceRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadDeviceRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadDeviceRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadDeviceRecordResponse response) {
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
        public Builder body(UploadDeviceRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadDeviceRecordResponse build() {
            return new UploadDeviceRecordResponse(this);
        } 

    } 

}
