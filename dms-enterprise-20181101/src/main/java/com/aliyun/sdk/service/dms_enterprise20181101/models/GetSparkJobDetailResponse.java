// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkJobDetailResponse} extends {@link TeaModel}
 *
 * <p>GetSparkJobDetailResponse</p>
 */
public class GetSparkJobDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkJobDetailResponseBody body;

    private GetSparkJobDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkJobDetailResponse create() {
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
    public GetSparkJobDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkJobDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkJobDetailResponseBody body);

        @Override
        GetSparkJobDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkJobDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkJobDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkJobDetailResponse response) {
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
        public Builder body(GetSparkJobDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkJobDetailResponse build() {
            return new GetSparkJobDetailResponse(this);
        } 

    } 

}
