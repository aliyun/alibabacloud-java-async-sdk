// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAnalyticsDataResponse} extends {@link TeaModel}
 *
 * <p>ListAnalyticsDataResponse</p>
 */
public class ListAnalyticsDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAnalyticsDataResponseBody body;

    private ListAnalyticsDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAnalyticsDataResponse create() {
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
    public ListAnalyticsDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAnalyticsDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAnalyticsDataResponseBody body);

        @Override
        ListAnalyticsDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAnalyticsDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAnalyticsDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAnalyticsDataResponse response) {
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
        public Builder body(ListAnalyticsDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAnalyticsDataResponse build() {
            return new ListAnalyticsDataResponse(this);
        } 

    } 

}
