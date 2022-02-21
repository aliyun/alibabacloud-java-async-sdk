// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDosEventMaxResponse} extends {@link TeaModel}
 *
 * <p>DescribeDDosEventMaxResponse</p>
 */
public class DescribeDDosEventMaxResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDDosEventMaxResponseBody body;

    private DescribeDDosEventMaxResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDDosEventMaxResponse create() {
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
    public DescribeDDosEventMaxResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDDosEventMaxResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDDosEventMaxResponseBody body);

        @Override
        DescribeDDosEventMaxResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDDosEventMaxResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDDosEventMaxResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDDosEventMaxResponse response) {
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
        public Builder body(DescribeDDosEventMaxResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDDosEventMaxResponse build() {
            return new DescribeDDosEventMaxResponse(this);
        } 

    } 

}
