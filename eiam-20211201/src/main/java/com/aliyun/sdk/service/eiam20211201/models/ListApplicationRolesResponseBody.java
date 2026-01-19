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
 * {@link ListApplicationRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationRolesResponseBody</p>
 */
public class ListApplicationRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationRoles")
    private java.util.List<ApplicationRoles> applicationRoles;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListApplicationRolesResponseBody(Builder builder) {
        this.applicationRoles = builder.applicationRoles;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationRolesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationRoles
     */
    public java.util.List<ApplicationRoles> getApplicationRoles() {
        return this.applicationRoles;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ApplicationRoles> applicationRoles; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListApplicationRolesResponseBody model) {
            this.applicationRoles = model.applicationRoles;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ApplicationRoles.
         */
        public Builder applicationRoles(java.util.List<ApplicationRoles> applicationRoles) {
            this.applicationRoles = applicationRoles;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListApplicationRolesResponseBody build() {
            return new ListApplicationRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListApplicationRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListApplicationRolesResponseBody</p>
     */
    public static class ApplicationRoles extends TeaModel {
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

        private ApplicationRoles(Builder builder) {
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

        public static ApplicationRoles create() {
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

            private Builder(ApplicationRoles model) {
                this.applicationId = model.applicationId;
                this.applicationRoleId = model.applicationRoleId;
                this.applicationRoleName = model.applicationRoleName;
                this.applicationRoleValue = model.applicationRoleValue;
                this.description = model.description;
                this.instanceId = model.instanceId;
            } 

            /**
             * ApplicationId.
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
             * ApplicationRoleValue.
             */
            public Builder applicationRoleValue(String applicationRoleValue) {
                this.applicationRoleValue = applicationRoleValue;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public ApplicationRoles build() {
                return new ApplicationRoles(this);
            } 

        } 

    }
}
