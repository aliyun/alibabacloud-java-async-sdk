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
 * {@link GetApplicationRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationRoleResponseBody</p>
 */
public class GetApplicationRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationRole")
    private ApplicationRole applicationRole;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationRoleResponseBody(Builder builder) {
        this.applicationRole = builder.applicationRole;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationRole
     */
    public ApplicationRole getApplicationRole() {
        return this.applicationRole;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApplicationRole applicationRole; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetApplicationRoleResponseBody model) {
            this.applicationRole = model.applicationRole;
            this.requestId = model.requestId;
        } 

        /**
         * ApplicationRole.
         */
        public Builder applicationRole(ApplicationRole applicationRole) {
            this.applicationRole = applicationRole;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationRoleResponseBody build() {
            return new GetApplicationRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetApplicationRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetApplicationRoleResponseBody</p>
     */
    public static class ApplicationRole extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplicationRoleId")
        private String applicationRoleId;

        @com.aliyun.core.annotation.NameInMap("ApplicationRoleName")
        private String applicationRoleName;

        @com.aliyun.core.annotation.NameInMap("ApplicationRoleValue")
        private String applicationRoleValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private ApplicationRole(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applicationRoleId = builder.applicationRoleId;
            this.applicationRoleName = builder.applicationRoleName;
            this.applicationRoleValue = builder.applicationRoleValue;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplicationRole create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applicationRoleId
         */
        public String getApplicationRoleId() {
            return this.applicationRoleId;
        }

        /**
         * @return applicationRoleName
         */
        public String getApplicationRoleName() {
            return this.applicationRoleName;
        }

        /**
         * @return applicationRoleValue
         */
        public String getApplicationRoleValue() {
            return this.applicationRoleValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String applicationId; 
            private String applicationRoleId; 
            private String applicationRoleName; 
            private String applicationRoleValue; 
            private String description; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(ApplicationRole model) {
                this.applicationId = model.applicationId;
                this.applicationRoleId = model.applicationRoleId;
                this.applicationRoleName = model.applicationRoleName;
                this.applicationRoleValue = model.applicationRoleValue;
                this.description = model.description;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>应用唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>应用角色的唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>approle_01kh2vuo8v9splv8maak1d22rxxxx</p>
             */
            public Builder applicationRoleId(String applicationRoleId) {
                this.applicationRoleId = applicationRoleId;
                return this;
            }

            /**
             * <p>应用角色名称</p>
             * 
             * <strong>example:</strong>
             * <p>Admin Role</p>
             */
            public Builder applicationRoleName(String applicationRoleName) {
                this.applicationRoleName = applicationRoleName;
                return this;
            }

            /**
             * <p>应用角色值</p>
             * 
             * <strong>example:</strong>
             * <p>admin_role</p>
             */
            public Builder applicationRoleValue(String applicationRoleValue) {
                this.applicationRoleValue = applicationRoleValue;
                return this;
            }

            /**
             * <p>应用角色描述</p>
             * 
             * <strong>example:</strong>
             * <p>Admin Role Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>EIAM 实例唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public ApplicationRole build() {
                return new ApplicationRole(this);
            } 

        } 

    }
}
