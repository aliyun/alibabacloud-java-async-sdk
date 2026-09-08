// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesOfUserResponseBody</p>
 */
public class ListInstancesOfUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListInstancesOfUserResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3969FC68-CEC2-4398-B76A-60D2F7EDEBAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancesOfUserResponseBody build() {
            return new ListInstancesOfUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class AdminList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("WorkMode")
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

            private Builder() {
            } 

            private Builder(AdminList model) {
                this.displayName = model.displayName;
                this.email = model.email;
                this.extension = model.extension;
                this.instanceId = model.instanceId;
                this.loginName = model.loginName;
                this.mobile = model.mobile;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
                this.userId = model.userId;
                this.workMode = model.workMode;
            } 

            /**
             * <p>The administrator\&quot;s name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试坐席</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Mailbox.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Agent extension number.</p>
             * 
             * <strong>example:</strong>
             * <p>8032****</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Agent logon name.</p>
             * 
             * <strong>example:</strong>
             * <p>agent</p>
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * <p>The agent\&quot;s personal phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1382114****</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>The role ID, in the format: role\@instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Admin@ccc-test</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>Role name.</p>
             * 
             * <strong>example:</strong>
             * <p>Admin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>Work mode.</p>
             * 
             * <strong>example:</strong>
             * <p>ON_SITE</p>
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
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class SkillGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberCount")
        private Integer phoneNumberCount;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("UserCount")
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

            private Builder() {
            } 

            private Builder(SkillGroups model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.phoneNumberCount = model.phoneNumberCount;
                this.skillGroupId = model.skillGroupId;
                this.userCount = model.userCount;
            } 

            /**
             * <p>Skill group description.</p>
             * 
             * <strong>example:</strong>
             * <p>云联络中心的测试技能组。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>测试技能组</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Number of phone numbers associated with the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder phoneNumberCount(Integer phoneNumberCount) {
                this.phoneNumberCount = phoneNumberCount;
                return this;
            }

            /**
             * <p>The skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * <p>The number of agents associated with the skill group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class NumberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("ContactFlowId")
        private String contactFlowId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("SkillGroups")
        private java.util.List<SkillGroups> skillGroups;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        @com.aliyun.core.annotation.NameInMap("UserId")
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
        public java.util.List<SkillGroups> getSkillGroups() {
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
            private java.util.List<SkillGroups> skillGroups; 
            private String usage; 
            private String userId; 

            private Builder() {
            } 

            private Builder(NumberList model) {
                this.active = model.active;
                this.city = model.city;
                this.contactFlowId = model.contactFlowId;
                this.instanceId = model.instanceId;
                this.number = model.number;
                this.province = model.province;
                this.skillGroups = model.skillGroups;
                this.usage = model.usage;
                this.userId = model.userId;
            } 

            /**
             * <p>Indicates whether the number is active.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The city of the phone number\&quot;s registration location.</p>
             * 
             * <strong>example:</strong>
             * <p>乐山</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The contact flow ID (IVR) associated with this phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>a3fb6c62-9b49-4942-ae5b-cf2abd4123ek</p>
             */
            public Builder contactFlowId(String contactFlowId) {
                this.contactFlowId = contactFlowId;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number.</p>
             * 
             * <strong>example:</strong>
             * <p>0830011****</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>The province of the phone number\&quot;s registration location.</p>
             * 
             * <strong>example:</strong>
             * <p>四川</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>List of skill groups associated with the phone number.</p>
             */
            public Builder skillGroups(java.util.List<SkillGroups> skillGroups) {
                this.skillGroups = skillGroups;
                return this;
            }

            /**
             * <p>The usage of the number.</p>
             * 
             * <strong>example:</strong>
             * <p>Bidirection</p>
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * <p>Agent ID. If this parameter is not empty, the number is a personal outbound number assigned to the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
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
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminList")
        private java.util.List<AdminList> adminList;

        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("ConsoleUrl")
        private String consoleUrl;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NumberList")
        private java.util.List<NumberList> numberList;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<AdminList> getAdminList() {
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
        public java.util.List<NumberList> getNumberList() {
            return this.numberList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<AdminList> adminList; 
            private String aliyunUid; 
            private String consoleUrl; 
            private String description; 
            private String domainName; 
            private String id; 
            private String name; 
            private java.util.List<NumberList> numberList; 
            private String status; 

            private Builder() {
            } 

            private Builder(List model) {
                this.adminList = model.adminList;
                this.aliyunUid = model.aliyunUid;
                this.consoleUrl = model.consoleUrl;
                this.description = model.description;
                this.domainName = model.domainName;
                this.id = model.id;
                this.name = model.name;
                this.numberList = model.numberList;
                this.status = model.status;
            } 

            /**
             * <p>Administrator list.</p>
             */
            public Builder adminList(java.util.List<AdminList> adminList) {
                this.adminList = adminList;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Account ID to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>157123456789****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The URL of the Cloud Contact Center instance, used to access the homepage of the Cloud Contact Center instance. It consists of the specific Cloud Contact Center URL followed by the instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ccc-v2.aliyun.com/#/workbench/ccc-test">https://ccc-v2.aliyun.com/#/workbench/ccc-test</a></p>
             */
            public Builder consoleUrl(String consoleUrl) {
                this.consoleUrl = consoleUrl;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>云联络中心的测试实例。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The domain name of the instance, which is globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试实例</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>List of numbers.</p>
             */
            public Builder numberList(java.util.List<NumberList> numberList) {
                this.numberList = numberList;
                return this;
            }

            /**
             * <p>Instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
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
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>List.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
