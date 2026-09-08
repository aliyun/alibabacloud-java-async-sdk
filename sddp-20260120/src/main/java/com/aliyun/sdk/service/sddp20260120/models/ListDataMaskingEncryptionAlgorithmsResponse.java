// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListDataMaskingEncryptionAlgorithmsResponse} extends {@link TeaModel}
 *
 * <p>ListDataMaskingEncryptionAlgorithmsResponse</p>
 */
public class ListDataMaskingEncryptionAlgorithmsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListDataMaskingEncryptionAlgorithmsResponseBody body;

    private ListDataMaskingEncryptionAlgorithmsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListDataMaskingEncryptionAlgorithmsResponse create() {
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
    public ListDataMaskingEncryptionAlgorithmsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataMaskingEncryptionAlgorithmsResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListDataMaskingEncryptionAlgorithmsResponseBody body);

        @Override
        ListDataMaskingEncryptionAlgorithmsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataMaskingEncryptionAlgorithmsResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListDataMaskingEncryptionAlgorithmsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataMaskingEncryptionAlgorithmsResponse response) {
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
        public Builder body(ListDataMaskingEncryptionAlgorithmsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataMaskingEncryptionAlgorithmsResponse build() {
            return new ListDataMaskingEncryptionAlgorithmsResponse(this);
        } 

    } 

}
