// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemWarningSummaryResponse} extends {@link TeaModel}
 *
 * <p>ListCheckItemWarningSummaryResponse</p>
 */
public class ListCheckItemWarningSummaryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCheckItemWarningSummaryResponseBody body;

    private ListCheckItemWarningSummaryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCheckItemWarningSummaryResponse create() {
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
    public ListCheckItemWarningSummaryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCheckItemWarningSummaryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCheckItemWarningSummaryResponseBody body);

        @Override
        ListCheckItemWarningSummaryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCheckItemWarningSummaryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCheckItemWarningSummaryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCheckItemWarningSummaryResponse response) {
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
        public Builder body(ListCheckItemWarningSummaryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCheckItemWarningSummaryResponse build() {
            return new ListCheckItemWarningSummaryResponse(this);
        } 

    } 

}
