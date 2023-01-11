// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPhoneBusinessProfileResponse} extends {@link TeaModel}
 *
 * <p>QueryPhoneBusinessProfileResponse</p>
 */
public class QueryPhoneBusinessProfileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPhoneBusinessProfileResponseBody body;

    private QueryPhoneBusinessProfileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPhoneBusinessProfileResponse create() {
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
    public QueryPhoneBusinessProfileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPhoneBusinessProfileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPhoneBusinessProfileResponseBody body);

        @Override
        QueryPhoneBusinessProfileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPhoneBusinessProfileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPhoneBusinessProfileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPhoneBusinessProfileResponse response) {
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
        public Builder body(QueryPhoneBusinessProfileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPhoneBusinessProfileResponse build() {
            return new QueryPhoneBusinessProfileResponse(this);
        } 

    } 

}
