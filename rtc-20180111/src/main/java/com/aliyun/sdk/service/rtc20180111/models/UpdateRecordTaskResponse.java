// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRecordTaskResponse} extends {@link TeaModel}
 *
 * <p>UpdateRecordTaskResponse</p>
 */
public class UpdateRecordTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRecordTaskResponseBody body;

    private UpdateRecordTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRecordTaskResponse create() {
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
    public UpdateRecordTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRecordTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRecordTaskResponseBody body);

        @Override
        UpdateRecordTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRecordTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRecordTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRecordTaskResponse response) {
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
        public Builder body(UpdateRecordTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRecordTaskResponse build() {
            return new UpdateRecordTaskResponse(this);
        } 

    } 

}
