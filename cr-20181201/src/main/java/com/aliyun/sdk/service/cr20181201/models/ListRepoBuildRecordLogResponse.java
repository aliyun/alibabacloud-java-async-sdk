// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepoBuildRecordLogResponse} extends {@link TeaModel}
 *
 * <p>ListRepoBuildRecordLogResponse</p>
 */
public class ListRepoBuildRecordLogResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListRepoBuildRecordLogResponseBody body;

    private ListRepoBuildRecordLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListRepoBuildRecordLogResponse create() {
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
    public ListRepoBuildRecordLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepoBuildRecordLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListRepoBuildRecordLogResponseBody body);

        @Override
        ListRepoBuildRecordLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepoBuildRecordLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListRepoBuildRecordLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepoBuildRecordLogResponse response) {
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
        public Builder body(ListRepoBuildRecordLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepoBuildRecordLogResponse build() {
            return new ListRepoBuildRecordLogResponse(this);
        } 

    } 

}
