// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdatePrometheusGlobalViewResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePrometheusGlobalViewResponseBody</p>
 */
public class UpdatePrometheusGlobalViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdatePrometheusGlobalViewResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusGlobalViewResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePrometheusGlobalViewResponseBody build() {
            return new UpdatePrometheusGlobalViewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrometheusGlobalViewResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePrometheusGlobalViewResponseBody</p>
     */
    public static class FailedInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("SourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private FailedInstances(Builder builder) {
            this.clusterId = builder.clusterId;
            this.sourceName = builder.sourceName;
            this.sourceType = builder.sourceType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailedInstances create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String clusterId; 
            private String sourceName; 
            private String sourceType; 
            private String userId; 

            /**
             * <p>The ID of the Prometheus instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cdb65ed2d527345*********</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>sourcename-test</p>
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * <p>The type of the data source. AlibabaPrometheus MetricStore CustomPrometheus</p>
             * 
             * <strong>example:</strong>
             * <p>AlibabaPrometheus</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>23784673825*******</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public FailedInstances build() {
                return new FailedInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePrometheusGlobalViewResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePrometheusGlobalViewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedInstances")
        private java.util.List<FailedInstances> failedInstances;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Data(Builder builder) {
            this.failedInstances = builder.failedInstances;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return failedInstances
         */
        public java.util.List<FailedInstances> getFailedInstances() {
            return this.failedInstances;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List<FailedInstances> failedInstances; 
            private Boolean success; 

            /**
             * <p>The data sources that failed to be updated.</p>
             */
            public Builder failedInstances(java.util.List<FailedInstances> failedInstances) {
                this.failedInstances = failedInstances;
                return this;
            }

            /**
             * <p>Indicates whether the request was successful. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
