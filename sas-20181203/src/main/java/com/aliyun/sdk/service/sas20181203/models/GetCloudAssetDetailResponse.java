// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetDetailResponse} extends {@link TeaModel}
 *
 * <p>GetCloudAssetDetailResponse</p>
 */
public class GetCloudAssetDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCloudAssetDetailResponseBody body;

    private GetCloudAssetDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCloudAssetDetailResponse create() {
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
    public GetCloudAssetDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCloudAssetDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCloudAssetDetailResponseBody body);

        @Override
        GetCloudAssetDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCloudAssetDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCloudAssetDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCloudAssetDetailResponse response) {
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
        public Builder body(GetCloudAssetDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCloudAssetDetailResponse build() {
            return new GetCloudAssetDetailResponse(this);
        } 

    } 

}
