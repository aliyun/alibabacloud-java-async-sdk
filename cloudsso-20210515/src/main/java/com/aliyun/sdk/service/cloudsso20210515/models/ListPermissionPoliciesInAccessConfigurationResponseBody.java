// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionPoliciesInAccessConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionPoliciesInAccessConfigurationResponseBody</p>
 */
public class ListPermissionPoliciesInAccessConfigurationResponseBody extends TeaModel {
    @NameInMap("PermissionPolicies")
    private java.util.List < PermissionPolicies> permissionPolicies;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCounts")
    private Integer totalCounts;

    private ListPermissionPoliciesInAccessConfigurationResponseBody(Builder builder) {
        this.permissionPolicies = builder.permissionPolicies;
        this.requestId = builder.requestId;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionPoliciesInAccessConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return permissionPolicies
     */
    public java.util.List < PermissionPolicies> getPermissionPolicies() {
        return this.permissionPolicies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private java.util.List < PermissionPolicies> permissionPolicies; 
        private String requestId; 
        private Integer totalCounts; 

        /**
         * PermissionPolicies.
         */
        public Builder permissionPolicies(java.util.List < PermissionPolicies> permissionPolicies) {
            this.permissionPolicies = permissionPolicies;
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
         * TotalCounts.
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListPermissionPoliciesInAccessConfigurationResponseBody build() {
            return new ListPermissionPoliciesInAccessConfigurationResponseBody(this);
        } 

    } 

    public static class PermissionPolicies extends TeaModel {
        @NameInMap("AddTime")
        private String addTime;

        @NameInMap("PermissionPolicyDocument")
        private String permissionPolicyDocument;

        @NameInMap("PermissionPolicyName")
        private String permissionPolicyName;

        @NameInMap("PermissionPolicyType")
        private String permissionPolicyType;

        private PermissionPolicies(Builder builder) {
            this.addTime = builder.addTime;
            this.permissionPolicyDocument = builder.permissionPolicyDocument;
            this.permissionPolicyName = builder.permissionPolicyName;
            this.permissionPolicyType = builder.permissionPolicyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionPolicies create() {
            return builder().build();
        }

        /**
         * @return addTime
         */
        public String getAddTime() {
            return this.addTime;
        }

        /**
         * @return permissionPolicyDocument
         */
        public String getPermissionPolicyDocument() {
            return this.permissionPolicyDocument;
        }

        /**
         * @return permissionPolicyName
         */
        public String getPermissionPolicyName() {
            return this.permissionPolicyName;
        }

        /**
         * @return permissionPolicyType
         */
        public String getPermissionPolicyType() {
            return this.permissionPolicyType;
        }

        public static final class Builder {
            private String addTime; 
            private String permissionPolicyDocument; 
            private String permissionPolicyName; 
            private String permissionPolicyType; 

            /**
             * AddTime.
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * PermissionPolicyDocument.
             */
            public Builder permissionPolicyDocument(String permissionPolicyDocument) {
                this.permissionPolicyDocument = permissionPolicyDocument;
                return this;
            }

            /**
             * PermissionPolicyName.
             */
            public Builder permissionPolicyName(String permissionPolicyName) {
                this.permissionPolicyName = permissionPolicyName;
                return this;
            }

            /**
             * PermissionPolicyType.
             */
            public Builder permissionPolicyType(String permissionPolicyType) {
                this.permissionPolicyType = permissionPolicyType;
                return this;
            }

            public PermissionPolicies build() {
                return new PermissionPolicies(this);
            } 

        } 

    }
}
