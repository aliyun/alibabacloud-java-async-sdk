// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationMembersResponseBody</p>
 */
public class ListOrganizationMembersResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("members")
    private java.util.List < Members> members;

    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("totalCount")
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
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 成员列表
         */
        public Builder members(java.util.List < Members> members) {
            this.members = members;
            return this;
        }

        /**
         * 分页Token
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * 总数
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
        @NameInMap("externUid")
        private String externUid;

        @NameInMap("provider")
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
             * 第三方系统的用户Id
             */
            public Builder externUid(String externUid) {
                this.externUid = externUid;
                return this;
            }

            /**
             * 第三方系统
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
        @NameInMap("accountId")
        private String accountId;

        @NameInMap("birthday")
        private Long birthday;

        @NameInMap("deptLists")
        private java.util.List < String > deptLists;

        @NameInMap("email")
        private String email;

        @NameInMap("hiredDate")
        private Long hiredDate;

        @NameInMap("identities")
        private Identities identities;

        @NameInMap("joinTime")
        private Long joinTime;

        @NameInMap("lastVisitTime")
        private Long lastVisitTime;

        @NameInMap("mobile")
        private String mobile;

        @NameInMap("organizationMemberName")
        private String organizationMemberName;

        @NameInMap("organizationRoleId")
        private String organizationRoleId;

        @NameInMap("organizationRoleName")
        private String organizationRoleName;

        @NameInMap("state")
        private String state;

        private Members(Builder builder) {
            this.accountId = builder.accountId;
            this.birthday = builder.birthday;
            this.deptLists = builder.deptLists;
            this.email = builder.email;
            this.hiredDate = builder.hiredDate;
            this.identities = builder.identities;
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
            private Long joinTime; 
            private Long lastVisitTime; 
            private String mobile; 
            private String organizationMemberName; 
            private String organizationRoleId; 
            private String organizationRoleName; 
            private String state; 

            /**
             * 阿里云用户ID
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * 生日
             */
            public Builder birthday(Long birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * 部门名称列表
             */
            public Builder deptLists(java.util.List < String > deptLists) {
                this.deptLists = deptLists;
                return this;
            }

            /**
             * 邮箱
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 入职时间
             */
            public Builder hiredDate(Long hiredDate) {
                this.hiredDate = hiredDate;
                return this;
            }

            /**
             * 第三方信息
             */
            public Builder identities(Identities identities) {
                this.identities = identities;
                return this;
            }

            /**
             * 加入云效企业时间
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * 最近一次访问时间
             */
            public Builder lastVisitTime(Long lastVisitTime) {
                this.lastVisitTime = lastVisitTime;
                return this;
            }

            /**
             * 手机号
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * 企业成员名
             */
            public Builder organizationMemberName(String organizationMemberName) {
                this.organizationMemberName = organizationMemberName;
                return this;
            }

            /**
             * 企业角色Id
             */
            public Builder organizationRoleId(String organizationRoleId) {
                this.organizationRoleId = organizationRoleId;
                return this;
            }

            /**
             * 企业角色名字
             */
            public Builder organizationRoleName(String organizationRoleName) {
                this.organizationRoleName = organizationRoleName;
                return this;
            }

            /**
             * 用户状态
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
