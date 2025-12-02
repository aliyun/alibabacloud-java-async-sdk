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
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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
             * <p>The name of the RAM action that failed the authentication.</p>
             * 
             * <strong>example:</strong>
             * <p>ListSparkApps</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The type of the policy denial. Valid values:</p>
             * <ul>
             * <li>ImplicitDeny: Resource owner has not configured relevant permission policies for the current user, default denial of unauthorized operations.</li>
             * <li>ExplicitDeny: RAM policies configured by the resource owner explicitly deny the current user access to corresponding resources</li>
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
             * <p>The type of the policy that causes the access denied error.</p>
             * <ul>
             * <li>ControlPolicy: control policy</li>
             * <li>SessionPolicy: Temporary Token additional permission policy</li>
             * <li>AssumeRolePolicy: RAM role trust policy</li>
             * <li>AccountLevelIdentityBasedPolicy: Principal policy within account authorization scope, including custom policies and system policies</li>
             * <li>ResourceGroupLevelIdentityBasedPolicy: Principal policy within resource group authorization scope, including custom policies and system policies.</li>
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
             * <li>SubUser: a RAM user</li>
             * <li>AssumedRoleUser: a RAM role</li>
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
             * <p>Authentication object information, can be the current user&quot;s RAM account ID, or the role information corresponding to the current visitor.</p>
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
             * <p>When permission check fails, returns diagnostic information related to permission check failure.</p>
             */
            public Builder deniedDetail(DeniedDetail deniedDetail) {
                this.deniedDetail = deniedDetail;
                return this;
            }

            /**
             * <p>Check whether the use has the basic permissions to use Analytic DB for Spark.</p>
             * <ul>
             * <li>true: The check is passed and the basic permissions are granted.</li>
             * <li>false: The check fails and some permissions are missing.</li>
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
             * <p>Based on diagnostic information, recommends configurations for customers to perform in the RAM system.</p>
             * 
             * <strong>example:</strong>
             * <p>Grant the system RAM policy &quot;AliyunADBDeveloperAccess&quot; to current RAM user can quickly solve this issue.</p>
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
