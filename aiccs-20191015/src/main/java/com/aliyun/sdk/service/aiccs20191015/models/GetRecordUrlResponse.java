// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecordUrlResponse} extends {@link TeaModel}
 *
 * <p>GetRecordUrlResponse</p>
 */
public class GetRecordUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRecordUrlResponseBody body;

    private GetRecordUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRecordUrlResponse create() {
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
    public GetRecordUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRecordUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRecordUrlResponseBody body);

        @Override
        GetRecordUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRecordUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRecordUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRecordUrlResponse response) {
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
        public Builder body(GetRecordUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRecordUrlResponse build() {
            return new GetRecordUrlResponse(this);
        } 

    } 

}
