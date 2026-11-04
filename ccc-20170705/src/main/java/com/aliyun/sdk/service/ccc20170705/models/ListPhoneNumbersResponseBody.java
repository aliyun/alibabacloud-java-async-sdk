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
 * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>ListPhoneNumbersResponseBody</p>
 */
public class ListPhoneNumbersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

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

    private ListPhoneNumbersResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.phoneNumbers = builder.phoneNumbers;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPhoneNumbersResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PhoneNumbers phoneNumbers; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPhoneNumbersResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.phoneNumbers = model.phoneNumbers;
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

        public ListPhoneNumbersResponseBody build() {
            return new ListPhoneNumbersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
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
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
     */
    public static class PrivacyNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("PoolId")
        private String poolId;

        @com.aliyun.core.annotation.NameInMap("PoolName")
        private String poolName;

        @com.aliyun.core.annotation.NameInMap("RegionNameCity")
        private String regionNameCity;

        @com.aliyun.core.annotation.NameInMap("SubId")
        private String subId;

        @com.aliyun.core.annotation.NameInMap("TelX")
        private String telX;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private PrivacyNumber(Builder builder) {
            this.bizId = builder.bizId;
            this.extra = builder.extra;
            this.phoneNumber = builder.phoneNumber;
            this.poolId = builder.poolId;
            this.poolName = builder.poolName;
            this.regionNameCity = builder.regionNameCity;
            this.subId = builder.subId;
            this.telX = builder.telX;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivacyNumber create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return poolId
         */
        public String getPoolId() {
            return this.poolId;
        }

        /**
         * @return poolName
         */
        public String getPoolName() {
            return this.poolName;
        }

        /**
         * @return regionNameCity
         */
        public String getRegionNameCity() {
            return this.regionNameCity;
        }

        /**
         * @return subId
         */
        public String getSubId() {
            return this.subId;
        }

        /**
         * @return telX
         */
        public String getTelX() {
            return this.telX;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bizId; 
            private String extra; 
            private String phoneNumber; 
            private String poolId; 
            private String poolName; 
            private String regionNameCity; 
            private String subId; 
            private String telX; 
            private String type; 

            private Builder() {
            } 

            private Builder(PrivacyNumber model) {
                this.bizId = model.bizId;
                this.extra = model.extra;
                this.phoneNumber = model.phoneNumber;
                this.poolId = model.poolId;
                this.poolName = model.poolName;
                this.regionNameCity = model.regionNameCity;
                this.subId = model.subId;
                this.telX = model.telX;
                this.type = model.type;
            } 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * PoolId.
             */
            public Builder poolId(String poolId) {
                this.poolId = poolId;
                return this;
            }

            /**
             * PoolName.
             */
            public Builder poolName(String poolName) {
                this.poolName = poolName;
                return this;
            }

            /**
             * RegionNameCity.
             */
            public Builder regionNameCity(String regionNameCity) {
                this.regionNameCity = regionNameCity;
                return this;
            }

            /**
             * SubId.
             */
            public Builder subId(String subId) {
                this.subId = subId;
                return this;
            }

            /**
             * TelX.
             */
            public Builder telX(String telX) {
                this.telX = telX;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PrivacyNumber build() {
                return new PrivacyNumber(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
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
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
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
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
     */
    public static class PhoneNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowOutbound")
        private Boolean allowOutbound;

        @com.aliyun.core.annotation.NameInMap("Assignee")
        private String assignee;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("ContactFlow")
        private ContactFlow contactFlow;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("NumberCommodityStatus")
        private Integer numberCommodityStatus;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberDescription")
        private String phoneNumberDescription;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberId")
        private String phoneNumberId;

        @com.aliyun.core.annotation.NameInMap("PrivacyNumber")
        private PrivacyNumber privacyNumber;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("RemainingTime")
        private Integer remainingTime;

        @com.aliyun.core.annotation.NameInMap("SipTelX")
        private String sipTelX;

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
            this.assignee = builder.assignee;
            this.city = builder.city;
            this.contactFlow = builder.contactFlow;
            this.instanceId = builder.instanceId;
            this.number = builder.number;
            this.numberCommodityStatus = builder.numberCommodityStatus;
            this.phoneNumberDescription = builder.phoneNumberDescription;
            this.phoneNumberId = builder.phoneNumberId;
            this.privacyNumber = builder.privacyNumber;
            this.province = builder.province;
            this.remainingTime = builder.remainingTime;
            this.sipTelX = builder.sipTelX;
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
         * @return assignee
         */
        public String getAssignee() {
            return this.assignee;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
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
         * @return numberCommodityStatus
         */
        public Integer getNumberCommodityStatus() {
            return this.numberCommodityStatus;
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
         * @return privacyNumber
         */
        public PrivacyNumber getPrivacyNumber() {
            return this.privacyNumber;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return remainingTime
         */
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        /**
         * @return sipTelX
         */
        public String getSipTelX() {
            return this.sipTelX;
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
            private String assignee; 
            private String city; 
            private ContactFlow contactFlow; 
            private String instanceId; 
            private String number; 
            private Integer numberCommodityStatus; 
            private String phoneNumberDescription; 
            private String phoneNumberId; 
            private PrivacyNumber privacyNumber; 
            private String province; 
            private Integer remainingTime; 
            private String sipTelX; 
            private SkillGroups skillGroups; 
            private Boolean testOnly; 
            private Integer trunks; 
            private String usage; 

            private Builder() {
            } 

            private Builder(PhoneNumber model) {
                this.allowOutbound = model.allowOutbound;
                this.assignee = model.assignee;
                this.city = model.city;
                this.contactFlow = model.contactFlow;
                this.instanceId = model.instanceId;
                this.number = model.number;
                this.numberCommodityStatus = model.numberCommodityStatus;
                this.phoneNumberDescription = model.phoneNumberDescription;
                this.phoneNumberId = model.phoneNumberId;
                this.privacyNumber = model.privacyNumber;
                this.province = model.province;
                this.remainingTime = model.remainingTime;
                this.sipTelX = model.sipTelX;
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
             * Assignee.
             */
            public Builder assignee(String assignee) {
                this.assignee = assignee;
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
             * NumberCommodityStatus.
             */
            public Builder numberCommodityStatus(Integer numberCommodityStatus) {
                this.numberCommodityStatus = numberCommodityStatus;
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
             * PrivacyNumber.
             */
            public Builder privacyNumber(PrivacyNumber privacyNumber) {
                this.privacyNumber = privacyNumber;
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
             * RemainingTime.
             */
            public Builder remainingTime(Integer remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * SipTelX.
             */
            public Builder sipTelX(String sipTelX) {
                this.sipTelX = sipTelX;
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
     * {@link ListPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>ListPhoneNumbersResponseBody</p>
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
}
