// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScheduleKeyDeletionResponse} extends {@link TeaModel}
 *
 * <p>ScheduleKeyDeletionResponse</p>
 */
public class ScheduleKeyDeletionResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ScheduleKeyDeletionResponseBody body;

    private ScheduleKeyDeletionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ScheduleKeyDeletionResponse create() {
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
    public ScheduleKeyDeletionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScheduleKeyDeletionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ScheduleKeyDeletionResponseBody body);

        @Override
        ScheduleKeyDeletionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScheduleKeyDeletionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ScheduleKeyDeletionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScheduleKeyDeletionResponse response) {
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
        public Builder body(ScheduleKeyDeletionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScheduleKeyDeletionResponse build() {
            return new ScheduleKeyDeletionResponse(this);
        } 

    } 

}
