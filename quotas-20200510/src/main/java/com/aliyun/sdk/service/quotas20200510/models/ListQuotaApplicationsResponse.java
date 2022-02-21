// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationsResponse} extends {@link TeaModel}
 *
 * <p>ListQuotaApplicationsResponse</p>
 */
public class ListQuotaApplicationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQuotaApplicationsResponseBody body;

    private ListQuotaApplicationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQuotaApplicationsResponse create() {
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
    public ListQuotaApplicationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQuotaApplicationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQuotaApplicationsResponseBody body);

        @Override
        ListQuotaApplicationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQuotaApplicationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQuotaApplicationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQuotaApplicationsResponse response) {
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
        public Builder body(ListQuotaApplicationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQuotaApplicationsResponse build() {
            return new ListQuotaApplicationsResponse(this);
        } 

    } 

}
