// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJMeterReportsResponse} extends {@link TeaModel}
 *
 * <p>ListJMeterReportsResponse</p>
 */
public class ListJMeterReportsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJMeterReportsResponseBody body;

    private ListJMeterReportsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJMeterReportsResponse create() {
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
    public ListJMeterReportsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJMeterReportsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJMeterReportsResponseBody body);

        @Override
        ListJMeterReportsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJMeterReportsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJMeterReportsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJMeterReportsResponse response) {
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
        public Builder body(ListJMeterReportsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJMeterReportsResponse build() {
            return new ListJMeterReportsResponse(this);
        } 

    } 

}
