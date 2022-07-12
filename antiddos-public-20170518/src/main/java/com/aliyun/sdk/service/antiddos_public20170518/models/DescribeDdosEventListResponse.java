// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosEventListResponse} extends {@link TeaModel}
 *
 * <p>DescribeDdosEventListResponse</p>
 */
public class DescribeDdosEventListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDdosEventListResponseBody body;

    private DescribeDdosEventListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDdosEventListResponse create() {
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
    public DescribeDdosEventListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDdosEventListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDdosEventListResponseBody body);

        @Override
        DescribeDdosEventListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDdosEventListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDdosEventListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDdosEventListResponse response) {
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
        public Builder body(DescribeDdosEventListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDdosEventListResponse build() {
            return new DescribeDdosEventListResponse(this);
        } 

    } 

}
