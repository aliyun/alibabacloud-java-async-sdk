// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link QueryMonitorResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMonitorResponseBody</p>
 */
public class QueryMonitorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryMonitorResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The details of the data.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-100-000</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request was successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ADDD8AB7-8D1C-4697-A83E-410D2607****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryMonitorResponseBody build() {
            return new QueryMonitorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMonitorResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMonitorResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterNamePrefix")
        private String clusterNamePrefix;

        @com.aliyun.core.annotation.NameInMap("podName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<java.util.Map<String, ?>> values;

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
        public java.util.List<java.util.Map<String, ?>> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String clusterNamePrefix; 
            private String podName; 
            private java.util.List<java.util.Map<String, ?>> values; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterNamePrefix = model.clusterNamePrefix;
                this.podName = model.podName;
                this.values = model.values;
            } 

            /**
             * <p>The prefix of the name.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-xxxx-xxxxxx</p>
             */
            public Builder clusterNamePrefix(String clusterNamePrefix) {
                this.clusterNamePrefix = clusterNamePrefix;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>mse-xxxxxx-xxxxxx-reg-center-0-0</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>The details of the data.</p>
             */
            public Builder values(java.util.List<java.util.Map<String, ?>> values) {
                this.values = values;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
