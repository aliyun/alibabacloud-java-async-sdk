// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateInstanceResponseBody</p>
 */
public class CreateInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Instance")
    private Instance instance;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.instance = builder.instance;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceResponseBody create() {
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
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
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
        private Instance instance; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
         * Instance.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
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

        public CreateInstanceResponseBody build() {
            return new CreateInstanceResponseBody(this);
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
    public static class User extends TeaModel {
        @NameInMap("Detail")
        private Detail detail;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("RamId")
        private String ramId;

        @NameInMap("UserId")
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
    public static class Admin extends TeaModel {
        @NameInMap("User")
        private java.util.List < User> user;

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

            public Admin build() {
                return new Admin(this);
            } 

        } 

    }
    public static class FailLoginNames extends TeaModel {
        @NameInMap("FailLoginName")
        private java.util.List < String > failLoginName;

        private FailLoginNames(Builder builder) {
            this.failLoginName = builder.failLoginName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailLoginNames create() {
            return builder().build();
        }

        /**
         * @return failLoginName
         */
        public java.util.List < String > getFailLoginName() {
            return this.failLoginName;
        }

        public static final class Builder {
            private java.util.List < String > failLoginName; 

            /**
             * FailLoginName.
             */
            public Builder failLoginName(java.util.List < String > failLoginName) {
                this.failLoginName = failLoginName;
                return this;
            }

            public FailLoginNames build() {
                return new FailLoginNames(this);
            } 

        } 

    }
    public static class FailPhoneNumbers extends TeaModel {
        @NameInMap("FailPhoneNumber")
        private java.util.List < String > failPhoneNumber;

        private FailPhoneNumbers(Builder builder) {
            this.failPhoneNumber = builder.failPhoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailPhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return failPhoneNumber
         */
        public java.util.List < String > getFailPhoneNumber() {
            return this.failPhoneNumber;
        }

        public static final class Builder {
            private java.util.List < String > failPhoneNumber; 

            /**
             * FailPhoneNumber.
             */
            public Builder failPhoneNumber(java.util.List < String > failPhoneNumber) {
                this.failPhoneNumber = failPhoneNumber;
                return this;
            }

            public FailPhoneNumbers build() {
                return new FailPhoneNumbers(this);
            } 

        } 

    }
    public static class PhoneNumber extends TeaModel {
        @NameInMap("AllowOutbound")
        private Boolean allowOutbound;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Number")
        private String number;

        @NameInMap("PhoneNumberDescription")
        private String phoneNumberDescription;

        @NameInMap("PhoneNumberId")
        private String phoneNumberId;

        @NameInMap("RemainingTime")
        private Integer remainingTime;

        @NameInMap("TestOnly")
        private Boolean testOnly;

        @NameInMap("Trunks")
        private Integer trunks;

        @NameInMap("Usage")
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
    public static class PhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        private java.util.List < PhoneNumber> phoneNumber;

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
        public java.util.List < PhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

        public static final class Builder {
            private java.util.List < PhoneNumber> phoneNumber; 

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(java.util.List < PhoneNumber> phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            public PhoneNumbers build() {
                return new PhoneNumbers(this);
            } 

        } 

    }
    public static class SuccessLoginNames extends TeaModel {
        @NameInMap("SuccessLoginName")
        private java.util.List < String > successLoginName;

        private SuccessLoginNames(Builder builder) {
            this.successLoginName = builder.successLoginName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessLoginNames create() {
            return builder().build();
        }

        /**
         * @return successLoginName
         */
        public java.util.List < String > getSuccessLoginName() {
            return this.successLoginName;
        }

        public static final class Builder {
            private java.util.List < String > successLoginName; 

            /**
             * SuccessLoginName.
             */
            public Builder successLoginName(java.util.List < String > successLoginName) {
                this.successLoginName = successLoginName;
                return this;
            }

            public SuccessLoginNames build() {
                return new SuccessLoginNames(this);
            } 

        } 

    }
    public static class SuccessPhoneNumbers extends TeaModel {
        @NameInMap("SuccessPhoneNumber")
        private java.util.List < String > successPhoneNumber;

        private SuccessPhoneNumbers(Builder builder) {
            this.successPhoneNumber = builder.successPhoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuccessPhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return successPhoneNumber
         */
        public java.util.List < String > getSuccessPhoneNumber() {
            return this.successPhoneNumber;
        }

        public static final class Builder {
            private java.util.List < String > successPhoneNumber; 

            /**
             * SuccessPhoneNumber.
             */
            public Builder successPhoneNumber(java.util.List < String > successPhoneNumber) {
                this.successPhoneNumber = successPhoneNumber;
                return this;
            }

            public SuccessPhoneNumbers build() {
                return new SuccessPhoneNumbers(this);
            } 

        } 

    }
    public static class Instance extends TeaModel {
        @NameInMap("Admin")
        private Admin admin;

        @NameInMap("ConsoleUrl")
        private String consoleUrl;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("DirectoryId")
        private String directoryId;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("FailLoginNames")
        private FailLoginNames failLoginNames;

        @NameInMap("FailPhoneNumbers")
        private FailPhoneNumbers failPhoneNumbers;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("MaxOnlineAgents")
        private Integer maxOnlineAgents;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("PhoneNumbers")
        private PhoneNumbers phoneNumbers;

        @NameInMap("Status")
        private String status;

        @NameInMap("StorageBucket")
        private String storageBucket;

        @NameInMap("StorageMaxDays")
        private Integer storageMaxDays;

        @NameInMap("StorageMaxSize")
        private Integer storageMaxSize;

        @NameInMap("SuccessLoginNames")
        private SuccessLoginNames successLoginNames;

        @NameInMap("SuccessPhoneNumbers")
        private SuccessPhoneNumbers successPhoneNumbers;

        @NameInMap("TenantId")
        private String tenantId;

        private Instance(Builder builder) {
            this.admin = builder.admin;
            this.consoleUrl = builder.consoleUrl;
            this.createdTime = builder.createdTime;
            this.directoryId = builder.directoryId;
            this.domainName = builder.domainName;
            this.failLoginNames = builder.failLoginNames;
            this.failPhoneNumbers = builder.failPhoneNumbers;
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
            this.successLoginNames = builder.successLoginNames;
            this.successPhoneNumbers = builder.successPhoneNumbers;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
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
         * @return failLoginNames
         */
        public FailLoginNames getFailLoginNames() {
            return this.failLoginNames;
        }

        /**
         * @return failPhoneNumbers
         */
        public FailPhoneNumbers getFailPhoneNumbers() {
            return this.failPhoneNumbers;
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
         * @return successLoginNames
         */
        public SuccessLoginNames getSuccessLoginNames() {
            return this.successLoginNames;
        }

        /**
         * @return successPhoneNumbers
         */
        public SuccessPhoneNumbers getSuccessPhoneNumbers() {
            return this.successPhoneNumbers;
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
            private FailLoginNames failLoginNames; 
            private FailPhoneNumbers failPhoneNumbers; 
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
            private SuccessLoginNames successLoginNames; 
            private SuccessPhoneNumbers successPhoneNumbers; 
            private String tenantId; 

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
             * FailLoginNames.
             */
            public Builder failLoginNames(FailLoginNames failLoginNames) {
                this.failLoginNames = failLoginNames;
                return this;
            }

            /**
             * FailPhoneNumbers.
             */
            public Builder failPhoneNumbers(FailPhoneNumbers failPhoneNumbers) {
                this.failPhoneNumbers = failPhoneNumbers;
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
             * SuccessLoginNames.
             */
            public Builder successLoginNames(SuccessLoginNames successLoginNames) {
                this.successLoginNames = successLoginNames;
                return this;
            }

            /**
             * SuccessPhoneNumbers.
             */
            public Builder successPhoneNumbers(SuccessPhoneNumbers successPhoneNumbers) {
                this.successPhoneNumbers = successPhoneNumbers;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
