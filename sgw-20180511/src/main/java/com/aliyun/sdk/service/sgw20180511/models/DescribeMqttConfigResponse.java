// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMqttConfigResponse} extends {@link TeaModel}
 *
 * <p>DescribeMqttConfigResponse</p>
 */
public class DescribeMqttConfigResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeMqttConfigResponseBody body;

    private DescribeMqttConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeMqttConfigResponse create() {
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
    public DescribeMqttConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMqttConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeMqttConfigResponseBody body);

        @Override
        DescribeMqttConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMqttConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeMqttConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMqttConfigResponse response) {
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
        public Builder body(DescribeMqttConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMqttConfigResponse build() {
            return new DescribeMqttConfigResponse(this);
        } 

    } 

}
