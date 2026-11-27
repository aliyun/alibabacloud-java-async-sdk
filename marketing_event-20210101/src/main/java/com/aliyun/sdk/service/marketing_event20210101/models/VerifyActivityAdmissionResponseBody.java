// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

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
 * {@link VerifyActivityAdmissionResponseBody} extends {@link TeaModel}
 *
 * <p>VerifyActivityAdmissionResponseBody</p>
 */
public class VerifyActivityAdmissionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private VerifyActivityAdmissionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyActivityAdmissionResponseBody create() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(VerifyActivityAdmissionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public VerifyActivityAdmissionResponseBody build() {
            return new VerifyActivityAdmissionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VerifyActivityAdmissionResponseBody} extends {@link TeaModel}
     *
     * <p>VerifyActivityAdmissionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityId")
        private Long activityId;

        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AdmissionDate")
        private String admissionDate;

        @com.aliyun.core.annotation.NameInMap("AllowedDates")
        private java.util.List<String> allowedDates;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("CustomerLabels")
        private java.util.List<String> customerLabels;

        @com.aliyun.core.annotation.NameInMap("Decision")
        private String decision;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("MaskedIdCardNo")
        private String maskedIdCardNo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegistrationStatus")
        private Integer registrationStatus;

        @com.aliyun.core.annotation.NameInMap("SignedIn")
        private Boolean signedIn;

        @com.aliyun.core.annotation.NameInMap("SigninTime")
        private String signinTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.activityId = builder.activityId;
            this.activityName = builder.activityName;
            this.address = builder.address;
            this.admissionDate = builder.admissionDate;
            this.allowedDates = builder.allowedDates;
            this.channelName = builder.channelName;
            this.customerLabels = builder.customerLabels;
            this.decision = builder.decision;
            this.endTime = builder.endTime;
            this.maskedIdCardNo = builder.maskedIdCardNo;
            this.name = builder.name;
            this.registrationStatus = builder.registrationStatus;
            this.signedIn = builder.signedIn;
            this.signinTime = builder.signinTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activityId
         */
        public Long getActivityId() {
            return this.activityId;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return admissionDate
         */
        public String getAdmissionDate() {
            return this.admissionDate;
        }

        /**
         * @return allowedDates
         */
        public java.util.List<String> getAllowedDates() {
            return this.allowedDates;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return customerLabels
         */
        public java.util.List<String> getCustomerLabels() {
            return this.customerLabels;
        }

        /**
         * @return decision
         */
        public String getDecision() {
            return this.decision;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return maskedIdCardNo
         */
        public String getMaskedIdCardNo() {
            return this.maskedIdCardNo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return registrationStatus
         */
        public Integer getRegistrationStatus() {
            return this.registrationStatus;
        }

        /**
         * @return signedIn
         */
        public Boolean getSignedIn() {
            return this.signedIn;
        }

        /**
         * @return signinTime
         */
        public String getSigninTime() {
            return this.signinTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long activityId; 
            private String activityName; 
            private String address; 
            private String admissionDate; 
            private java.util.List<String> allowedDates; 
            private String channelName; 
            private java.util.List<String> customerLabels; 
            private String decision; 
            private String endTime; 
            private String maskedIdCardNo; 
            private String name; 
            private Integer registrationStatus; 
            private Boolean signedIn; 
            private String signinTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activityId = model.activityId;
                this.activityName = model.activityName;
                this.address = model.address;
                this.admissionDate = model.admissionDate;
                this.allowedDates = model.allowedDates;
                this.channelName = model.channelName;
                this.customerLabels = model.customerLabels;
                this.decision = model.decision;
                this.endTime = model.endTime;
                this.maskedIdCardNo = model.maskedIdCardNo;
                this.name = model.name;
                this.registrationStatus = model.registrationStatus;
                this.signedIn = model.signedIn;
                this.signinTime = model.signinTime;
                this.startTime = model.startTime;
            } 

            /**
             * ActivityId.
             */
            public Builder activityId(Long activityId) {
                this.activityId = activityId;
                return this;
            }

            /**
             * ActivityName.
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AdmissionDate.
             */
            public Builder admissionDate(String admissionDate) {
                this.admissionDate = admissionDate;
                return this;
            }

            /**
             * AllowedDates.
             */
            public Builder allowedDates(java.util.List<String> allowedDates) {
                this.allowedDates = allowedDates;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * CustomerLabels.
             */
            public Builder customerLabels(java.util.List<String> customerLabels) {
                this.customerLabels = customerLabels;
                return this;
            }

            /**
             * Decision.
             */
            public Builder decision(String decision) {
                this.decision = decision;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * MaskedIdCardNo.
             */
            public Builder maskedIdCardNo(String maskedIdCardNo) {
                this.maskedIdCardNo = maskedIdCardNo;
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
             * RegistrationStatus.
             */
            public Builder registrationStatus(Integer registrationStatus) {
                this.registrationStatus = registrationStatus;
                return this;
            }

            /**
             * SignedIn.
             */
            public Builder signedIn(Boolean signedIn) {
                this.signedIn = signedIn;
                return this;
            }

            /**
             * SigninTime.
             */
            public Builder signinTime(String signinTime) {
                this.signinTime = signinTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
