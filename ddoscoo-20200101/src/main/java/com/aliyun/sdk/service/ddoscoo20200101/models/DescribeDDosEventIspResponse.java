// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventIspResponse} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventIspResponse</p>
 */
public class DescribeDDosEventIspResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDDosEventIspResponseBody body;

    private DescribeDDosEventIspResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDDosEventIspResponse create() {
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
    public DescribeDDosEventIspResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDDosEventIspResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDDosEventIspResponseBody body);

        @Override
        DescribeDDosEventIspResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDDosEventIspResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDDosEventIspResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDDosEventIspResponse response) {
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
        public Builder body(DescribeDDosEventIspResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDDosEventIspResponse build() {
            return new DescribeDDosEventIspResponse(this);
        } 

    } 

}
