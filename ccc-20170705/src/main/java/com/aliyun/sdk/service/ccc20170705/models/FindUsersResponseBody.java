// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindUsersResponseBody} extends {@link TeaModel}
 *
 * <p>FindUsersResponseBody</p>
 */
public class FindUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Users")
    private Users users;

    private FindUsersResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return users
     */
    public Users getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Users users; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public FindUsersResponseBody build() {
            return new FindUsersResponseBody(this);
        } 

    } 

    public static class Detail extends TeaModel {
        @NameInMap("Department")
        private String department;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Email")
        private String email;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("Phone")
        private String phone;

        private Detail(Builder builder) {
            this.department = builder.department;
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.loginName = builder.loginName;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return department
         */
        public String getDepartment() {
            return this.department;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String department; 
            private String displayName; 
            private String email; 
            private String loginName; 
            private String phone; 

            /**
             * Department.
             */
            public Builder department(String department) {
                this.department = department;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    public static class Role extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RoleDescription")
        private String roleDescription;

        @NameInMap("RoleId")
        private String roleId;

        @NameInMap("RoleName")
        private String roleName;

        private Role(Builder builder) {
            this.instanceId = builder.instanceId;
            this.roleDescription = builder.roleDescription;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return roleDescription
         */
        public String getRoleDescription() {
            return this.roleDescription;
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

        public static final class Builder {
            private String instanceId; 
            private String roleDescription; 
            private String roleId; 
            private String roleName; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RoleDescription.
             */
            public Builder roleDescription(String roleDescription) {
                this.roleDescription = roleDescription;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
    public static class Roles extends TeaModel {
        @NameInMap("Role")
        private java.util.List < Role> role;

        private Roles(Builder builder) {
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public java.util.List < Role> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List < Role> role; 

            /**
             * Role.
             */
            public Builder role(java.util.List < Role> role) {
                this.role = role;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    public static class Skill extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("SkillGroupDescription")
        private String skillGroupDescription;

        @NameInMap("SkillGroupId")
        private String skillGroupId;

        @NameInMap("SkillGroupName")
        private String skillGroupName;

        private Skill(Builder builder) {
            this.instanceId = builder.instanceId;
            this.skillGroupDescription = builder.skillGroupDescription;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Skill create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return skillGroupDescription
         */
        public String getSkillGroupDescription() {
            return this.skillGroupDescription;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return skillGroupName
         */
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public static final class Builder {
            private String instanceId; 
            private String skillGroupDescription; 
            private String skillGroupId; 
            private String skillGroupName; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * SkillGroupDescription.
             */
            public Builder skillGroupDescription(String skillGroupDescription) {
                this.skillGroupDescription = skillGroupDescription;
                return this;
            }

            /**
             * SkillGroupId.
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * SkillGroupName.
             */
            public Builder skillGroupName(String skillGroupName) {
                this.skillGroupName = skillGroupName;
                return this;
            }

            public Skill build() {
                return new Skill(this);
            } 

        } 

    }
    public static class SkillLevel extends TeaModel {
        @NameInMap("Level")
        private Integer level;

        @NameInMap("Skill")
        private Skill skill;

        @NameInMap("SkillLevelId")
        private String skillLevelId;

        private SkillLevel(Builder builder) {
            this.level = builder.level;
            this.skill = builder.skill;
            this.skillLevelId = builder.skillLevelId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillLevel create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public Integer getLevel() {
            return this.level;
        }

        /**
         * @return skill
         */
        public Skill getSkill() {
            return this.skill;
        }

        /**
         * @return skillLevelId
         */
        public String getSkillLevelId() {
            return this.skillLevelId;
        }

        public static final class Builder {
            private Integer level; 
            private Skill skill; 
            private String skillLevelId; 

            /**
             * Level.
             */
            public Builder level(Integer level) {
                this.level = level;
                return this;
            }

            /**
             * Skill.
             */
            public Builder skill(Skill skill) {
                this.skill = skill;
                return this;
            }

            /**
             * SkillLevelId.
             */
            public Builder skillLevelId(String skillLevelId) {
                this.skillLevelId = skillLevelId;
                return this;
            }

            public SkillLevel build() {
                return new SkillLevel(this);
            } 

        } 

    }
    public static class SkillLevels extends TeaModel {
        @NameInMap("SkillLevel")
        private java.util.List < SkillLevel> skillLevel;

        private SkillLevels(Builder builder) {
            this.skillLevel = builder.skillLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillLevels create() {
            return builder().build();
        }

        /**
         * @return skillLevel
         */
        public java.util.List < SkillLevel> getSkillLevel() {
            return this.skillLevel;
        }

        public static final class Builder {
            private java.util.List < SkillLevel> skillLevel; 

            /**
             * SkillLevel.
             */
            public Builder skillLevel(java.util.List < SkillLevel> skillLevel) {
                this.skillLevel = skillLevel;
                return this;
            }

            public SkillLevels build() {
                return new SkillLevels(this);
            } 

        } 

    }
    public static class User extends TeaModel {
        @NameInMap("Detail")
        private Detail detail;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("PrivateOutboundNumberId")
        private String privateOutboundNumberId;

        @NameInMap("RamId")
        private String ramId;

        @NameInMap("Roles")
        private Roles roles;

        @NameInMap("SkillLevels")
        private SkillLevels skillLevels;

        @NameInMap("UserId")
        private String userId;

        private User(Builder builder) {
            this.detail = builder.detail;
            this.instanceId = builder.instanceId;
            this.privateOutboundNumberId = builder.privateOutboundNumberId;
            this.ramId = builder.ramId;
            this.roles = builder.roles;
            this.skillLevels = builder.skillLevels;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public Detail getDetail() {
            return this.detail;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return privateOutboundNumberId
         */
        public String getPrivateOutboundNumberId() {
            return this.privateOutboundNumberId;
        }

        /**
         * @return ramId
         */
        public String getRamId() {
            return this.ramId;
        }

        /**
         * @return roles
         */
        public Roles getRoles() {
            return this.roles;
        }

        /**
         * @return skillLevels
         */
        public SkillLevels getSkillLevels() {
            return this.skillLevels;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Detail detail; 
            private String instanceId; 
            private String privateOutboundNumberId; 
            private String ramId; 
            private Roles roles; 
            private SkillLevels skillLevels; 
            private String userId; 

            /**
             * Detail.
             */
            public Builder detail(Detail detail) {
                this.detail = detail;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PrivateOutboundNumberId.
             */
            public Builder privateOutboundNumberId(String privateOutboundNumberId) {
                this.privateOutboundNumberId = privateOutboundNumberId;
                return this;
            }

            /**
             * RamId.
             */
            public Builder ramId(String ramId) {
                this.ramId = ramId;
                return this;
            }

            /**
             * Roles.
             */
            public Builder roles(Roles roles) {
                this.roles = roles;
                return this;
            }

            /**
             * SkillLevels.
             */
            public Builder skillLevels(SkillLevels skillLevels) {
                this.skillLevels = skillLevels;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("User")
        private java.util.List < User> user;

        private List(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List < User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List < User> user; 

            /**
             * User.
             */
            public Builder user(java.util.List < User> user) {
                this.user = user;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("List")
        private List list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Users(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
