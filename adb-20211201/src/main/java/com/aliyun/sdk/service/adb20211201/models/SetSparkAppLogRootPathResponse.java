// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetSparkAppLogRootPathResponse} extends {@link TeaModel}
 *
 * <p>SetSparkAppLogRootPathResponse</p>
 */
public class SetSparkAppLogRootPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetSparkAppLogRootPathResponseBody body;

    private SetSparkAppLogRootPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetSparkAppLogRootPathResponse create() {
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
    public SetSparkAppLogRootPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetSparkAppLogRootPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetSparkAppLogRootPathResponseBody body);

        @Override
        SetSparkAppLogRootPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetSparkAppLogRootPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetSparkAppLogRootPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetSparkAppLogRootPathResponse response) {
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
        public Builder body(SetSparkAppLogRootPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetSparkAppLogRootPathResponse build() {
            return new SetSparkAppLogRootPathResponse(this);
        } 

    } 

}
