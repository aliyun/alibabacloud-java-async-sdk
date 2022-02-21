// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDynamicImageJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitDynamicImageJobResponse</p>
 */
public class SubmitDynamicImageJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitDynamicImageJobResponseBody body;

    private SubmitDynamicImageJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitDynamicImageJobResponse create() {
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
    public SubmitDynamicImageJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitDynamicImageJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitDynamicImageJobResponseBody body);

        @Override
        SubmitDynamicImageJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitDynamicImageJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitDynamicImageJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitDynamicImageJobResponse response) {
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
        public Builder body(SubmitDynamicImageJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitDynamicImageJobResponse build() {
            return new SubmitDynamicImageJobResponse(this);
        } 

    } 

}
