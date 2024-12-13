// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPermissionPoliciesInAccessConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionPoliciesInAccessConfigurationResponseBody</p>
 */
public class ListPermissionPoliciesInAccessConfigurationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PermissionPolicies")
    private java.util.List < PermissionPolicies> permissionPolicies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCounts")
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
         * <p>The policies.</p>
         */
        public Builder permissionPolicies(java.util.List < PermissionPolicies> permissionPolicies) {
            this.permissionPolicies = permissionPolicies;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3A5E771F-1F5A-5555-A64E-579748AAFD98</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of policies.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListPermissionPoliciesInAccessConfigurationResponseBody build() {
            return new ListPermissionPoliciesInAccessConfigurationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPermissionPoliciesInAccessConfigurationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPermissionPoliciesInAccessConfigurationResponseBody</p>
     */
    public static class PermissionPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddTime")
        private String addTime;

        @com.aliyun.core.annotation.NameInMap("PermissionPolicyDocument")
        private String permissionPolicyDocument;

        @com.aliyun.core.annotation.NameInMap("PermissionPolicyName")
        private String permissionPolicyName;

        @com.aliyun.core.annotation.NameInMap("PermissionPolicyType")
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
             * <p>The time when the policy was created for the access configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-03T06:37:25Z</p>
             */
            public Builder addTime(String addTime) {
                this.addTime = addTime;
                return this;
            }

            /**
             * <p>The configurations of the inline policy.</p>
             * <blockquote>
             * <p> This parameter is returned only when the value of the PermissionPolicyType parameter is Inline.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Statement&quot;: [{&quot;Action&quot;: &quot;<em>&quot;,&quot;Effect&quot;: &quot;Allow&quot;,&quot;Resource&quot;: &quot;</em>&quot;}],&quot;Version&quot;: &quot;1&quot;}</p>
             */
            public Builder permissionPolicyDocument(String permissionPolicyDocument) {
                this.permissionPolicyDocument = permissionPolicyDocument;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunECSFullAccess</p>
             */
            public Builder permissionPolicyName(String permissionPolicyName) {
                this.permissionPolicyName = permissionPolicyName;
                return this;
            }

            /**
             * <p>The type of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
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
