// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrometheusGlobalViewResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePrometheusGlobalViewResponseBody</p>
 */
public class UpdatePrometheusGlobalViewResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * The status code. The status code 200 indicates that the request was successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned struct.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned if the Prometheus agent failed to be installed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID. You can use the ID to query logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdatePrometheusGlobalViewResponseBody build() {
            return new UpdatePrometheusGlobalViewResponseBody(this);
        } 

    } 

    public static class FailedInstances extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("SourceName")
        private String sourceName;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("UserId")
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
             * The ID of the Prometheus instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the data source.
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * The type of the data source. Valid values:
             * <p>
             * 
             * *   AlibabaPrometheus
             * *   MetricStore
             * *   CustomPrometheus
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The user ID.
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
    public static class Data extends TeaModel {
        @NameInMap("FailedInstances")
        private java.util.List < FailedInstances> failedInstances;

        @NameInMap("Success")
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
        public java.util.List < FailedInstances> getFailedInstances() {
            return this.failedInstances;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List < FailedInstances> failedInstances; 
            private Boolean success; 

            /**
             * The Prometheus instances or data sources that failed to be updated.
             */
            public Builder failedInstances(java.util.List < FailedInstances> failedInstances) {
                this.failedInstances = failedInstances;
                return this;
            }

            /**
             * Indicates whether the request was successful. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
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
