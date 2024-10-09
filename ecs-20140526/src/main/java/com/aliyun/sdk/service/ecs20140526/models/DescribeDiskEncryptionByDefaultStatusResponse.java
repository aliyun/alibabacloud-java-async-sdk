// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDiskEncryptionByDefaultStatusResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiskEncryptionByDefaultStatusResponse</p>
 */
public class DescribeDiskEncryptionByDefaultStatusResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeDiskEncryptionByDefaultStatusResponseBody body;

    private DescribeDiskEncryptionByDefaultStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeDiskEncryptionByDefaultStatusResponse create() {
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
    public DescribeDiskEncryptionByDefaultStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiskEncryptionByDefaultStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeDiskEncryptionByDefaultStatusResponseBody body);

        @Override
        DescribeDiskEncryptionByDefaultStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiskEncryptionByDefaultStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeDiskEncryptionByDefaultStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiskEncryptionByDefaultStatusResponse response) {
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
        public Builder body(DescribeDiskEncryptionByDefaultStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiskEncryptionByDefaultStatusResponse build() {
            return new DescribeDiskEncryptionByDefaultStatusResponse(this);
        } 

    } 

}
