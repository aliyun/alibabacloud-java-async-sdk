// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDeviceStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceStatisticsResponseBody</p>
 */
public class QueryDeviceStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDeviceStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceStatisticsResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDeviceStatisticsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The device statistics returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
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

        public QueryDeviceStatisticsResponseBody build() {
            return new QueryDeviceStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("activeCount")
        private Long activeCount;

        @com.aliyun.core.annotation.NameInMap("deviceCount")
        private Long deviceCount;

        @com.aliyun.core.annotation.NameInMap("onlineCount")
        private Long onlineCount;

        private Data(Builder builder) {
            this.activeCount = builder.activeCount;
            this.deviceCount = builder.deviceCount;
            this.onlineCount = builder.onlineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeCount
         */
        public Long getActiveCount() {
            return this.activeCount;
        }

        /**
         * @return deviceCount
         */
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        /**
         * @return onlineCount
         */
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public static final class Builder {
            private Long activeCount; 
            private Long deviceCount; 
            private Long onlineCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activeCount = model.activeCount;
                this.deviceCount = model.deviceCount;
                this.onlineCount = model.onlineCount;
            } 

            /**
             * <p>The number of activated devices.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder activeCount(Long activeCount) {
                this.activeCount = activeCount;
                return this;
            }

            /**
             * <p>The total number of devices.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder deviceCount(Long deviceCount) {
                this.deviceCount = deviceCount;
                return this;
            }

            /**
             * <p>The number of online devices.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder onlineCount(Long onlineCount) {
                this.onlineCount = onlineCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
