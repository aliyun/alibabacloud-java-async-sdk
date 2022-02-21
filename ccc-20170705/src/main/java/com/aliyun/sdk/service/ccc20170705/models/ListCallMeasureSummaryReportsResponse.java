// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCallMeasureSummaryReportsResponse} extends {@link TeaModel}
 *
 * <p>ListCallMeasureSummaryReportsResponse</p>
 */
public class ListCallMeasureSummaryReportsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCallMeasureSummaryReportsResponseBody body;

    private ListCallMeasureSummaryReportsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCallMeasureSummaryReportsResponse create() {
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
    public ListCallMeasureSummaryReportsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCallMeasureSummaryReportsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCallMeasureSummaryReportsResponseBody body);

        @Override
        ListCallMeasureSummaryReportsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCallMeasureSummaryReportsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCallMeasureSummaryReportsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCallMeasureSummaryReportsResponse response) {
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
        public Builder body(ListCallMeasureSummaryReportsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCallMeasureSummaryReportsResponse build() {
            return new ListCallMeasureSummaryReportsResponse(this);
        } 

    } 

}
