// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ReadSchedulerxCalendarResponseBody} extends {@link TeaModel}
 *
 * <p>ReadSchedulerxCalendarResponseBody</p>
 */
public class ReadSchedulerxCalendarResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ReadSchedulerxCalendarResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadSchedulerxCalendarResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private AccessDeniedDetail accessDeniedDetail; 
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ReadSchedulerxCalendarResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The access denial details.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>unknown exception occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C8E5FB4A-6D8D-424D-9AAA-4FE06BB74FF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReadSchedulerxCalendarResponseBody build() {
            return new ReadSchedulerxCalendarResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadSchedulerxCalendarResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxCalendarResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

            /**
             * <p>The authentication action.</p>
             * 
             * <strong>example:</strong>
             * <p>edas:ReadSchedulerxCalendar</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The principal name.</p>
             * 
             * <strong>example:</strong>
             * <p>209312833131416xxx</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The account of the principal.</p>
             * 
             * <strong>example:</strong>
             * <p>1827811800526xxx</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The principal type.</p>
             * 
             * <strong>example:</strong>
             * <p>SubUser</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The encoded diagnostic message.</p>
             * 
             * <strong>example:</strong>
             * <p>AQEAAAAAaDEssEE4MDg4NTQyLTVGMTYtNTFEQy1CODJCLUFFMDY4NUVDQ0ZBQQ==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>The permission denial type.</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>AccountLevelIdentityBasedPolicy</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadSchedulerxCalendarResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxCalendarResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalendarName")
        private String calendarName;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("MonthDaysContent")
        private String monthDaysContent;

        @com.aliyun.core.annotation.NameInMap("SystemCalendar")
        private Boolean systemCalendar;

        @com.aliyun.core.annotation.NameInMap("Year")
        private Integer year;

        private Records(Builder builder) {
            this.calendarName = builder.calendarName;
            this.creator = builder.creator;
            this.monthDaysContent = builder.monthDaysContent;
            this.systemCalendar = builder.systemCalendar;
            this.year = builder.year;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return calendarName
         */
        public String getCalendarName() {
            return this.calendarName;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return monthDaysContent
         */
        public String getMonthDaysContent() {
            return this.monthDaysContent;
        }

        /**
         * @return systemCalendar
         */
        public Boolean getSystemCalendar() {
            return this.systemCalendar;
        }

        /**
         * @return year
         */
        public Integer getYear() {
            return this.year;
        }

        public static final class Builder {
            private String calendarName; 
            private String creator; 
            private String monthDaysContent; 
            private Boolean systemCalendar; 
            private Integer year; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.calendarName = model.calendarName;
                this.creator = model.creator;
                this.monthDaysContent = model.monthDaysContent;
                this.systemCalendar = model.systemCalendar;
                this.year = model.year;
            } 

            /**
             * <p>The calendar name.</p>
             * 
             * <strong>example:</strong>
             * <p>2025workday</p>
             */
            public Builder calendarName(String calendarName) {
                this.calendarName = calendarName;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>1827811800526xxx</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The months and days.</p>
             * 
             * <strong>example:</strong>
             * <p>[
             *   {&quot;month&quot;:1,&quot;days&quot;:[3,4,5,6,9,10,11,12,13,16,17,18,19,20,28,29,30,31]},
             *   {&quot;month&quot;:2,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28]},
             *   {&quot;month&quot;:3,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30,31]},
             *   {&quot;month&quot;:4,&quot;days&quot;:[3,4,6,7,10,11,12,13,14,17,18,19,20,21,23,24,25,26,27,28]},
             *   {&quot;month&quot;:5,&quot;days&quot;:[4,5,6,8,9,10,11,12,15,16,17,18,19,22,23,24,25,26,29,30,31]},
             *   {&quot;month&quot;:6,&quot;days&quot;:[1,2,5,6,7,8,9,12,13,14,15,16,19,20,21,25,26,27,28,29,30]},
             *   {&quot;month&quot;:7,&quot;days&quot;:[3,4,5,6,7,10,11,12,13,14,17,18,19,20,21,24,25,26,27,28,31]},
             *   {&quot;month&quot;:8,&quot;days&quot;:[1,2,3,4,7,8,9,10,11,14,15,16,17,18,21,22,23,24,25,28,29,30,31]},
             *   {&quot;month&quot;:9,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28]},
             *   {&quot;month&quot;:10,&quot;days&quot;:[7,8,9,10,11,12,13,16,17,18,19,20,23,24,25,26,27,30,31]},
             *   {&quot;month&quot;:11,&quot;days&quot;:[1,2,3,6,7,8,9,10,13,14,15,16,17,20,21,22,23,24,27,28,29,30]},
             *   {&quot;month&quot;:12,&quot;days&quot;:[1,4,5,6,7,8,11,12,13,14,15,18,19,20,21,22,25,26,27,28,29]}
             * ]</p>
             */
            public Builder monthDaysContent(String monthDaysContent) {
                this.monthDaysContent = monthDaysContent;
                return this;
            }

            /**
             * <p>Indicates whether it is a system calendar.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder systemCalendar(Boolean systemCalendar) {
                this.systemCalendar = systemCalendar;
                return this;
            }

            /**
             * <p>The year.</p>
             * 
             * <strong>example:</strong>
             * <p>2025</p>
             */
            public Builder year(Integer year) {
                this.year = year;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadSchedulerxCalendarResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxCalendarResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.records = builder.records;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<Records> records; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.records = model.records;
                this.total = model.total;
            } 

            /**
             * <p>The maximum number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>When there is more data to retrieve, the server returns a nextToken. You can use this token in a subsequent request to continue reading from where you left off.</p>
             * 
             * <strong>example:</strong>
             * <p>O39nXKu5XafATl3/cJjSJw==</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
