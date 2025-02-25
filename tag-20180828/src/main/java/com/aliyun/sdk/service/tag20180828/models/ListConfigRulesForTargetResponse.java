// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListConfigRulesForTargetResponse} extends {@link TeaModel}
 *
 * <p>ListConfigRulesForTargetResponse</p>
 */
public class ListConfigRulesForTargetResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListConfigRulesForTargetResponseBody body;

    private ListConfigRulesForTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListConfigRulesForTargetResponse create() {
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
    public ListConfigRulesForTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListConfigRulesForTargetResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListConfigRulesForTargetResponseBody body);

        @Override
        ListConfigRulesForTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListConfigRulesForTargetResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListConfigRulesForTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListConfigRulesForTargetResponse response) {
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
        public Builder body(ListConfigRulesForTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListConfigRulesForTargetResponse build() {
            return new ListConfigRulesForTargetResponse(this);
        } 

    } 

}
