// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadRoutineCodeResponse} extends {@link TeaModel}
 *
 * <p>UploadRoutineCodeResponse</p>
 */
public class UploadRoutineCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadRoutineCodeResponseBody body;

    private UploadRoutineCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadRoutineCodeResponse create() {
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
    public UploadRoutineCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadRoutineCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadRoutineCodeResponseBody body);

        @Override
        UploadRoutineCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadRoutineCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadRoutineCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadRoutineCodeResponse response) {
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
        public Builder body(UploadRoutineCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadRoutineCodeResponse build() {
            return new UploadRoutineCodeResponse(this);
        } 

    } 

}
