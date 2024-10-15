// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCallInTransferRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCallInTransferRecordResponseBody</p>
 */
public class QueryCallInTransferRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
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
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCallInTransferRecordResponseBody build() {
            return new QueryCallInTransferRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCallInTransferRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCallInTransferRecordResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallInCalled")
        private String callInCalled;

        @com.aliyun.core.annotation.NameInMap("CallInCaller")
        private String callInCaller;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("RecordUrl")
        private String recordUrl;

        @com.aliyun.core.annotation.NameInMap("TransferCalled")
        private String transferCalled;

        @com.aliyun.core.annotation.NameInMap("TransferCaller")
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
             * <p>The called number of the inbound call.</p>
             * 
             * <strong>example:</strong>
             * <p>150****0000</p>
             */
            public Builder callInCalled(String callInCalled) {
                this.callInCalled = callInCalled;
                return this;
            }

            /**
             * <p>The calling number of the inbound call.</p>
             * 
             * <strong>example:</strong>
             * <p>150****0000</p>
             */
            public Builder callInCaller(String callInCaller) {
                this.callInCaller = callInCaller;
                return this;
            }

            /**
             * <p>The time when the call was initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-03 10:21:21</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The recording URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://alicom-fc-media.cn-hangzhou.oss.aliyun-inc.com/dayuBizVoiceMrg/4238c230-9e74-41be-90b8-2fbe7684****.wav?Expires=1627538265&OSSAccessKeyId=bypFNbGJVk73****&Signature=****mUqkPqIQ%3D">http://alicom-fc-media.cn-hangzhou.oss.aliyun-inc.com/dayuBizVoiceMrg/4238c230-9e74-41be-90b8-2fbe7684****.wav?Expires=1627538265&amp;OSSAccessKeyId=bypFNbGJVk73****&amp;Signature=****mUqkPqIQ%3D</a></p>
             */
            public Builder recordUrl(String recordUrl) {
                this.recordUrl = recordUrl;
                return this;
            }

            /**
             * <p>The phone number to which the call was transferred.</p>
             * 
             * <strong>example:</strong>
             * <p>151****0000</p>
             */
            public Builder transferCalled(String transferCalled) {
                this.transferCalled = transferCalled;
                return this;
            }

            /**
             * <p>The calling number that transferred the call.</p>
             * 
             * <strong>example:</strong>
             * <p>151****0000</p>
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
    /**
     * 
     * {@link QueryCallInTransferRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCallInTransferRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Values")
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
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The call transfer records.</p>
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
