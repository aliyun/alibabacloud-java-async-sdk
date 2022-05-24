// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCopyrightJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitCopyrightJobResponse</p>
 */
public class SubmitCopyrightJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitCopyrightJobResponseBody body;

    private SubmitCopyrightJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitCopyrightJobResponse create() {
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
    public SubmitCopyrightJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitCopyrightJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitCopyrightJobResponseBody body);

        @Override
        SubmitCopyrightJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitCopyrightJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitCopyrightJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitCopyrightJobResponse response) {
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
        public Builder body(SubmitCopyrightJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitCopyrightJobResponse build() {
            return new SubmitCopyrightJobResponse(this);
        } 

    } 

}
