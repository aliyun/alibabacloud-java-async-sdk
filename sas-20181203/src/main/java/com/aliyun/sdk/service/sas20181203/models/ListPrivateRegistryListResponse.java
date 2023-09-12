// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateRegistryListResponse} extends {@link TeaModel}
 *
 * <p>ListPrivateRegistryListResponse</p>
 */
public class ListPrivateRegistryListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrivateRegistryListResponseBody body;

    private ListPrivateRegistryListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListPrivateRegistryListResponse create() {
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
    public ListPrivateRegistryListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrivateRegistryListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListPrivateRegistryListResponseBody body);

        @Override
        ListPrivateRegistryListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrivateRegistryListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListPrivateRegistryListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrivateRegistryListResponse response) {
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
        public Builder body(ListPrivateRegistryListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrivateRegistryListResponse build() {
            return new ListPrivateRegistryListResponse(this);
        } 

    } 

}
