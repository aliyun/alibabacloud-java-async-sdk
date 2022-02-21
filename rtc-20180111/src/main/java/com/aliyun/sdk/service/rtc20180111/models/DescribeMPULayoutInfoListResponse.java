// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPULayoutInfoListResponse} extends {@link TeaModel}
 *
 * <p>DescribeMPULayoutInfoListResponse</p>
 */
public class DescribeMPULayoutInfoListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMPULayoutInfoListResponseBody body;

    private DescribeMPULayoutInfoListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMPULayoutInfoListResponse create() {
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
    public DescribeMPULayoutInfoListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMPULayoutInfoListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMPULayoutInfoListResponseBody body);

        @Override
        DescribeMPULayoutInfoListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMPULayoutInfoListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMPULayoutInfoListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMPULayoutInfoListResponse response) {
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
        public Builder body(DescribeMPULayoutInfoListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMPULayoutInfoListResponse build() {
            return new DescribeMPULayoutInfoListResponse(this);
        } 

    } 

}
