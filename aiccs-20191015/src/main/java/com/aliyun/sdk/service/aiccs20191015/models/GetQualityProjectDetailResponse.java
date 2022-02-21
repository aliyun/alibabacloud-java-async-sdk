// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityProjectDetailResponse} extends {@link TeaModel}
 *
 * <p>GetQualityProjectDetailResponse</p>
 */
public class GetQualityProjectDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQualityProjectDetailResponseBody body;

    private GetQualityProjectDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQualityProjectDetailResponse create() {
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
    public GetQualityProjectDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQualityProjectDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQualityProjectDetailResponseBody body);

        @Override
        GetQualityProjectDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQualityProjectDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQualityProjectDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQualityProjectDetailResponse response) {
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
        public Builder body(GetQualityProjectDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQualityProjectDetailResponse build() {
            return new GetQualityProjectDetailResponse(this);
        } 

    } 

}
