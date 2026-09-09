// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListCustomPrivacyPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomPrivacyPoliciesResponseBody</p>
 */
public class ListCustomPrivacyPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicies")
    private java.util.List<CustomPrivacyPolicies> customPrivacyPolicies;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCustomPrivacyPoliciesResponseBody(Builder builder) {
        this.customPrivacyPolicies = builder.customPrivacyPolicies;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomPrivacyPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customPrivacyPolicies
     */
    public java.util.List<CustomPrivacyPolicies> getCustomPrivacyPolicies() {
        return this.customPrivacyPolicies;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<CustomPrivacyPolicies> customPrivacyPolicies; 
        private Long maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomPrivacyPoliciesResponseBody model) {
            this.customPrivacyPolicies = model.customPrivacyPolicies;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of custom terms.</p>
         */
        public Builder customPrivacyPolicies(java.util.List<CustomPrivacyPolicies> customPrivacyPolicies) {
            this.customPrivacyPolicies = customPrivacyPolicies;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The pagination token returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCustomPrivacyPoliciesResponseBody build() {
            return new ListCustomPrivacyPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomPrivacyPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomPrivacyPoliciesResponseBody</p>
     */
    public static class CustomPrivacyPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyId")
        private String customPrivacyPolicyId;

        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyName")
        private String customPrivacyPolicyName;

        @com.aliyun.core.annotation.NameInMap("DefaultLanguageCode")
        private String defaultLanguageCode;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserConsentType")
        private String userConsentType;

        private CustomPrivacyPolicies(Builder builder) {
            this.customPrivacyPolicyId = builder.customPrivacyPolicyId;
            this.customPrivacyPolicyName = builder.customPrivacyPolicyName;
            this.defaultLanguageCode = builder.defaultLanguageCode;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.userConsentType = builder.userConsentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrivacyPolicies create() {
            return builder().build();
        }

        /**
         * @return customPrivacyPolicyId
         */
        public String getCustomPrivacyPolicyId() {
            return this.customPrivacyPolicyId;
        }

        /**
         * @return customPrivacyPolicyName
         */
        public String getCustomPrivacyPolicyName() {
            return this.customPrivacyPolicyName;
        }

        /**
         * @return defaultLanguageCode
         */
        public String getDefaultLanguageCode() {
            return this.defaultLanguageCode;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userConsentType
         */
        public String getUserConsentType() {
            return this.userConsentType;
        }

        public static final class Builder {
            private String customPrivacyPolicyId; 
            private String customPrivacyPolicyName; 
            private String defaultLanguageCode; 
            private String instanceId; 
            private String status; 
            private String userConsentType; 

            private Builder() {
            } 

            private Builder(CustomPrivacyPolicies model) {
                this.customPrivacyPolicyId = model.customPrivacyPolicyId;
                this.customPrivacyPolicyName = model.customPrivacyPolicyName;
                this.defaultLanguageCode = model.defaultLanguageCode;
                this.instanceId = model.instanceId;
                this.status = model.status;
                this.userConsentType = model.userConsentType;
            } 

            /**
             * <p>The custom term ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pp_xxxxx</p>
             */
            public Builder customPrivacyPolicyId(String customPrivacyPolicyId) {
                this.customPrivacyPolicyId = customPrivacyPolicyId;
                return this;
            }

            /**
             * <p>The custom term name.</p>
             * 
             * <strong>example:</strong>
             * <p>Custom Privacy Policy Name</p>
             */
            public Builder customPrivacyPolicyName(String customPrivacyPolicyName) {
                this.customPrivacyPolicyName = customPrivacyPolicyName;
                return this;
            }

            /**
             * <p>The default language term entry. The value is obtained from the LanguageCode field returned by the ListLanguages operation.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-Hans-CN</p>
             */
            public Builder defaultLanguageCode(String defaultLanguageCode) {
                this.defaultLanguageCode = defaultLanguageCode;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The custom term status.</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The consent type of the custom term.</p>
             * 
             * <strong>example:</strong>
             * <p>implied_consent</p>
             */
            public Builder userConsentType(String userConsentType) {
                this.userConsentType = userConsentType;
                return this;
            }

            public CustomPrivacyPolicies build() {
                return new CustomPrivacyPolicies(this);
            } 

        } 

    }
}
