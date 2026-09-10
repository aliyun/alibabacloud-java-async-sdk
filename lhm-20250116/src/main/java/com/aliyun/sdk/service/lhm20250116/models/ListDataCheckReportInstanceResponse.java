// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListDataCheckReportInstanceResponse} extends {@link TeaModel}
 *
 * <p>ListDataCheckReportInstanceResponse</p>
 */
public class ListDataCheckReportInstanceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ListDataCheckReportInstanceResponseBody body;

    private ListDataCheckReportInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ListDataCheckReportInstanceResponse create() {
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
    public ListDataCheckReportInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataCheckReportInstanceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListDataCheckReportInstanceResponseBody body);

        @Override
        ListDataCheckReportInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataCheckReportInstanceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private ListDataCheckReportInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataCheckReportInstanceResponse response) {
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
        public Builder body(ListDataCheckReportInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataCheckReportInstanceResponse build() {
            return new ListDataCheckReportInstanceResponse(this);
        } 

    } 

}
