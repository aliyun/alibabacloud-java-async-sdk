// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMonitorResponseBody</p>
 */
public class QueryMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryMonitorResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonitorResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of the data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMonitorResponseBody build() {
            return new QueryMonitorResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterNamePrefix")
        private String clusterNamePrefix;

        @com.aliyun.core.annotation.NameInMap("podName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List < java.util.Map<String, ?>> values;

        private Data(Builder builder) {
            this.clusterNamePrefix = builder.clusterNamePrefix;
            this.podName = builder.podName;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterNamePrefix
         */
        public String getClusterNamePrefix() {
            return this.clusterNamePrefix;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return values
         */
        public java.util.List < java.util.Map<String, ?>> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String clusterNamePrefix; 
            private String podName; 
            private java.util.List < java.util.Map<String, ?>> values; 

            /**
             * The prefix of the name.
             */
            public Builder clusterNamePrefix(String clusterNamePrefix) {
                this.clusterNamePrefix = clusterNamePrefix;
                return this;
            }

            /**
             * The name of the pod.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * The details of the data.
             */
            public Builder values(java.util.List < java.util.Map<String, ?>> values) {
                this.values = values;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
