// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationMembersResponseBody</p>
 */
public class ListOrganizationMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("members")
    private java.util.List < Members> members;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListOrganizationMembersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.members = builder.members;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return members
     */
    public java.util.List < Members> getMembers() {
        return this.members;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List < Members> members; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * members.
         */
        public Builder members(java.util.List < Members> members) {
            this.members = members;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrganizationMembersResponseBody build() {
            return new ListOrganizationMembersResponseBody(this);
        } 

    } 

    public static class Identities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("externUid")
        private String externUid;

        @com.aliyun.core.annotation.NameInMap("provider")
        private String provider;

        private Identities(Builder builder) {
            this.externUid = builder.externUid;
            this.provider = builder.provider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identities create() {
            return builder().build();
        }

        /**
         * @return externUid
         */
        public String getExternUid() {
            return this.externUid;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        public static final class Builder {
            private String externUid; 
            private String provider; 

            /**
             * externUid.
             */
            public Builder externUid(String externUid) {
                this.externUid = externUid;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            public Identities build() {
                return new Identities(this);
            } 

        } 

    }
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("birthday")
        private Long birthday;

        @com.aliyun.core.annotation.NameInMap("deptLists")
        private java.util.List < String > deptLists;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("hiredDate")
        private Long hiredDate;

        @com.aliyun.core.annotation.NameInMap("identities")
        private Identities identities;

        @com.aliyun.core.annotation.NameInMap("jobNumber")
        private String jobNumber;

        @com.aliyun.core.annotation.NameInMap("joinTime")
        private Long joinTime;

        @com.aliyun.core.annotation.NameInMap("lastVisitTime")
        private Long lastVisitTime;

        @com.aliyun.core.annotation.NameInMap("mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("organizationMemberName")
        private String organizationMemberName;

        @com.aliyun.core.annotation.NameInMap("organizationRoleId")
        private String organizationRoleId;

        @com.aliyun.core.annotation.NameInMap("organizationRoleName")
        private String organizationRoleName;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        private Members(Builder builder) {
            this.accountId = builder.accountId;
            this.birthday = builder.birthday;
            this.deptLists = builder.deptLists;
            this.email = builder.email;
            this.hiredDate = builder.hiredDate;
            this.identities = builder.identities;
            this.jobNumber = builder.jobNumber;
            this.joinTime = builder.joinTime;
            this.lastVisitTime = builder.lastVisitTime;
            this.mobile = builder.mobile;
            this.organizationMemberName = builder.organizationMemberName;
            this.organizationRoleId = builder.organizationRoleId;
            this.organizationRoleName = builder.organizationRoleName;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return birthday
         */
        public Long getBirthday() {
            return this.birthday;
        }

        /**
         * @return deptLists
         */
        public java.util.List < String > getDeptLists() {
            return this.deptLists;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return hiredDate
         */
        public Long getHiredDate() {
            return this.hiredDate;
        }

        /**
         * @return identities
         */
        public Identities getIdentities() {
            return this.identities;
        }

        /**
         * @return jobNumber
         */
        public String getJobNumber() {
            return this.jobNumber;
        }

        /**
         * @return joinTime
         */
        public Long getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return lastVisitTime
         */
        public Long getLastVisitTime() {
            return this.lastVisitTime;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return organizationMemberName
         */
        public String getOrganizationMemberName() {
            return this.organizationMemberName;
        }

        /**
         * @return organizationRoleId
         */
        public String getOrganizationRoleId() {
            return this.organizationRoleId;
        }

        /**
         * @return organizationRoleName
         */
        public String getOrganizationRoleName() {
            return this.organizationRoleName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String accountId; 
            private Long birthday; 
            private java.util.List < String > deptLists; 
            private String email; 
            private Long hiredDate; 
            private Identities identities; 
            private String jobNumber; 
            private Long joinTime; 
            private Long lastVisitTime; 
            private String mobile; 
            private String organizationMemberName; 
            private String organizationRoleId; 
            private String organizationRoleName; 
            private String state; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * birthday.
             */
            public Builder birthday(Long birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * deptLists.
             */
            public Builder deptLists(java.util.List < String > deptLists) {
                this.deptLists = deptLists;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * hiredDate.
             */
            public Builder hiredDate(Long hiredDate) {
                this.hiredDate = hiredDate;
                return this;
            }

            /**
             * identities.
             */
            public Builder identities(Identities identities) {
                this.identities = identities;
                return this;
            }

            /**
             * jobNumber.
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            /**
             * joinTime.
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * lastVisitTime.
             */
            public Builder lastVisitTime(Long lastVisitTime) {
                this.lastVisitTime = lastVisitTime;
                return this;
            }

            /**
             * mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * organizationMemberName.
             */
            public Builder organizationMemberName(String organizationMemberName) {
                this.organizationMemberName = organizationMemberName;
                return this;
            }

            /**
             * organizationRoleId.
             */
            public Builder organizationRoleId(String organizationRoleId) {
                this.organizationRoleId = organizationRoleId;
                return this;
            }

            /**
             * organizationRoleName.
             */
            public Builder organizationRoleName(String organizationRoleName) {
                this.organizationRoleName = organizationRoleName;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
