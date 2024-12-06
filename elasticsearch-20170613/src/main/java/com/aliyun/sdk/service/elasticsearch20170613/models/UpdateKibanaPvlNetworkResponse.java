// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateKibanaPvlNetworkResponse} extends {@link TeaModel}
 *
 * <p>UpdateKibanaPvlNetworkResponse</p>
 */
public class UpdateKibanaPvlNetworkResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateKibanaPvlNetworkResponseBody body;

    private UpdateKibanaPvlNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static UpdateKibanaPvlNetworkResponse create() {
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
    public UpdateKibanaPvlNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateKibanaPvlNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(UpdateKibanaPvlNetworkResponseBody body);

        @Override
        UpdateKibanaPvlNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateKibanaPvlNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private UpdateKibanaPvlNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateKibanaPvlNetworkResponse response) {
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
        public Builder body(UpdateKibanaPvlNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateKibanaPvlNetworkResponse build() {
            return new UpdateKibanaPvlNetworkResponse(this);
        } 

    } 

}
