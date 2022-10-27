// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryImagesInfoResponse} extends {@link TeaModel}
 *
 * <p>SummaryImagesInfoResponse</p>
 */
public class SummaryImagesInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SummaryImagesInfoResponseBody body;

    private SummaryImagesInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SummaryImagesInfoResponse create() {
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
    public SummaryImagesInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SummaryImagesInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SummaryImagesInfoResponseBody body);

        @Override
        SummaryImagesInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SummaryImagesInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SummaryImagesInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SummaryImagesInfoResponse response) {
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
        public Builder body(SummaryImagesInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SummaryImagesInfoResponse build() {
            return new SummaryImagesInfoResponse(this);
        } 

    } 

}
