// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTreePhysicalSpacesResponse} extends {@link TeaModel}
 *
 * <p>ListTreePhysicalSpacesResponse</p>
 */
public class ListTreePhysicalSpacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListTreePhysicalSpacesResponseBody body;

    private ListTreePhysicalSpacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTreePhysicalSpacesResponse create() {
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
    public ListTreePhysicalSpacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTreePhysicalSpacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTreePhysicalSpacesResponseBody body);

        @Override
        ListTreePhysicalSpacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTreePhysicalSpacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListTreePhysicalSpacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTreePhysicalSpacesResponse response) {
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
        public Builder body(ListTreePhysicalSpacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTreePhysicalSpacesResponse build() {
            return new ListTreePhysicalSpacesResponse(this);
        } 

    } 

}
