// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSyncEcsHostTaskResponse} extends {@link TeaModel}
 *
 * <p>DescribeSyncEcsHostTaskResponse</p>
 */
public class DescribeSyncEcsHostTaskResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeSyncEcsHostTaskResponseBody body;

    private DescribeSyncEcsHostTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeSyncEcsHostTaskResponse create() {
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
    public DescribeSyncEcsHostTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSyncEcsHostTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeSyncEcsHostTaskResponseBody body);

        @Override
        DescribeSyncEcsHostTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSyncEcsHostTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeSyncEcsHostTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSyncEcsHostTaskResponse response) {
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
        public Builder body(DescribeSyncEcsHostTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSyncEcsHostTaskResponse build() {
            return new DescribeSyncEcsHostTaskResponse(this);
        } 

    } 

}
