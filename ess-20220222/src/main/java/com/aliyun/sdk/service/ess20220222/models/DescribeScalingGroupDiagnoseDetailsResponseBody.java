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
         * <p>Details of the diagnostic report.</p>
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
             * <p>Item type for diagnostics. Possible values:</p>
             * <ul>
             * <li>AccountArrearage: Checks if the user&quot;s account is in arrears.</li>
             * <li>AccountNotEnoughBalance: Checks the account balance.</li>
             * <li>ElasticStrength: Checks the inventory health of instance types corresponding to the scaling group configuration.</li>
             * <li>VSwitch: Checks if the switch is available, for example, whether it has been deleted.</li>
             * <li>SecurityGroup: Checks if the security group is available, for example, whether it has been deleted.</li>
             * <li>KeyPair: Checks if the key pair is available, for example, whether it has been deleted.</li>
             * <li>SlbBackendServerQuota: Checks if the number of ECS instances mounted to the default SLB group and virtual server group exceeds the quota.</li>
             * <li>AlbBackendServerQuota: Checks if the number of ECS instances mounted to the ALB group exceeds the quota.</li>
             * <li>NlbBackendServerQuota: Checks if the number of ECS instances mounted to the NLB group exceeds the quota.</li>
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
             * <p>Error code of the diagnostic item. Possible values:</p>
             * <ul>
             * <li><p>VSwitchIdNotFound: The VSwitch does not exist.</p>
             * </li>
             * <li><p>SecurityGroupNotFound: The security group does not exist.</p>
             * </li>
             * <li><p>KeyPairNotFound: The key pair does not exist.</p>
             * </li>
             * <li><p>SlbBackendServerQuotaExceeded: The number of ECS instances mounted on the backend of the SLB default group and virtual server group exceeds the quota.</p>
             * </li>
             * <li><p>AlbBackendServerQuotaExceeded: The number of ECS instances mounted on the backend of the ALB group exceeds the quota.</p>
             * </li>
             * <li><p>NlbBackendServerQuotaExceeded: The number of ECS instances mounted on the backend of the NLB group exceeds the quota.</p>
             * </li>
             * <li><p>AccountArrearage: The account is in arrears.</p>
             * </li>
             * <li><p>AccountNotEnoughBalance: The account balance is insufficient.</p>
             * </li>
             * <li><p>ElasticStrengthAlert: The inventory health is poor.</p>
             * </li>
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
