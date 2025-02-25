// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForModifyingDSRecordResponse} extends {@link TeaModel}
 *
 * <p>SaveSingleTaskForModifyingDSRecordResponse</p>
 */
public class SaveSingleTaskForModifyingDSRecordResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private SaveSingleTaskForModifyingDSRecordResponseBody body;

    private SaveSingleTaskForModifyingDSRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveSingleTaskForModifyingDSRecordResponse create() {
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
    public SaveSingleTaskForModifyingDSRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveSingleTaskForModifyingDSRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveSingleTaskForModifyingDSRecordResponseBody body);

        @Override
        SaveSingleTaskForModifyingDSRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveSingleTaskForModifyingDSRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SaveSingleTaskForModifyingDSRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveSingleTaskForModifyingDSRecordResponse response) {
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
        public Builder body(SaveSingleTaskForModifyingDSRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveSingleTaskForModifyingDSRecordResponse build() {
            return new SaveSingleTaskForModifyingDSRecordResponse(this);
        } 

    } 

}
