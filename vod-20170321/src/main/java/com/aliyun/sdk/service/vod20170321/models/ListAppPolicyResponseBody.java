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
 * {@link ListAppPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppPolicyResponseBody</p>
 */
public class ListAppPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppPolicyList")
    private java.util.List<AppPolicyList> appPolicyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListAppPolicyResponseBody(Builder builder) {
        this.appPolicyList = builder.appPolicyList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<AppPolicyList> appPolicyList; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListAppPolicyResponseBody model) {
            this.appPolicyList = model.appPolicyList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * AppPolicyList.
         */
        public Builder appPolicyList(java.util.List<AppPolicyList> appPolicyList) {
            this.appPolicyList = appPolicyList;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListAppPolicyResponseBody build() {
            return new ListAppPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppPolicyResponseBody</p>
     */
    public static class AppPolicyList extends TeaModel {
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

        private AppPolicyList(Builder builder) {
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

        public static AppPolicyList create() {
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

            private Builder(AppPolicyList model) {
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

            public AppPolicyList build() {
                return new AppPolicyList(this);
            } 

        } 

    }
}
