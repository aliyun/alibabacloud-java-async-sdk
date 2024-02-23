// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallInTransferRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallInTransferRecordResponseBody</p>
 */
public class QueryCallInTransferRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCallInTransferRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCallInTransferRecordResponseBody create() {
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
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCallInTransferRecordResponseBody build() {
            return new QueryCallInTransferRecordResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @NameInMap("CallInCalled")
        private String callInCalled;

        @NameInMap("CallInCaller")
        private String callInCaller;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("RecordUrl")
        private String recordUrl;

        @NameInMap("TransferCalled")
        private String transferCalled;

        @NameInMap("TransferCaller")
        private String transferCaller;

        private Values(Builder builder) {
            this.callInCalled = builder.callInCalled;
            this.callInCaller = builder.callInCaller;
            this.gmtCreate = builder.gmtCreate;
            this.recordUrl = builder.recordUrl;
            this.transferCalled = builder.transferCalled;
            this.transferCaller = builder.transferCaller;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return callInCalled
         */
        public String getCallInCalled() {
            return this.callInCalled;
        }

        /**
         * @return callInCaller
         */
        public String getCallInCaller() {
            return this.callInCaller;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return recordUrl
         */
        public String getRecordUrl() {
            return this.recordUrl;
        }

        /**
         * @return transferCalled
         */
        public String getTransferCalled() {
            return this.transferCalled;
        }

        /**
         * @return transferCaller
         */
        public String getTransferCaller() {
            return this.transferCaller;
        }

        public static final class Builder {
            private String callInCalled; 
            private String callInCaller; 
            private Long gmtCreate; 
            private String recordUrl; 
            private String transferCalled; 
            private String transferCaller; 

            /**
             * The called number of the inbound call.
             */
            public Builder callInCalled(String callInCalled) {
                this.callInCalled = callInCalled;
                return this;
            }

            /**
             * The calling number of the inbound call.
             */
            public Builder callInCaller(String callInCaller) {
                this.callInCaller = callInCaller;
                return this;
            }

            /**
             * The time when the call was initiated.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The recording URL.
             */
            public Builder recordUrl(String recordUrl) {
                this.recordUrl = recordUrl;
                return this;
            }

            /**
             * The phone number to which the call was transferred.
             */
            public Builder transferCalled(String transferCalled) {
                this.transferCalled = transferCalled;
                return this;
            }

            /**
             * The calling number that transferred the call.
             */
            public Builder transferCaller(String transferCaller) {
                this.transferCaller = transferCaller;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNo")
        private Long pageNo;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Total")
        private Long total;

        @NameInMap("Values")
        private java.util.List < Values> values;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return values
         */
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 
            private java.util.List < Values> values; 

            /**
             * The page number.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * The call transfer records.
             */
            public Builder values(java.util.List < Values> values) {
                this.values = values;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
