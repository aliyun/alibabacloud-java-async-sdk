// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssetCleanConfigResponse} extends {@link TeaModel}
 *
 * <p>ListAssetCleanConfigResponse</p>
 */
public class ListAssetCleanConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    private Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    private ListAssetCleanConfigResponseBody body;

    private ListAssetCleanConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAssetCleanConfigResponse create() {
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
    public ListAssetCleanConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAssetCleanConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAssetCleanConfigResponseBody body);

        @Override
        ListAssetCleanConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAssetCleanConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAssetCleanConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAssetCleanConfigResponse response) {
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
        public Builder body(ListAssetCleanConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAssetCleanConfigResponse build() {
            return new ListAssetCleanConfigResponse(this);
        } 

    } 

}
