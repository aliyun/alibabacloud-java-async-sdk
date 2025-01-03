// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeDiskReplicaPairProgressResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskReplicaPairProgressResponse</p>
 */
public class DescribeDiskReplicaPairProgressResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeDiskReplicaPairProgressResponseBody body;

    private DescribeDiskReplicaPairProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeDiskReplicaPairProgressResponse create() {
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
    public DescribeDiskReplicaPairProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskReplicaPairProgressResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeDiskReplicaPairProgressResponseBody body);

        @Override
        DescribeDiskReplicaPairProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskReplicaPairProgressResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeDiskReplicaPairProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskReplicaPairProgressResponse response) {
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
        public Builder body(DescribeDiskReplicaPairProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskReplicaPairProgressResponse build() {
            return new DescribeDiskReplicaPairProgressResponse(this);
        } 

    } 

}
