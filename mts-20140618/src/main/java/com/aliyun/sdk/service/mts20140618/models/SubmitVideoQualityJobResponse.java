// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitVideoQualityJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitVideoQualityJobResponse</p>
 */
public class SubmitVideoQualityJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitVideoQualityJobResponseBody body;

    private SubmitVideoQualityJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitVideoQualityJobResponse create() {
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
    public SubmitVideoQualityJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitVideoQualityJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitVideoQualityJobResponseBody body);

        @Override
        SubmitVideoQualityJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitVideoQualityJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitVideoQualityJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitVideoQualityJobResponse response) {
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
        public Builder body(SubmitVideoQualityJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitVideoQualityJobResponse build() {
            return new SubmitVideoQualityJobResponse(this);
        } 

    } 

}
