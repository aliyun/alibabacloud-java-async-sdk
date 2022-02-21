// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDtsEtlJobVersionInfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeDtsEtlJobVersionInfoResponse</p>
 */
public class DescribeDtsEtlJobVersionInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDtsEtlJobVersionInfoResponseBody body;

    private DescribeDtsEtlJobVersionInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDtsEtlJobVersionInfoResponse create() {
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
    public DescribeDtsEtlJobVersionInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDtsEtlJobVersionInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDtsEtlJobVersionInfoResponseBody body);

        @Override
        DescribeDtsEtlJobVersionInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDtsEtlJobVersionInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDtsEtlJobVersionInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDtsEtlJobVersionInfoResponse response) {
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
        public Builder body(DescribeDtsEtlJobVersionInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDtsEtlJobVersionInfoResponse build() {
            return new DescribeDtsEtlJobVersionInfoResponse(this);
        } 

    } 

}
