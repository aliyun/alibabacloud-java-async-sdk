// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpgradeServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeServiceInstanceResponseBody</p>
 */
public class UpgradeServiceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpgradeRequiredParameters")
    private java.util.List < String > upgradeRequiredParameters;

    private UpgradeServiceInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.status = builder.status;
        this.upgradeRequiredParameters = builder.upgradeRequiredParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeServiceInstanceResponseBody create() {
        return builder().build();
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

    /**
     * @return upgradeRequiredParameters
     */
    public java.util.List < String > getUpgradeRequiredParameters() {
        return this.upgradeRequiredParameters;
    }

    public static final class Builder {
        private String requestId; 
        private String serviceInstanceId; 
        private String status; 
        private java.util.List < String > upgradeRequiredParameters; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F224E002-AB0E-5FD9-A87E-54AEE56F6CAE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-5cbae874da0e47xxxxxx</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The deployment state of the service instance. Valid values:</p>
         * <ul>
         * <li>Created</li>
         * <li>Deploying</li>
         * <li>DeployedFailed</li>
         * <li>Deployed</li>
         * <li>Upgrading</li>
         * <li>Deleting</li>
         * <li>Deleted</li>
         * <li>DeletedFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The parameters required for the upgrade.</p>
         */
        public Builder upgradeRequiredParameters(java.util.List < String > upgradeRequiredParameters) {
            this.upgradeRequiredParameters = upgradeRequiredParameters;
            return this;
        }

        public UpgradeServiceInstanceResponseBody build() {
            return new UpgradeServiceInstanceResponseBody(this);
        } 

    } 

}
