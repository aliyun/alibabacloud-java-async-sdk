// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataReportForUserResponse} extends {@link TeaModel}
 *
 * <p>ListDataReportForUserResponse</p>
 */
public class ListDataReportForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataReportForUserResponseBody body;

    private ListDataReportForUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataReportForUserResponse create() {
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
    public ListDataReportForUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataReportForUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataReportForUserResponseBody body);

        @Override
        ListDataReportForUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataReportForUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataReportForUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataReportForUserResponse response) {
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
        public Builder body(ListDataReportForUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataReportForUserResponse build() {
            return new ListDataReportForUserResponse(this);
        } 

    } 

}
