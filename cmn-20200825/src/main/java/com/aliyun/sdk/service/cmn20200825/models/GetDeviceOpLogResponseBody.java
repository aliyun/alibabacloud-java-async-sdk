// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceOpLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceOpLogResponseBody</p>
 */
public class GetDeviceOpLogResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private Integer nextToken;

    @NameInMap("OperationLogs")
    private java.util.List < OperationLogs> operationLogs;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GetDeviceOpLogResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.operationLogs = builder.operationLogs;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceOpLogResponseBody create() {
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
    public Integer getNextToken() {
        return this.nextToken;
    }

    /**
     * @return operationLogs
     */
    public java.util.List < OperationLogs> getOperationLogs() {
        return this.operationLogs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private Integer nextToken; 
        private java.util.List < OperationLogs> operationLogs; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(Integer nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OperationLogs.
         */
        public Builder operationLogs(java.util.List < OperationLogs> operationLogs) {
            this.operationLogs = operationLogs;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetDeviceOpLogResponseBody build() {
            return new GetDeviceOpLogResponseBody(this);
        } 

    } 

    public static class OperationLogs extends TeaModel {
        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("Keyword")
        private String keyword;

        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("OldValue")
        private String oldValue;

        @NameInMap("Operator")
        private String operator;

        private OperationLogs(Builder builder) {
            this.deviceId = builder.deviceId;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.keyword = builder.keyword;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLogs create() {
            return builder().build();
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String deviceId; 
            private String gmtModifiedTime; 
            private String keyword; 
            private String newValue; 
            private String oldValue; 
            private String operator; 

            /**
             * 设备ID
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * SNMP Privacy Protocol
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * 设备额外属性(JSON)
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * SNMP Privacy Passphrase
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public OperationLogs build() {
                return new OperationLogs(this);
            } 

        } 

    }
}
