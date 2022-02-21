// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobInfoResponse} extends {@link TeaModel}
 *
 * <p>GetJobInfoResponse</p>
 */
public class GetJobInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobInfoResponseBody body;

    private GetJobInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobInfoResponse create() {
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
    public GetJobInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobInfoResponseBody body);

        @Override
        GetJobInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobInfoResponse response) {
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
        public Builder body(GetJobInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobInfoResponse build() {
            return new GetJobInfoResponse(this);
        } 

    } 

}
