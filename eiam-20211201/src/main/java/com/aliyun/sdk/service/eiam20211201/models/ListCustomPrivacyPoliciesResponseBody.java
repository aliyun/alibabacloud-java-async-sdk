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
         * CustomPrivacyPolicies.
         */
        public Builder customPrivacyPolicies(java.util.List<CustomPrivacyPolicies> customPrivacyPolicies) {
            this.customPrivacyPolicies = customPrivacyPolicies;
            return this;
        }

        /**
         * <p>分页查询时每页行数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
             * <p>自定义条款Id</p>
             * 
             * <strong>example:</strong>
             * <p>pp_xxxxx</p>
             */
            public Builder customPrivacyPolicyId(String customPrivacyPolicyId) {
                this.customPrivacyPolicyId = customPrivacyPolicyId;
                return this;
            }

            /**
             * <p>自定义条款名称</p>
             * 
             * <strong>example:</strong>
             * <p>Custom Privacy Policy Name</p>
             */
            public Builder customPrivacyPolicyName(String customPrivacyPolicyName) {
                this.customPrivacyPolicyName = customPrivacyPolicyName;
                return this;
            }

            /**
             * <p>若显示语言未配置时，门户侧展示默认语言展示条款。</p>
             * 
             * <strong>example:</strong>
             * <p>zh-Hans-CN</p>
             */
            public Builder defaultLanguageCode(String defaultLanguageCode) {
                this.defaultLanguageCode = defaultLanguageCode;
                return this;
            }

            /**
             * <p>实例id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>自定义条款状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>自定义条款同意类型，是默认同意，还是用户勾选同意</p>
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
