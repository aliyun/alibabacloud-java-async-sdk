// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDdosThresholdResponse} extends {@link TeaModel}
 *
 * <p>DescribeDdosThresholdResponse</p>
 */
public class DescribeDdosThresholdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDdosThresholdResponseBody body;

    private DescribeDdosThresholdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDdosThresholdResponse create() {
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
    public DescribeDdosThresholdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDdosThresholdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDdosThresholdResponseBody body);

        @Override
        DescribeDdosThresholdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDdosThresholdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDdosThresholdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDdosThresholdResponse response) {
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
        public Builder body(DescribeDdosThresholdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDdosThresholdResponse build() {
            return new DescribeDdosThresholdResponse(this);
        } 

    } 

}
