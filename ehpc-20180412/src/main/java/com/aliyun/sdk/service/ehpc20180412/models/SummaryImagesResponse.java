// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryImagesResponse} extends {@link TeaModel}
 *
 * <p>SummaryImagesResponse</p>
 */
public class SummaryImagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SummaryImagesResponseBody body;

    private SummaryImagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SummaryImagesResponse create() {
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
    public SummaryImagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SummaryImagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SummaryImagesResponseBody body);

        @Override
        SummaryImagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SummaryImagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SummaryImagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SummaryImagesResponse response) {
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
        public Builder body(SummaryImagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SummaryImagesResponse build() {
            return new SummaryImagesResponse(this);
        } 

    } 

}
