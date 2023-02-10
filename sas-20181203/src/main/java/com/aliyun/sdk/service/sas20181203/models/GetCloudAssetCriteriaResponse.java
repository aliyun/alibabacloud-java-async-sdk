// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAssetCriteriaResponse} extends {@link TeaModel}
 *
 * <p>GetCloudAssetCriteriaResponse</p>
 */
public class GetCloudAssetCriteriaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCloudAssetCriteriaResponseBody body;

    private GetCloudAssetCriteriaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCloudAssetCriteriaResponse create() {
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
    public GetCloudAssetCriteriaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCloudAssetCriteriaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCloudAssetCriteriaResponseBody body);

        @Override
        GetCloudAssetCriteriaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCloudAssetCriteriaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCloudAssetCriteriaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCloudAssetCriteriaResponse response) {
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
        public Builder body(GetCloudAssetCriteriaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCloudAssetCriteriaResponse build() {
            return new GetCloudAssetCriteriaResponse(this);
        } 

    } 

}
