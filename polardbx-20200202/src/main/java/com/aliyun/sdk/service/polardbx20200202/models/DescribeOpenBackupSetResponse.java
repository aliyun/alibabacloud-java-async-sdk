// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link DescribeOpenBackupSetResponse} extends {@link TeaModel}
 *
 * <p>DescribeOpenBackupSetResponse</p>
 */
public class DescribeOpenBackupSetResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeOpenBackupSetResponseBody body;

    private DescribeOpenBackupSetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeOpenBackupSetResponse create() {
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
    public DescribeOpenBackupSetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeOpenBackupSetResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeOpenBackupSetResponseBody body);

        @Override
        DescribeOpenBackupSetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeOpenBackupSetResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeOpenBackupSetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeOpenBackupSetResponse response) {
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
        public Builder body(DescribeOpenBackupSetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeOpenBackupSetResponse build() {
            return new DescribeOpenBackupSetResponse(this);
        } 

    } 

}
