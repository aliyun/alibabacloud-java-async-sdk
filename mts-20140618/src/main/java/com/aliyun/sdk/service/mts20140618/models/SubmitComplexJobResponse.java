// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitComplexJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitComplexJobResponse</p>
 */
public class SubmitComplexJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitComplexJobResponseBody body;

    private SubmitComplexJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitComplexJobResponse create() {
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
    public SubmitComplexJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitComplexJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitComplexJobResponseBody body);

        @Override
        SubmitComplexJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitComplexJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitComplexJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitComplexJobResponse response) {
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
        public Builder body(SubmitComplexJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitComplexJobResponse build() {
            return new SubmitComplexJobResponse(this);
        } 

    } 

}
