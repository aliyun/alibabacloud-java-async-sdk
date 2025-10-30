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
 * {@link GetCustomPrivacyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomPrivacyPolicyResponseBody</p>
 */
public class GetCustomPrivacyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicy")
    private CustomPrivacyPolicy customPrivacyPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCustomPrivacyPolicyResponseBody(Builder builder) {
        this.customPrivacyPolicy = builder.customPrivacyPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomPrivacyPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customPrivacyPolicy
     */
    public CustomPrivacyPolicy getCustomPrivacyPolicy() {
        return this.customPrivacyPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CustomPrivacyPolicy customPrivacyPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCustomPrivacyPolicyResponseBody model) {
            this.customPrivacyPolicy = model.customPrivacyPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * CustomPrivacyPolicy.
         */
        public Builder customPrivacyPolicy(CustomPrivacyPolicy customPrivacyPolicy) {
            this.customPrivacyPolicy = customPrivacyPolicy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCustomPrivacyPolicyResponseBody build() {
            return new GetCustomPrivacyPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomPrivacyPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomPrivacyPolicyResponseBody</p>
     */
    public static class CustomPrivacyPolicyItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyItemName")
        private String customPrivacyPolicyItemName;

        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyItemUrl")
        private String customPrivacyPolicyItemUrl;

        private CustomPrivacyPolicyItems(Builder builder) {
            this.customPrivacyPolicyItemName = builder.customPrivacyPolicyItemName;
            this.customPrivacyPolicyItemUrl = builder.customPrivacyPolicyItemUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrivacyPolicyItems create() {
            return builder().build();
        }

        /**
         * @return customPrivacyPolicyItemName
         */
        public String getCustomPrivacyPolicyItemName() {
            return this.customPrivacyPolicyItemName;
        }

        /**
         * @return customPrivacyPolicyItemUrl
         */
        public String getCustomPrivacyPolicyItemUrl() {
            return this.customPrivacyPolicyItemUrl;
        }

        public static final class Builder {
            private String customPrivacyPolicyItemName; 
            private String customPrivacyPolicyItemUrl; 

            private Builder() {
            } 

            private Builder(CustomPrivacyPolicyItems model) {
                this.customPrivacyPolicyItemName = model.customPrivacyPolicyItemName;
                this.customPrivacyPolicyItemUrl = model.customPrivacyPolicyItemUrl;
            } 

            /**
             * CustomPrivacyPolicyItemName.
             */
            public Builder customPrivacyPolicyItemName(String customPrivacyPolicyItemName) {
                this.customPrivacyPolicyItemName = customPrivacyPolicyItemName;
                return this;
            }

            /**
             * CustomPrivacyPolicyItemUrl.
             */
            public Builder customPrivacyPolicyItemUrl(String customPrivacyPolicyItemUrl) {
                this.customPrivacyPolicyItemUrl = customPrivacyPolicyItemUrl;
                return this;
            }

            public CustomPrivacyPolicyItems build() {
                return new CustomPrivacyPolicyItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomPrivacyPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomPrivacyPolicyResponseBody</p>
     */
    public static class CustomPrivacyPolicyContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyItems")
        private java.util.List<CustomPrivacyPolicyItems> customPrivacyPolicyItems;

        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyTip")
        private String customPrivacyPolicyTip;

        @com.aliyun.core.annotation.NameInMap("LanguageCode")
        private String languageCode;

        private CustomPrivacyPolicyContents(Builder builder) {
            this.customPrivacyPolicyItems = builder.customPrivacyPolicyItems;
            this.customPrivacyPolicyTip = builder.customPrivacyPolicyTip;
            this.languageCode = builder.languageCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomPrivacyPolicyContents create() {
            return builder().build();
        }

        /**
         * @return customPrivacyPolicyItems
         */
        public java.util.List<CustomPrivacyPolicyItems> getCustomPrivacyPolicyItems() {
            return this.customPrivacyPolicyItems;
        }

        /**
         * @return customPrivacyPolicyTip
         */
        public String getCustomPrivacyPolicyTip() {
            return this.customPrivacyPolicyTip;
        }

        /**
         * @return languageCode
         */
        public String getLanguageCode() {
            return this.languageCode;
        }

        public static final class Builder {
            private java.util.List<CustomPrivacyPolicyItems> customPrivacyPolicyItems; 
            private String customPrivacyPolicyTip; 
            private String languageCode; 

            private Builder() {
            } 

            private Builder(CustomPrivacyPolicyContents model) {
                this.customPrivacyPolicyItems = model.customPrivacyPolicyItems;
                this.customPrivacyPolicyTip = model.customPrivacyPolicyTip;
                this.languageCode = model.languageCode;
            } 

            /**
             * CustomPrivacyPolicyItems.
             */
            public Builder customPrivacyPolicyItems(java.util.List<CustomPrivacyPolicyItems> customPrivacyPolicyItems) {
                this.customPrivacyPolicyItems = customPrivacyPolicyItems;
                return this;
            }

            /**
             * CustomPrivacyPolicyTip.
             */
            public Builder customPrivacyPolicyTip(String customPrivacyPolicyTip) {
                this.customPrivacyPolicyTip = customPrivacyPolicyTip;
                return this;
            }

            /**
             * LanguageCode.
             */
            public Builder languageCode(String languageCode) {
                this.languageCode = languageCode;
                return this;
            }

            public CustomPrivacyPolicyContents build() {
                return new CustomPrivacyPolicyContents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomPrivacyPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomPrivacyPolicyResponseBody</p>
     */
    public static class CustomPrivacyPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomPrivacyPolicyContents")
        private java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents;

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

        private CustomPrivacyPolicy(Builder builder) {
            this.customPrivacyPolicyContents = builder.customPrivacyPolicyContents;
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

        public static CustomPrivacyPolicy create() {
            return builder().build();
        }

        /**
         * @return customPrivacyPolicyContents
         */
        public java.util.List<CustomPrivacyPolicyContents> getCustomPrivacyPolicyContents() {
            return this.customPrivacyPolicyContents;
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
            private java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents; 
            private String customPrivacyPolicyId; 
            private String customPrivacyPolicyName; 
            private String defaultLanguageCode; 
            private String instanceId; 
            private String status; 
            private String userConsentType; 

            private Builder() {
            } 

            private Builder(CustomPrivacyPolicy model) {
                this.customPrivacyPolicyContents = model.customPrivacyPolicyContents;
                this.customPrivacyPolicyId = model.customPrivacyPolicyId;
                this.customPrivacyPolicyName = model.customPrivacyPolicyName;
                this.defaultLanguageCode = model.defaultLanguageCode;
                this.instanceId = model.instanceId;
                this.status = model.status;
                this.userConsentType = model.userConsentType;
            } 

            /**
             * CustomPrivacyPolicyContents.
             */
            public Builder customPrivacyPolicyContents(java.util.List<CustomPrivacyPolicyContents> customPrivacyPolicyContents) {
                this.customPrivacyPolicyContents = customPrivacyPolicyContents;
                return this;
            }

            /**
             * CustomPrivacyPolicyId.
             */
            public Builder customPrivacyPolicyId(String customPrivacyPolicyId) {
                this.customPrivacyPolicyId = customPrivacyPolicyId;
                return this;
            }

            /**
             * CustomPrivacyPolicyName.
             */
            public Builder customPrivacyPolicyName(String customPrivacyPolicyName) {
                this.customPrivacyPolicyName = customPrivacyPolicyName;
                return this;
            }

            /**
             * DefaultLanguageCode.
             */
            public Builder defaultLanguageCode(String defaultLanguageCode) {
                this.defaultLanguageCode = defaultLanguageCode;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * UserConsentType.
             */
            public Builder userConsentType(String userConsentType) {
                this.userConsentType = userConsentType;
                return this;
            }

            public CustomPrivacyPolicy build() {
                return new CustomPrivacyPolicy(this);
            } 

        } 

    }
}
