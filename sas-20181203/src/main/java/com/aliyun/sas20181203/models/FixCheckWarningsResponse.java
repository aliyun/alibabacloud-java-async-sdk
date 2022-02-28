// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FixCheckWarningsResponse} extends {@link TeaModel}
 *
 * <p>FixCheckWarningsResponse</p>
 */
public class FixCheckWarningsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FixCheckWarningsResponseBody body;

    private FixCheckWarningsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FixCheckWarningsResponse create() {
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
    public FixCheckWarningsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FixCheckWarningsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FixCheckWarningsResponseBody body);

        @Override
        FixCheckWarningsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FixCheckWarningsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FixCheckWarningsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FixCheckWarningsResponse response) {
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
        public Builder body(FixCheckWarningsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FixCheckWarningsResponse build() {
            return new FixCheckWarningsResponse(this);
        } 

    } 

}
