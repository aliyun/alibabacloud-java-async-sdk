// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExceedApplySyncResponse} extends {@link TeaModel}
 *
 * <p>ExceedApplySyncResponse</p>
 */
public class ExceedApplySyncResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExceedApplySyncResponseBody body;

    private ExceedApplySyncResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExceedApplySyncResponse create() {
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
    public ExceedApplySyncResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExceedApplySyncResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExceedApplySyncResponseBody body);

        @Override
        ExceedApplySyncResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExceedApplySyncResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExceedApplySyncResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExceedApplySyncResponse response) {
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
        public Builder body(ExceedApplySyncResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExceedApplySyncResponse build() {
            return new ExceedApplySyncResponse(this);
        } 

    } 

}
