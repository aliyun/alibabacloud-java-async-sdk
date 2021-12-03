// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListReservedCapacitiesResponse} extends {@link TeaModel}
 *
 * <p>ListReservedCapacitiesResponse</p>
 */
public class ListReservedCapacitiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListReservedCapacitiesResponseBody body;


    private ListReservedCapacitiesResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReservedCapacitiesResponse create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public ListReservedCapacitiesResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private ListReservedCapacitiesResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(ListReservedCapacitiesResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * <p>headers.</p>
         */
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>body.</p>
         */
        public Builder body(ListReservedCapacitiesResponseBody body) {
            this.body = body;
            return this;
        }

        public ListReservedCapacitiesResponse build() {
            return new ListReservedCapacitiesResponse(this);
        } 

    } 

}
