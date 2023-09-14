// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRegistrationPoliciesForUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListRegistrationPoliciesForUserGroupResponseBody</p>
 */
public class ListRegistrationPoliciesForUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserGroups")
    private java.util.List < UserGroups> userGroups;

    private ListRegistrationPoliciesForUserGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userGroups = builder.userGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegistrationPoliciesForUserGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userGroups
     */
    public java.util.List < UserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UserGroups> userGroups; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserGroups.
         */
        public Builder userGroups(java.util.List < UserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        public ListRegistrationPoliciesForUserGroupResponseBody build() {
            return new ListRegistrationPoliciesForUserGroupResponseBody(this);
        } 

    } 

    public static class LimitCount extends TeaModel {
        @NameInMap("All")
        private String all;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("PC")
        private String pc;

        private LimitCount(Builder builder) {
            this.all = builder.all;
            this.mobile = builder.mobile;
            this.pc = builder.pc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimitCount create() {
            return builder().build();
        }

        /**
         * @return all
         */
        public String getAll() {
            return this.all;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return pc
         */
        public String getPc() {
            return this.pc;
        }

        public static final class Builder {
            private String all; 
            private String mobile; 
            private String pc; 

            /**
             * All.
             */
            public Builder all(String all) {
                this.all = all;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * PC.
             */
            public Builder pc(String pc) {
                this.pc = pc;
                return this;
            }

            public LimitCount build() {
                return new LimitCount(this);
            } 

        } 

    }
    public static class LimitDetail extends TeaModel {
        @NameInMap("DeviceBelong")
        private String deviceBelong;

        @NameInMap("LimitCount")
        private LimitCount limitCount;

        @NameInMap("LimitType")
        private String limitType;

        private LimitDetail(Builder builder) {
            this.deviceBelong = builder.deviceBelong;
            this.limitCount = builder.limitCount;
            this.limitType = builder.limitType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LimitDetail create() {
            return builder().build();
        }

        /**
         * @return deviceBelong
         */
        public String getDeviceBelong() {
            return this.deviceBelong;
        }

        /**
         * @return limitCount
         */
        public LimitCount getLimitCount() {
            return this.limitCount;
        }

        /**
         * @return limitType
         */
        public String getLimitType() {
            return this.limitType;
        }

        public static final class Builder {
            private String deviceBelong; 
            private LimitCount limitCount; 
            private String limitType; 

            /**
             * DeviceBelong.
             */
            public Builder deviceBelong(String deviceBelong) {
                this.deviceBelong = deviceBelong;
                return this;
            }

            /**
             * LimitCount.
             */
            public Builder limitCount(LimitCount limitCount) {
                this.limitCount = limitCount;
                return this;
            }

            /**
             * LimitType.
             */
            public Builder limitType(String limitType) {
                this.limitType = limitType;
                return this;
            }

            public LimitDetail build() {
                return new LimitDetail(this);
            } 

        } 

    }
    public static class Policies extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("LimitDetail")
        private java.util.List < LimitDetail> limitDetail;

        @NameInMap("MatchMode")
        private String matchMode;

        @NameInMap("Name")
        private String name;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("Priority")
        private Long priority;

        @NameInMap("Status")
        private String status;

        @NameInMap("Whitelist")
        private java.util.List < String > whitelist;

        private Policies(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.limitDetail = builder.limitDetail;
            this.matchMode = builder.matchMode;
            this.name = builder.name;
            this.policyId = builder.policyId;
            this.priority = builder.priority;
            this.status = builder.status;
            this.whitelist = builder.whitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
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
         * @return limitDetail
         */
        public java.util.List < LimitDetail> getLimitDetail() {
            return this.limitDetail;
        }

        /**
         * @return matchMode
         */
        public String getMatchMode() {
            return this.matchMode;
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

        /**
         * @return priority
         */
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return whitelist
         */
        public java.util.List < String > getWhitelist() {
            return this.whitelist;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private java.util.List < LimitDetail> limitDetail; 
            private String matchMode; 
            private String name; 
            private String policyId; 
            private Long priority; 
            private String status; 
            private java.util.List < String > whitelist; 

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
             * LimitDetail.
             */
            public Builder limitDetail(java.util.List < LimitDetail> limitDetail) {
                this.limitDetail = limitDetail;
                return this;
            }

            /**
             * MatchMode.
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
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

            /**
             * Priority.
             */
            public Builder priority(Long priority) {
                this.priority = priority;
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
             * Whitelist.
             */
            public Builder whitelist(java.util.List < String > whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    public static class UserGroups extends TeaModel {
        @NameInMap("Policies")
        private java.util.List < Policies> policies;

        @NameInMap("UserGroupId")
        private String userGroupId;

        private UserGroups(Builder builder) {
            this.policies = builder.policies;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return policies
         */
        public java.util.List < Policies> getPolicies() {
            return this.policies;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private java.util.List < Policies> policies; 
            private String userGroupId; 

            /**
             * Policies.
             */
            public Builder policies(java.util.List < Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * UserGroupId.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
}
