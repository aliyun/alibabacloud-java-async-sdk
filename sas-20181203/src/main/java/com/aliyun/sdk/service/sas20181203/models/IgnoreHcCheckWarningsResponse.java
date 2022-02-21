// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IgnoreHcCheckWarningsResponse} extends {@link TeaModel}
 *
 * <p>IgnoreHcCheckWarningsResponse</p>
 */
public class IgnoreHcCheckWarningsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private IgnoreHcCheckWarningsResponseBody body;

    private IgnoreHcCheckWarningsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static IgnoreHcCheckWarningsResponse create() {
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
    public IgnoreHcCheckWarningsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<IgnoreHcCheckWarningsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(IgnoreHcCheckWarningsResponseBody body);

        @Override
        IgnoreHcCheckWarningsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<IgnoreHcCheckWarningsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private IgnoreHcCheckWarningsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(IgnoreHcCheckWarningsResponse response) {
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
        public Builder body(IgnoreHcCheckWarningsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public IgnoreHcCheckWarningsResponse build() {
            return new IgnoreHcCheckWarningsResponse(this);
        } 

    } 

}
