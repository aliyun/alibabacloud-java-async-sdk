// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSparkTemplateFileResponse} extends {@link TeaModel}
 *
 * <p>UpdateSparkTemplateFileResponse</p>
 */
public class UpdateSparkTemplateFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSparkTemplateFileResponseBody body;

    private UpdateSparkTemplateFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSparkTemplateFileResponse create() {
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
    public UpdateSparkTemplateFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSparkTemplateFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSparkTemplateFileResponseBody body);

        @Override
        UpdateSparkTemplateFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSparkTemplateFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSparkTemplateFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSparkTemplateFileResponse response) {
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
        public Builder body(UpdateSparkTemplateFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSparkTemplateFileResponse build() {
            return new UpdateSparkTemplateFileResponse(this);
        } 

    } 

}
