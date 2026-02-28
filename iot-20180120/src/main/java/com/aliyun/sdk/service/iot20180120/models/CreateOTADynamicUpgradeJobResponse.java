// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateOTADynamicUpgradeJobResponse} extends {@link TeaModel}
 *
 * <p>CreateOTADynamicUpgradeJobResponse</p>
 */
public class CreateOTADynamicUpgradeJobResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateOTADynamicUpgradeJobResponseBody body;

    private CreateOTADynamicUpgradeJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateOTADynamicUpgradeJobResponse create() {
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
    public CreateOTADynamicUpgradeJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOTADynamicUpgradeJobResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateOTADynamicUpgradeJobResponseBody body);

        @Override
        CreateOTADynamicUpgradeJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOTADynamicUpgradeJobResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateOTADynamicUpgradeJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOTADynamicUpgradeJobResponse response) {
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
        public Builder body(CreateOTADynamicUpgradeJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOTADynamicUpgradeJobResponse build() {
            return new CreateOTADynamicUpgradeJobResponse(this);
        } 

    } 

}
