// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpgradeRequiredParameters.
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
