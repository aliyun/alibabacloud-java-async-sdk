// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SummaryJobDetailResponse} extends {@link TeaModel}
 *
 * <p>SummaryJobDetailResponse</p>
 */
public class SummaryJobDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SummaryJobDetailResponseBody body;

    private SummaryJobDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SummaryJobDetailResponse create() {
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
    public SummaryJobDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SummaryJobDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SummaryJobDetailResponseBody body);

        @Override
        SummaryJobDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SummaryJobDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SummaryJobDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SummaryJobDetailResponse response) {
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
        public Builder body(SummaryJobDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SummaryJobDetailResponse build() {
            return new SummaryJobDetailResponse(this);
        } 

    } 

}
