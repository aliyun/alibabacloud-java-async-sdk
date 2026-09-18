// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link CancelAiCallDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>CancelAiCallDetailsResponseBody</p>
 */
public class CancelAiCallDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

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

    private CancelAiCallDetailsResponseBody(Builder builder) {
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

    public static CancelAiCallDetailsResponseBody create() {
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CancelAiCallDetailsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed reason why the access was denied.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
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
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>成功</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>46C98E28-9239-5D95-AC76-648B8FD4889A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CancelAiCallDetailsResponseBody build() {
            return new CancelAiCallDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CancelAiCallDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>CancelAiCallDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Long failedCount;

        @com.aliyun.core.annotation.NameInMap("FailedDetails")
        private java.util.Map<String, ?> failedDetails;

        @com.aliyun.core.annotation.NameInMap("ResultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("SucceedCount")
        private Long succeedCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.failedCount = builder.failedCount;
            this.failedDetails = builder.failedDetails;
            this.resultCode = builder.resultCode;
            this.succeedCount = builder.succeedCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedCount
         */
        public Long getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return failedDetails
         */
        public java.util.Map<String, ?> getFailedDetails() {
            return this.failedDetails;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return succeedCount
         */
        public Long getSucceedCount() {
            return this.succeedCount;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long failedCount; 
            private java.util.Map<String, ?> failedDetails; 
            private String resultCode; 
            private Long succeedCount; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.failedCount = model.failedCount;
                this.failedDetails = model.failedDetails;
                this.resultCode = model.resultCode;
                this.succeedCount = model.succeedCount;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of calls that could not be canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder failedCount(Long failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>Details about the failed cancellations. This is a map where the key is the failed detail ID or phone number, and the value is the reason for the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;176********&quot;: &quot;明细记录当前状态不可取消&quot;
             * }</p>
             */
            public Builder failedDetails(java.util.Map<String, ?> failedDetails) {
                this.failedDetails = failedDetails;
                return this;
            }

            /**
             * <p>The result code of the cancellation. Valid values:</p>
             * <ul>
             * <li><p>ALL_FAILED: All cancellations failed.</p>
             * </li>
             * <li><p>ALL_SUCCEED: All cancellations succeeded.</p>
             * </li>
             * <li><p>PART_FAILED: Some cancellations failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PART_FAILED</p>
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * <p>The number of calls that were successfully canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>81</p>
             */
            public Builder succeedCount(Long succeedCount) {
                this.succeedCount = succeedCount;
                return this;
            }

            /**
             * <p>The total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
