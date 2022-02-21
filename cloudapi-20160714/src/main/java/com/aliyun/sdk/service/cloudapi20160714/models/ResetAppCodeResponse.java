// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetAppCodeResponse} extends {@link TeaModel}
 *
 * <p>ResetAppCodeResponse</p>
 */
public class ResetAppCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetAppCodeResponseBody body;

    private ResetAppCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetAppCodeResponse create() {
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
    public ResetAppCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetAppCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetAppCodeResponseBody body);

        @Override
        ResetAppCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetAppCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetAppCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetAppCodeResponse response) {
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
        public Builder body(ResetAppCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetAppCodeResponse build() {
            return new ResetAppCodeResponse(this);
        } 

    } 

}
