// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobDetailResponse} extends {@link TeaModel}
 *
 * <p>GetJobDetailResponse</p>
 */
public class GetJobDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetJobDetailResponseBody body;

    private GetJobDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetJobDetailResponse create() {
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
    public GetJobDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetJobDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetJobDetailResponseBody body);

        @Override
        GetJobDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetJobDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetJobDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetJobDetailResponse response) {
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
        public Builder body(GetJobDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetJobDetailResponse build() {
            return new GetJobDetailResponse(this);
        } 

    } 

}
