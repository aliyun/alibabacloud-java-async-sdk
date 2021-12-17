// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteCenChildInstanceRouteEntryToCenResponse} extends {@link TeaModel}
 *
 * <p>DeleteCenChildInstanceRouteEntryToCenResponse</p>
 */
public class DeleteCenChildInstanceRouteEntryToCenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCenChildInstanceRouteEntryToCenResponseBody body;


    private DeleteCenChildInstanceRouteEntryToCenResponse(Builder builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCenChildInstanceRouteEntryToCenResponse create() {
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
    public DeleteCenChildInstanceRouteEntryToCenResponseBody getBody() {
        return this.body;
    }

    public static final class Builder extends Response.Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCenChildInstanceRouteEntryToCenResponseBody body; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCenChildInstanceRouteEntryToCenResponse response) {
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
        public Builder body(DeleteCenChildInstanceRouteEntryToCenResponseBody body) {
            this.body = body;
            return this;
        }

        public DeleteCenChildInstanceRouteEntryToCenResponse build() {
            return new DeleteCenChildInstanceRouteEntryToCenResponse(this);
        } 

    } 

}
