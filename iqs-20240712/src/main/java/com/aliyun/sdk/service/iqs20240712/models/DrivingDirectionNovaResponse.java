// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20240712.models;

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
 * {@link DrivingDirectionNovaResponse} extends {@link TeaModel}
 *
 * <p>DrivingDirectionNovaResponse</p>
 */
public class DrivingDirectionNovaResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DrivingDirectionNovaResponseBody body;

    private DrivingDirectionNovaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DrivingDirectionNovaResponse create() {
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
    public DrivingDirectionNovaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DrivingDirectionNovaResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DrivingDirectionNovaResponseBody body);

        @Override
        DrivingDirectionNovaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DrivingDirectionNovaResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DrivingDirectionNovaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DrivingDirectionNovaResponse response) {
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
        public Builder body(DrivingDirectionNovaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DrivingDirectionNovaResponse build() {
            return new DrivingDirectionNovaResponse(this);
        } 

    } 

}
