// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelFineTuneJobResponse} extends {@link TeaModel}
 *
 * <p>CancelFineTuneJobResponse</p>
 */
public class CancelFineTuneJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelFineTuneJobResponseBody body;

    private CancelFineTuneJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelFineTuneJobResponse create() {
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
    public CancelFineTuneJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelFineTuneJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelFineTuneJobResponseBody body);

        @Override
        CancelFineTuneJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelFineTuneJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelFineTuneJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelFineTuneJobResponse response) {
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
        public Builder body(CancelFineTuneJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelFineTuneJobResponse build() {
            return new CancelFineTuneJobResponse(this);
        } 

    } 

}
