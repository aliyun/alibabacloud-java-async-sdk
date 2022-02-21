// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaAlarmsResponse} extends {@link TeaModel}
 *
 * <p>ListQuotaAlarmsResponse</p>
 */
public class ListQuotaAlarmsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQuotaAlarmsResponseBody body;

    private ListQuotaAlarmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQuotaAlarmsResponse create() {
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
    public ListQuotaAlarmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQuotaAlarmsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQuotaAlarmsResponseBody body);

        @Override
        ListQuotaAlarmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQuotaAlarmsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQuotaAlarmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQuotaAlarmsResponse response) {
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
        public Builder body(ListQuotaAlarmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQuotaAlarmsResponse build() {
            return new ListQuotaAlarmsResponse(this);
        } 

    } 

}
