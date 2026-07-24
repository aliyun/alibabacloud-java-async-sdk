// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link MerchandisePlacementDetectionResponse} extends {@link TeaModel}
 *
 * <p>MerchandisePlacementDetectionResponse</p>
 */
public class MerchandisePlacementDetectionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private MerchandisePlacementDetectionResponseBody body;

    private MerchandisePlacementDetectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static MerchandisePlacementDetectionResponse create() {
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
    public MerchandisePlacementDetectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<MerchandisePlacementDetectionResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(MerchandisePlacementDetectionResponseBody body);

        @Override
        MerchandisePlacementDetectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<MerchandisePlacementDetectionResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private MerchandisePlacementDetectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(MerchandisePlacementDetectionResponse response) {
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
        public Builder body(MerchandisePlacementDetectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public MerchandisePlacementDetectionResponse build() {
            return new MerchandisePlacementDetectionResponse(this);
        } 

    } 

}
