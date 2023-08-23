// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCasesResponseBody</p>
 */
public class ListCasesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListCasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCasesResponseBody create() {
        return builder().build();
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
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCasesResponseBody build() {
            return new ListCasesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("AbandonType")
        private String abandonType;

        @NameInMap("AttemptCount")
        private Long attemptCount;

        @NameInMap("CaseId")
        private String caseId;

        @NameInMap("CustomVariables")
        private String customVariables;

        @NameInMap("ExpandInfo")
        private String expandInfo;

        @NameInMap("FailureReason")
        private String failureReason;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("State")
        private String state;

        private List(Builder builder) {
            this.abandonType = builder.abandonType;
            this.attemptCount = builder.attemptCount;
            this.caseId = builder.caseId;
            this.customVariables = builder.customVariables;
            this.expandInfo = builder.expandInfo;
            this.failureReason = builder.failureReason;
            this.phoneNumber = builder.phoneNumber;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return abandonType
         */
        public String getAbandonType() {
            return this.abandonType;
        }

        /**
         * @return attemptCount
         */
        public Long getAttemptCount() {
            return this.attemptCount;
        }

        /**
         * @return caseId
         */
        public String getCaseId() {
            return this.caseId;
        }

        /**
         * @return customVariables
         */
        public String getCustomVariables() {
            return this.customVariables;
        }

        /**
         * @return expandInfo
         */
        public String getExpandInfo() {
            return this.expandInfo;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String abandonType; 
            private Long attemptCount; 
            private String caseId; 
            private String customVariables; 
            private String expandInfo; 
            private String failureReason; 
            private String phoneNumber; 
            private String state; 

            /**
             * AbandonType.
             */
            public Builder abandonType(String abandonType) {
                this.abandonType = abandonType;
                return this;
            }

            /**
             * AttemptCount.
             */
            public Builder attemptCount(Long attemptCount) {
                this.attemptCount = attemptCount;
                return this;
            }

            /**
             * CaseId.
             */
            public Builder caseId(String caseId) {
                this.caseId = caseId;
                return this;
            }

            /**
             * CustomVariables.
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * ExpandInfo.
             */
            public Builder expandInfo(String expandInfo) {
                this.expandInfo = expandInfo;
                return this;
            }

            /**
             * FailureReason.
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
