// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePodLogResponse} extends {@link TeaModel}
 *
 * <p>DescribePodLogResponse</p>
 */
public class DescribePodLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePodLogResponseBody body;

    private DescribePodLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePodLogResponse create() {
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
    public DescribePodLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePodLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePodLogResponseBody body);

        @Override
        DescribePodLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePodLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePodLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePodLogResponse response) {
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
        public Builder body(DescribePodLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePodLogResponse build() {
            return new DescribePodLogResponse(this);
        } 

    } 

}
