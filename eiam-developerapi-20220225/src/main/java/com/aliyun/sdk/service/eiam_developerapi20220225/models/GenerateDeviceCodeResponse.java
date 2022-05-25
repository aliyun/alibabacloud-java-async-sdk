// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GenerateDeviceCodeResponse} extends {@link TeaModel}
 *
 * <p>GenerateDeviceCodeResponse</p>
 */
public class GenerateDeviceCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateDeviceCodeResponseBody body;

    private GenerateDeviceCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateDeviceCodeResponse create() {
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
    public GenerateDeviceCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateDeviceCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateDeviceCodeResponseBody body);

        @Override
        GenerateDeviceCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateDeviceCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateDeviceCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateDeviceCodeResponse response) {
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
        public Builder body(GenerateDeviceCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateDeviceCodeResponse build() {
            return new GenerateDeviceCodeResponse(this);
        } 

    } 

}
