// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link GetRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoleResponseBody</p>
 */
public class GetRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private Role role;

    private GetRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return role
     */
    public Role getRole() {
        return this.role;
    }

    public static final class Builder {
        private String requestId; 
        private Role role; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the RAM role.</p>
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        public GetRoleResponseBody build() {
            return new GetRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleResponseBody</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("AssumeRolePolicyDocument")
        private String assumeRolePolicyDocument;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("MaxSessionDuration")
        private Long maxSessionDuration;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private Role(Builder builder) {
            this.arn = builder.arn;
            this.assumeRolePolicyDocument = builder.assumeRolePolicyDocument;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.maxSessionDuration = builder.maxSessionDuration;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return assumeRolePolicyDocument
         */
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return maxSessionDuration
         */
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String arn; 
            private String assumeRolePolicyDocument; 
            private String createDate; 
            private String description; 
            private Long maxSessionDuration; 
            private String roleId; 
            private String roleName; 
            private String updateDate; 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/ECSAdmin</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The content of the policy that specifies one or more entities entrusted to assume the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Statement&quot;: [ { &quot;Action&quot;: &quot;sts:AssumeRole&quot;, &quot;Effect&quot;: &quot;Allow&quot;, &quot;Principal&quot;: { &quot;RAM&quot;: &quot;acs:ram::123456789012****:root&quot; } } ], &quot;Version&quot;: &quot;1&quot; }</p>
             */
            public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
                this.assumeRolePolicyDocument = assumeRolePolicyDocument;
                return this;
            }

            /**
             * <p>The time when the RAM role was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The description of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS administrator</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The maximum session duration of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder maxSessionDuration(Long maxSessionDuration) {
                this.maxSessionDuration = maxSessionDuration;
                return this;
            }

            /**
             * <p>The ID of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>901234567890****</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>The name of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>ECSAdmin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The time when the RAM role was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
}
