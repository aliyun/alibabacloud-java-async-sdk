// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSmarttagJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitSmarttagJobResponse</p>
 */
public class SubmitSmarttagJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitSmarttagJobResponseBody body;

    private SubmitSmarttagJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitSmarttagJobResponse create() {
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
    public SubmitSmarttagJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitSmarttagJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitSmarttagJobResponseBody body);

        @Override
        SubmitSmarttagJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitSmarttagJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitSmarttagJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitSmarttagJobResponse response) {
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
        public Builder body(SubmitSmarttagJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitSmarttagJobResponse build() {
            return new SubmitSmarttagJobResponse(this);
        } 

    } 

}
