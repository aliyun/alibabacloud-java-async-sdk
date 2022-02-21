// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBoardEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeBoardEventsResponse</p>
 */
public class DescribeBoardEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBoardEventsResponseBody body;

    private DescribeBoardEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBoardEventsResponse create() {
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
    public DescribeBoardEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBoardEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBoardEventsResponseBody body);

        @Override
        DescribeBoardEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBoardEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBoardEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBoardEventsResponse response) {
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
        public Builder body(DescribeBoardEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBoardEventsResponse build() {
            return new DescribeBoardEventsResponse(this);
        } 

    } 

}
