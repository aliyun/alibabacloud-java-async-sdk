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
 * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>AddBulkPhoneNumbersResponseBody</p>
 */
public class AddBulkPhoneNumbersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArrearagePhoneNumbers")
    private ArrearagePhoneNumbers arrearagePhoneNumbers;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FailedPhoneNumbers")
    private FailedPhoneNumbers failedPhoneNumbers;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    private PhoneNumbers phoneNumbers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("UserdPhoneNumbers")
    private UserdPhoneNumbers userdPhoneNumbers;

    private AddBulkPhoneNumbersResponseBody(Builder builder) {
        this.arrearagePhoneNumbers = builder.arrearagePhoneNumbers;
        this.code = builder.code;
        this.failedPhoneNumbers = builder.failedPhoneNumbers;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.phoneNumbers = builder.phoneNumbers;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.userdPhoneNumbers = builder.userdPhoneNumbers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBulkPhoneNumbersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arrearagePhoneNumbers
     */
    public ArrearagePhoneNumbers getArrearagePhoneNumbers() {
        return this.arrearagePhoneNumbers;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failedPhoneNumbers
     */
    public FailedPhoneNumbers getFailedPhoneNumbers() {
        return this.failedPhoneNumbers;
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
     * @return phoneNumbers
     */
    public PhoneNumbers getPhoneNumbers() {
        return this.phoneNumbers;
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
     * @return userdPhoneNumbers
     */
    public UserdPhoneNumbers getUserdPhoneNumbers() {
        return this.userdPhoneNumbers;
    }

    public static final class Builder {
        private ArrearagePhoneNumbers arrearagePhoneNumbers; 
        private String code; 
        private FailedPhoneNumbers failedPhoneNumbers; 
        private Integer httpStatusCode; 
        private String message; 
        private PhoneNumbers phoneNumbers; 
        private String requestId; 
        private Boolean success; 
        private UserdPhoneNumbers userdPhoneNumbers; 

        private Builder() {
        } 

        private Builder(AddBulkPhoneNumbersResponseBody model) {
            this.arrearagePhoneNumbers = model.arrearagePhoneNumbers;
            this.code = model.code;
            this.failedPhoneNumbers = model.failedPhoneNumbers;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.phoneNumbers = model.phoneNumbers;
            this.requestId = model.requestId;
            this.success = model.success;
            this.userdPhoneNumbers = model.userdPhoneNumbers;
        } 

        /**
         * ArrearagePhoneNumbers.
         */
        public Builder arrearagePhoneNumbers(ArrearagePhoneNumbers arrearagePhoneNumbers) {
            this.arrearagePhoneNumbers = arrearagePhoneNumbers;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * FailedPhoneNumbers.
         */
        public Builder failedPhoneNumbers(FailedPhoneNumbers failedPhoneNumbers) {
            this.failedPhoneNumbers = failedPhoneNumbers;
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
         * PhoneNumbers.
         */
        public Builder phoneNumbers(PhoneNumbers phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
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
         * UserdPhoneNumbers.
         */
        public Builder userdPhoneNumbers(UserdPhoneNumbers userdPhoneNumbers) {
            this.userdPhoneNumbers = userdPhoneNumbers;
            return this;
        }

        public AddBulkPhoneNumbersResponseBody build() {
            return new AddBulkPhoneNumbersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>AddBulkPhoneNumbersResponseBody</p>
     */
    public static class ArrearagePhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArrearagePhoneNumber")
        private java.util.List<String> arrearagePhoneNumber;

        private ArrearagePhoneNumbers(Builder builder) {
            this.arrearagePhoneNumber = builder.arrearagePhoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ArrearagePhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return arrearagePhoneNumber
         */
        public java.util.List<String> getArrearagePhoneNumber() {
            return this.arrearagePhoneNumber;
        }

        public static final class Builder {
            private java.util.List<String> arrearagePhoneNumber; 

            private Builder() {
            } 

            private Builder(ArrearagePhoneNumbers model) {
                this.arrearagePhoneNumber = model.arrearagePhoneNumber;
            } 

            /**
             * ArrearagePhoneNumber.
             */
            public Builder arrearagePhoneNumber(java.util.List<String> arrearagePhoneNumber) {
                this.arrearagePhoneNumber = arrearagePhoneNumber;
                return this;
            }

            public ArrearagePhoneNumbers build() {
                return new ArrearagePhoneNumbers(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>AddBulkPhoneNumbersResponseBody</p>
     */
    public static class FailedPhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedPhoneNumber")
        private java.util.List<String> failedPhoneNumber;

        private FailedPhoneNumbers(Builder builder) {
            this.failedPhoneNumber = builder.failedPhoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedPhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return failedPhoneNumber
         */
        public java.util.List<String> getFailedPhoneNumber() {
            return this.failedPhoneNumber;
        }

        public static final class Builder {
            private java.util.List<String> failedPhoneNumber; 

            private Builder() {
            } 

            private Builder(FailedPhoneNumbers model) {
                this.failedPhoneNumber = model.failedPhoneNumber;
            } 

            /**
             * FailedPhoneNumber.
             */
            public Builder failedPhoneNumber(java.util.List<String> failedPhoneNumber) {
                this.failedPhoneNumber = failedPhoneNumber;
                return this;
            }

            public FailedPhoneNumbers build() {
                return new FailedPhoneNumbers(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>AddBulkPhoneNumbersResponseBody</p>
     */
    public static class ContactFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactFlowDescription")
        private String contactFlowDescription;

        @com.aliyun.core.annotation.NameInMap("ContactFlowId")
        private String contactFlowId;

        @com.aliyun.core.annotation.NameInMap("ContactFlowName")
        private String contactFlowName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ContactFlow(Builder builder) {
            this.contactFlowDescription = builder.contactFlowDescription;
            this.contactFlowId = builder.contactFlowId;
            this.contactFlowName = builder.contactFlowName;
            this.instanceId = builder.instanceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactFlow create() {
            return builder().build();
        }

        /**
         * @return contactFlowDescription
         */
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        /**
         * @return contactFlowId
         */
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        /**
         * @return contactFlowName
         */
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String contactFlowDescription; 
            private String contactFlowId; 
            private String contactFlowName; 
            private String instanceId; 
            private String type; 

            private Builder() {
            } 

            private Builder(ContactFlow model) {
                this.contactFlowDescription = model.contactFlowDescription;
                this.contactFlowId = model.contactFlowId;
                this.contactFlowName = model.contactFlowName;
                this.instanceId = model.instanceId;
                this.type = model.type;
            } 

            /**
             * ContactFlowDescription.
             */
            public Builder contactFlowDescription(String contactFlowDescription) {
                this.contactFlowDescription = contactFlowDescription;
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
             * ContactFlowName.
             */
            public Builder contactFlowName(String contactFlowName) {
                this.contactFlowName = contactFlowName;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ContactFlow build() {
                return new ContactFlow(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>AddBulkPhoneNumbersResponseBody</p>
     */
    public static class SkillGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupName")
        private String skillGroupName;

        private SkillGroup(Builder builder) {
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroup create() {
            return builder().build();
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
            private String skillGroupId; 
            private String skillGroupName; 

            private Builder() {
            } 

            private Builder(SkillGroup model) {
                this.skillGroupId = model.skillGroupId;
                this.skillGroupName = model.skillGroupName;
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

            public SkillGroup build() {
                return new SkillGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>AddBulkPhoneNumbersResponseBody</p>
     */
    public static class SkillGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkillGroup")
        private java.util.List<SkillGroup> skillGroup;

        private SkillGroups(Builder builder) {
            this.skillGroup = builder.skillGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroups create() {
            return builder().build();
        }

        /**
         * @return skillGroup
         */
        public java.util.List<SkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

        public static final class Builder {
            private java.util.List<SkillGroup> skillGroup; 

            private Builder() {
            } 

            private Builder(SkillGroups model) {
                this.skillGroup = model.skillGroup;
            } 

            /**
             * SkillGroup.
             */
            public Builder skillGroup(java.util.List<SkillGroup> skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            public SkillGroups build() {
                return new SkillGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>AddBulkPhoneNumbersResponseBody</p>
     */
    public static class PhoneNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowOutbound")
        private Boolean allowOutbound;

        @com.aliyun.core.annotation.NameInMap("ContactFlow")
        private ContactFlow contactFlow;

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

        @com.aliyun.core.annotation.NameInMap("SkillGroups")
        private SkillGroups skillGroups;

        @com.aliyun.core.annotation.NameInMap("TestOnly")
        private Boolean testOnly;

        @com.aliyun.core.annotation.NameInMap("Trunks")
        private Integer trunks;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private PhoneNumber(Builder builder) {
            this.allowOutbound = builder.allowOutbound;
            this.contactFlow = builder.contactFlow;
            this.instanceId = builder.instanceId;
            this.number = builder.number;
            this.phoneNumberDescription = builder.phoneNumberDescription;
            this.phoneNumberId = builder.phoneNumberId;
            this.remainingTime = builder.remainingTime;
            this.skillGroups = builder.skillGroups;
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
         * @return contactFlow
         */
        public ContactFlow getContactFlow() {
            return this.contactFlow;
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
         * @return skillGroups
         */
        public SkillGroups getSkillGroups() {
            return this.skillGroups;
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
            private ContactFlow contactFlow; 
            private String instanceId; 
            private String number; 
            private String phoneNumberDescription; 
            private String phoneNumberId; 
            private Integer remainingTime; 
            private SkillGroups skillGroups; 
            private Boolean testOnly; 
            private Integer trunks; 
            private String usage; 

            private Builder() {
            } 

            private Builder(PhoneNumber model) {
                this.allowOutbound = model.allowOutbound;
                this.contactFlow = model.contactFlow;
                this.instanceId = model.instanceId;
                this.number = model.number;
                this.phoneNumberDescription = model.phoneNumberDescription;
                this.phoneNumberId = model.phoneNumberId;
                this.remainingTime = model.remainingTime;
                this.skillGroups = model.skillGroups;
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
             * ContactFlow.
             */
            public Builder contactFlow(ContactFlow contactFlow) {
                this.contactFlow = contactFlow;
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
             * SkillGroups.
             */
            public Builder skillGroups(SkillGroups skillGroups) {
                this.skillGroups = skillGroups;
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
     * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>AddBulkPhoneNumbersResponseBody</p>
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
     * {@link AddBulkPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>AddBulkPhoneNumbersResponseBody</p>
     */
    public static class UserdPhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserdPhoneNumber")
        private java.util.List<String> userdPhoneNumber;

        private UserdPhoneNumbers(Builder builder) {
            this.userdPhoneNumber = builder.userdPhoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserdPhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return userdPhoneNumber
         */
        public java.util.List<String> getUserdPhoneNumber() {
            return this.userdPhoneNumber;
        }

        public static final class Builder {
            private java.util.List<String> userdPhoneNumber; 

            private Builder() {
            } 

            private Builder(UserdPhoneNumbers model) {
                this.userdPhoneNumber = model.userdPhoneNumber;
            } 

            /**
             * UserdPhoneNumber.
             */
            public Builder userdPhoneNumber(java.util.List<String> userdPhoneNumber) {
                this.userdPhoneNumber = userdPhoneNumber;
                return this;
            }

            public UserdPhoneNumbers build() {
                return new UserdPhoneNumbers(this);
            } 

        } 

    }
}
