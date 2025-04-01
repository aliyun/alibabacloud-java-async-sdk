// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link RollbackServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RollbackServiceInstanceResponseBody</p>
 */
public class RollbackServiceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private RollbackServiceInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackServiceInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private String serviceInstanceId; 
        private String status; 

        private Builder() {
        } 

        private Builder(RollbackServiceInstanceResponseBody model) {
            this.requestId = model.requestId;
            this.serviceInstanceId = model.serviceInstanceId;
            this.status = model.status;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE9EF87D-46F8-5AF6-9A65-6B034E204136</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-5289e1d6d0c14397881d</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The deployment status of the service instance. Possible values:</p>
         * <ul>
         * <li><p>Created: Created</p>
         * </li>
         * <li><p>Deploying: Deploying</p>
         * </li>
         * <li><p>DeployedFailed: Deployment Failed</p>
         * </li>
         * <li><p>Deployed: Deployed</p>
         * </li>
         * <li><p>Upgrading: Upgrading</p>
         * </li>
         * <li><p>UpgradeRollbacking: Rolling Back</p>
         * </li>
         * <li><p>Deleting: Deleting</p>
         * </li>
         * <li><p>Deleted: Deleted</p>
         * </li>
         * <li><p>DeletedFailed: Deletion Failed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UpgradeRollbacking</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public RollbackServiceInstanceResponseBody build() {
            return new RollbackServiceInstanceResponseBody(this);
        } 

    } 

}
