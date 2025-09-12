// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link TravelStandardScopeSaveResponse} extends {@link TeaModel}
 *
 * <p>TravelStandardScopeSaveResponse</p>
 */
public class TravelStandardScopeSaveResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private TravelStandardScopeSaveResponseBody body;

    private TravelStandardScopeSaveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static TravelStandardScopeSaveResponse create() {
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
    public TravelStandardScopeSaveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TravelStandardScopeSaveResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(TravelStandardScopeSaveResponseBody body);

        @Override
        TravelStandardScopeSaveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TravelStandardScopeSaveResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private TravelStandardScopeSaveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TravelStandardScopeSaveResponse response) {
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
        public Builder body(TravelStandardScopeSaveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TravelStandardScopeSaveResponse build() {
            return new TravelStandardScopeSaveResponse(this);
        } 

    } 

}
