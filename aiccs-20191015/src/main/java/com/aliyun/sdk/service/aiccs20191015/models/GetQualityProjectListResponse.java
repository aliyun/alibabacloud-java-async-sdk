// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityProjectListResponse} extends {@link TeaModel}
 *
 * <p>GetQualityProjectListResponse</p>
 */
public class GetQualityProjectListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetQualityProjectListResponseBody body;

    private GetQualityProjectListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetQualityProjectListResponse create() {
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
    public GetQualityProjectListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetQualityProjectListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetQualityProjectListResponseBody body);

        @Override
        GetQualityProjectListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetQualityProjectListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetQualityProjectListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetQualityProjectListResponse response) {
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
        public Builder body(GetQualityProjectListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetQualityProjectListResponse build() {
            return new GetQualityProjectListResponse(this);
        } 

    } 

}
