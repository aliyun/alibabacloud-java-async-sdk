// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopRecordContentResponse} extends {@link TeaModel}
 *
 * <p>StopRecordContentResponse</p>
 */
public class StopRecordContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopRecordContentResponseBody body;

    private StopRecordContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopRecordContentResponse create() {
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
    public StopRecordContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopRecordContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopRecordContentResponseBody body);

        @Override
        StopRecordContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopRecordContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopRecordContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopRecordContentResponse response) {
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
        public Builder body(StopRecordContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopRecordContentResponse build() {
            return new StopRecordContentResponse(this);
        } 

    } 

}
