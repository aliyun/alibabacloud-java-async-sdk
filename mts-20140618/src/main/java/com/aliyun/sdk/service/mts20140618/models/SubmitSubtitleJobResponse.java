// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSubtitleJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitSubtitleJobResponse</p>
 */
public class SubmitSubtitleJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitSubtitleJobResponseBody body;

    private SubmitSubtitleJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitSubtitleJobResponse create() {
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
    public SubmitSubtitleJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitSubtitleJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitSubtitleJobResponseBody body);

        @Override
        SubmitSubtitleJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitSubtitleJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitSubtitleJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitSubtitleJobResponse response) {
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
        public Builder body(SubmitSubtitleJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitSubtitleJobResponse build() {
            return new SubmitSubtitleJobResponse(this);
        } 

    } 

}
