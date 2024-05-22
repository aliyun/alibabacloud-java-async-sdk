// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeAICInstanceImageResponse} extends {@link TeaModel}
 *
 * <p>UpgradeAICInstanceImageResponse</p>
 */
public class UpgradeAICInstanceImageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpgradeAICInstanceImageResponseBody body;

    private UpgradeAICInstanceImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpgradeAICInstanceImageResponse create() {
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
    public UpgradeAICInstanceImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeAICInstanceImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpgradeAICInstanceImageResponseBody body);

        @Override
        UpgradeAICInstanceImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeAICInstanceImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpgradeAICInstanceImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeAICInstanceImageResponse response) {
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
        public Builder body(UpgradeAICInstanceImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeAICInstanceImageResponse build() {
            return new UpgradeAICInstanceImageResponse(this);
        } 

    } 

}
