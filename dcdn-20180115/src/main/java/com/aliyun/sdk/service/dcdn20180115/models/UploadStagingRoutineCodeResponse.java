// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadStagingRoutineCodeResponse} extends {@link TeaModel}
 *
 * <p>UploadStagingRoutineCodeResponse</p>
 */
public class UploadStagingRoutineCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadStagingRoutineCodeResponseBody body;

    private UploadStagingRoutineCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadStagingRoutineCodeResponse create() {
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
    public UploadStagingRoutineCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadStagingRoutineCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadStagingRoutineCodeResponseBody body);

        @Override
        UploadStagingRoutineCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadStagingRoutineCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadStagingRoutineCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadStagingRoutineCodeResponse response) {
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
        public Builder body(UploadStagingRoutineCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadStagingRoutineCodeResponse build() {
            return new UploadStagingRoutineCodeResponse(this);
        } 

    } 

}
