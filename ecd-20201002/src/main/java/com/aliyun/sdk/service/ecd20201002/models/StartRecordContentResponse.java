// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRecordContentResponse} extends {@link TeaModel}
 *
 * <p>StartRecordContentResponse</p>
 */
public class StartRecordContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartRecordContentResponseBody body;

    private StartRecordContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartRecordContentResponse create() {
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
    public StartRecordContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartRecordContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartRecordContentResponseBody body);

        @Override
        StartRecordContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartRecordContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartRecordContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartRecordContentResponse response) {
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
        public Builder body(StartRecordContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartRecordContentResponse build() {
            return new StartRecordContentResponse(this);
        } 

    } 

}
