// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link GetProtectionPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetProtectionPolicyResponseBody</p>
 */
public class GetProtectionPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProtectionPolicyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProtectionPolicyResponseBody create() {
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

        private Builder(GetProtectionPolicyResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProtectionPolicyResponseBody build() {
            return new GetProtectionPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProtectionPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetProtectionPolicyResponseBody</p>
     */
    public static class SubProtectionPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("SubProtectionPolicyType")
        private String subProtectionPolicyType;

        private SubProtectionPolicies(Builder builder) {
            this.config = builder.config;
            this.subProtectionPolicyType = builder.subProtectionPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubProtectionPolicies create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return subProtectionPolicyType
         */
        public String getSubProtectionPolicyType() {
            return this.subProtectionPolicyType;
        }

        public static final class Builder {
            private String config; 
            private String subProtectionPolicyType; 

            private Builder() {
            } 

            private Builder(SubProtectionPolicies model) {
                this.config = model.config;
                this.subProtectionPolicyType = model.subProtectionPolicyType;
            } 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * SubProtectionPolicyType.
             */
            public Builder subProtectionPolicyType(String subProtectionPolicyType) {
                this.subProtectionPolicyType = subProtectionPolicyType;
                return this;
            }

            public SubProtectionPolicies build() {
                return new SubProtectionPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetProtectionPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetProtectionPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoundResourceCategoryIds")
        private java.util.List<String> boundResourceCategoryIds;

        @com.aliyun.core.annotation.NameInMap("LatestApplyTime")
        private Long latestApplyTime;

        @com.aliyun.core.annotation.NameInMap("LatestTaskId")
        private String latestTaskId;

        @com.aliyun.core.annotation.NameInMap("ProtectionPolicyId")
        private String protectionPolicyId;

        @com.aliyun.core.annotation.NameInMap("ProtectionPolicyName")
        private String protectionPolicyName;

        @com.aliyun.core.annotation.NameInMap("ProtectionPolicyRegionId")
        private String protectionPolicyRegionId;

        @com.aliyun.core.annotation.NameInMap("SubProtectionPolicies")
        private java.util.List<SubProtectionPolicies> subProtectionPolicies;

        private Data(Builder builder) {
            this.boundResourceCategoryIds = builder.boundResourceCategoryIds;
            this.latestApplyTime = builder.latestApplyTime;
            this.latestTaskId = builder.latestTaskId;
            this.protectionPolicyId = builder.protectionPolicyId;
            this.protectionPolicyName = builder.protectionPolicyName;
            this.protectionPolicyRegionId = builder.protectionPolicyRegionId;
            this.subProtectionPolicies = builder.subProtectionPolicies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return boundResourceCategoryIds
         */
        public java.util.List<String> getBoundResourceCategoryIds() {
            return this.boundResourceCategoryIds;
        }

        /**
         * @return latestApplyTime
         */
        public Long getLatestApplyTime() {
            return this.latestApplyTime;
        }

        /**
         * @return latestTaskId
         */
        public String getLatestTaskId() {
            return this.latestTaskId;
        }

        /**
         * @return protectionPolicyId
         */
        public String getProtectionPolicyId() {
            return this.protectionPolicyId;
        }

        /**
         * @return protectionPolicyName
         */
        public String getProtectionPolicyName() {
            return this.protectionPolicyName;
        }

        /**
         * @return protectionPolicyRegionId
         */
        public String getProtectionPolicyRegionId() {
            return this.protectionPolicyRegionId;
        }

        /**
         * @return subProtectionPolicies
         */
        public java.util.List<SubProtectionPolicies> getSubProtectionPolicies() {
            return this.subProtectionPolicies;
        }

        public static final class Builder {
            private java.util.List<String> boundResourceCategoryIds; 
            private Long latestApplyTime; 
            private String latestTaskId; 
            private String protectionPolicyId; 
            private String protectionPolicyName; 
            private String protectionPolicyRegionId; 
            private java.util.List<SubProtectionPolicies> subProtectionPolicies; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.boundResourceCategoryIds = model.boundResourceCategoryIds;
                this.latestApplyTime = model.latestApplyTime;
                this.latestTaskId = model.latestTaskId;
                this.protectionPolicyId = model.protectionPolicyId;
                this.protectionPolicyName = model.protectionPolicyName;
                this.protectionPolicyRegionId = model.protectionPolicyRegionId;
                this.subProtectionPolicies = model.subProtectionPolicies;
            } 

            /**
             * BoundResourceCategoryIds.
             */
            public Builder boundResourceCategoryIds(java.util.List<String> boundResourceCategoryIds) {
                this.boundResourceCategoryIds = boundResourceCategoryIds;
                return this;
            }

            /**
             * LatestApplyTime.
             */
            public Builder latestApplyTime(Long latestApplyTime) {
                this.latestApplyTime = latestApplyTime;
                return this;
            }

            /**
             * LatestTaskId.
             */
            public Builder latestTaskId(String latestTaskId) {
                this.latestTaskId = latestTaskId;
                return this;
            }

            /**
             * ProtectionPolicyId.
             */
            public Builder protectionPolicyId(String protectionPolicyId) {
                this.protectionPolicyId = protectionPolicyId;
                return this;
            }

            /**
             * ProtectionPolicyName.
             */
            public Builder protectionPolicyName(String protectionPolicyName) {
                this.protectionPolicyName = protectionPolicyName;
                return this;
            }

            /**
             * ProtectionPolicyRegionId.
             */
            public Builder protectionPolicyRegionId(String protectionPolicyRegionId) {
                this.protectionPolicyRegionId = protectionPolicyRegionId;
                return this;
            }

            /**
             * SubProtectionPolicies.
             */
            public Builder subProtectionPolicies(java.util.List<SubProtectionPolicies> subProtectionPolicies) {
                this.subProtectionPolicies = subProtectionPolicies;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
