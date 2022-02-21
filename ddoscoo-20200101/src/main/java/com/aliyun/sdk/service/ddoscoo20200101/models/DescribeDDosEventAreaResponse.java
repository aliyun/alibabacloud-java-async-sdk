// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventAreaResponse} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventAreaResponse</p>
 */
public class DescribeDDosEventAreaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDDosEventAreaResponseBody body;

    private DescribeDDosEventAreaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDDosEventAreaResponse create() {
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
    public DescribeDDosEventAreaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDDosEventAreaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDDosEventAreaResponseBody body);

        @Override
        DescribeDDosEventAreaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDDosEventAreaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDDosEventAreaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDDosEventAreaResponse response) {
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
        public Builder body(DescribeDDosEventAreaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDDosEventAreaResponse build() {
            return new DescribeDDosEventAreaResponse(this);
        } 

    } 

}
