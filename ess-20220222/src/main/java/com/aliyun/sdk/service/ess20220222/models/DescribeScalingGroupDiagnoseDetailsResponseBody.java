// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeScalingGroupDiagnoseDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupDiagnoseDetailsResponseBody</p>
 */
public class DescribeScalingGroupDiagnoseDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Details")
    private java.util.List<Details> details;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeScalingGroupDiagnoseDetailsResponseBody(Builder builder) {
        this.details = builder.details;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupDiagnoseDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return details
     */
    public java.util.List<Details> getDetails() {
        return this.details;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Details> details; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeScalingGroupDiagnoseDetailsResponseBody model) {
            this.details = model.details;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The diagnostic reports.</p>
         */
        public Builder details(java.util.List<Details> details) {
            this.details = details;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>688B18B8-FB1E-42EB-A1ED-7F55B090****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeScalingGroupDiagnoseDetailsResponseBody build() {
            return new DescribeScalingGroupDiagnoseDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScalingGroupDiagnoseDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDiagnoseDetailsResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DiagnoseType")
        private String diagnoseType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Details(Builder builder) {
            this.diagnoseType = builder.diagnoseType;
            this.errorCode = builder.errorCode;
            this.resourceId = builder.resourceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return diagnoseType
         */
        public String getDiagnoseType() {
            return this.diagnoseType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String diagnoseType; 
            private String errorCode; 
            private String resourceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Details model) {
                this.diagnoseType = model.diagnoseType;
                this.errorCode = model.errorCode;
                this.resourceId = model.resourceId;
                this.status = model.status;
            } 

            /**
             * <p>The type of the diagnostic item. Valid values:</p>
             * <ul>
             * <li>AccountArrearage: Checks whether your Alibaba Cloud account has overdue payments.</li>
             * <li>AccountNotEnoughBalance: Checks whether the balance of your Alibaba Cloud account is sufficient.</li>
             * <li>ElasticStrength: Checks whether the instance types that are specified in the scaling configuration are sufficient.</li>
             * <li>VSwitch: Checks whether the vSwitch is available. If the specified vSwitch is deleted, specify an existing vSwitch for the scaling group.</li>
             * <li>SecurityGroup: Checks whether the security group is available. If the specified security group is deleted, specify an existing security group for the scaling group.</li>
             * <li>KeyPair: Checks whether the key pair is available. If the specified key pair is deleted, specify another key pair for the scaling group.</li>
             * <li>SlbBackendServerQuota: Checks whether the number of ECS instances that are added to the default server group and the vServer groups of the SLB instances associated with the scaling group has reached the upper limit.</li>
             * <li>AlbBackendServerQuota: Checks whether the number of ECS instances that are attached to the ALB instances of the scaling group has reached the upper limit.</li>
             * <li>NlbBackendServerQuota: Checks whether the number of ECS instances that are attached to the NLB instances of the scaling group has reached the upper limit.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SecurityGroup</p>
             */
            public Builder diagnoseType(String diagnoseType) {
                this.diagnoseType = diagnoseType;
                return this;
            }

            /**
             * <p>The error code of the diagnostic item. Valid values:</p>
             * <ul>
             * <li>VSwitchIdNotFound: The vSwitch does not exist.</li>
             * <li>SecurityGroupNotFound: The security group does not exist.</li>
             * <li>KeyPairNotFound: The key pair does not exist.</li>
             * <li>SlbBackendServerQuotaExceeded: The number of ECS instances that are added to the default server group and the vServer groups of the SLB instances associated with the scaling group has reached the upper limit.</li>
             * <li>AlbBackendServerQuotaExceeded: The number of ECS instances that are attached to the ALB instances of the scaling group has reached the upper limit.</li>
             * <li>NlbBackendServerQuotaExceeded: The number of ECS instances that are attached to the NLB instances of the scaling group has reached the upper limit.</li>
             * <li>AccountArrearage: Your account has an overdue payment.</li>
             * <li>AccountNotEnoughBalance: The balance of your Alibaba Cloud account is insufficient.</li>
             * <li>ElasticStrengthAlert: The inventory levels are lower than required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AccountArrearage</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The resource ID corresponding to the diagnostic result.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-280ih****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Status of the diagnostic item. Possible values:</p>
             * <ul>
             * <li><p>Normal: The diagnostic result is normal.</p>
             * </li>
             * <li><p>Warn: The diagnostic result is a warning.</p>
             * </li>
             * <li><p>Critical: The diagnostic result is critical.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
}
