// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupsResponseBody</p>
 */
public class DescribeGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupsResponseBody(Builder builder) {
        this.count = builder.count;
        this.groups = builder.groups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<Groups> groups; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeGroupsResponseBody model) {
            this.count = model.count;
            this.groups = model.groups;
            this.requestId = model.requestId;
        } 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Groups.
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupsResponseBody build() {
            return new DescribeGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupsResponseBody</p>
     */
    public static class AttachedLoginPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        private AttachedLoginPolicy(Builder builder) {
            this.name = builder.name;
            this.policyId = builder.policyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachedLoginPolicy create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        public static final class Builder {
            private String name; 
            private String policyId; 

            private Builder() {
            } 

            private Builder(AttachedLoginPolicy model) {
                this.name = model.name;
                this.policyId = model.policyId;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            public AttachedLoginPolicy build() {
                return new AttachedLoginPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupsResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedLoginPolicy")
        private AttachedLoginPolicy attachedLoginPolicy;

        @com.aliyun.core.annotation.NameInMap("AuthedResources")
        private java.util.Map<String, String> authedResources;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("TransferFileNeedApproval")
        private Boolean transferFileNeedApproval;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private Integer userCount;

        private Groups(Builder builder) {
            this.attachedLoginPolicy = builder.attachedLoginPolicy;
            this.authedResources = builder.authedResources;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.transferFileNeedApproval = builder.transferFileNeedApproval;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return attachedLoginPolicy
         */
        public AttachedLoginPolicy getAttachedLoginPolicy() {
            return this.attachedLoginPolicy;
        }

        /**
         * @return authedResources
         */
        public java.util.Map<String, String> getAuthedResources() {
            return this.authedResources;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return transferFileNeedApproval
         */
        public Boolean getTransferFileNeedApproval() {
            return this.transferFileNeedApproval;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        public static final class Builder {
            private AttachedLoginPolicy attachedLoginPolicy; 
            private java.util.Map<String, String> authedResources; 
            private String createTime; 
            private String description; 
            private String groupId; 
            private String groupName; 
            private Boolean transferFileNeedApproval; 
            private Integer userCount; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.attachedLoginPolicy = model.attachedLoginPolicy;
                this.authedResources = model.authedResources;
                this.createTime = model.createTime;
                this.description = model.description;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.transferFileNeedApproval = model.transferFileNeedApproval;
                this.userCount = model.userCount;
            } 

            /**
             * AttachedLoginPolicy.
             */
            public Builder attachedLoginPolicy(AttachedLoginPolicy attachedLoginPolicy) {
                this.attachedLoginPolicy = attachedLoginPolicy;
                return this;
            }

            /**
             * AuthedResources.
             */
            public Builder authedResources(java.util.Map<String, String> authedResources) {
                this.authedResources = authedResources;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * TransferFileNeedApproval.
             */
            public Builder transferFileNeedApproval(Boolean transferFileNeedApproval) {
                this.transferFileNeedApproval = transferFileNeedApproval;
                return this;
            }

            /**
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
