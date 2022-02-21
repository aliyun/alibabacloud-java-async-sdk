// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillGroupsResponseBody</p>
 */
public class ListSkillGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SkillGroups")
    private SkillGroups skillGroups;

    @NameInMap("Success")
    private Boolean success;

    private ListSkillGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.skillGroups = builder.skillGroups;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupsResponseBody create() {
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
     * @return skillGroups
     */
    public SkillGroups getSkillGroups() {
        return this.skillGroups;
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
        private String requestId; 
        private SkillGroups skillGroups; 
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
         * SkillGroups.
         */
        public Builder skillGroups(SkillGroups skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSkillGroupsResponseBody build() {
            return new ListSkillGroupsResponseBody(this);
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
    public static class OutboundPhoneNumbers extends TeaModel {
        @NameInMap("PhoneNumber")
        private java.util.List < PhoneNumber> phoneNumber;

        private OutboundPhoneNumbers(Builder builder) {
            this.phoneNumber = builder.phoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutboundPhoneNumbers create() {
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

            public OutboundPhoneNumbers build() {
                return new OutboundPhoneNumbers(this);
            } 

        } 

    }
    public static class SkillGroup extends TeaModel {
        @NameInMap("AccQueueName")
        private String accQueueName;

        @NameInMap("AccSkillGroupName")
        private String accSkillGroupName;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OutboundPhoneNumbers")
        private OutboundPhoneNumbers outboundPhoneNumbers;

        @NameInMap("RoutingStrategy")
        private String routingStrategy;

        @NameInMap("SkillGroupDescription")
        private String skillGroupDescription;

        @NameInMap("SkillGroupId")
        private String skillGroupId;

        @NameInMap("SkillGroupName")
        private String skillGroupName;

        @NameInMap("UserCount")
        private Integer userCount;

        private SkillGroup(Builder builder) {
            this.accQueueName = builder.accQueueName;
            this.accSkillGroupName = builder.accSkillGroupName;
            this.instanceId = builder.instanceId;
            this.outboundPhoneNumbers = builder.outboundPhoneNumbers;
            this.routingStrategy = builder.routingStrategy;
            this.skillGroupDescription = builder.skillGroupDescription;
            this.skillGroupId = builder.skillGroupId;
            this.skillGroupName = builder.skillGroupName;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillGroup create() {
            return builder().build();
        }

        /**
         * @return accQueueName
         */
        public String getAccQueueName() {
            return this.accQueueName;
        }

        /**
         * @return accSkillGroupName
         */
        public String getAccSkillGroupName() {
            return this.accSkillGroupName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return outboundPhoneNumbers
         */
        public OutboundPhoneNumbers getOutboundPhoneNumbers() {
            return this.outboundPhoneNumbers;
        }

        /**
         * @return routingStrategy
         */
        public String getRoutingStrategy() {
            return this.routingStrategy;
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

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        public static final class Builder {
            private String accQueueName; 
            private String accSkillGroupName; 
            private String instanceId; 
            private OutboundPhoneNumbers outboundPhoneNumbers; 
            private String routingStrategy; 
            private String skillGroupDescription; 
            private String skillGroupId; 
            private String skillGroupName; 
            private Integer userCount; 

            /**
             * AccQueueName.
             */
            public Builder accQueueName(String accQueueName) {
                this.accQueueName = accQueueName;
                return this;
            }

            /**
             * AccSkillGroupName.
             */
            public Builder accSkillGroupName(String accSkillGroupName) {
                this.accSkillGroupName = accSkillGroupName;
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
             * OutboundPhoneNumbers.
             */
            public Builder outboundPhoneNumbers(OutboundPhoneNumbers outboundPhoneNumbers) {
                this.outboundPhoneNumbers = outboundPhoneNumbers;
                return this;
            }

            /**
             * RoutingStrategy.
             */
            public Builder routingStrategy(String routingStrategy) {
                this.routingStrategy = routingStrategy;
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

            /**
             * UserCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            public SkillGroup build() {
                return new SkillGroup(this);
            } 

        } 

    }
    public static class SkillGroups extends TeaModel {
        @NameInMap("SkillGroup")
        private java.util.List < SkillGroup> skillGroup;

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
        public java.util.List < SkillGroup> getSkillGroup() {
            return this.skillGroup;
        }

        public static final class Builder {
            private java.util.List < SkillGroup> skillGroup; 

            /**
             * SkillGroup.
             */
            public Builder skillGroup(java.util.List < SkillGroup> skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            public SkillGroups build() {
                return new SkillGroups(this);
            } 

        } 

    }
}
