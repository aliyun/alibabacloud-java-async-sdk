// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSaslUsersResponse} extends {@link TeaModel}
 *
 * <p>DescribeSaslUsersResponse</p>
 */
public class DescribeSaslUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSaslUsersResponseBody body;

    private DescribeSaslUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSaslUsersResponse create() {
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
    public DescribeSaslUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSaslUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSaslUsersResponseBody body);

        @Override
        DescribeSaslUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSaslUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSaslUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSaslUsersResponse response) {
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
        public Builder body(DescribeSaslUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSaslUsersResponse build() {
            return new DescribeSaslUsersResponse(this);
        } 

    } 

}
