// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Instances")
    private Instances instances;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListInstancesOfUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instances = builder.instances;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instances
     */
    public Instances getInstances() {
        return this.instances;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private Instances instances; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListInstancesOfUserResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.instances = model.instances;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
         * Instances.
         */
        public Builder instances(Instances instances) {
            this.instances = instances;
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
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Department")
        private String department;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("Phone")
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

            private Builder() {
            } 

            private Builder(Detail model) {
                this.department = model.department;
                this.displayName = model.displayName;
                this.email = model.email;
                this.loginName = model.loginName;
                this.phone = model.phone;
            } 

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
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private Detail detail;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RamId")
        private String ramId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private User(Builder builder) {
            this.detail = builder.detail;
            this.instanceId = builder.instanceId;
            this.ramId = builder.ramId;
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
         * @return ramId
         */
        public String getRamId() {
            return this.ramId;
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
            private String ramId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(User model) {
                this.detail = model.detail;
                this.instanceId = model.instanceId;
                this.ramId = model.ramId;
                this.userId = model.userId;
            } 

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
             * RamId.
             */
            public Builder ramId(String ramId) {
                this.ramId = ramId;
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
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class Admin extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private java.util.List<User> user;

        private Admin(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Admin create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List<User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List<User> user; 

            private Builder() {
            } 

            private Builder(Admin model) {
                this.user = model.user;
            } 

            /**
             * User.
             */
            public Builder user(java.util.List<User> user) {
                this.user = user;
                return this;
            }

            public Admin build() {
                return new Admin(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class PhoneNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowOutbound")
        private Boolean allowOutbound;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberDescription")
        private String phoneNumberDescription;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberId")
        private String phoneNumberId;

        @com.aliyun.core.annotation.NameInMap("RemainingTime")
        private Integer remainingTime;

        @com.aliyun.core.annotation.NameInMap("TestOnly")
        private Boolean testOnly;

        @com.aliyun.core.annotation.NameInMap("Trunks")
        private Integer trunks;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private PhoneNumber(Builder builder) {
            this.allowOutbound = builder.allowOutbound;
            this.instanceId = builder.instanceId;
            this.number = builder.number;
            this.phoneNumberDescription = builder.phoneNumberDescription;
            this.phoneNumberId = builder.phoneNumberId;
            this.remainingTime = builder.remainingTime;
            this.testOnly = builder.testOnly;
            this.trunks = builder.trunks;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneNumber create() {
            return builder().build();
        }

        /**
         * @return allowOutbound
         */
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
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
         * @return phoneNumberDescription
         */
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        /**
         * @return phoneNumberId
         */
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        /**
         * @return remainingTime
         */
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        /**
         * @return testOnly
         */
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        /**
         * @return trunks
         */
        public Integer getTrunks() {
            return this.trunks;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Boolean allowOutbound; 
            private String instanceId; 
            private String number; 
            private String phoneNumberDescription; 
            private String phoneNumberId; 
            private Integer remainingTime; 
            private Boolean testOnly; 
            private Integer trunks; 
            private String usage; 

            private Builder() {
            } 

            private Builder(PhoneNumber model) {
                this.allowOutbound = model.allowOutbound;
                this.instanceId = model.instanceId;
                this.number = model.number;
                this.phoneNumberDescription = model.phoneNumberDescription;
                this.phoneNumberId = model.phoneNumberId;
                this.remainingTime = model.remainingTime;
                this.testOnly = model.testOnly;
                this.trunks = model.trunks;
                this.usage = model.usage;
            } 

            /**
             * AllowOutbound.
             */
            public Builder allowOutbound(Boolean allowOutbound) {
                this.allowOutbound = allowOutbound;
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
             * PhoneNumberDescription.
             */
            public Builder phoneNumberDescription(String phoneNumberDescription) {
                this.phoneNumberDescription = phoneNumberDescription;
                return this;
            }

            /**
             * PhoneNumberId.
             */
            public Builder phoneNumberId(String phoneNumberId) {
                this.phoneNumberId = phoneNumberId;
                return this;
            }

            /**
             * RemainingTime.
             */
            public Builder remainingTime(Integer remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * TestOnly.
             */
            public Builder testOnly(Boolean testOnly) {
                this.testOnly = testOnly;
                return this;
            }

            /**
             * Trunks.
             */
            public Builder trunks(Integer trunks) {
                this.trunks = trunks;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public PhoneNumber build() {
                return new PhoneNumber(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class PhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private java.util.List<PhoneNumber> phoneNumber;

        private PhoneNumbers(Builder builder) {
            this.phoneNumber = builder.phoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return phoneNumber
         */
        public java.util.List<PhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

        public static final class Builder {
            private java.util.List<PhoneNumber> phoneNumber; 

            private Builder() {
            } 

            private Builder(PhoneNumbers model) {
                this.phoneNumber = model.phoneNumber;
            } 

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(java.util.List<PhoneNumber> phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            public PhoneNumbers build() {
                return new PhoneNumbers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class CallCenterInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Admin")
        private Admin admin;

        @com.aliyun.core.annotation.NameInMap("ConsoleUrl")
        private String consoleUrl;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private String directoryId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MaxOnlineAgents")
        private Integer maxOnlineAgents;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
        private PhoneNumbers phoneNumbers;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageBucket")
        private String storageBucket;

        @com.aliyun.core.annotation.NameInMap("StorageMaxDays")
        private Integer storageMaxDays;

        @com.aliyun.core.annotation.NameInMap("StorageMaxSize")
        private Integer storageMaxSize;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private CallCenterInstance(Builder builder) {
            this.admin = builder.admin;
            this.consoleUrl = builder.consoleUrl;
            this.createdTime = builder.createdTime;
            this.directoryId = builder.directoryId;
            this.domainName = builder.domainName;
            this.instanceDescription = builder.instanceDescription;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.maxOnlineAgents = builder.maxOnlineAgents;
            this.owner = builder.owner;
            this.phoneNumbers = builder.phoneNumbers;
            this.status = builder.status;
            this.storageBucket = builder.storageBucket;
            this.storageMaxDays = builder.storageMaxDays;
            this.storageMaxSize = builder.storageMaxSize;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallCenterInstance create() {
            return builder().build();
        }

        /**
         * @return admin
         */
        public Admin getAdmin() {
            return this.admin;
        }

        /**
         * @return consoleUrl
         */
        public String getConsoleUrl() {
            return this.consoleUrl;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return directoryId
         */
        public String getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return maxOnlineAgents
         */
        public Integer getMaxOnlineAgents() {
            return this.maxOnlineAgents;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return phoneNumbers
         */
        public PhoneNumbers getPhoneNumbers() {
            return this.phoneNumbers;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageBucket
         */
        public String getStorageBucket() {
            return this.storageBucket;
        }

        /**
         * @return storageMaxDays
         */
        public Integer getStorageMaxDays() {
            return this.storageMaxDays;
        }

        /**
         * @return storageMaxSize
         */
        public Integer getStorageMaxSize() {
            return this.storageMaxSize;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Admin admin; 
            private String consoleUrl; 
            private Long createdTime; 
            private String directoryId; 
            private String domainName; 
            private String instanceDescription; 
            private String instanceId; 
            private String instanceName; 
            private Integer maxOnlineAgents; 
            private String owner; 
            private PhoneNumbers phoneNumbers; 
            private String status; 
            private String storageBucket; 
            private Integer storageMaxDays; 
            private Integer storageMaxSize; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(CallCenterInstance model) {
                this.admin = model.admin;
                this.consoleUrl = model.consoleUrl;
                this.createdTime = model.createdTime;
                this.directoryId = model.directoryId;
                this.domainName = model.domainName;
                this.instanceDescription = model.instanceDescription;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.maxOnlineAgents = model.maxOnlineAgents;
                this.owner = model.owner;
                this.phoneNumbers = model.phoneNumbers;
                this.status = model.status;
                this.storageBucket = model.storageBucket;
                this.storageMaxDays = model.storageMaxDays;
                this.storageMaxSize = model.storageMaxSize;
                this.tenantId = model.tenantId;
            } 

            /**
             * Admin.
             */
            public Builder admin(Admin admin) {
                this.admin = admin;
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
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DirectoryId.
             */
            public Builder directoryId(String directoryId) {
                this.directoryId = directoryId;
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
             * InstanceDescription.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * MaxOnlineAgents.
             */
            public Builder maxOnlineAgents(Integer maxOnlineAgents) {
                this.maxOnlineAgents = maxOnlineAgents;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * PhoneNumbers.
             */
            public Builder phoneNumbers(PhoneNumbers phoneNumbers) {
                this.phoneNumbers = phoneNumbers;
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
             * StorageBucket.
             */
            public Builder storageBucket(String storageBucket) {
                this.storageBucket = storageBucket;
                return this;
            }

            /**
             * StorageMaxDays.
             */
            public Builder storageMaxDays(Integer storageMaxDays) {
                this.storageMaxDays = storageMaxDays;
                return this;
            }

            /**
             * StorageMaxSize.
             */
            public Builder storageMaxSize(Integer storageMaxSize) {
                this.storageMaxSize = storageMaxSize;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public CallCenterInstance build() {
                return new CallCenterInstance(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesOfUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesOfUserResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallCenterInstance")
        private java.util.List<CallCenterInstance> callCenterInstance;

        private Instances(Builder builder) {
            this.callCenterInstance = builder.callCenterInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return callCenterInstance
         */
        public java.util.List<CallCenterInstance> getCallCenterInstance() {
            return this.callCenterInstance;
        }

        public static final class Builder {
            private java.util.List<CallCenterInstance> callCenterInstance; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.callCenterInstance = model.callCenterInstance;
            } 

            /**
             * CallCenterInstance.
             */
            public Builder callCenterInstance(java.util.List<CallCenterInstance> callCenterInstance) {
                this.callCenterInstance = callCenterInstance;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
