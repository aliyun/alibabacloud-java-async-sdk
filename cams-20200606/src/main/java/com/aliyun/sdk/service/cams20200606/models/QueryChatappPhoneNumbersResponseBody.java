// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>QueryChatappPhoneNumbersResponseBody</p>
 */
public class QueryChatappPhoneNumbersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    private java.util.List<PhoneNumbers> phoneNumbers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryChatappPhoneNumbersResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.phoneNumbers = builder.phoneNumbers;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChatappPhoneNumbersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public String getData() {
        return this.data;
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
    public java.util.List<PhoneNumbers> getPhoneNumbers() {
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
        private String accessDeniedDetail; 
        private String code; 
        private String data; 
        private String message; 
        private java.util.List<PhoneNumbers> phoneNumbers; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryChatappPhoneNumbersResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.phoneNumbers = model.phoneNumbers;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The request status code.</p>
         * <ul>
         * <li><p>OK indicates that the request was successful.</p>
         * </li>
         * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The list of phone numbers.</p>
         */
        public Builder phoneNumbers(java.util.List<PhoneNumbers> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryChatappPhoneNumbersResponseBody build() {
            return new QueryChatappPhoneNumbersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChatappPhoneNumbersResponseBody</p>
     */
    public static class HolidaySchedule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private HolidaySchedule(Builder builder) {
            this.date = builder.date;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HolidaySchedule create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String date; 
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(HolidaySchedule model) {
                this.date = model.date;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The date in YYYY-MM-DD format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The end time in HHmm format.</p>
             * 
             * <strong>example:</strong>
             * <p>2359</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time in HHmm format.</p>
             * 
             * <strong>example:</strong>
             * <p>0000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public HolidaySchedule build() {
                return new HolidaySchedule(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChatappPhoneNumbersResponseBody</p>
     */
    public static class WeeklyOperatingHours extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CloseTime")
        private String closeTime;

        @com.aliyun.core.annotation.NameInMap("DayOfWeek")
        private String dayOfWeek;

        @com.aliyun.core.annotation.NameInMap("OpenTime")
        private String openTime;

        private WeeklyOperatingHours(Builder builder) {
            this.closeTime = builder.closeTime;
            this.dayOfWeek = builder.dayOfWeek;
            this.openTime = builder.openTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WeeklyOperatingHours create() {
            return builder().build();
        }

        /**
         * @return closeTime
         */
        public String getCloseTime() {
            return this.closeTime;
        }

        /**
         * @return dayOfWeek
         */
        public String getDayOfWeek() {
            return this.dayOfWeek;
        }

        /**
         * @return openTime
         */
        public String getOpenTime() {
            return this.openTime;
        }

        public static final class Builder {
            private String closeTime; 
            private String dayOfWeek; 
            private String openTime; 

            private Builder() {
            } 

            private Builder(WeeklyOperatingHours model) {
                this.closeTime = model.closeTime;
                this.dayOfWeek = model.dayOfWeek;
                this.openTime = model.openTime;
            } 

            /**
             * <p>The closing time in HHmm format.</p>
             * 
             * <strong>example:</strong>
             * <p>2359</p>
             */
            public Builder closeTime(String closeTime) {
                this.closeTime = closeTime;
                return this;
            }

            /**
             * <p>The day of the week.</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder dayOfWeek(String dayOfWeek) {
                this.dayOfWeek = dayOfWeek;
                return this;
            }

            /**
             * <p>The opening time in HHmm format.</p>
             * 
             * <strong>example:</strong>
             * <p>0000</p>
             */
            public Builder openTime(String openTime) {
                this.openTime = openTime;
                return this;
            }

            public WeeklyOperatingHours build() {
                return new WeeklyOperatingHours(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChatappPhoneNumbersResponseBody</p>
     */
    public static class CallHours extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallIconVisibility")
        private String callIconVisibility;

        @com.aliyun.core.annotation.NameInMap("CallbackPermissionStatus")
        private String callbackPermissionStatus;

        @com.aliyun.core.annotation.NameInMap("HolidaySchedule")
        private java.util.List<HolidaySchedule> holidaySchedule;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimezoneId")
        private String timezoneId;

        @com.aliyun.core.annotation.NameInMap("WeeklyOperatingHours")
        private java.util.List<WeeklyOperatingHours> weeklyOperatingHours;

        private CallHours(Builder builder) {
            this.callIconVisibility = builder.callIconVisibility;
            this.callbackPermissionStatus = builder.callbackPermissionStatus;
            this.holidaySchedule = builder.holidaySchedule;
            this.status = builder.status;
            this.timezoneId = builder.timezoneId;
            this.weeklyOperatingHours = builder.weeklyOperatingHours;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallHours create() {
            return builder().build();
        }

        /**
         * @return callIconVisibility
         */
        public String getCallIconVisibility() {
            return this.callIconVisibility;
        }

        /**
         * @return callbackPermissionStatus
         */
        public String getCallbackPermissionStatus() {
            return this.callbackPermissionStatus;
        }

        /**
         * @return holidaySchedule
         */
        public java.util.List<HolidaySchedule> getHolidaySchedule() {
            return this.holidaySchedule;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timezoneId
         */
        public String getTimezoneId() {
            return this.timezoneId;
        }

        /**
         * @return weeklyOperatingHours
         */
        public java.util.List<WeeklyOperatingHours> getWeeklyOperatingHours() {
            return this.weeklyOperatingHours;
        }

        public static final class Builder {
            private String callIconVisibility; 
            private String callbackPermissionStatus; 
            private java.util.List<HolidaySchedule> holidaySchedule; 
            private String status; 
            private String timezoneId; 
            private java.util.List<WeeklyOperatingHours> weeklyOperatingHours; 

            private Builder() {
            } 

            private Builder(CallHours model) {
                this.callIconVisibility = model.callIconVisibility;
                this.callbackPermissionStatus = model.callbackPermissionStatus;
                this.holidaySchedule = model.holidaySchedule;
                this.status = model.status;
                this.timezoneId = model.timezoneId;
                this.weeklyOperatingHours = model.weeklyOperatingHours;
            } 

            /**
             * <p>The visibility of the call icon.</p>
             * 
             * <strong>example:</strong>
             * <p>DEFAULT</p>
             */
            public Builder callIconVisibility(String callIconVisibility) {
                this.callIconVisibility = callIconVisibility;
                return this;
            }

            /**
             * <p>The callback permission status.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder callbackPermissionStatus(String callbackPermissionStatus) {
                this.callbackPermissionStatus = callbackPermissionStatus;
                return this;
            }

            /**
             * <p>The holiday call hours schedule.</p>
             */
            public Builder holidaySchedule(java.util.List<HolidaySchedule> holidaySchedule) {
                this.holidaySchedule = holidaySchedule;
                return this;
            }

            /**
             * <p>The status of the call hours configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time zone ID, such as Asia/Shanghai.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezoneId(String timezoneId) {
                this.timezoneId = timezoneId;
                return this;
            }

            /**
             * <p>The weekly operating hours schedule.</p>
             */
            public Builder weeklyOperatingHours(java.util.List<WeeklyOperatingHours> weeklyOperatingHours) {
                this.weeklyOperatingHours = weeklyOperatingHours;
                return this;
            }

            public CallHours build() {
                return new CallHours(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChatappPhoneNumbersResponseBody</p>
     */
    public static class Calling extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallHours")
        private CallHours callHours;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Calling(Builder builder) {
            this.callHours = builder.callHours;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Calling create() {
            return builder().build();
        }

        /**
         * @return callHours
         */
        public CallHours getCallHours() {
            return this.callHours;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private CallHours callHours; 
            private String status; 

            private Builder() {
            } 

            private Builder(Calling model) {
                this.callHours = model.callHours;
                this.status = model.status;
            } 

            /**
             * <p>The call hours configuration.</p>
             */
            public Builder callHours(CallHours callHours) {
                this.callHours = callHours;
                return this;
            }

            /**
             * <p>The status of the calling feature.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Calling build() {
                return new Calling(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChatappPhoneNumbersResponseBody</p>
     */
    public static class CallingConfigure extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Calling")
        private Calling calling;

        @com.aliyun.core.annotation.NameInMap("CallingCallbackUrl")
        private String callingCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("MaxTalkTime")
        private Long maxTalkTime;

        private CallingConfigure(Builder builder) {
            this.calling = builder.calling;
            this.callingCallbackUrl = builder.callingCallbackUrl;
            this.maxTalkTime = builder.maxTalkTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallingConfigure create() {
            return builder().build();
        }

        /**
         * @return calling
         */
        public Calling getCalling() {
            return this.calling;
        }

        /**
         * @return callingCallbackUrl
         */
        public String getCallingCallbackUrl() {
            return this.callingCallbackUrl;
        }

        /**
         * @return maxTalkTime
         */
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public static final class Builder {
            private Calling calling; 
            private String callingCallbackUrl; 
            private Long maxTalkTime; 

            private Builder() {
            } 

            private Builder(CallingConfigure model) {
                this.calling = model.calling;
                this.callingCallbackUrl = model.callingCallbackUrl;
                this.maxTalkTime = model.maxTalkTime;
            } 

            /**
             * <p>The calling feature configuration.</p>
             */
            public Builder calling(Calling calling) {
                this.calling = calling;
                return this;
            }

            /**
             * <p>The callback URL for calls.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
             */
            public Builder callingCallbackUrl(String callingCallbackUrl) {
                this.callingCallbackUrl = callingCallbackUrl;
                return this;
            }

            /**
             * <p>The maximum call duration.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxTalkTime(Long maxTalkTime) {
                this.maxTalkTime = maxTalkTime;
                return this;
            }

            public CallingConfigure build() {
                return new CallingConfigure(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryChatappPhoneNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>QueryChatappPhoneNumbersResponseBody</p>
     */
    public static class PhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallingConfigure")
        private CallingConfigure callingConfigure;

        @com.aliyun.core.annotation.NameInMap("CodeVerificationStatus")
        private String codeVerificationStatus;

        @com.aliyun.core.annotation.NameInMap("IsOfficial")
        private String isOfficial;

        @com.aliyun.core.annotation.NameInMap("MessagingLimitTier")
        private String messagingLimitTier;

        @com.aliyun.core.annotation.NameInMap("NameStatus")
        private String nameStatus;

        @com.aliyun.core.annotation.NameInMap("NewNameStatus")
        private String newNameStatus;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("QualityRating")
        private String qualityRating;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCallbackUrl")
        private String statusCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("StatusQueue")
        private String statusQueue;

        @com.aliyun.core.annotation.NameInMap("UpCallbackUrl")
        private String upCallbackUrl;

        @com.aliyun.core.annotation.NameInMap("UpQueue")
        private String upQueue;

        @com.aliyun.core.annotation.NameInMap("VerifiedName")
        private String verifiedName;

        private PhoneNumbers(Builder builder) {
            this.callingConfigure = builder.callingConfigure;
            this.codeVerificationStatus = builder.codeVerificationStatus;
            this.isOfficial = builder.isOfficial;
            this.messagingLimitTier = builder.messagingLimitTier;
            this.nameStatus = builder.nameStatus;
            this.newNameStatus = builder.newNameStatus;
            this.phoneNumber = builder.phoneNumber;
            this.qualityRating = builder.qualityRating;
            this.status = builder.status;
            this.statusCallbackUrl = builder.statusCallbackUrl;
            this.statusQueue = builder.statusQueue;
            this.upCallbackUrl = builder.upCallbackUrl;
            this.upQueue = builder.upQueue;
            this.verifiedName = builder.verifiedName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return callingConfigure
         */
        public CallingConfigure getCallingConfigure() {
            return this.callingConfigure;
        }

        /**
         * @return codeVerificationStatus
         */
        public String getCodeVerificationStatus() {
            return this.codeVerificationStatus;
        }

        /**
         * @return isOfficial
         */
        public String getIsOfficial() {
            return this.isOfficial;
        }

        /**
         * @return messagingLimitTier
         */
        public String getMessagingLimitTier() {
            return this.messagingLimitTier;
        }

        /**
         * @return nameStatus
         */
        public String getNameStatus() {
            return this.nameStatus;
        }

        /**
         * @return newNameStatus
         */
        public String getNewNameStatus() {
            return this.newNameStatus;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return qualityRating
         */
        public String getQualityRating() {
            return this.qualityRating;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusCallbackUrl
         */
        public String getStatusCallbackUrl() {
            return this.statusCallbackUrl;
        }

        /**
         * @return statusQueue
         */
        public String getStatusQueue() {
            return this.statusQueue;
        }

        /**
         * @return upCallbackUrl
         */
        public String getUpCallbackUrl() {
            return this.upCallbackUrl;
        }

        /**
         * @return upQueue
         */
        public String getUpQueue() {
            return this.upQueue;
        }

        /**
         * @return verifiedName
         */
        public String getVerifiedName() {
            return this.verifiedName;
        }

        public static final class Builder {
            private CallingConfigure callingConfigure; 
            private String codeVerificationStatus; 
            private String isOfficial; 
            private String messagingLimitTier; 
            private String nameStatus; 
            private String newNameStatus; 
            private String phoneNumber; 
            private String qualityRating; 
            private String status; 
            private String statusCallbackUrl; 
            private String statusQueue; 
            private String upCallbackUrl; 
            private String upQueue; 
            private String verifiedName; 

            private Builder() {
            } 

            private Builder(PhoneNumbers model) {
                this.callingConfigure = model.callingConfigure;
                this.codeVerificationStatus = model.codeVerificationStatus;
                this.isOfficial = model.isOfficial;
                this.messagingLimitTier = model.messagingLimitTier;
                this.nameStatus = model.nameStatus;
                this.newNameStatus = model.newNameStatus;
                this.phoneNumber = model.phoneNumber;
                this.qualityRating = model.qualityRating;
                this.status = model.status;
                this.statusCallbackUrl = model.statusCallbackUrl;
                this.statusQueue = model.statusQueue;
                this.upCallbackUrl = model.upCallbackUrl;
                this.upQueue = model.upQueue;
                this.verifiedName = model.verifiedName;
            } 

            /**
             * <p>The calling configuration.</p>
             */
            public Builder callingConfigure(CallingConfigure callingConfigure) {
                this.callingConfigure = callingConfigure;
                return this;
            }

            /**
             * <p>The verification status of the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>VERIFIED</p>
             */
            public Builder codeVerificationStatus(String codeVerificationStatus) {
                this.codeVerificationStatus = codeVerificationStatus;
                return this;
            }

            /**
             * <p>Indicates whether the phone number is verified.</p>
             * 
             * <strong>example:</strong>
             * <p>N</p>
             */
            public Builder isOfficial(String isOfficial) {
                this.isOfficial = isOfficial;
                return this;
            }

            /**
             * <p>The messaging volume limit tier of the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>TIER_10K</p>
             */
            public Builder messagingLimitTier(String messagingLimitTier) {
                this.messagingLimitTier = messagingLimitTier;
                return this;
            }

            /**
             * <p>The name status.</p>
             * 
             * <strong>example:</strong>
             * <p>Approval</p>
             */
            public Builder nameStatus(String nameStatus) {
                this.nameStatus = nameStatus;
                return this;
            }

            /**
             * <p>The review status of the new name.</p>
             * 
             * <strong>example:</strong>
             * <p>Approval</p>
             */
            public Builder newNameStatus(String newNameStatus) {
                this.newNameStatus = newNameStatus;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>861380000****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The quality rating of the phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>GREEN</p>
             */
            public Builder qualityRating(String qualityRating) {
                this.qualityRating = qualityRating;
                return this;
            }

            /**
             * <p>The phone number status.</p>
             * 
             * <strong>example:</strong>
             * <p>CONNECTED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The URL for status report notifications.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ali.com/status">https://ali.com/status</a></p>
             */
            public Builder statusCallbackUrl(String statusCallbackUrl) {
                this.statusCallbackUrl = statusCallbackUrl;
                return this;
            }

            /**
             * <p>The queue for status report notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>Alicom-Queue-****-ChatAppStatus</p>
             */
            public Builder statusQueue(String statusQueue) {
                this.statusQueue = statusQueue;
                return this;
            }

            /**
             * <p>The URL for inbound message notifications.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ali.com/inbound">https://ali.com/inbound</a></p>
             */
            public Builder upCallbackUrl(String upCallbackUrl) {
                this.upCallbackUrl = upCallbackUrl;
                return this;
            }

            /**
             * <p>The queue for inbound message notifications.</p>
             * 
             * <strong>example:</strong>
             * <p>Alicom-Queue-****-ChatAppInbound</p>
             */
            public Builder upQueue(String upQueue) {
                this.upQueue = upQueue;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder verifiedName(String verifiedName) {
                this.verifiedName = verifiedName;
                return this;
            }

            public PhoneNumbers build() {
                return new PhoneNumbers(this);
            } 

        } 

    }
}
