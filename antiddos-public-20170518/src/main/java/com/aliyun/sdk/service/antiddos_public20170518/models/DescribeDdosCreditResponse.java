// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosCreditResponse} extends {@link TeaModel}
 *
 * <p>DescribeDdosCreditResponse</p>
 */
public class DescribeDdosCreditResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDdosCreditResponseBody body;

    private DescribeDdosCreditResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDdosCreditResponse create() {
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
    public DescribeDdosCreditResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDdosCreditResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDdosCreditResponseBody body);

        @Override
        DescribeDdosCreditResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDdosCreditResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDdosCreditResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDdosCreditResponse response) {
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
        public Builder body(DescribeDdosCreditResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDdosCreditResponse build() {
            return new DescribeDdosCreditResponse(this);
        } 

    } 

}
