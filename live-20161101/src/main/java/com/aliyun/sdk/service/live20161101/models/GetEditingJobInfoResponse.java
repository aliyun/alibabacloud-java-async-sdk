// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEditingJobInfoResponse} extends {@link TeaModel}
 *
 * <p>GetEditingJobInfoResponse</p>
 */
public class GetEditingJobInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEditingJobInfoResponseBody body;

    private GetEditingJobInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEditingJobInfoResponse create() {
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
    public GetEditingJobInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEditingJobInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEditingJobInfoResponseBody body);

        @Override
        GetEditingJobInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEditingJobInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEditingJobInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEditingJobInfoResponse response) {
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
        public Builder body(GetEditingJobInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEditingJobInfoResponse build() {
            return new GetEditingJobInfoResponse(this);
        } 

    } 

}
