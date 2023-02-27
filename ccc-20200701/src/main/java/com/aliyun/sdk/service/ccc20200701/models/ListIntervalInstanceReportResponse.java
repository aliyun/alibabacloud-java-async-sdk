// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntervalInstanceReportResponse} extends {@link TeaModel}
 *
 * <p>ListIntervalInstanceReportResponse</p>
 */
public class ListIntervalInstanceReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIntervalInstanceReportResponseBody body;

    private ListIntervalInstanceReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIntervalInstanceReportResponse create() {
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
    public ListIntervalInstanceReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIntervalInstanceReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIntervalInstanceReportResponseBody body);

        @Override
        ListIntervalInstanceReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIntervalInstanceReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIntervalInstanceReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIntervalInstanceReportResponse response) {
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
        public Builder body(ListIntervalInstanceReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIntervalInstanceReportResponse build() {
            return new ListIntervalInstanceReportResponse(this);
        } 

    } 

}
