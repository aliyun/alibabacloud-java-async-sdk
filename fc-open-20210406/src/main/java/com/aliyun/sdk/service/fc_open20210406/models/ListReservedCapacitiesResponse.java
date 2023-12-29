// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListReservedCapacitiesResponse} extends {@link TeaModel}
 *
 * <p>ListReservedCapacitiesResponse</p>
 */
public class ListReservedCapacitiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListReservedCapacitiesResponseBody body;

    private ListReservedCapacitiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListReservedCapacitiesResponse create() {
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
    public ListReservedCapacitiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListReservedCapacitiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListReservedCapacitiesResponseBody body);

        @Override
        ListReservedCapacitiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListReservedCapacitiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListReservedCapacitiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListReservedCapacitiesResponse response) {
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
        public Builder body(ListReservedCapacitiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListReservedCapacitiesResponse build() {
            return new ListReservedCapacitiesResponse(this);
        } 

    } 

}
