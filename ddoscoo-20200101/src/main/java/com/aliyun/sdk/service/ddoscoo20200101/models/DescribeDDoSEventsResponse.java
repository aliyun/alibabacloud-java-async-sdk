// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDDoSEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeDDoSEventsResponse</p>
 */
public class DescribeDDoSEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDDoSEventsResponseBody body;

    private DescribeDDoSEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDDoSEventsResponse create() {
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
    public DescribeDDoSEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDDoSEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDDoSEventsResponseBody body);

        @Override
        DescribeDDoSEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDDoSEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDDoSEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDDoSEventsResponse response) {
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
        public Builder body(DescribeDDoSEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDDoSEventsResponse build() {
            return new DescribeDDoSEventsResponse(this);
        } 

    } 

}
