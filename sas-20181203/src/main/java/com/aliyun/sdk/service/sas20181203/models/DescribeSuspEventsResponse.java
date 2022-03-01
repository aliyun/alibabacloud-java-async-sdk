// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventsResponse</p>
 */
public class DescribeSuspEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSuspEventsResponseBody body;

    private DescribeSuspEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSuspEventsResponse create() {
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
    public DescribeSuspEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSuspEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSuspEventsResponseBody body);

        @Override
        DescribeSuspEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSuspEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSuspEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSuspEventsResponse response) {
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
        public Builder body(DescribeSuspEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSuspEventsResponse build() {
            return new DescribeSuspEventsResponse(this);
        } 

    } 

}
