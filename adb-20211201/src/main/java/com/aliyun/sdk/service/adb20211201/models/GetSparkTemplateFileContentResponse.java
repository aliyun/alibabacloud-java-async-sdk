// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkTemplateFileContentResponse} extends {@link TeaModel}
 *
 * <p>GetSparkTemplateFileContentResponse</p>
 */
public class GetSparkTemplateFileContentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSparkTemplateFileContentResponseBody body;

    private GetSparkTemplateFileContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSparkTemplateFileContentResponse create() {
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
    public GetSparkTemplateFileContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSparkTemplateFileContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSparkTemplateFileContentResponseBody body);

        @Override
        GetSparkTemplateFileContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSparkTemplateFileContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSparkTemplateFileContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSparkTemplateFileContentResponse response) {
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
        public Builder body(GetSparkTemplateFileContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSparkTemplateFileContentResponse build() {
            return new GetSparkTemplateFileContentResponse(this);
        } 

    } 

}
