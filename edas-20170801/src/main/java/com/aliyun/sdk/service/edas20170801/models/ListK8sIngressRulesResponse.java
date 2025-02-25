// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListK8sIngressRulesResponse} extends {@link TeaModel}
 *
 * <p>ListK8sIngressRulesResponse</p>
 */
public class ListK8sIngressRulesResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListK8sIngressRulesResponseBody body;

    private ListK8sIngressRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListK8sIngressRulesResponse create() {
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
    public ListK8sIngressRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListK8sIngressRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListK8sIngressRulesResponseBody body);

        @Override
        ListK8sIngressRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListK8sIngressRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListK8sIngressRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListK8sIngressRulesResponse response) {
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
        public Builder body(ListK8sIngressRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListK8sIngressRulesResponse build() {
            return new ListK8sIngressRulesResponse(this);
        } 

    } 

}
