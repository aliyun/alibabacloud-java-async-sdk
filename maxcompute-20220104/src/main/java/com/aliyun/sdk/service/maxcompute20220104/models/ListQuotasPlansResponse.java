// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotasPlansResponse} extends {@link TeaModel}
 *
 * <p>ListQuotasPlansResponse</p>
 */
public class ListQuotasPlansResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListQuotasPlansResponseBody body;

    private ListQuotasPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListQuotasPlansResponse create() {
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
    public ListQuotasPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQuotasPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListQuotasPlansResponseBody body);

        @Override
        ListQuotasPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQuotasPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListQuotasPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQuotasPlansResponse response) {
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
        public Builder body(ListQuotasPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQuotasPlansResponse build() {
            return new ListQuotasPlansResponse(this);
        } 

    } 

}
