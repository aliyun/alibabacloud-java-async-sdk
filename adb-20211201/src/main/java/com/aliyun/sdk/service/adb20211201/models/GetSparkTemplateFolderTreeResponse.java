// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkTemplateFolderTreeResponse} extends {@link TeaModel}
 *
 * <p>GetSparkTemplateFolderTreeResponse</p>
 */
public class GetSparkTemplateFolderTreeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkTemplateFolderTreeResponseBody body;

    private GetSparkTemplateFolderTreeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkTemplateFolderTreeResponse create() {
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
    public GetSparkTemplateFolderTreeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkTemplateFolderTreeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkTemplateFolderTreeResponseBody body);

        @Override
        GetSparkTemplateFolderTreeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkTemplateFolderTreeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkTemplateFolderTreeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkTemplateFolderTreeResponse response) {
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
        public Builder body(GetSparkTemplateFolderTreeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkTemplateFolderTreeResponse build() {
            return new GetSparkTemplateFolderTreeResponse(this);
        } 

    } 

}
