// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetSelectionConfigResponse} extends {@link TeaModel}
 *
 * <p>GetAssetSelectionConfigResponse</p>
 */
public class GetAssetSelectionConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAssetSelectionConfigResponseBody body;

    private GetAssetSelectionConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAssetSelectionConfigResponse create() {
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
    public GetAssetSelectionConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAssetSelectionConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAssetSelectionConfigResponseBody body);

        @Override
        GetAssetSelectionConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAssetSelectionConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAssetSelectionConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAssetSelectionConfigResponse response) {
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
        public Builder body(GetAssetSelectionConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAssetSelectionConfigResponse build() {
            return new GetAssetSelectionConfigResponse(this);
        } 

    } 

}
