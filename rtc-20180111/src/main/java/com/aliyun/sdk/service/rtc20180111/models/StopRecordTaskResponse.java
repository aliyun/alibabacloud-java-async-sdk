// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopRecordTaskResponse} extends {@link TeaModel}
 *
 * <p>StopRecordTaskResponse</p>
 */
public class StopRecordTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopRecordTaskResponseBody body;

    private StopRecordTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopRecordTaskResponse create() {
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
    public StopRecordTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopRecordTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopRecordTaskResponseBody body);

        @Override
        StopRecordTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopRecordTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopRecordTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopRecordTaskResponse response) {
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
        public Builder body(StopRecordTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopRecordTaskResponse build() {
            return new StopRecordTaskResponse(this);
        } 

    } 

}
