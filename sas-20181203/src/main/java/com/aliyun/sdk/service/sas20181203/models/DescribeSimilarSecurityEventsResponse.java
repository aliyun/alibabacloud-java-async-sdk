// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSimilarSecurityEventsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSimilarSecurityEventsResponse</p>
 */
public class DescribeSimilarSecurityEventsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSimilarSecurityEventsResponseBody body;

    private DescribeSimilarSecurityEventsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSimilarSecurityEventsResponse create() {
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
    public DescribeSimilarSecurityEventsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSimilarSecurityEventsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSimilarSecurityEventsResponseBody body);

        @Override
        DescribeSimilarSecurityEventsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSimilarSecurityEventsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSimilarSecurityEventsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSimilarSecurityEventsResponse response) {
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
        public Builder body(DescribeSimilarSecurityEventsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSimilarSecurityEventsResponse build() {
            return new DescribeSimilarSecurityEventsResponse(this);
        } 

    } 

}
