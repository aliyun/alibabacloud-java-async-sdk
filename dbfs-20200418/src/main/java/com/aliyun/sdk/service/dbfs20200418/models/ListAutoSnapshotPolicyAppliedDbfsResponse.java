// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAutoSnapshotPolicyAppliedDbfsResponse} extends {@link TeaModel}
 *
 * <p>ListAutoSnapshotPolicyAppliedDbfsResponse</p>
 */
public class ListAutoSnapshotPolicyAppliedDbfsResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListAutoSnapshotPolicyAppliedDbfsResponseBody body;

    private ListAutoSnapshotPolicyAppliedDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListAutoSnapshotPolicyAppliedDbfsResponse create() {
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
    public ListAutoSnapshotPolicyAppliedDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAutoSnapshotPolicyAppliedDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListAutoSnapshotPolicyAppliedDbfsResponseBody body);

        @Override
        ListAutoSnapshotPolicyAppliedDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAutoSnapshotPolicyAppliedDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListAutoSnapshotPolicyAppliedDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAutoSnapshotPolicyAppliedDbfsResponse response) {
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
        public Builder body(ListAutoSnapshotPolicyAppliedDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAutoSnapshotPolicyAppliedDbfsResponse build() {
            return new ListAutoSnapshotPolicyAppliedDbfsResponse(this);
        } 

    } 

}
