// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartReplicaGroupDrillResponse} extends {@link TeaModel}
 *
 * <p>StartReplicaGroupDrillResponse</p>
 */
public class StartReplicaGroupDrillResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private StartReplicaGroupDrillResponseBody body;

    private StartReplicaGroupDrillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static StartReplicaGroupDrillResponse create() {
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
    public StartReplicaGroupDrillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartReplicaGroupDrillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(StartReplicaGroupDrillResponseBody body);

        @Override
        StartReplicaGroupDrillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartReplicaGroupDrillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private StartReplicaGroupDrillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartReplicaGroupDrillResponse response) {
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
        public Builder body(StartReplicaGroupDrillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartReplicaGroupDrillResponse build() {
            return new StartReplicaGroupDrillResponse(this);
        } 

    } 

}
