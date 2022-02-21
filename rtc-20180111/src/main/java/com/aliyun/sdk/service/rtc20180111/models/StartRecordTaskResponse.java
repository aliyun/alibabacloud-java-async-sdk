// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRecordTaskResponse} extends {@link TeaModel}
 *
 * <p>StartRecordTaskResponse</p>
 */
public class StartRecordTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartRecordTaskResponseBody body;

    private StartRecordTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartRecordTaskResponse create() {
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
    public StartRecordTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartRecordTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartRecordTaskResponseBody body);

        @Override
        StartRecordTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartRecordTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartRecordTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartRecordTaskResponse response) {
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
        public Builder body(StartRecordTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartRecordTaskResponse build() {
            return new StartRecordTaskResponse(this);
        } 

    } 

}
