// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSkillGroupsOfUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillGroupsOfUserResponseBody</p>
 */
public class ListSkillGroupsOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SkillLevels")
    private SkillLevels skillLevels;

    @NameInMap("Success")
    private Boolean success;

    private ListSkillGroupsOfUserResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.skillLevels = builder.skillLevels;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillGroupsOfUserResponseBody create() {
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
     * @return skillLevels
     */
    public SkillLevels getSkillLevels() {
        return this.skillLevels;
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
        private SkillLevels skillLevels; 
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
         * SkillLevels.
         */
        public Builder skillLevels(SkillLevels skillLevels) {
            this.skillLevels = skillLevels;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSkillGroupsOfUserResponseBody build() {
            return new ListSkillGroupsOfUserResponseBody(this);
        } 

    } 

    public static class PhoneNumber extends TeaModel {
        @NameInMap("AllowOutbound")
        private Boolean allowOutbound;

        @NameInMap("City")
        private String city;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Number")
        private String number;

        @NameInMap("PhoneNumberDescription")
        private String phoneNumberDescription;

        @NameInMap("PhoneNumberId")
        private String phoneNumberId;

        @NameInMap("Province")
        private String province;

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
            this.city = builder.city;
            this.instanceId = builder.instanceId;
            this.number = builder.number;
            this.phoneNumberDescription = builder.phoneNumberDescription;
            this.phoneNumberId = builder.phoneNumberId;
            this.province = builder.province;
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
         * @return city
         */
        public String getCity() {
            return this.city;
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
            private String city; 
            private String instanceId; 
            private String number; 
            private String phoneNumberDescription; 
            private String phoneNumberId; 
            private String province; 
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
             * City.
             */
            public Builder city(String city) {
                this.city = city;
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
    public static class Skill extends TeaModel {
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

        private Skill(Builder builder) {
            this.instanceId = builder.instanceId;
            this.outboundPhoneNumbers = builder.outboundPhoneNumbers;
            this.routingStrategy = builder.routingStrategy;
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

        public static final class Builder {
            private String instanceId; 
            private OutboundPhoneNumbers outboundPhoneNumbers; 
            private String routingStrategy; 
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
}
