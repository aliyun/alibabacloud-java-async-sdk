// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePodEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribePodEventsResponse</p>
 */
public class DescribePodEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribePodEventsResponseBody body;

    private DescribePodEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribePodEventsResponse create() {
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
    public DescribePodEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribePodEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribePodEventsResponseBody body);

        @Override
        DescribePodEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribePodEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribePodEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribePodEventsResponse response) {
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
        public Builder body(DescribePodEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribePodEventsResponse build() {
            return new DescribePodEventsResponse(this);
        } 

    } 

}
