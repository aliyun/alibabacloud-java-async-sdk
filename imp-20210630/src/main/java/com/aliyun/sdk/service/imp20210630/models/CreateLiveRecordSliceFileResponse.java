// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveRecordSliceFileResponse} extends {@link TeaModel}
 *
 * <p>CreateLiveRecordSliceFileResponse</p>
 */
public class CreateLiveRecordSliceFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLiveRecordSliceFileResponseBody body;

    private CreateLiveRecordSliceFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLiveRecordSliceFileResponse create() {
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
    public CreateLiveRecordSliceFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLiveRecordSliceFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLiveRecordSliceFileResponseBody body);

        @Override
        CreateLiveRecordSliceFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLiveRecordSliceFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLiveRecordSliceFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLiveRecordSliceFileResponse response) {
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
        public Builder body(CreateLiveRecordSliceFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLiveRecordSliceFileResponse build() {
            return new CreateLiveRecordSliceFileResponse(this);
        } 

    } 

}
