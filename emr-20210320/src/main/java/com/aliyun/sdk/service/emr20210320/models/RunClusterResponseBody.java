// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunClusterResponseBody} extends {@link TeaModel}
 *
 * <p>RunClusterResponseBody</p>
 */
public class RunClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunClusterResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String operationId; 
        private String requestId; 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac7f7***</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The operation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>op-13c37a77c505****</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

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

        public RunClusterResponseBody build() {
            return new RunClusterResponseBody(this);
        } 

    } 

}
