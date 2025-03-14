// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeSuspEventQuaraFilesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSuspEventQuaraFilesResponse</p>
 */
public class DescribeSuspEventQuaraFilesResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSuspEventQuaraFilesResponseBody body;

    private DescribeSuspEventQuaraFilesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSuspEventQuaraFilesResponse create() {
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
    public DescribeSuspEventQuaraFilesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSuspEventQuaraFilesResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSuspEventQuaraFilesResponseBody body);

        @Override
        DescribeSuspEventQuaraFilesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSuspEventQuaraFilesResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeSuspEventQuaraFilesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSuspEventQuaraFilesResponse response) {
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
        public Builder body(DescribeSuspEventQuaraFilesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSuspEventQuaraFilesResponse build() {
            return new DescribeSuspEventQuaraFilesResponse(this);
        } 

    } 

}
