// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecordOssUploadParamResponse} extends {@link TeaModel}
 *
 * <p>GetRecordOssUploadParamResponse</p>
 */
public class GetRecordOssUploadParamResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRecordOssUploadParamResponseBody body;

    private GetRecordOssUploadParamResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRecordOssUploadParamResponse create() {
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
    public GetRecordOssUploadParamResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRecordOssUploadParamResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRecordOssUploadParamResponseBody body);

        @Override
        GetRecordOssUploadParamResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRecordOssUploadParamResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRecordOssUploadParamResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRecordOssUploadParamResponse response) {
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
        public Builder body(GetRecordOssUploadParamResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRecordOssUploadParamResponse build() {
            return new GetRecordOssUploadParamResponse(this);
        } 

    } 

}
