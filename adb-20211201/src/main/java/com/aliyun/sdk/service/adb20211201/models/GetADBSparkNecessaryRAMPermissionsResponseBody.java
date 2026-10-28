// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link GetADBSparkNecessaryRAMPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>GetADBSparkNecessaryRAMPermissionsResponseBody</p>
 */
public class GetADBSparkNecessaryRAMPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetADBSparkNecessaryRAMPermissionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetADBSparkNecessaryRAMPermissionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetADBSparkNecessaryRAMPermissionsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>642F3512-C628-5D0C-8815-F6670C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetADBSparkNecessaryRAMPermissionsResponseBody build() {
            return new GetADBSparkNecessaryRAMPermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetADBSparkNecessaryRAMPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetADBSparkNecessaryRAMPermissionsResponseBody</p>
     */
    public static class DeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("ResourceAuthTargetInfo")
        private String resourceAuthTargetInfo;

        @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
        private String resourceOwnerId;

        private DeniedDetail(Builder builder) {
            this.action = builder.action;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
            this.principalType = builder.principalType;
            this.resourceAuthTargetInfo = builder.resourceAuthTargetInfo;
            this.resourceOwnerId = builder.resourceOwnerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeniedDetail create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return resourceAuthTargetInfo
         */
        public String getResourceAuthTargetInfo() {
            return this.resourceAuthTargetInfo;
        }

        /**
         * @return resourceOwnerId
         */
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public static final class Builder {
            private String action; 
            private String noPermissionType; 
            private String policyType; 
            private String principalType; 
            private String resourceAuthTargetInfo; 
            private String resourceOwnerId; 

            private Builder() {
            } 

            private Builder(DeniedDetail model) {
                this.action = model.action;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
                this.principalType = model.principalType;
                this.resourceAuthTargetInfo = model.resourceAuthTargetInfo;
                this.resourceOwnerId = model.resourceOwnerId;
            } 

            /**
             * <p>The name of the RAM action for which authentication failed.</p>
             * 
             * <strong>example:</strong>
             * <p>ListSparkApps</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The type of denial by the access policy. Valid values:</p>
             * <ul>
             * <li>ImplicitDeny: The resource owner has not configured a relevant access policy for the current user, and operations without authorization are denied by default.</li>
             * <li>ExplicitDeny: The RAM policy configured by the resource owner explicitly denies the current user access to the corresponding resource.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The type of the policy that causes the permission denial. Valid values:</p>
             * <ul>
             * <li>ControlPolicy: The control policy.</li>
             * <li>SessionPolicy: An additional permission policy attached to the temporary token.</li>
             * <li>AssumeRolePolicy: The trust policy of the RAM role.</li>
             * <li>AccountLevelIdentityBasedPolicy: The identity-access policy at the account level, including custom policies and system policies.</li>
             * <li>ResourceGroupLevelIdentityBasedPolicy: The identity-access policy at the resource group level, including custom policies and system policies.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ControlPolicy</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The identity type of the current user. Valid values:</p>
             * <ul>
             * <li>SubUser: Resource Access Management (RAM) user.</li>
             * <li>AssumedRoleUser: RAM role.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SubUser</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>The information about the authentication object, which can be the ID of the Resource Access Management (RAM) users of the current user or the role information of the current accessor.</p>
             * 
             * <strong>example:</strong>
             * <p>223345695632****</p>
             */
            public Builder resourceAuthTargetInfo(String resourceAuthTargetInfo) {
                this.resourceAuthTargetInfo = resourceAuthTargetInfo;
                return this;
            }

            /**
             * <p>The ID of the resource owner.</p>
             * 
             * <strong>example:</strong>
             * <p>11685695632****</p>
             */
            public Builder resourceOwnerId(String resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            public DeniedDetail build() {
                return new DeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetADBSparkNecessaryRAMPermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>GetADBSparkNecessaryRAMPermissionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeniedDetail")
        private DeniedDetail deniedDetail;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private Boolean passed;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Data(Builder builder) {
            this.deniedDetail = builder.deniedDetail;
            this.passed = builder.passed;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deniedDetail
         */
        public DeniedDetail getDeniedDetail() {
            return this.deniedDetail;
        }

        /**
         * @return passed
         */
        public Boolean getPassed() {
            return this.passed;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private DeniedDetail deniedDetail; 
            private Boolean passed; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deniedDetail = model.deniedDetail;
                this.passed = model.passed;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The diagnostic information about the permission check failure. This parameter is returned when the permission check fails.</p>
             */
            public Builder deniedDetail(DeniedDetail deniedDetail) {
                this.deniedDetail = deniedDetail;
                return this;
            }

            /**
             * <p>Indicates whether the user has the basic permissions required to use ADB Spark. Valid values:</p>
             * <ul>
             * <li>true: The check passed, and the user has the basic permissions.</li>
             * <li>false: The check failed, and the user lacks some permissions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder passed(Boolean passed) {
                this.passed = passed;
                return this;
            }

            /**
             * <p>The recommended configurations in the RAM system based on the diagnostic information.</p>
             * 
             * <strong>example:</strong>
             * <p>Grant the system RAM policy \&quot;AliyunADBDeveloperAccess\&quot; to current RAM user can quickly solve this issue.</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
