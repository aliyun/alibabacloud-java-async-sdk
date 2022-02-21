// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPhoneNoAByTrackNoResponse} extends {@link TeaModel}
 *
 * <p>QueryPhoneNoAByTrackNoResponse</p>
 */
public class QueryPhoneNoAByTrackNoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPhoneNoAByTrackNoResponseBody body;

    private QueryPhoneNoAByTrackNoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPhoneNoAByTrackNoResponse create() {
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
    public QueryPhoneNoAByTrackNoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPhoneNoAByTrackNoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPhoneNoAByTrackNoResponseBody body);

        @Override
        QueryPhoneNoAByTrackNoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPhoneNoAByTrackNoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPhoneNoAByTrackNoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPhoneNoAByTrackNoResponse response) {
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
        public Builder body(QueryPhoneNoAByTrackNoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPhoneNoAByTrackNoResponse build() {
            return new QueryPhoneNoAByTrackNoResponse(this);
        } 

    } 

}
