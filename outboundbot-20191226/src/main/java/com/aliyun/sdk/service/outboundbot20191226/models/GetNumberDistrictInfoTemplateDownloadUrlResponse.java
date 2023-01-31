// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNumberDistrictInfoTemplateDownloadUrlResponse} extends {@link TeaModel}
 *
 * <p>GetNumberDistrictInfoTemplateDownloadUrlResponse</p>
 */
public class GetNumberDistrictInfoTemplateDownloadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNumberDistrictInfoTemplateDownloadUrlResponseBody body;

    private GetNumberDistrictInfoTemplateDownloadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNumberDistrictInfoTemplateDownloadUrlResponse create() {
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
    public GetNumberDistrictInfoTemplateDownloadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNumberDistrictInfoTemplateDownloadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNumberDistrictInfoTemplateDownloadUrlResponseBody body);

        @Override
        GetNumberDistrictInfoTemplateDownloadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNumberDistrictInfoTemplateDownloadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNumberDistrictInfoTemplateDownloadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNumberDistrictInfoTemplateDownloadUrlResponse response) {
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
        public Builder body(GetNumberDistrictInfoTemplateDownloadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNumberDistrictInfoTemplateDownloadUrlResponse build() {
            return new GetNumberDistrictInfoTemplateDownloadUrlResponse(this);
        } 

    } 

}
