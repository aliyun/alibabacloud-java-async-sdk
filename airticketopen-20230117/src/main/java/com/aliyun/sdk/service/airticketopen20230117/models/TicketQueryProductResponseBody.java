// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airticketopen20230117.models;

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
 * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
 *
 * <p>TicketQueryProductResponseBody</p>
 */
public class TicketQueryProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private TicketQueryProductResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TicketQueryProductResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(TicketQueryProductResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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

        public TicketQueryProductResponseBody build() {
            return new TicketQueryProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class AheadBuyTimePointRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Integer anchor;

        @com.aliyun.core.annotation.NameInMap("FixedTime")
        private String fixedTime;

        @com.aliyun.core.annotation.NameInMap("OffsetDayOfTime")
        private String offsetDayOfTime;

        @com.aliyun.core.annotation.NameInMap("OffsetUnit")
        private Integer offsetUnit;

        @com.aliyun.core.annotation.NameInMap("OffsetValue")
        private Integer offsetValue;

        private AheadBuyTimePointRule(Builder builder) {
            this.anchor = builder.anchor;
            this.fixedTime = builder.fixedTime;
            this.offsetDayOfTime = builder.offsetDayOfTime;
            this.offsetUnit = builder.offsetUnit;
            this.offsetValue = builder.offsetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AheadBuyTimePointRule create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Integer getAnchor() {
            return this.anchor;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return offsetDayOfTime
         */
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        /**
         * @return offsetUnit
         */
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        /**
         * @return offsetValue
         */
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

        public static final class Builder {
            private Integer anchor; 
            private String fixedTime; 
            private String offsetDayOfTime; 
            private Integer offsetUnit; 
            private Integer offsetValue; 

            private Builder() {
            } 

            private Builder(AheadBuyTimePointRule model) {
                this.anchor = model.anchor;
                this.fixedTime = model.fixedTime;
                this.offsetDayOfTime = model.offsetDayOfTime;
                this.offsetUnit = model.offsetUnit;
                this.offsetValue = model.offsetValue;
            } 

            /**
             * Anchor.
             */
            public Builder anchor(Integer anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * OffsetDayOfTime.
             */
            public Builder offsetDayOfTime(String offsetDayOfTime) {
                this.offsetDayOfTime = offsetDayOfTime;
                return this;
            }

            /**
             * OffsetUnit.
             */
            public Builder offsetUnit(Integer offsetUnit) {
                this.offsetUnit = offsetUnit;
                return this;
            }

            /**
             * OffsetValue.
             */
            public Builder offsetValue(Integer offsetValue) {
                this.offsetValue = offsetValue;
                return this;
            }

            public AheadBuyTimePointRule build() {
                return new AheadBuyTimePointRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class ContactFieldRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Certificate")
        private Boolean certificate;

        @com.aliyun.core.annotation.NameInMap("CertificateTypes")
        private java.util.List<Integer> certificateTypes;

        @com.aliyun.core.annotation.NameInMap("DialingCode")
        private Boolean dialingCode;

        @com.aliyun.core.annotation.NameInMap("Email")
        private Boolean email;

        @com.aliyun.core.annotation.NameInMap("FirstName")
        private Boolean firstName;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private Boolean lastName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private Boolean mobile;

        @com.aliyun.core.annotation.NameInMap("Name")
        private Boolean name;

        private ContactFieldRule(Builder builder) {
            this.certificate = builder.certificate;
            this.certificateTypes = builder.certificateTypes;
            this.dialingCode = builder.dialingCode;
            this.email = builder.email;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.mobile = builder.mobile;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactFieldRule create() {
            return builder().build();
        }

        /**
         * @return certificate
         */
        public Boolean getCertificate() {
            return this.certificate;
        }

        /**
         * @return certificateTypes
         */
        public java.util.List<Integer> getCertificateTypes() {
            return this.certificateTypes;
        }

        /**
         * @return dialingCode
         */
        public Boolean getDialingCode() {
            return this.dialingCode;
        }

        /**
         * @return email
         */
        public Boolean getEmail() {
            return this.email;
        }

        /**
         * @return firstName
         */
        public Boolean getFirstName() {
            return this.firstName;
        }

        /**
         * @return lastName
         */
        public Boolean getLastName() {
            return this.lastName;
        }

        /**
         * @return mobile
         */
        public Boolean getMobile() {
            return this.mobile;
        }

        /**
         * @return name
         */
        public Boolean getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean certificate; 
            private java.util.List<Integer> certificateTypes; 
            private Boolean dialingCode; 
            private Boolean email; 
            private Boolean firstName; 
            private Boolean lastName; 
            private Boolean mobile; 
            private Boolean name; 

            private Builder() {
            } 

            private Builder(ContactFieldRule model) {
                this.certificate = model.certificate;
                this.certificateTypes = model.certificateTypes;
                this.dialingCode = model.dialingCode;
                this.email = model.email;
                this.firstName = model.firstName;
                this.lastName = model.lastName;
                this.mobile = model.mobile;
                this.name = model.name;
            } 

            /**
             * Certificate.
             */
            public Builder certificate(Boolean certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * CertificateTypes.
             */
            public Builder certificateTypes(java.util.List<Integer> certificateTypes) {
                this.certificateTypes = certificateTypes;
                return this;
            }

            /**
             * DialingCode.
             */
            public Builder dialingCode(Boolean dialingCode) {
                this.dialingCode = dialingCode;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(Boolean email) {
                this.email = email;
                return this;
            }

            /**
             * FirstName.
             */
            public Builder firstName(Boolean firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * LastName.
             */
            public Builder lastName(Boolean lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(Boolean mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(Boolean name) {
                this.name = name;
                return this;
            }

            public ContactFieldRule build() {
                return new ContactFieldRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class ContactRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactFieldRule")
        private ContactFieldRule contactFieldRule;

        private ContactRule(Builder builder) {
            this.contactFieldRule = builder.contactFieldRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactRule create() {
            return builder().build();
        }

        /**
         * @return contactFieldRule
         */
        public ContactFieldRule getContactFieldRule() {
            return this.contactFieldRule;
        }

        public static final class Builder {
            private ContactFieldRule contactFieldRule; 

            private Builder() {
            } 

            private Builder(ContactRule model) {
                this.contactFieldRule = model.contactFieldRule;
            } 

            /**
             * ContactFieldRule.
             */
            public Builder contactFieldRule(ContactFieldRule contactFieldRule) {
                this.contactFieldRule = contactFieldRule;
                return this;
            }

            public ContactRule build() {
                return new ContactRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class CrossOrderBuyQuantityLimitRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LimitDayType")
        private Integer limitDayType;

        @com.aliyun.core.annotation.NameInMap("LimitDays")
        private Integer limitDays;

        @com.aliyun.core.annotation.NameInMap("LimitPeriod")
        private Integer limitPeriod;

        @com.aliyun.core.annotation.NameInMap("LimitQuantityType")
        private Integer limitQuantityType;

        @com.aliyun.core.annotation.NameInMap("LimitType")
        private Integer limitType;

        @com.aliyun.core.annotation.NameInMap("MaxBuyQuantity")
        private Integer maxBuyQuantity;

        private CrossOrderBuyQuantityLimitRules(Builder builder) {
            this.limitDayType = builder.limitDayType;
            this.limitDays = builder.limitDays;
            this.limitPeriod = builder.limitPeriod;
            this.limitQuantityType = builder.limitQuantityType;
            this.limitType = builder.limitType;
            this.maxBuyQuantity = builder.maxBuyQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossOrderBuyQuantityLimitRules create() {
            return builder().build();
        }

        /**
         * @return limitDayType
         */
        public Integer getLimitDayType() {
            return this.limitDayType;
        }

        /**
         * @return limitDays
         */
        public Integer getLimitDays() {
            return this.limitDays;
        }

        /**
         * @return limitPeriod
         */
        public Integer getLimitPeriod() {
            return this.limitPeriod;
        }

        /**
         * @return limitQuantityType
         */
        public Integer getLimitQuantityType() {
            return this.limitQuantityType;
        }

        /**
         * @return limitType
         */
        public Integer getLimitType() {
            return this.limitType;
        }

        /**
         * @return maxBuyQuantity
         */
        public Integer getMaxBuyQuantity() {
            return this.maxBuyQuantity;
        }

        public static final class Builder {
            private Integer limitDayType; 
            private Integer limitDays; 
            private Integer limitPeriod; 
            private Integer limitQuantityType; 
            private Integer limitType; 
            private Integer maxBuyQuantity; 

            private Builder() {
            } 

            private Builder(CrossOrderBuyQuantityLimitRules model) {
                this.limitDayType = model.limitDayType;
                this.limitDays = model.limitDays;
                this.limitPeriod = model.limitPeriod;
                this.limitQuantityType = model.limitQuantityType;
                this.limitType = model.limitType;
                this.maxBuyQuantity = model.maxBuyQuantity;
            } 

            /**
             * LimitDayType.
             */
            public Builder limitDayType(Integer limitDayType) {
                this.limitDayType = limitDayType;
                return this;
            }

            /**
             * LimitDays.
             */
            public Builder limitDays(Integer limitDays) {
                this.limitDays = limitDays;
                return this;
            }

            /**
             * LimitPeriod.
             */
            public Builder limitPeriod(Integer limitPeriod) {
                this.limitPeriod = limitPeriod;
                return this;
            }

            /**
             * LimitQuantityType.
             */
            public Builder limitQuantityType(Integer limitQuantityType) {
                this.limitQuantityType = limitQuantityType;
                return this;
            }

            /**
             * LimitType.
             */
            public Builder limitType(Integer limitType) {
                this.limitType = limitType;
                return this;
            }

            /**
             * MaxBuyQuantity.
             */
            public Builder maxBuyQuantity(Integer maxBuyQuantity) {
                this.maxBuyQuantity = maxBuyQuantity;
                return this;
            }

            public CrossOrderBuyQuantityLimitRules build() {
                return new CrossOrderBuyQuantityLimitRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class PerOrderBuyQuantityLimitRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxBuyQuantity")
        private Integer maxBuyQuantity;

        @com.aliyun.core.annotation.NameInMap("MinBuyQuantity")
        private Integer minBuyQuantity;

        private PerOrderBuyQuantityLimitRule(Builder builder) {
            this.maxBuyQuantity = builder.maxBuyQuantity;
            this.minBuyQuantity = builder.minBuyQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PerOrderBuyQuantityLimitRule create() {
            return builder().build();
        }

        /**
         * @return maxBuyQuantity
         */
        public Integer getMaxBuyQuantity() {
            return this.maxBuyQuantity;
        }

        /**
         * @return minBuyQuantity
         */
        public Integer getMinBuyQuantity() {
            return this.minBuyQuantity;
        }

        public static final class Builder {
            private Integer maxBuyQuantity; 
            private Integer minBuyQuantity; 

            private Builder() {
            } 

            private Builder(PerOrderBuyQuantityLimitRule model) {
                this.maxBuyQuantity = model.maxBuyQuantity;
                this.minBuyQuantity = model.minBuyQuantity;
            } 

            /**
             * MaxBuyQuantity.
             */
            public Builder maxBuyQuantity(Integer maxBuyQuantity) {
                this.maxBuyQuantity = maxBuyQuantity;
                return this;
            }

            /**
             * MinBuyQuantity.
             */
            public Builder minBuyQuantity(Integer minBuyQuantity) {
                this.minBuyQuantity = minBuyQuantity;
                return this;
            }

            public PerOrderBuyQuantityLimitRule build() {
                return new PerOrderBuyQuantityLimitRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class CrowdLimitRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgeBaseTimeType")
        private Integer ageBaseTimeType;

        @com.aliyun.core.annotation.NameInMap("AgeCalculateType")
        private Integer ageCalculateType;

        @com.aliyun.core.annotation.NameInMap("AgeMax")
        private Integer ageMax;

        @com.aliyun.core.annotation.NameInMap("AgeMin")
        private Integer ageMin;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private CrowdLimitRules(Builder builder) {
            this.ageBaseTimeType = builder.ageBaseTimeType;
            this.ageCalculateType = builder.ageCalculateType;
            this.ageMax = builder.ageMax;
            this.ageMin = builder.ageMin;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrowdLimitRules create() {
            return builder().build();
        }

        /**
         * @return ageBaseTimeType
         */
        public Integer getAgeBaseTimeType() {
            return this.ageBaseTimeType;
        }

        /**
         * @return ageCalculateType
         */
        public Integer getAgeCalculateType() {
            return this.ageCalculateType;
        }

        /**
         * @return ageMax
         */
        public Integer getAgeMax() {
            return this.ageMax;
        }

        /**
         * @return ageMin
         */
        public Integer getAgeMin() {
            return this.ageMin;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer ageBaseTimeType; 
            private Integer ageCalculateType; 
            private Integer ageMax; 
            private Integer ageMin; 
            private String name; 

            private Builder() {
            } 

            private Builder(CrowdLimitRules model) {
                this.ageBaseTimeType = model.ageBaseTimeType;
                this.ageCalculateType = model.ageCalculateType;
                this.ageMax = model.ageMax;
                this.ageMin = model.ageMin;
                this.name = model.name;
            } 

            /**
             * AgeBaseTimeType.
             */
            public Builder ageBaseTimeType(Integer ageBaseTimeType) {
                this.ageBaseTimeType = ageBaseTimeType;
                return this;
            }

            /**
             * AgeCalculateType.
             */
            public Builder ageCalculateType(Integer ageCalculateType) {
                this.ageCalculateType = ageCalculateType;
                return this;
            }

            /**
             * AgeMax.
             */
            public Builder ageMax(Integer ageMax) {
                this.ageMax = ageMax;
                return this;
            }

            /**
             * AgeMin.
             */
            public Builder ageMin(Integer ageMin) {
                this.ageMin = ageMin;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public CrowdLimitRules build() {
                return new CrowdLimitRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class CrowdQuantityLimits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Quantity")
        private Integer quantity;

        private CrowdQuantityLimits(Builder builder) {
            this.name = builder.name;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrowdQuantityLimits create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return quantity
         */
        public Integer getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private String name; 
            private Integer quantity; 

            private Builder() {
            } 

            private Builder(CrowdQuantityLimits model) {
                this.name = model.name;
                this.quantity = model.quantity;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Quantity.
             */
            public Builder quantity(Integer quantity) {
                this.quantity = quantity;
                return this;
            }

            public CrowdQuantityLimits build() {
                return new CrowdQuantityLimits(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class TravelerFieldRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Birthday")
        private Boolean birthday;

        @com.aliyun.core.annotation.NameInMap("Certificate")
        private Boolean certificate;

        @com.aliyun.core.annotation.NameInMap("CertificateTypes")
        private java.util.List<Integer> certificateTypes;

        @com.aliyun.core.annotation.NameInMap("DialingCode")
        private Boolean dialingCode;

        @com.aliyun.core.annotation.NameInMap("Email")
        private Boolean email;

        @com.aliyun.core.annotation.NameInMap("FirstName")
        private Boolean firstName;

        @com.aliyun.core.annotation.NameInMap("Gender")
        private Boolean gender;

        @com.aliyun.core.annotation.NameInMap("LastName")
        private Boolean lastName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private Boolean mobile;

        @com.aliyun.core.annotation.NameInMap("Name")
        private Boolean name;

        @com.aliyun.core.annotation.NameInMap("Nationality")
        private Boolean nationality;

        private TravelerFieldRule(Builder builder) {
            this.birthday = builder.birthday;
            this.certificate = builder.certificate;
            this.certificateTypes = builder.certificateTypes;
            this.dialingCode = builder.dialingCode;
            this.email = builder.email;
            this.firstName = builder.firstName;
            this.gender = builder.gender;
            this.lastName = builder.lastName;
            this.mobile = builder.mobile;
            this.name = builder.name;
            this.nationality = builder.nationality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerFieldRule create() {
            return builder().build();
        }

        /**
         * @return birthday
         */
        public Boolean getBirthday() {
            return this.birthday;
        }

        /**
         * @return certificate
         */
        public Boolean getCertificate() {
            return this.certificate;
        }

        /**
         * @return certificateTypes
         */
        public java.util.List<Integer> getCertificateTypes() {
            return this.certificateTypes;
        }

        /**
         * @return dialingCode
         */
        public Boolean getDialingCode() {
            return this.dialingCode;
        }

        /**
         * @return email
         */
        public Boolean getEmail() {
            return this.email;
        }

        /**
         * @return firstName
         */
        public Boolean getFirstName() {
            return this.firstName;
        }

        /**
         * @return gender
         */
        public Boolean getGender() {
            return this.gender;
        }

        /**
         * @return lastName
         */
        public Boolean getLastName() {
            return this.lastName;
        }

        /**
         * @return mobile
         */
        public Boolean getMobile() {
            return this.mobile;
        }

        /**
         * @return name
         */
        public Boolean getName() {
            return this.name;
        }

        /**
         * @return nationality
         */
        public Boolean getNationality() {
            return this.nationality;
        }

        public static final class Builder {
            private Boolean birthday; 
            private Boolean certificate; 
            private java.util.List<Integer> certificateTypes; 
            private Boolean dialingCode; 
            private Boolean email; 
            private Boolean firstName; 
            private Boolean gender; 
            private Boolean lastName; 
            private Boolean mobile; 
            private Boolean name; 
            private Boolean nationality; 

            private Builder() {
            } 

            private Builder(TravelerFieldRule model) {
                this.birthday = model.birthday;
                this.certificate = model.certificate;
                this.certificateTypes = model.certificateTypes;
                this.dialingCode = model.dialingCode;
                this.email = model.email;
                this.firstName = model.firstName;
                this.gender = model.gender;
                this.lastName = model.lastName;
                this.mobile = model.mobile;
                this.name = model.name;
                this.nationality = model.nationality;
            } 

            /**
             * Birthday.
             */
            public Builder birthday(Boolean birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * Certificate.
             */
            public Builder certificate(Boolean certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * CertificateTypes.
             */
            public Builder certificateTypes(java.util.List<Integer> certificateTypes) {
                this.certificateTypes = certificateTypes;
                return this;
            }

            /**
             * DialingCode.
             */
            public Builder dialingCode(Boolean dialingCode) {
                this.dialingCode = dialingCode;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(Boolean email) {
                this.email = email;
                return this;
            }

            /**
             * FirstName.
             */
            public Builder firstName(Boolean firstName) {
                this.firstName = firstName;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(Boolean gender) {
                this.gender = gender;
                return this;
            }

            /**
             * LastName.
             */
            public Builder lastName(Boolean lastName) {
                this.lastName = lastName;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(Boolean mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(Boolean name) {
                this.name = name;
                return this;
            }

            /**
             * Nationality.
             */
            public Builder nationality(Boolean nationality) {
                this.nationality = nationality;
                return this;
            }

            public TravelerFieldRule build() {
                return new TravelerFieldRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class TravelerRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrowdLimitRules")
        private java.util.List<CrowdLimitRules> crowdLimitRules;

        @com.aliyun.core.annotation.NameInMap("CrowdQuantityLimits")
        private java.util.List<CrowdQuantityLimits> crowdQuantityLimits;

        @com.aliyun.core.annotation.NameInMap("NeedFillTraveler")
        private Boolean needFillTraveler;

        @com.aliyun.core.annotation.NameInMap("TravelerFieldRule")
        private TravelerFieldRule travelerFieldRule;

        @com.aliyun.core.annotation.NameInMap("TravelerFillDimension")
        private Integer travelerFillDimension;

        @com.aliyun.core.annotation.NameInMap("TravelerQuantity")
        private Integer travelerQuantity;

        private TravelerRule(Builder builder) {
            this.crowdLimitRules = builder.crowdLimitRules;
            this.crowdQuantityLimits = builder.crowdQuantityLimits;
            this.needFillTraveler = builder.needFillTraveler;
            this.travelerFieldRule = builder.travelerFieldRule;
            this.travelerFillDimension = builder.travelerFillDimension;
            this.travelerQuantity = builder.travelerQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TravelerRule create() {
            return builder().build();
        }

        /**
         * @return crowdLimitRules
         */
        public java.util.List<CrowdLimitRules> getCrowdLimitRules() {
            return this.crowdLimitRules;
        }

        /**
         * @return crowdQuantityLimits
         */
        public java.util.List<CrowdQuantityLimits> getCrowdQuantityLimits() {
            return this.crowdQuantityLimits;
        }

        /**
         * @return needFillTraveler
         */
        public Boolean getNeedFillTraveler() {
            return this.needFillTraveler;
        }

        /**
         * @return travelerFieldRule
         */
        public TravelerFieldRule getTravelerFieldRule() {
            return this.travelerFieldRule;
        }

        /**
         * @return travelerFillDimension
         */
        public Integer getTravelerFillDimension() {
            return this.travelerFillDimension;
        }

        /**
         * @return travelerQuantity
         */
        public Integer getTravelerQuantity() {
            return this.travelerQuantity;
        }

        public static final class Builder {
            private java.util.List<CrowdLimitRules> crowdLimitRules; 
            private java.util.List<CrowdQuantityLimits> crowdQuantityLimits; 
            private Boolean needFillTraveler; 
            private TravelerFieldRule travelerFieldRule; 
            private Integer travelerFillDimension; 
            private Integer travelerQuantity; 

            private Builder() {
            } 

            private Builder(TravelerRule model) {
                this.crowdLimitRules = model.crowdLimitRules;
                this.crowdQuantityLimits = model.crowdQuantityLimits;
                this.needFillTraveler = model.needFillTraveler;
                this.travelerFieldRule = model.travelerFieldRule;
                this.travelerFillDimension = model.travelerFillDimension;
                this.travelerQuantity = model.travelerQuantity;
            } 

            /**
             * CrowdLimitRules.
             */
            public Builder crowdLimitRules(java.util.List<CrowdLimitRules> crowdLimitRules) {
                this.crowdLimitRules = crowdLimitRules;
                return this;
            }

            /**
             * CrowdQuantityLimits.
             */
            public Builder crowdQuantityLimits(java.util.List<CrowdQuantityLimits> crowdQuantityLimits) {
                this.crowdQuantityLimits = crowdQuantityLimits;
                return this;
            }

            /**
             * NeedFillTraveler.
             */
            public Builder needFillTraveler(Boolean needFillTraveler) {
                this.needFillTraveler = needFillTraveler;
                return this;
            }

            /**
             * TravelerFieldRule.
             */
            public Builder travelerFieldRule(TravelerFieldRule travelerFieldRule) {
                this.travelerFieldRule = travelerFieldRule;
                return this;
            }

            /**
             * TravelerFillDimension.
             */
            public Builder travelerFillDimension(Integer travelerFillDimension) {
                this.travelerFillDimension = travelerFillDimension;
                return this;
            }

            /**
             * TravelerQuantity.
             */
            public Builder travelerQuantity(Integer travelerQuantity) {
                this.travelerQuantity = travelerQuantity;
                return this;
            }

            public TravelerRule build() {
                return new TravelerRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class BuyRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AheadBuyTimePointRule")
        private AheadBuyTimePointRule aheadBuyTimePointRule;

        @com.aliyun.core.annotation.NameInMap("ContactRule")
        private ContactRule contactRule;

        @com.aliyun.core.annotation.NameInMap("CrossOrderBuyQuantityLimitRules")
        private java.util.List<CrossOrderBuyQuantityLimitRules> crossOrderBuyQuantityLimitRules;

        @com.aliyun.core.annotation.NameInMap("PerOrderBuyQuantityLimitRule")
        private PerOrderBuyQuantityLimitRule perOrderBuyQuantityLimitRule;

        @com.aliyun.core.annotation.NameInMap("TravelerRule")
        private TravelerRule travelerRule;

        private BuyRule(Builder builder) {
            this.aheadBuyTimePointRule = builder.aheadBuyTimePointRule;
            this.contactRule = builder.contactRule;
            this.crossOrderBuyQuantityLimitRules = builder.crossOrderBuyQuantityLimitRules;
            this.perOrderBuyQuantityLimitRule = builder.perOrderBuyQuantityLimitRule;
            this.travelerRule = builder.travelerRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BuyRule create() {
            return builder().build();
        }

        /**
         * @return aheadBuyTimePointRule
         */
        public AheadBuyTimePointRule getAheadBuyTimePointRule() {
            return this.aheadBuyTimePointRule;
        }

        /**
         * @return contactRule
         */
        public ContactRule getContactRule() {
            return this.contactRule;
        }

        /**
         * @return crossOrderBuyQuantityLimitRules
         */
        public java.util.List<CrossOrderBuyQuantityLimitRules> getCrossOrderBuyQuantityLimitRules() {
            return this.crossOrderBuyQuantityLimitRules;
        }

        /**
         * @return perOrderBuyQuantityLimitRule
         */
        public PerOrderBuyQuantityLimitRule getPerOrderBuyQuantityLimitRule() {
            return this.perOrderBuyQuantityLimitRule;
        }

        /**
         * @return travelerRule
         */
        public TravelerRule getTravelerRule() {
            return this.travelerRule;
        }

        public static final class Builder {
            private AheadBuyTimePointRule aheadBuyTimePointRule; 
            private ContactRule contactRule; 
            private java.util.List<CrossOrderBuyQuantityLimitRules> crossOrderBuyQuantityLimitRules; 
            private PerOrderBuyQuantityLimitRule perOrderBuyQuantityLimitRule; 
            private TravelerRule travelerRule; 

            private Builder() {
            } 

            private Builder(BuyRule model) {
                this.aheadBuyTimePointRule = model.aheadBuyTimePointRule;
                this.contactRule = model.contactRule;
                this.crossOrderBuyQuantityLimitRules = model.crossOrderBuyQuantityLimitRules;
                this.perOrderBuyQuantityLimitRule = model.perOrderBuyQuantityLimitRule;
                this.travelerRule = model.travelerRule;
            } 

            /**
             * AheadBuyTimePointRule.
             */
            public Builder aheadBuyTimePointRule(AheadBuyTimePointRule aheadBuyTimePointRule) {
                this.aheadBuyTimePointRule = aheadBuyTimePointRule;
                return this;
            }

            /**
             * ContactRule.
             */
            public Builder contactRule(ContactRule contactRule) {
                this.contactRule = contactRule;
                return this;
            }

            /**
             * CrossOrderBuyQuantityLimitRules.
             */
            public Builder crossOrderBuyQuantityLimitRules(java.util.List<CrossOrderBuyQuantityLimitRules> crossOrderBuyQuantityLimitRules) {
                this.crossOrderBuyQuantityLimitRules = crossOrderBuyQuantityLimitRules;
                return this;
            }

            /**
             * PerOrderBuyQuantityLimitRule.
             */
            public Builder perOrderBuyQuantityLimitRule(PerOrderBuyQuantityLimitRule perOrderBuyQuantityLimitRule) {
                this.perOrderBuyQuantityLimitRule = perOrderBuyQuantityLimitRule;
                return this;
            }

            /**
             * TravelerRule.
             */
            public Builder travelerRule(TravelerRule travelerRule) {
                this.travelerRule = travelerRule;
                return this;
            }

            public BuyRule build() {
                return new BuyRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class From extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Integer anchor;

        @com.aliyun.core.annotation.NameInMap("FixedTime")
        private String fixedTime;

        @com.aliyun.core.annotation.NameInMap("OffsetDayOfTime")
        private String offsetDayOfTime;

        @com.aliyun.core.annotation.NameInMap("OffsetUnit")
        private Integer offsetUnit;

        @com.aliyun.core.annotation.NameInMap("OffsetValue")
        private Integer offsetValue;

        private From(Builder builder) {
            this.anchor = builder.anchor;
            this.fixedTime = builder.fixedTime;
            this.offsetDayOfTime = builder.offsetDayOfTime;
            this.offsetUnit = builder.offsetUnit;
            this.offsetValue = builder.offsetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static From create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Integer getAnchor() {
            return this.anchor;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return offsetDayOfTime
         */
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        /**
         * @return offsetUnit
         */
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        /**
         * @return offsetValue
         */
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

        public static final class Builder {
            private Integer anchor; 
            private String fixedTime; 
            private String offsetDayOfTime; 
            private Integer offsetUnit; 
            private Integer offsetValue; 

            private Builder() {
            } 

            private Builder(From model) {
                this.anchor = model.anchor;
                this.fixedTime = model.fixedTime;
                this.offsetDayOfTime = model.offsetDayOfTime;
                this.offsetUnit = model.offsetUnit;
                this.offsetValue = model.offsetValue;
            } 

            /**
             * Anchor.
             */
            public Builder anchor(Integer anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * OffsetDayOfTime.
             */
            public Builder offsetDayOfTime(String offsetDayOfTime) {
                this.offsetDayOfTime = offsetDayOfTime;
                return this;
            }

            /**
             * OffsetUnit.
             */
            public Builder offsetUnit(Integer offsetUnit) {
                this.offsetUnit = offsetUnit;
                return this;
            }

            /**
             * OffsetValue.
             */
            public Builder offsetValue(Integer offsetValue) {
                this.offsetValue = offsetValue;
                return this;
            }

            public From build() {
                return new From(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class To extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Integer anchor;

        @com.aliyun.core.annotation.NameInMap("FixedTime")
        private String fixedTime;

        @com.aliyun.core.annotation.NameInMap("OffsetDayOfTime")
        private String offsetDayOfTime;

        @com.aliyun.core.annotation.NameInMap("OffsetUnit")
        private Integer offsetUnit;

        @com.aliyun.core.annotation.NameInMap("OffsetValue")
        private Integer offsetValue;

        private To(Builder builder) {
            this.anchor = builder.anchor;
            this.fixedTime = builder.fixedTime;
            this.offsetDayOfTime = builder.offsetDayOfTime;
            this.offsetUnit = builder.offsetUnit;
            this.offsetValue = builder.offsetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static To create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Integer getAnchor() {
            return this.anchor;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return offsetDayOfTime
         */
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        /**
         * @return offsetUnit
         */
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        /**
         * @return offsetValue
         */
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

        public static final class Builder {
            private Integer anchor; 
            private String fixedTime; 
            private String offsetDayOfTime; 
            private Integer offsetUnit; 
            private Integer offsetValue; 

            private Builder() {
            } 

            private Builder(To model) {
                this.anchor = model.anchor;
                this.fixedTime = model.fixedTime;
                this.offsetDayOfTime = model.offsetDayOfTime;
                this.offsetUnit = model.offsetUnit;
                this.offsetValue = model.offsetValue;
            } 

            /**
             * Anchor.
             */
            public Builder anchor(Integer anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * OffsetDayOfTime.
             */
            public Builder offsetDayOfTime(String offsetDayOfTime) {
                this.offsetDayOfTime = offsetDayOfTime;
                return this;
            }

            /**
             * OffsetUnit.
             */
            public Builder offsetUnit(Integer offsetUnit) {
                this.offsetUnit = offsetUnit;
                return this;
            }

            /**
             * OffsetValue.
             */
            public Builder offsetValue(Integer offsetValue) {
                this.offsetValue = offsetValue;
                return this;
            }

            public To build() {
                return new To(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class RefundStageRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fee")
        private Double fee;

        @com.aliyun.core.annotation.NameInMap("FeeBase")
        private Integer feeBase;

        @com.aliyun.core.annotation.NameInMap("FeeType")
        private Integer feeType;

        @com.aliyun.core.annotation.NameInMap("From")
        private From from;

        @com.aliyun.core.annotation.NameInMap("To")
        private To to;

        private RefundStageRules(Builder builder) {
            this.fee = builder.fee;
            this.feeBase = builder.feeBase;
            this.feeType = builder.feeType;
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundStageRules create() {
            return builder().build();
        }

        /**
         * @return fee
         */
        public Double getFee() {
            return this.fee;
        }

        /**
         * @return feeBase
         */
        public Integer getFeeBase() {
            return this.feeBase;
        }

        /**
         * @return feeType
         */
        public Integer getFeeType() {
            return this.feeType;
        }

        /**
         * @return from
         */
        public From getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public To getTo() {
            return this.to;
        }

        public static final class Builder {
            private Double fee; 
            private Integer feeBase; 
            private Integer feeType; 
            private From from; 
            private To to; 

            private Builder() {
            } 

            private Builder(RefundStageRules model) {
                this.fee = model.fee;
                this.feeBase = model.feeBase;
                this.feeType = model.feeType;
                this.from = model.from;
                this.to = model.to;
            } 

            /**
             * Fee.
             */
            public Builder fee(Double fee) {
                this.fee = fee;
                return this;
            }

            /**
             * FeeBase.
             */
            public Builder feeBase(Integer feeBase) {
                this.feeBase = feeBase;
                return this;
            }

            /**
             * FeeType.
             */
            public Builder feeType(Integer feeType) {
                this.feeType = feeType;
                return this;
            }

            /**
             * From.
             */
            public Builder from(From from) {
                this.from = from;
                return this;
            }

            /**
             * To.
             */
            public Builder to(To to) {
                this.to = to;
                return this;
            }

            public RefundStageRules build() {
                return new RefundStageRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class RefundRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefundStageRules")
        private java.util.List<RefundStageRules> refundStageRules;

        @com.aliyun.core.annotation.NameInMap("RefundType")
        private Integer refundType;

        private RefundRule(Builder builder) {
            this.refundStageRules = builder.refundStageRules;
            this.refundType = builder.refundType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefundRule create() {
            return builder().build();
        }

        /**
         * @return refundStageRules
         */
        public java.util.List<RefundStageRules> getRefundStageRules() {
            return this.refundStageRules;
        }

        /**
         * @return refundType
         */
        public Integer getRefundType() {
            return this.refundType;
        }

        public static final class Builder {
            private java.util.List<RefundStageRules> refundStageRules; 
            private Integer refundType; 

            private Builder() {
            } 

            private Builder(RefundRule model) {
                this.refundStageRules = model.refundStageRules;
                this.refundType = model.refundType;
            } 

            /**
             * RefundStageRules.
             */
            public Builder refundStageRules(java.util.List<RefundStageRules> refundStageRules) {
                this.refundStageRules = refundStageRules;
                return this;
            }

            /**
             * RefundType.
             */
            public Builder refundType(Integer refundType) {
                this.refundType = refundType;
                return this;
            }

            public RefundRule build() {
                return new RefundRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Region(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(Region model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class Session extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SessionEndTime")
        private String sessionEndTime;

        @com.aliyun.core.annotation.NameInMap("SessionName")
        private String sessionName;

        @com.aliyun.core.annotation.NameInMap("SessionStartTime")
        private String sessionStartTime;

        private Session(Builder builder) {
            this.sessionEndTime = builder.sessionEndTime;
            this.sessionName = builder.sessionName;
            this.sessionStartTime = builder.sessionStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Session create() {
            return builder().build();
        }

        /**
         * @return sessionEndTime
         */
        public String getSessionEndTime() {
            return this.sessionEndTime;
        }

        /**
         * @return sessionName
         */
        public String getSessionName() {
            return this.sessionName;
        }

        /**
         * @return sessionStartTime
         */
        public String getSessionStartTime() {
            return this.sessionStartTime;
        }

        public static final class Builder {
            private String sessionEndTime; 
            private String sessionName; 
            private String sessionStartTime; 

            private Builder() {
            } 

            private Builder(Session model) {
                this.sessionEndTime = model.sessionEndTime;
                this.sessionName = model.sessionName;
                this.sessionStartTime = model.sessionStartTime;
            } 

            /**
             * SessionEndTime.
             */
            public Builder sessionEndTime(String sessionEndTime) {
                this.sessionEndTime = sessionEndTime;
                return this;
            }

            /**
             * SessionName.
             */
            public Builder sessionName(String sessionName) {
                this.sessionName = sessionName;
                return this;
            }

            /**
             * SessionStartTime.
             */
            public Builder sessionStartTime(String sessionStartTime) {
                this.sessionStartTime = sessionStartTime;
                return this;
            }

            public Session build() {
                return new Session(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class Spu extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrimaryTypeName")
        private String primaryTypeName;

        @com.aliyun.core.annotation.NameInMap("ReserveDetail")
        private String reserveDetail;

        @com.aliyun.core.annotation.NameInMap("ReserveTitle")
        private String reserveTitle;

        @com.aliyun.core.annotation.NameInMap("SecondaryTypeName")
        private String secondaryTypeName;

        @com.aliyun.core.annotation.NameInMap("SpuId")
        private Long spuId;

        @com.aliyun.core.annotation.NameInMap("SpuName")
        private String spuName;

        private Spu(Builder builder) {
            this.primaryTypeName = builder.primaryTypeName;
            this.reserveDetail = builder.reserveDetail;
            this.reserveTitle = builder.reserveTitle;
            this.secondaryTypeName = builder.secondaryTypeName;
            this.spuId = builder.spuId;
            this.spuName = builder.spuName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spu create() {
            return builder().build();
        }

        /**
         * @return primaryTypeName
         */
        public String getPrimaryTypeName() {
            return this.primaryTypeName;
        }

        /**
         * @return reserveDetail
         */
        public String getReserveDetail() {
            return this.reserveDetail;
        }

        /**
         * @return reserveTitle
         */
        public String getReserveTitle() {
            return this.reserveTitle;
        }

        /**
         * @return secondaryTypeName
         */
        public String getSecondaryTypeName() {
            return this.secondaryTypeName;
        }

        /**
         * @return spuId
         */
        public Long getSpuId() {
            return this.spuId;
        }

        /**
         * @return spuName
         */
        public String getSpuName() {
            return this.spuName;
        }

        public static final class Builder {
            private String primaryTypeName; 
            private String reserveDetail; 
            private String reserveTitle; 
            private String secondaryTypeName; 
            private Long spuId; 
            private String spuName; 

            private Builder() {
            } 

            private Builder(Spu model) {
                this.primaryTypeName = model.primaryTypeName;
                this.reserveDetail = model.reserveDetail;
                this.reserveTitle = model.reserveTitle;
                this.secondaryTypeName = model.secondaryTypeName;
                this.spuId = model.spuId;
                this.spuName = model.spuName;
            } 

            /**
             * PrimaryTypeName.
             */
            public Builder primaryTypeName(String primaryTypeName) {
                this.primaryTypeName = primaryTypeName;
                return this;
            }

            /**
             * ReserveDetail.
             */
            public Builder reserveDetail(String reserveDetail) {
                this.reserveDetail = reserveDetail;
                return this;
            }

            /**
             * ReserveTitle.
             */
            public Builder reserveTitle(String reserveTitle) {
                this.reserveTitle = reserveTitle;
                return this;
            }

            /**
             * SecondaryTypeName.
             */
            public Builder secondaryTypeName(String secondaryTypeName) {
                this.secondaryTypeName = secondaryTypeName;
                return this;
            }

            /**
             * SpuId.
             */
            public Builder spuId(Long spuId) {
                this.spuId = spuId;
                return this;
            }

            /**
             * SpuName.
             */
            public Builder spuName(String spuName) {
                this.spuName = spuName;
                return this;
            }

            public Spu build() {
                return new Spu(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class TicketKind extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private TicketKind(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TicketKind create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 

            private Builder() {
            } 

            private Builder(TicketKind model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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

            public TicketKind build() {
                return new TicketKind(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class EffectTimePointRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Integer anchor;

        @com.aliyun.core.annotation.NameInMap("FixedTime")
        private String fixedTime;

        @com.aliyun.core.annotation.NameInMap("OffsetDayOfTime")
        private String offsetDayOfTime;

        @com.aliyun.core.annotation.NameInMap("OffsetUnit")
        private Integer offsetUnit;

        @com.aliyun.core.annotation.NameInMap("OffsetValue")
        private Integer offsetValue;

        private EffectTimePointRule(Builder builder) {
            this.anchor = builder.anchor;
            this.fixedTime = builder.fixedTime;
            this.offsetDayOfTime = builder.offsetDayOfTime;
            this.offsetUnit = builder.offsetUnit;
            this.offsetValue = builder.offsetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectTimePointRule create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Integer getAnchor() {
            return this.anchor;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return offsetDayOfTime
         */
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        /**
         * @return offsetUnit
         */
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        /**
         * @return offsetValue
         */
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

        public static final class Builder {
            private Integer anchor; 
            private String fixedTime; 
            private String offsetDayOfTime; 
            private Integer offsetUnit; 
            private Integer offsetValue; 

            private Builder() {
            } 

            private Builder(EffectTimePointRule model) {
                this.anchor = model.anchor;
                this.fixedTime = model.fixedTime;
                this.offsetDayOfTime = model.offsetDayOfTime;
                this.offsetUnit = model.offsetUnit;
                this.offsetValue = model.offsetValue;
            } 

            /**
             * Anchor.
             */
            public Builder anchor(Integer anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * OffsetDayOfTime.
             */
            public Builder offsetDayOfTime(String offsetDayOfTime) {
                this.offsetDayOfTime = offsetDayOfTime;
                return this;
            }

            /**
             * OffsetUnit.
             */
            public Builder offsetUnit(Integer offsetUnit) {
                this.offsetUnit = offsetUnit;
                return this;
            }

            /**
             * OffsetValue.
             */
            public Builder offsetValue(Integer offsetValue) {
                this.offsetValue = offsetValue;
                return this;
            }

            public EffectTimePointRule build() {
                return new EffectTimePointRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class EntryTimePeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        private EntryTimePeriods(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntryTimePeriods create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 

            private Builder() {
            } 

            private Builder(EntryTimePeriods model) {
                this.beginTime = model.beginTime;
                this.endTime = model.endTime;
            } 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            public EntryTimePeriods build() {
                return new EntryTimePeriods(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class EntryWithVoucherRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VoucherRemark")
        private String voucherRemark;

        @com.aliyun.core.annotation.NameInMap("VoucherTypes")
        private java.util.List<Integer> voucherTypes;

        private EntryWithVoucherRule(Builder builder) {
            this.voucherRemark = builder.voucherRemark;
            this.voucherTypes = builder.voucherTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntryWithVoucherRule create() {
            return builder().build();
        }

        /**
         * @return voucherRemark
         */
        public String getVoucherRemark() {
            return this.voucherRemark;
        }

        /**
         * @return voucherTypes
         */
        public java.util.List<Integer> getVoucherTypes() {
            return this.voucherTypes;
        }

        public static final class Builder {
            private String voucherRemark; 
            private java.util.List<Integer> voucherTypes; 

            private Builder() {
            } 

            private Builder(EntryWithVoucherRule model) {
                this.voucherRemark = model.voucherRemark;
                this.voucherTypes = model.voucherTypes;
            } 

            /**
             * VoucherRemark.
             */
            public Builder voucherRemark(String voucherRemark) {
                this.voucherRemark = voucherRemark;
                return this;
            }

            /**
             * VoucherTypes.
             */
            public Builder voucherTypes(java.util.List<Integer> voucherTypes) {
                this.voucherTypes = voucherTypes;
                return this;
            }

            public EntryWithVoucherRule build() {
                return new EntryWithVoucherRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class PickupsRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PickupsAddress")
        private String pickupsAddress;

        @com.aliyun.core.annotation.NameInMap("VoucherRemark")
        private String voucherRemark;

        @com.aliyun.core.annotation.NameInMap("VoucherTypes")
        private java.util.List<Integer> voucherTypes;

        private PickupsRule(Builder builder) {
            this.pickupsAddress = builder.pickupsAddress;
            this.voucherRemark = builder.voucherRemark;
            this.voucherTypes = builder.voucherTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PickupsRule create() {
            return builder().build();
        }

        /**
         * @return pickupsAddress
         */
        public String getPickupsAddress() {
            return this.pickupsAddress;
        }

        /**
         * @return voucherRemark
         */
        public String getVoucherRemark() {
            return this.voucherRemark;
        }

        /**
         * @return voucherTypes
         */
        public java.util.List<Integer> getVoucherTypes() {
            return this.voucherTypes;
        }

        public static final class Builder {
            private String pickupsAddress; 
            private String voucherRemark; 
            private java.util.List<Integer> voucherTypes; 

            private Builder() {
            } 

            private Builder(PickupsRule model) {
                this.pickupsAddress = model.pickupsAddress;
                this.voucherRemark = model.voucherRemark;
                this.voucherTypes = model.voucherTypes;
            } 

            /**
             * PickupsAddress.
             */
            public Builder pickupsAddress(String pickupsAddress) {
                this.pickupsAddress = pickupsAddress;
                return this;
            }

            /**
             * VoucherRemark.
             */
            public Builder voucherRemark(String voucherRemark) {
                this.voucherRemark = voucherRemark;
                return this;
            }

            /**
             * VoucherTypes.
             */
            public Builder voucherTypes(java.util.List<Integer> voucherTypes) {
                this.voucherTypes = voucherTypes;
                return this;
            }

            public PickupsRule build() {
                return new PickupsRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class ValidityPeriodRuleFrom extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Integer anchor;

        @com.aliyun.core.annotation.NameInMap("FixedTime")
        private String fixedTime;

        @com.aliyun.core.annotation.NameInMap("OffsetDayOfTime")
        private String offsetDayOfTime;

        @com.aliyun.core.annotation.NameInMap("OffsetUnit")
        private Integer offsetUnit;

        @com.aliyun.core.annotation.NameInMap("OffsetValue")
        private Integer offsetValue;

        private ValidityPeriodRuleFrom(Builder builder) {
            this.anchor = builder.anchor;
            this.fixedTime = builder.fixedTime;
            this.offsetDayOfTime = builder.offsetDayOfTime;
            this.offsetUnit = builder.offsetUnit;
            this.offsetValue = builder.offsetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidityPeriodRuleFrom create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Integer getAnchor() {
            return this.anchor;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return offsetDayOfTime
         */
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        /**
         * @return offsetUnit
         */
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        /**
         * @return offsetValue
         */
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

        public static final class Builder {
            private Integer anchor; 
            private String fixedTime; 
            private String offsetDayOfTime; 
            private Integer offsetUnit; 
            private Integer offsetValue; 

            private Builder() {
            } 

            private Builder(ValidityPeriodRuleFrom model) {
                this.anchor = model.anchor;
                this.fixedTime = model.fixedTime;
                this.offsetDayOfTime = model.offsetDayOfTime;
                this.offsetUnit = model.offsetUnit;
                this.offsetValue = model.offsetValue;
            } 

            /**
             * Anchor.
             */
            public Builder anchor(Integer anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * OffsetDayOfTime.
             */
            public Builder offsetDayOfTime(String offsetDayOfTime) {
                this.offsetDayOfTime = offsetDayOfTime;
                return this;
            }

            /**
             * OffsetUnit.
             */
            public Builder offsetUnit(Integer offsetUnit) {
                this.offsetUnit = offsetUnit;
                return this;
            }

            /**
             * OffsetValue.
             */
            public Builder offsetValue(Integer offsetValue) {
                this.offsetValue = offsetValue;
                return this;
            }

            public ValidityPeriodRuleFrom build() {
                return new ValidityPeriodRuleFrom(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class ValidityPeriodRuleTo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Integer anchor;

        @com.aliyun.core.annotation.NameInMap("FixedTime")
        private String fixedTime;

        @com.aliyun.core.annotation.NameInMap("OffsetDayOfTime")
        private String offsetDayOfTime;

        @com.aliyun.core.annotation.NameInMap("OffsetUnit")
        private Integer offsetUnit;

        @com.aliyun.core.annotation.NameInMap("OffsetValue")
        private Integer offsetValue;

        private ValidityPeriodRuleTo(Builder builder) {
            this.anchor = builder.anchor;
            this.fixedTime = builder.fixedTime;
            this.offsetDayOfTime = builder.offsetDayOfTime;
            this.offsetUnit = builder.offsetUnit;
            this.offsetValue = builder.offsetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidityPeriodRuleTo create() {
            return builder().build();
        }

        /**
         * @return anchor
         */
        public Integer getAnchor() {
            return this.anchor;
        }

        /**
         * @return fixedTime
         */
        public String getFixedTime() {
            return this.fixedTime;
        }

        /**
         * @return offsetDayOfTime
         */
        public String getOffsetDayOfTime() {
            return this.offsetDayOfTime;
        }

        /**
         * @return offsetUnit
         */
        public Integer getOffsetUnit() {
            return this.offsetUnit;
        }

        /**
         * @return offsetValue
         */
        public Integer getOffsetValue() {
            return this.offsetValue;
        }

        public static final class Builder {
            private Integer anchor; 
            private String fixedTime; 
            private String offsetDayOfTime; 
            private Integer offsetUnit; 
            private Integer offsetValue; 

            private Builder() {
            } 

            private Builder(ValidityPeriodRuleTo model) {
                this.anchor = model.anchor;
                this.fixedTime = model.fixedTime;
                this.offsetDayOfTime = model.offsetDayOfTime;
                this.offsetUnit = model.offsetUnit;
                this.offsetValue = model.offsetValue;
            } 

            /**
             * Anchor.
             */
            public Builder anchor(Integer anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * FixedTime.
             */
            public Builder fixedTime(String fixedTime) {
                this.fixedTime = fixedTime;
                return this;
            }

            /**
             * OffsetDayOfTime.
             */
            public Builder offsetDayOfTime(String offsetDayOfTime) {
                this.offsetDayOfTime = offsetDayOfTime;
                return this;
            }

            /**
             * OffsetUnit.
             */
            public Builder offsetUnit(Integer offsetUnit) {
                this.offsetUnit = offsetUnit;
                return this;
            }

            /**
             * OffsetValue.
             */
            public Builder offsetValue(Integer offsetValue) {
                this.offsetValue = offsetValue;
                return this;
            }

            public ValidityPeriodRuleTo build() {
                return new ValidityPeriodRuleTo(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class ValidityPeriodRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableWeeks")
        private java.util.List<Integer> availableWeeks;

        @com.aliyun.core.annotation.NameInMap("From")
        private ValidityPeriodRuleFrom from;

        @com.aliyun.core.annotation.NameInMap("To")
        private ValidityPeriodRuleTo to;

        @com.aliyun.core.annotation.NameInMap("UnavailableDates")
        private java.util.List<String> unavailableDates;

        private ValidityPeriodRule(Builder builder) {
            this.availableWeeks = builder.availableWeeks;
            this.from = builder.from;
            this.to = builder.to;
            this.unavailableDates = builder.unavailableDates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidityPeriodRule create() {
            return builder().build();
        }

        /**
         * @return availableWeeks
         */
        public java.util.List<Integer> getAvailableWeeks() {
            return this.availableWeeks;
        }

        /**
         * @return from
         */
        public ValidityPeriodRuleFrom getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public ValidityPeriodRuleTo getTo() {
            return this.to;
        }

        /**
         * @return unavailableDates
         */
        public java.util.List<String> getUnavailableDates() {
            return this.unavailableDates;
        }

        public static final class Builder {
            private java.util.List<Integer> availableWeeks; 
            private ValidityPeriodRuleFrom from; 
            private ValidityPeriodRuleTo to; 
            private java.util.List<String> unavailableDates; 

            private Builder() {
            } 

            private Builder(ValidityPeriodRule model) {
                this.availableWeeks = model.availableWeeks;
                this.from = model.from;
                this.to = model.to;
                this.unavailableDates = model.unavailableDates;
            } 

            /**
             * AvailableWeeks.
             */
            public Builder availableWeeks(java.util.List<Integer> availableWeeks) {
                this.availableWeeks = availableWeeks;
                return this;
            }

            /**
             * From.
             */
            public Builder from(ValidityPeriodRuleFrom from) {
                this.from = from;
                return this;
            }

            /**
             * To.
             */
            public Builder to(ValidityPeriodRuleTo to) {
                this.to = to;
                return this;
            }

            /**
             * UnavailableDates.
             */
            public Builder unavailableDates(java.util.List<String> unavailableDates) {
                this.unavailableDates = unavailableDates;
                return this;
            }

            public ValidityPeriodRule build() {
                return new ValidityPeriodRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class UseRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectTimePointRule")
        private EffectTimePointRule effectTimePointRule;

        @com.aliyun.core.annotation.NameInMap("EntryAddress")
        private String entryAddress;

        @com.aliyun.core.annotation.NameInMap("EntryRemark")
        private String entryRemark;

        @com.aliyun.core.annotation.NameInMap("EntryTimePeriods")
        private java.util.List<EntryTimePeriods> entryTimePeriods;

        @com.aliyun.core.annotation.NameInMap("EntryType")
        private Integer entryType;

        @com.aliyun.core.annotation.NameInMap("EntryWithVoucherRule")
        private EntryWithVoucherRule entryWithVoucherRule;

        @com.aliyun.core.annotation.NameInMap("NeedAssemble")
        private Boolean needAssemble;

        @com.aliyun.core.annotation.NameInMap("NeedPrebook")
        private Boolean needPrebook;

        @com.aliyun.core.annotation.NameInMap("OtherNote")
        private String otherNote;

        @com.aliyun.core.annotation.NameInMap("PickupsRule")
        private PickupsRule pickupsRule;

        @com.aliyun.core.annotation.NameInMap("ValidityPeriodRule")
        private ValidityPeriodRule validityPeriodRule;

        private UseRule(Builder builder) {
            this.effectTimePointRule = builder.effectTimePointRule;
            this.entryAddress = builder.entryAddress;
            this.entryRemark = builder.entryRemark;
            this.entryTimePeriods = builder.entryTimePeriods;
            this.entryType = builder.entryType;
            this.entryWithVoucherRule = builder.entryWithVoucherRule;
            this.needAssemble = builder.needAssemble;
            this.needPrebook = builder.needPrebook;
            this.otherNote = builder.otherNote;
            this.pickupsRule = builder.pickupsRule;
            this.validityPeriodRule = builder.validityPeriodRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UseRule create() {
            return builder().build();
        }

        /**
         * @return effectTimePointRule
         */
        public EffectTimePointRule getEffectTimePointRule() {
            return this.effectTimePointRule;
        }

        /**
         * @return entryAddress
         */
        public String getEntryAddress() {
            return this.entryAddress;
        }

        /**
         * @return entryRemark
         */
        public String getEntryRemark() {
            return this.entryRemark;
        }

        /**
         * @return entryTimePeriods
         */
        public java.util.List<EntryTimePeriods> getEntryTimePeriods() {
            return this.entryTimePeriods;
        }

        /**
         * @return entryType
         */
        public Integer getEntryType() {
            return this.entryType;
        }

        /**
         * @return entryWithVoucherRule
         */
        public EntryWithVoucherRule getEntryWithVoucherRule() {
            return this.entryWithVoucherRule;
        }

        /**
         * @return needAssemble
         */
        public Boolean getNeedAssemble() {
            return this.needAssemble;
        }

        /**
         * @return needPrebook
         */
        public Boolean getNeedPrebook() {
            return this.needPrebook;
        }

        /**
         * @return otherNote
         */
        public String getOtherNote() {
            return this.otherNote;
        }

        /**
         * @return pickupsRule
         */
        public PickupsRule getPickupsRule() {
            return this.pickupsRule;
        }

        /**
         * @return validityPeriodRule
         */
        public ValidityPeriodRule getValidityPeriodRule() {
            return this.validityPeriodRule;
        }

        public static final class Builder {
            private EffectTimePointRule effectTimePointRule; 
            private String entryAddress; 
            private String entryRemark; 
            private java.util.List<EntryTimePeriods> entryTimePeriods; 
            private Integer entryType; 
            private EntryWithVoucherRule entryWithVoucherRule; 
            private Boolean needAssemble; 
            private Boolean needPrebook; 
            private String otherNote; 
            private PickupsRule pickupsRule; 
            private ValidityPeriodRule validityPeriodRule; 

            private Builder() {
            } 

            private Builder(UseRule model) {
                this.effectTimePointRule = model.effectTimePointRule;
                this.entryAddress = model.entryAddress;
                this.entryRemark = model.entryRemark;
                this.entryTimePeriods = model.entryTimePeriods;
                this.entryType = model.entryType;
                this.entryWithVoucherRule = model.entryWithVoucherRule;
                this.needAssemble = model.needAssemble;
                this.needPrebook = model.needPrebook;
                this.otherNote = model.otherNote;
                this.pickupsRule = model.pickupsRule;
                this.validityPeriodRule = model.validityPeriodRule;
            } 

            /**
             * EffectTimePointRule.
             */
            public Builder effectTimePointRule(EffectTimePointRule effectTimePointRule) {
                this.effectTimePointRule = effectTimePointRule;
                return this;
            }

            /**
             * EntryAddress.
             */
            public Builder entryAddress(String entryAddress) {
                this.entryAddress = entryAddress;
                return this;
            }

            /**
             * EntryRemark.
             */
            public Builder entryRemark(String entryRemark) {
                this.entryRemark = entryRemark;
                return this;
            }

            /**
             * EntryTimePeriods.
             */
            public Builder entryTimePeriods(java.util.List<EntryTimePeriods> entryTimePeriods) {
                this.entryTimePeriods = entryTimePeriods;
                return this;
            }

            /**
             * EntryType.
             */
            public Builder entryType(Integer entryType) {
                this.entryType = entryType;
                return this;
            }

            /**
             * EntryWithVoucherRule.
             */
            public Builder entryWithVoucherRule(EntryWithVoucherRule entryWithVoucherRule) {
                this.entryWithVoucherRule = entryWithVoucherRule;
                return this;
            }

            /**
             * NeedAssemble.
             */
            public Builder needAssemble(Boolean needAssemble) {
                this.needAssemble = needAssemble;
                return this;
            }

            /**
             * NeedPrebook.
             */
            public Builder needPrebook(Boolean needPrebook) {
                this.needPrebook = needPrebook;
                return this;
            }

            /**
             * OtherNote.
             */
            public Builder otherNote(String otherNote) {
                this.otherNote = otherNote;
                return this;
            }

            /**
             * PickupsRule.
             */
            public Builder pickupsRule(PickupsRule pickupsRule) {
                this.pickupsRule = pickupsRule;
                return this;
            }

            /**
             * ValidityPeriodRule.
             */
            public Builder validityPeriodRule(ValidityPeriodRule validityPeriodRule) {
                this.validityPeriodRule = validityPeriodRule;
                return this;
            }

            public UseRule build() {
                return new UseRule(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class Product extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BookingType")
        private Integer bookingType;

        @com.aliyun.core.annotation.NameInMap("BuyRule")
        private BuyRule buyRule;

        @com.aliyun.core.annotation.NameInMap("CostIncludeRemark")
        private String costIncludeRemark;

        @com.aliyun.core.annotation.NameInMap("DeliverGuaranteeMinutes")
        private Integer deliverGuaranteeMinutes;

        @com.aliyun.core.annotation.NameInMap("Images")
        private java.util.List<String> images;

        @com.aliyun.core.annotation.NameInMap("InvoiceIssuerType")
        private Integer invoiceIssuerType;

        @com.aliyun.core.annotation.NameInMap("PaymentLimitMinutes")
        private Integer paymentLimitMinutes;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("RefundRule")
        private RefundRule refundRule;

        @com.aliyun.core.annotation.NameInMap("Region")
        private Region region;

        @com.aliyun.core.annotation.NameInMap("ScenicId")
        private Long scenicId;

        @com.aliyun.core.annotation.NameInMap("Session")
        private Session session;

        @com.aliyun.core.annotation.NameInMap("SettlePriceCalculateType")
        private Integer settlePriceCalculateType;

        @com.aliyun.core.annotation.NameInMap("Spu")
        private Spu spu;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("TicketKind")
        private TicketKind ticketKind;

        @com.aliyun.core.annotation.NameInMap("UseRule")
        private UseRule useRule;

        private Product(Builder builder) {
            this.bookingType = builder.bookingType;
            this.buyRule = builder.buyRule;
            this.costIncludeRemark = builder.costIncludeRemark;
            this.deliverGuaranteeMinutes = builder.deliverGuaranteeMinutes;
            this.images = builder.images;
            this.invoiceIssuerType = builder.invoiceIssuerType;
            this.paymentLimitMinutes = builder.paymentLimitMinutes;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.refundRule = builder.refundRule;
            this.region = builder.region;
            this.scenicId = builder.scenicId;
            this.session = builder.session;
            this.settlePriceCalculateType = builder.settlePriceCalculateType;
            this.spu = builder.spu;
            this.supplierName = builder.supplierName;
            this.ticketKind = builder.ticketKind;
            this.useRule = builder.useRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Product create() {
            return builder().build();
        }

        /**
         * @return bookingType
         */
        public Integer getBookingType() {
            return this.bookingType;
        }

        /**
         * @return buyRule
         */
        public BuyRule getBuyRule() {
            return this.buyRule;
        }

        /**
         * @return costIncludeRemark
         */
        public String getCostIncludeRemark() {
            return this.costIncludeRemark;
        }

        /**
         * @return deliverGuaranteeMinutes
         */
        public Integer getDeliverGuaranteeMinutes() {
            return this.deliverGuaranteeMinutes;
        }

        /**
         * @return images
         */
        public java.util.List<String> getImages() {
            return this.images;
        }

        /**
         * @return invoiceIssuerType
         */
        public Integer getInvoiceIssuerType() {
            return this.invoiceIssuerType;
        }

        /**
         * @return paymentLimitMinutes
         */
        public Integer getPaymentLimitMinutes() {
            return this.paymentLimitMinutes;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return refundRule
         */
        public RefundRule getRefundRule() {
            return this.refundRule;
        }

        /**
         * @return region
         */
        public Region getRegion() {
            return this.region;
        }

        /**
         * @return scenicId
         */
        public Long getScenicId() {
            return this.scenicId;
        }

        /**
         * @return session
         */
        public Session getSession() {
            return this.session;
        }

        /**
         * @return settlePriceCalculateType
         */
        public Integer getSettlePriceCalculateType() {
            return this.settlePriceCalculateType;
        }

        /**
         * @return spu
         */
        public Spu getSpu() {
            return this.spu;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return ticketKind
         */
        public TicketKind getTicketKind() {
            return this.ticketKind;
        }

        /**
         * @return useRule
         */
        public UseRule getUseRule() {
            return this.useRule;
        }

        public static final class Builder {
            private Integer bookingType; 
            private BuyRule buyRule; 
            private String costIncludeRemark; 
            private Integer deliverGuaranteeMinutes; 
            private java.util.List<String> images; 
            private Integer invoiceIssuerType; 
            private Integer paymentLimitMinutes; 
            private String productId; 
            private String productName; 
            private RefundRule refundRule; 
            private Region region; 
            private Long scenicId; 
            private Session session; 
            private Integer settlePriceCalculateType; 
            private Spu spu; 
            private String supplierName; 
            private TicketKind ticketKind; 
            private UseRule useRule; 

            private Builder() {
            } 

            private Builder(Product model) {
                this.bookingType = model.bookingType;
                this.buyRule = model.buyRule;
                this.costIncludeRemark = model.costIncludeRemark;
                this.deliverGuaranteeMinutes = model.deliverGuaranteeMinutes;
                this.images = model.images;
                this.invoiceIssuerType = model.invoiceIssuerType;
                this.paymentLimitMinutes = model.paymentLimitMinutes;
                this.productId = model.productId;
                this.productName = model.productName;
                this.refundRule = model.refundRule;
                this.region = model.region;
                this.scenicId = model.scenicId;
                this.session = model.session;
                this.settlePriceCalculateType = model.settlePriceCalculateType;
                this.spu = model.spu;
                this.supplierName = model.supplierName;
                this.ticketKind = model.ticketKind;
                this.useRule = model.useRule;
            } 

            /**
             * BookingType.
             */
            public Builder bookingType(Integer bookingType) {
                this.bookingType = bookingType;
                return this;
            }

            /**
             * BuyRule.
             */
            public Builder buyRule(BuyRule buyRule) {
                this.buyRule = buyRule;
                return this;
            }

            /**
             * CostIncludeRemark.
             */
            public Builder costIncludeRemark(String costIncludeRemark) {
                this.costIncludeRemark = costIncludeRemark;
                return this;
            }

            /**
             * DeliverGuaranteeMinutes.
             */
            public Builder deliverGuaranteeMinutes(Integer deliverGuaranteeMinutes) {
                this.deliverGuaranteeMinutes = deliverGuaranteeMinutes;
                return this;
            }

            /**
             * Images.
             */
            public Builder images(java.util.List<String> images) {
                this.images = images;
                return this;
            }

            /**
             * InvoiceIssuerType.
             */
            public Builder invoiceIssuerType(Integer invoiceIssuerType) {
                this.invoiceIssuerType = invoiceIssuerType;
                return this;
            }

            /**
             * PaymentLimitMinutes.
             */
            public Builder paymentLimitMinutes(Integer paymentLimitMinutes) {
                this.paymentLimitMinutes = paymentLimitMinutes;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * RefundRule.
             */
            public Builder refundRule(RefundRule refundRule) {
                this.refundRule = refundRule;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(Region region) {
                this.region = region;
                return this;
            }

            /**
             * ScenicId.
             */
            public Builder scenicId(Long scenicId) {
                this.scenicId = scenicId;
                return this;
            }

            /**
             * Session.
             */
            public Builder session(Session session) {
                this.session = session;
                return this;
            }

            /**
             * SettlePriceCalculateType.
             */
            public Builder settlePriceCalculateType(Integer settlePriceCalculateType) {
                this.settlePriceCalculateType = settlePriceCalculateType;
                return this;
            }

            /**
             * Spu.
             */
            public Builder spu(Spu spu) {
                this.spu = spu;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * TicketKind.
             */
            public Builder ticketKind(TicketKind ticketKind) {
                this.ticketKind = ticketKind;
                return this;
            }

            /**
             * UseRule.
             */
            public Builder useRule(UseRule useRule) {
                this.useRule = useRule;
                return this;
            }

            public Product build() {
                return new Product(this);
            } 

        } 

    }
    /**
     * 
     * {@link TicketQueryProductResponseBody} extends {@link TeaModel}
     *
     * <p>TicketQueryProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Product")
        private Product product;

        private Data(Builder builder) {
            this.product = builder.product;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return product
         */
        public Product getProduct() {
            return this.product;
        }

        public static final class Builder {
            private Product product; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.product = model.product;
            } 

            /**
             * Product.
             */
            public Builder product(Product product) {
                this.product = product;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
