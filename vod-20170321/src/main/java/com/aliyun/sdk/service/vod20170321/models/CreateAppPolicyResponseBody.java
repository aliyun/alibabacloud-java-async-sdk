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
 * {@link CreateAppPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppPolicyResponseBody</p>
 */
public class CreateAppPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppPolicy")
    private AppPolicy appPolicy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAppPolicyResponseBody(Builder builder) {
        this.appPolicy = builder.appPolicy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appPolicy
     */
    public AppPolicy getAppPolicy() {
        return this.appPolicy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppPolicy appPolicy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAppPolicyResponseBody model) {
            this.appPolicy = model.appPolicy;
            this.requestId = model.requestId;
        } 

        /**
         * AppPolicy.
         */
        public Builder appPolicy(AppPolicy appPolicy) {
            this.appPolicy = appPolicy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAppPolicyResponseBody build() {
            return new CreateAppPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAppPolicyResponseBody</p>
     */
    public static class AppPolicy extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Products")
        private String products;

        private AppPolicy(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.modificationTime = builder.modificationTime;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.policyValue = builder.policyValue;
            this.products = builder.products;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppPolicy create() {
            return builder().build();
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

        /**
         * @return products
         */
        public String getProducts() {
            return this.products;
        }

        public static final class Builder {
            private String creationTime; 
            private String description; 
            private String modificationTime; 
            private String policyName; 
            private String policyType; 
            private String policyValue; 
            private String products; 

            private Builder() {
            } 

            private Builder(AppPolicy model) {
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.modificationTime = model.modificationTime;
                this.policyName = model.policyName;
                this.policyType = model.policyType;
                this.policyValue = model.policyValue;
                this.products = model.products;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * PolicyValue.
             */
            public Builder policyValue(String policyValue) {
                this.policyValue = policyValue;
                return this;
            }

            /**
             * Products.
             */
            public Builder products(String products) {
                this.products = products;
                return this;
            }

            public AppPolicy build() {
                return new AppPolicy(this);
            } 

        } 

    }
}
