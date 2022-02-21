// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadRuleResponse} extends {@link TeaModel}
 *
 * <p>UploadRuleResponse</p>
 */
public class UploadRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadRuleResponseBody body;

    private UploadRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadRuleResponse create() {
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
    public UploadRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadRuleResponseBody body);

        @Override
        UploadRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadRuleResponse response) {
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
        public Builder body(UploadRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadRuleResponse build() {
            return new UploadRuleResponse(this);
        } 

    } 

}
