// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link ListAppPoliciesForIdentityResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppPoliciesForIdentityResponseBody</p>
 */
public class ListAppPoliciesForIdentityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppPolicyList")
    private java.util.List<AppPolicyList> appPolicyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<AppPolicyList> getAppPolicyList() {
        return this.appPolicyList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AppPolicyList> appPolicyList; 
        private String requestId; 

        /**
         * <p>The details of each policy.</p>
         * <blockquote>
         * <p>A maximum of 100 entries can be returned.</p>
         * </blockquote>
         */
        public Builder appPolicyList(java.util.List<AppPolicyList> appPolicyList) {
            this.appPolicyList = appPolicyList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C9F3E715-B3B8-4D*****27-3A70346F0E04</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAppPoliciesForIdentityResponseBody build() {
            return new ListAppPoliciesForIdentityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppPoliciesForIdentityResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppPoliciesForIdentityResponseBody</p>
     */
    public static class AppPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("PolicyValue")
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>app-****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the application policy was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T01:01:01Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>App full access permission</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The last time when the application policy was modified. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-01T01:08:01Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>VODAppFullAccess</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The type of the policy. Valid values:</p>
             * <ul>
             * <li><strong>System</strong></li>
             * <li><strong>Custom</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The content of the policy.</p>
             * 
             * <strong>example:</strong>
             * <hr>
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
