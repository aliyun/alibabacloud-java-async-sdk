// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSparkAppResponse} extends {@link TeaModel}
 *
 * <p>SubmitSparkAppResponse</p>
 */
public class SubmitSparkAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitSparkAppResponseBody body;

    private SubmitSparkAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitSparkAppResponse create() {
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
    public SubmitSparkAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitSparkAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitSparkAppResponseBody body);

        @Override
        SubmitSparkAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitSparkAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitSparkAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitSparkAppResponse response) {
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
        public Builder body(SubmitSparkAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitSparkAppResponse build() {
            return new SubmitSparkAppResponse(this);
        } 

    } 

}
