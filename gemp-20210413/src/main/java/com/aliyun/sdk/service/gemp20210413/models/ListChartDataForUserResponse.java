// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartDataForUserResponse} extends {@link TeaModel}
 *
 * <p>ListChartDataForUserResponse</p>
 */
public class ListChartDataForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListChartDataForUserResponseBody body;

    private ListChartDataForUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListChartDataForUserResponse create() {
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
    public ListChartDataForUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListChartDataForUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListChartDataForUserResponseBody body);

        @Override
        ListChartDataForUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListChartDataForUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListChartDataForUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListChartDataForUserResponse response) {
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
        public Builder body(ListChartDataForUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListChartDataForUserResponse build() {
            return new ListChartDataForUserResponse(this);
        } 

    } 

}
