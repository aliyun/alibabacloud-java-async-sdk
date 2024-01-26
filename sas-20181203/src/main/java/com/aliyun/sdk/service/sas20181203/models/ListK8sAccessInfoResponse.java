// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListK8sAccessInfoResponse} extends {@link TeaModel}
 *
 * <p>ListK8sAccessInfoResponse</p>
 */
public class ListK8sAccessInfoResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListK8sAccessInfoResponseBody body;

    private ListK8sAccessInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListK8sAccessInfoResponse create() {
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
    public ListK8sAccessInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListK8sAccessInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListK8sAccessInfoResponseBody body);

        @Override
        ListK8sAccessInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListK8sAccessInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListK8sAccessInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListK8sAccessInfoResponse response) {
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
        public Builder body(ListK8sAccessInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListK8sAccessInfoResponse build() {
            return new ListK8sAccessInfoResponse(this);
        } 

    } 

}
