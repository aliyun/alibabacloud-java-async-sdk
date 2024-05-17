// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrafficMarkingPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListTrafficMarkingPoliciesResponse</p>
 */
public class ListTrafficMarkingPoliciesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListTrafficMarkingPoliciesResponseBody body;

    private ListTrafficMarkingPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListTrafficMarkingPoliciesResponse create() {
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
    public ListTrafficMarkingPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTrafficMarkingPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListTrafficMarkingPoliciesResponseBody body);

        @Override
        ListTrafficMarkingPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTrafficMarkingPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListTrafficMarkingPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTrafficMarkingPoliciesResponse response) {
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
        public Builder body(ListTrafficMarkingPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTrafficMarkingPoliciesResponse build() {
            return new ListTrafficMarkingPoliciesResponse(this);
        } 

    } 

}
