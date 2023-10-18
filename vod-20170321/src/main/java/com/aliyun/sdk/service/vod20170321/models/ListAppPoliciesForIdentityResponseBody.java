// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppPoliciesForIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppPoliciesForIdentityResponseBody</p>
 */
public class ListAppPoliciesForIdentityResponseBody extends TeaModel {
    @NameInMap("AppPolicyList")
    private java.util.List < AppPolicyList> appPolicyList;

    @NameInMap("RequestId")
    private String requestId;

    private ListAppPoliciesForIdentityResponseBody(Builder builder) {
        this.appPolicyList = builder.appPolicyList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppPoliciesForIdentityResponseBody create() {
        return builder().build();
    }

    /**
     * @return appPolicyList
     */
    public java.util.List < AppPolicyList> getAppPolicyList() {
        return this.appPolicyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AppPolicyList> appPolicyList; 
        private String requestId; 

        /**
         * The details of each policy.
         * <p>
         * 
         * > A maximum of 100 entries can be returned.
         */
        public Builder appPolicyList(java.util.List < AppPolicyList> appPolicyList) {
            this.appPolicyList = appPolicyList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAppPoliciesForIdentityResponseBody build() {
            return new ListAppPoliciesForIdentityResponseBody(this);
        } 

    } 

    public static class AppPolicyList extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyType")
        private String policyType;

        @NameInMap("PolicyValue")
        private String policyValue;

        private AppPolicyList(Builder builder) {
            this.appId = builder.appId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.modificationTime = builder.modificationTime;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.policyValue = builder.policyValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppPolicyList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return policyValue
         */
        public String getPolicyValue() {
            return this.policyValue;
        }

        public static final class Builder {
            private String appId; 
            private String creationTime; 
            private String description; 
            private String modificationTime; 
            private String policyName; 
            private String policyType; 
            private String policyValue; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The time when the application policy was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the policy.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The last time when the application policy was modified. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The type of the policy. Valid values:
             * <p>
             * 
             * *   **System**
             * *   **Custom**
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The content of the policy.
             */
            public Builder policyValue(String policyValue) {
                this.policyValue = policyValue;
                return this;
            }

            public AppPolicyList build() {
                return new AppPolicyList(this);
            } 

        } 

    }
}
