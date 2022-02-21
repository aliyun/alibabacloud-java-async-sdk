// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadFabricOrganizationSDKResponse} extends {@link TeaModel}
 *
 * <p>DownloadFabricOrganizationSDKResponse</p>
 */
public class DownloadFabricOrganizationSDKResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DownloadFabricOrganizationSDKResponseBody body;

    private DownloadFabricOrganizationSDKResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DownloadFabricOrganizationSDKResponse create() {
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
    public DownloadFabricOrganizationSDKResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DownloadFabricOrganizationSDKResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DownloadFabricOrganizationSDKResponseBody body);

        @Override
        DownloadFabricOrganizationSDKResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DownloadFabricOrganizationSDKResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DownloadFabricOrganizationSDKResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DownloadFabricOrganizationSDKResponse response) {
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
        public Builder body(DownloadFabricOrganizationSDKResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DownloadFabricOrganizationSDKResponse build() {
            return new DownloadFabricOrganizationSDKResponse(this);
        } 

    } 

}
