// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartSessionClusterResponseBody} extends {@link TeaModel}
 *
 * <p>StartSessionClusterResponseBody</p>
 */
public class StartSessionClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionClusterId")
    private String sessionClusterId;

    private StartSessionClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sessionClusterId = builder.sessionClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSessionClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionClusterId
     */
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    public static final class Builder {
        private String requestId; 
        private String sessionClusterId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-******</p>
         */
        public Builder sessionClusterId(String sessionClusterId) {
            this.sessionClusterId = sessionClusterId;
            return this;
        }

        public StartSessionClusterResponseBody build() {
            return new StartSessionClusterResponseBody(this);
        } 

    } 

}
