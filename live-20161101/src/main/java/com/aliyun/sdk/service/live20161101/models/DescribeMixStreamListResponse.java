// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMixStreamListResponse} extends {@link TeaModel}
 *
 * <p>DescribeMixStreamListResponse</p>
 */
public class DescribeMixStreamListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMixStreamListResponseBody body;

    private DescribeMixStreamListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMixStreamListResponse create() {
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
    public DescribeMixStreamListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMixStreamListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMixStreamListResponseBody body);

        @Override
        DescribeMixStreamListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMixStreamListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMixStreamListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMixStreamListResponse response) {
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
        public Builder body(DescribeMixStreamListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMixStreamListResponse build() {
            return new DescribeMixStreamListResponse(this);
        } 

    } 

}
