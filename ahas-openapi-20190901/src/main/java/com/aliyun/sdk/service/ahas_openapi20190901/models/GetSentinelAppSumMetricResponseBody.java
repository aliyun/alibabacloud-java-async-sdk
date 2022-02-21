// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSentinelAppSumMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetSentinelAppSumMetricResponseBody</p>
 */
public class GetSentinelAppSumMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("MetricData")
    private MetricData metricData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSentinelAppSumMetricResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.metricData = builder.metricData;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSentinelAppSumMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return metricData
     */
    public MetricData getMetricData() {
        return this.metricData;
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
        private String message; 
        private MetricData metricData; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * MetricData.
         */
        public Builder metricData(MetricData metricData) {
            this.metricData = metricData;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSentinelAppSumMetricResponseBody build() {
            return new GetSentinelAppSumMetricResponseBody(this);
        } 

    } 

    public static class MetricData extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("AvgRt")
        private Float avgRt;

        @NameInMap("BlockCount")
        private Float blockCount;

        @NameInMap("MachineCount")
        private Long machineCount;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("PassCount")
        private Float passCount;

        @NameInMap("TotalCount")
        private Float totalCount;

        @NameInMap("UserId")
        private String userId;

        private MetricData(Builder builder) {
            this.appName = builder.appName;
            this.avgRt = builder.avgRt;
            this.blockCount = builder.blockCount;
            this.machineCount = builder.machineCount;
            this.namespace = builder.namespace;
            this.passCount = builder.passCount;
            this.totalCount = builder.totalCount;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricData create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return avgRt
         */
        public Float getAvgRt() {
            return this.avgRt;
        }

        /**
         * @return blockCount
         */
        public Float getBlockCount() {
            return this.blockCount;
        }

        /**
         * @return machineCount
         */
        public Long getMachineCount() {
            return this.machineCount;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return passCount
         */
        public Float getPassCount() {
            return this.passCount;
        }

        /**
         * @return totalCount
         */
        public Float getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appName; 
            private Float avgRt; 
            private Float blockCount; 
            private Long machineCount; 
            private String namespace; 
            private Float passCount; 
            private Float totalCount; 
            private String userId; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AvgRt.
             */
            public Builder avgRt(Float avgRt) {
                this.avgRt = avgRt;
                return this;
            }

            /**
             * BlockCount.
             */
            public Builder blockCount(Float blockCount) {
                this.blockCount = blockCount;
                return this;
            }

            /**
             * MachineCount.
             */
            public Builder machineCount(Long machineCount) {
                this.machineCount = machineCount;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * PassCount.
             */
            public Builder passCount(Float passCount) {
                this.passCount = passCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Float totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public MetricData build() {
                return new MetricData(this);
            } 

        } 

    }
}
