// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetDetailResponse} extends {@link TeaModel}
 *
 * <p>GetCloudAssetDetailResponse</p>
 */
public class GetCloudAssetDetailResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private GetCloudAssetDetailResponseBody body;

    private GetCloudAssetDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public GetCloudAssetDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCloudAssetDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(GetCloudAssetDetailResponseBody body);

        @Override
        GetCloudAssetDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCloudAssetDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private GetCloudAssetDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCloudAssetDetailResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
