// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetUserPasswordPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserPasswordPolicyResponseBody</p>
 */
public class GetUserPasswordPolicyResponseBody extends TeaModel {
    @NameInMap("activeCycle")
    private Long activeCycle;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("minLength")
    private Integer minLength;

    @NameInMap("passwordComplexityItem")
    private PasswordComplexityItem passwordComplexityItem;

    @NameInMap("reservationCount")
    private Integer reservationCount;

    private GetUserPasswordPolicyResponseBody(Builder builder) {
        this.activeCycle = builder.activeCycle;
        this.instanceId = builder.instanceId;
        this.minLength = builder.minLength;
        this.passwordComplexityItem = builder.passwordComplexityItem;
        this.reservationCount = builder.reservationCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserPasswordPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return activeCycle
     */
    public Long getActiveCycle() {
        return this.activeCycle;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return minLength
     */
    public Integer getMinLength() {
        return this.minLength;
    }

    /**
     * @return passwordComplexityItem
     */
    public PasswordComplexityItem getPasswordComplexityItem() {
        return this.passwordComplexityItem;
    }

    /**
     * @return reservationCount
     */
    public Integer getReservationCount() {
        return this.reservationCount;
    }

    public static final class Builder {
        private Long activeCycle; 
        private String instanceId; 
        private Integer minLength; 
        private PasswordComplexityItem passwordComplexityItem; 
        private Integer reservationCount; 

        /**
         * ??????????????????, ???????????????-1??????????????????
         */
        public Builder activeCycle(Long activeCycle) {
            this.activeCycle = activeCycle;
            return this;
        }

        /**
         * ??????ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ?????????????????????-1???????????????
         */
        public Builder minLength(Integer minLength) {
            this.minLength = minLength;
            return this;
        }

        /**
         * ???????????????
         */
        public Builder passwordComplexityItem(PasswordComplexityItem passwordComplexityItem) {
            this.passwordComplexityItem = passwordComplexityItem;
            return this;
        }

        /**
         * ???????????????????????????
         */
        public Builder reservationCount(Integer reservationCount) {
            this.reservationCount = reservationCount;
            return this;
        }

        public GetUserPasswordPolicyResponseBody build() {
            return new GetUserPasswordPolicyResponseBody(this);
        } 

    } 

    public static class PasswordComplexityItem extends TeaModel {
        @NameInMap("containLowerCase")
        private Boolean containLowerCase;

        @NameInMap("containNumber")
        private Boolean containNumber;

        @NameInMap("containSpecialChar")
        private Boolean containSpecialChar;

        @NameInMap("containUpperCase")
        private Boolean containUpperCase;

        @NameInMap("displayNameCheck")
        private Boolean displayNameCheck;

        @NameInMap("emailCheck")
        private Boolean emailCheck;

        @NameInMap("phoneCheck")
        private Boolean phoneCheck;

        @NameInMap("usernameCheck")
        private Boolean usernameCheck;

        private PasswordComplexityItem(Builder builder) {
            this.containLowerCase = builder.containLowerCase;
            this.containNumber = builder.containNumber;
            this.containSpecialChar = builder.containSpecialChar;
            this.containUpperCase = builder.containUpperCase;
            this.displayNameCheck = builder.displayNameCheck;
            this.emailCheck = builder.emailCheck;
            this.phoneCheck = builder.phoneCheck;
            this.usernameCheck = builder.usernameCheck;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordComplexityItem create() {
            return builder().build();
        }

        /**
         * @return containLowerCase
         */
        public Boolean getContainLowerCase() {
            return this.containLowerCase;
        }

        /**
         * @return containNumber
         */
        public Boolean getContainNumber() {
            return this.containNumber;
        }

        /**
         * @return containSpecialChar
         */
        public Boolean getContainSpecialChar() {
            return this.containSpecialChar;
        }

        /**
         * @return containUpperCase
         */
        public Boolean getContainUpperCase() {
            return this.containUpperCase;
        }

        /**
         * @return displayNameCheck
         */
        public Boolean getDisplayNameCheck() {
            return this.displayNameCheck;
        }

        /**
         * @return emailCheck
         */
        public Boolean getEmailCheck() {
            return this.emailCheck;
        }

        /**
         * @return phoneCheck
         */
        public Boolean getPhoneCheck() {
            return this.phoneCheck;
        }

        /**
         * @return usernameCheck
         */
        public Boolean getUsernameCheck() {
            return this.usernameCheck;
        }

        public static final class Builder {
            private Boolean containLowerCase; 
            private Boolean containNumber; 
            private Boolean containSpecialChar; 
            private Boolean containUpperCase; 
            private Boolean displayNameCheck; 
            private Boolean emailCheck; 
            private Boolean phoneCheck; 
            private Boolean usernameCheck; 

            /**
             * ????????????????????????
             */
            public Builder containLowerCase(Boolean containLowerCase) {
                this.containLowerCase = containLowerCase;
                return this;
            }

            /**
             * ??????????????????
             */
            public Builder containNumber(Boolean containNumber) {
                this.containNumber = containNumber;
                return this;
            }

            /**
             * ????????????????????????
             */
            public Builder containSpecialChar(Boolean containSpecialChar) {
                this.containSpecialChar = containSpecialChar;
                return this;
            }

            /**
             * ????????????????????????
             */
            public Builder containUpperCase(Boolean containUpperCase) {
                this.containUpperCase = containUpperCase;
                return this;
            }

            /**
             * ?????????????????????????????????
             */
            public Builder displayNameCheck(Boolean displayNameCheck) {
                this.displayNameCheck = displayNameCheck;
                return this;
            }

            /**
             * ????????????email??????
             */
            public Builder emailCheck(Boolean emailCheck) {
                this.emailCheck = emailCheck;
                return this;
            }

            /**
             * ?????????????????????????????????
             */
            public Builder phoneCheck(Boolean phoneCheck) {
                this.phoneCheck = phoneCheck;
                return this;
            }

            /**
             * ?????????????????????????????????
             */
            public Builder usernameCheck(Boolean usernameCheck) {
                this.usernameCheck = usernameCheck;
                return this;
            }

            public PasswordComplexityItem build() {
                return new PasswordComplexityItem(this);
            } 

        } 

    }
}
