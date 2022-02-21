// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshClusterResourcePoolResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshClusterResourcePoolResponseBody</p>
 */
public class RefreshClusterResourcePoolResponseBody extends TeaModel {
    @NameInMap("OperationId")
    private String operationId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WorkFlowInstanceId")
    private String workFlowInstanceId;

    private RefreshClusterResourcePoolResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
        this.workFlowInstanceId = builder.workFlowInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshClusterResourcePoolResponseBody create() {
        return builder().build();
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

    /**
     * @return workFlowInstanceId
     */
    public String getWorkFlowInstanceId() {
        return this.workFlowInstanceId;
    }

    public static final class Builder {
        private String operationId; 
        private String requestId; 
        private String workFlowInstanceId; 

        /**
         * OperationId.
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkFlowInstanceId.
         */
        public Builder workFlowInstanceId(String workFlowInstanceId) {
            this.workFlowInstanceId = workFlowInstanceId;
            return this;
        }

        public RefreshClusterResourcePoolResponseBody build() {
            return new RefreshClusterResourcePoolResponseBody(this);
        } 

    } 

}
