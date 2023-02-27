// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesOfUserResponseBody</p>
 */
public class ListInstancesOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListInstancesOfUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesOfUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListInstancesOfUserResponseBody build() {
            return new ListInstancesOfUserResponseBody(this);
        } 

    } 

    public static class AdminList extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Email")
        private String email;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("RoleId")
        private String roleId;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("WorkMode")
        private String workMode;

        private AdminList(Builder builder) {
            this.displayName = builder.displayName;
            this.email = builder.email;
            this.extension = builder.extension;
            this.instanceId = builder.instanceId;
            this.loginName = builder.loginName;
            this.mobile = builder.mobile;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.userId = builder.userId;
            this.workMode = builder.workMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdminList create() {
            return builder().build();
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
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return workMode
         */
        public String getWorkMode() {
            return this.workMode;
        }

        public static final class Builder {
            private String displayName; 
            private String email; 
            private String extension; 
            private String instanceId; 
            private String loginName; 
            private String mobile; 
            private String roleId; 
            private String roleName; 
            private String userId; 
            private String workMode; 

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
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
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
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
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

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WorkMode.
             */
            public Builder workMode(String workMode) {
                this.workMode = workMode;
                return this;
            }

            public AdminList build() {
                return new AdminList(this);
            } 

        } 

    }
    public static class SkillGroups extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PhoneNumberCount")
        private Integer phoneNumberCount;

        @NameInMap("SkillGroupId")
        private String skillGroupId;

        @NameInMap("UserCount")
        private Integer userCount;

        private SkillGroups(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.phoneNumberCount = builder.phoneNumberCount;
            this.skillGroupId = builder.skillGroupId;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroups create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phoneNumberCount
         */
        public Integer getPhoneNumberCount() {
            return this.phoneNumberCount;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String instanceId; 
            private String name; 
            private Integer phoneNumberCount; 
            private String skillGroupId; 
            private Integer userCount; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * PhoneNumberCount.
             */
            public Builder phoneNumberCount(Integer phoneNumberCount) {
                this.phoneNumberCount = phoneNumberCount;
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
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            public SkillGroups build() {
                return new SkillGroups(this);
            } 

        } 

    }
    public static class NumberList extends TeaModel {
        @NameInMap("Active")
        private Boolean active;

        @NameInMap("City")
        private String city;

        @NameInMap("ContactFlowId")
        private String contactFlowId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Number")
        private String number;

        @NameInMap("Province")
        private String province;

        @NameInMap("SkillGroups")
        private java.util.List < SkillGroups> skillGroups;

        @NameInMap("Usage")
        private String usage;

        @NameInMap("UserId")
        private String userId;

        private NumberList(Builder builder) {
            this.active = builder.active;
            this.city = builder.city;
            this.contactFlowId = builder.contactFlowId;
            this.instanceId = builder.instanceId;
            this.number = builder.number;
            this.province = builder.province;
            this.skillGroups = builder.skillGroups;
            this.usage = builder.usage;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NumberList create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return contactFlowId
         */
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return skillGroups
         */
        public java.util.List < SkillGroups> getSkillGroups() {
            return this.skillGroups;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean active; 
            private String city; 
            private String contactFlowId; 
            private String instanceId; 
            private String number; 
            private String province; 
            private java.util.List < SkillGroups> skillGroups; 
            private String usage; 
            private String userId; 

            /**
             * Active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * ContactFlowId.
             */
            public Builder contactFlowId(String contactFlowId) {
                this.contactFlowId = contactFlowId;
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
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * SkillGroups.
             */
            public Builder skillGroups(java.util.List < SkillGroups> skillGroups) {
                this.skillGroups = skillGroups;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public NumberList build() {
                return new NumberList(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("AdminList")
        private java.util.List < AdminList> adminList;

        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("ConsoleUrl")
        private String consoleUrl;

        @NameInMap("Description")
        private String description;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("NumberList")
        private java.util.List < NumberList> numberList;

        @NameInMap("Status")
        private String status;

        private List(Builder builder) {
            this.adminList = builder.adminList;
            this.aliyunUid = builder.aliyunUid;
            this.consoleUrl = builder.consoleUrl;
            this.description = builder.description;
            this.domainName = builder.domainName;
            this.id = builder.id;
            this.name = builder.name;
            this.numberList = builder.numberList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return adminList
         */
        public java.util.List < AdminList> getAdminList() {
            return this.adminList;
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return consoleUrl
         */
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return numberList
         */
        public java.util.List < NumberList> getNumberList() {
            return this.numberList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < AdminList> adminList; 
            private String aliyunUid; 
            private String consoleUrl; 
            private String description; 
            private String domainName; 
            private String id; 
            private String name; 
            private java.util.List < NumberList> numberList; 
            private String status; 

            /**
             * AdminList.
             */
            public Builder adminList(java.util.List < AdminList> adminList) {
                this.adminList = adminList;
                return this;
            }

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * ConsoleUrl.
             */
            public Builder consoleUrl(String consoleUrl) {
                this.consoleUrl = consoleUrl;
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
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * NumberList.
             */
            public Builder numberList(java.util.List < NumberList> numberList) {
                this.numberList = numberList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
