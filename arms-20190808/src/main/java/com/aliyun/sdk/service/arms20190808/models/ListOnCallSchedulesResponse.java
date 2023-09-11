// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOnCallSchedulesResponse} extends {@link TeaModel}
 *
 * <p>ListOnCallSchedulesResponse</p>
 */
public class ListOnCallSchedulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListOnCallSchedulesResponseBody body;

    private ListOnCallSchedulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListOnCallSchedulesResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ListOnCallSchedulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOnCallSchedulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListOnCallSchedulesResponseBody body);

        @Override
        ListOnCallSchedulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOnCallSchedulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListOnCallSchedulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOnCallSchedulesResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ListOnCallSchedulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOnCallSchedulesResponse build() {
            return new ListOnCallSchedulesResponse(this);
        } 

    } 

}
