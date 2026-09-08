// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListCasesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCasesResponseBody</p>
 */
public class ListCasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCasesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCasesResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCasesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7CC6523B-0E51-1B62-8DA5-6A9831CAE316</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCasesResponseBody build() {
            return new ListCasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCasesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbandonPhase")
        private String abandonPhase;

        @com.aliyun.core.annotation.NameInMap("AbandonType")
        private String abandonType;

        @com.aliyun.core.annotation.NameInMap("AttemptCount")
        private Long attemptCount;

        @com.aliyun.core.annotation.NameInMap("CaseId")
        private String caseId;

        @com.aliyun.core.annotation.NameInMap("CustomVariables")
        private String customVariables;

        @com.aliyun.core.annotation.NameInMap("FailureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private List(Builder builder) {
            this.abandonPhase = builder.abandonPhase;
            this.abandonType = builder.abandonType;
            this.attemptCount = builder.attemptCount;
            this.caseId = builder.caseId;
            this.customVariables = builder.customVariables;
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
         * @return abandonPhase
         */
        public String getAbandonPhase() {
            return this.abandonPhase;
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
            private String abandonPhase; 
            private String abandonType; 
            private Long attemptCount; 
            private String caseId; 
            private String customVariables; 
            private String failureReason; 
            private String phoneNumber; 
            private String state; 

            private Builder() {
            } 

            private Builder(List model) {
                this.abandonPhase = model.abandonPhase;
                this.abandonType = model.abandonType;
                this.attemptCount = model.attemptCount;
                this.caseId = model.caseId;
                this.customVariables = model.customVariables;
                this.failureReason = model.failureReason;
                this.phoneNumber = model.phoneNumber;
                this.state = model.state;
            } 

            /**
             * <p>Phase at which the call was abandoned.</p>
             * <ul>
             * <li><p>IVR (IVR interaction phase)</p>
             * </li>
             * <li><p>Queuing (queuing phase)</p>
             * </li>
             * <li><p>Ringing (agent ringing phase)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ringing</p>
             */
            public Builder abandonPhase(String abandonPhase) {
                this.abandonPhase = abandonPhase;
                return this;
            }

            /**
             * <p>The type of call abandonment, that is, the reason why the call was not successfully connected.</p>
             * 
             * <strong>example:</strong>
             * <p>NA</p>
             */
            public Builder abandonType(String abandonType) {
                this.abandonType = abandonType;
                return this;
            }

            /**
             * <p>Number of attempts, which is the total number of calls made to this contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder attemptCount(Long attemptCount) {
                this.attemptCount = attemptCount;
                return this;
            }

            /**
             * <p>System-generated contact ID. Customers do not need to concern themselves with this.</p>
             * 
             * <strong>example:</strong>
             * <p>60ecb1a2-4480-4d01-bede-c5b7655bfadf</p>
             */
            public Builder caseId(String caseId) {
                this.caseId = caseId;
                return this;
            }

            /**
             * <p>Custom variables defined by the customer, formatted as a JSON object. The object can contain up to 10 properties, each with a name and value defined by the customer. These can be configured when creating a predictive outbound dialing activity.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;:&quot;yy&quot;,&quot;客戶标签&quot;:&quot;tag-yy&quot;}</p>
             */
            public Builder customVariables(String customVariables) {
                this.customVariables = customVariables;
                return this;
            }

            /**
             * <p>Reason for outbound call failure.</p>
             * 
             * <strong>example:</strong>
             * <p>无</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>Phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1888888****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>Status.</p>
             * 
             * <strong>example:</strong>
             * <p>Connected</p>
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
    /**
     * 
     * {@link ListCasesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCasesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        public java.util.List<List> getList() {
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
            private java.util.List<List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>List of contact list execution details.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
