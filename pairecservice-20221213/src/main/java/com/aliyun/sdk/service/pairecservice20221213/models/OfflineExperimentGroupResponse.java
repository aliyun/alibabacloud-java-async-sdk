// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineExperimentGroupResponse} extends {@link TeaModel}
 *
 * <p>OfflineExperimentGroupResponse</p>
 */
public class OfflineExperimentGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private OfflineExperimentGroupResponseBody body;

    private OfflineExperimentGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static OfflineExperimentGroupResponse create() {
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
    public OfflineExperimentGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OfflineExperimentGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(OfflineExperimentGroupResponseBody body);

        @Override
        OfflineExperimentGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OfflineExperimentGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private OfflineExperimentGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OfflineExperimentGroupResponse response) {
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
        public Builder body(OfflineExperimentGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OfflineExperimentGroupResponse build() {
            return new OfflineExperimentGroupResponse(this);
        } 

    } 

}
