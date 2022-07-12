// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosCountResponse} extends {@link TeaModel}
 *
 * <p>DescribeDdosCountResponse</p>
 */
public class DescribeDdosCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDdosCountResponseBody body;

    private DescribeDdosCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDdosCountResponse create() {
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
    public DescribeDdosCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDdosCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDdosCountResponseBody body);

        @Override
        DescribeDdosCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDdosCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDdosCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDdosCountResponse response) {
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
        public Builder body(DescribeDdosCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDdosCountResponse build() {
            return new DescribeDdosCountResponse(this);
        } 

    } 

}
