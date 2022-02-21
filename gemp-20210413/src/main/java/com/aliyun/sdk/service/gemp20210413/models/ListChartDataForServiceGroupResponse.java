// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartDataForServiceGroupResponse} extends {@link TeaModel}
 *
 * <p>ListChartDataForServiceGroupResponse</p>
 */
public class ListChartDataForServiceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListChartDataForServiceGroupResponseBody body;

    private ListChartDataForServiceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListChartDataForServiceGroupResponse create() {
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
    public ListChartDataForServiceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChartDataForServiceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListChartDataForServiceGroupResponseBody body);

        @Override
        ListChartDataForServiceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChartDataForServiceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListChartDataForServiceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChartDataForServiceGroupResponse response) {
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
        public Builder body(ListChartDataForServiceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChartDataForServiceGroupResponse build() {
            return new ListChartDataForServiceGroupResponse(this);
        } 

    } 

}
