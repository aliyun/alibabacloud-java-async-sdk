// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataReportForServiceGroupResponse} extends {@link TeaModel}
 *
 * <p>ListDataReportForServiceGroupResponse</p>
 */
public class ListDataReportForServiceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataReportForServiceGroupResponseBody body;

    private ListDataReportForServiceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataReportForServiceGroupResponse create() {
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
    public ListDataReportForServiceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataReportForServiceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataReportForServiceGroupResponseBody body);

        @Override
        ListDataReportForServiceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataReportForServiceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataReportForServiceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataReportForServiceGroupResponse response) {
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
        public Builder body(ListDataReportForServiceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataReportForServiceGroupResponse build() {
            return new ListDataReportForServiceGroupResponse(this);
        } 

    } 

}
