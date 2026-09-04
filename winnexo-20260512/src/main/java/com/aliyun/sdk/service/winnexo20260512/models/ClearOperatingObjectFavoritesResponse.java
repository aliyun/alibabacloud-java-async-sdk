// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ClearOperatingObjectFavoritesResponse} extends {@link TeaModel}
 *
 * <p>ClearOperatingObjectFavoritesResponse</p>
 */
public class ClearOperatingObjectFavoritesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ClearOperatingObjectFavoritesResponseBody body;

    private ClearOperatingObjectFavoritesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ClearOperatingObjectFavoritesResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public ClearOperatingObjectFavoritesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ClearOperatingObjectFavoritesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ClearOperatingObjectFavoritesResponseBody body);

        @Override
        ClearOperatingObjectFavoritesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ClearOperatingObjectFavoritesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ClearOperatingObjectFavoritesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ClearOperatingObjectFavoritesResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(ClearOperatingObjectFavoritesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ClearOperatingObjectFavoritesResponse build() {
            return new ClearOperatingObjectFavoritesResponse(this);
        } 

    } 

}
