// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link LogtailConfig} extends {@link TeaModel}
 *
 * <p>LogtailConfig</p>
 */
public class LogtailConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("inputDetail")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> inputDetail;

    @com.aliyun.core.annotation.NameInMap("inputType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputType;

    @com.aliyun.core.annotation.NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @com.aliyun.core.annotation.NameInMap("logSample")
    private String logSample;

    @com.aliyun.core.annotation.NameInMap("outputDetail")
    @com.aliyun.core.annotation.Validation(required = true)
    private OutputDetail outputDetail;

    @com.aliyun.core.annotation.NameInMap("outputType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputType;

    private LogtailConfig(Builder builder) {
        this.configName = builder.configName;
        this.createTime = builder.createTime;
        this.inputDetail = builder.inputDetail;
        this.inputType = builder.inputType;
        this.lastModifyTime = builder.lastModifyTime;
        this.logSample = builder.logSample;
        this.outputDetail = builder.outputDetail;
        this.outputType = builder.outputType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogtailConfig create() {
        return builder().build();
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return inputDetail
     */
    public java.util.Map<String, ?> getInputDetail() {
        return this.inputDetail;
    }

    /**
     * @return inputType
     */
    public String getInputType() {
        return this.inputType;
    }

    /**
     * @return lastModifyTime
     */
    public Long getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * @return logSample
     */
    public String getLogSample() {
        return this.logSample;
    }

    /**
     * @return outputDetail
     */
    public OutputDetail getOutputDetail() {
        return this.outputDetail;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    public static final class Builder {
        private String configName; 
        private Long createTime; 
        private java.util.Map<String, ?> inputDetail; 
        private String inputType; 
        private Long lastModifyTime; 
        private String logSample; 
        private OutputDetail outputDetail; 
        private String outputType; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-config</p>
         */
        public Builder configName(String configName) {
            this.configName = configName;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputDetail(java.util.Map<String, ?> inputDetail) {
            this.inputDetail = inputDetail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder inputType(String inputType) {
            this.inputType = inputType;
            return this;
        }

        /**
         * lastModifyTime.
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * logSample.
         */
        public Builder logSample(String logSample) {
            this.logSample = logSample;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder outputDetail(OutputDetail outputDetail) {
            this.outputDetail = outputDetail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LogService</p>
         */
        public Builder outputType(String outputType) {
            this.outputType = outputType;
            return this;
        }

        public LogtailConfig build() {
            return new LogtailConfig(this);
        } 

    } 

    /**
     * 
     * {@link LogtailConfig} extends {@link TeaModel}
     *
     * <p>LogtailConfig</p>
     */
    public static class OutputDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("logstoreName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String logstoreName;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("telemetryType")
        private String telemetryType;

        private OutputDetail(Builder builder) {
            this.endpoint = builder.endpoint;
            this.logstoreName = builder.logstoreName;
            this.region = builder.region;
            this.telemetryType = builder.telemetryType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputDetail create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return logstoreName
         */
        public String getLogstoreName() {
            return this.logstoreName;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return telemetryType
         */
        public String getTelemetryType() {
            return this.telemetryType;
        }

        public static final class Builder {
            private String endpoint; 
            private String logstoreName; 
            private String region; 
            private String telemetryType; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-intranet.log.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-logstore</p>
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * telemetryType.
             */
            public Builder telemetryType(String telemetryType) {
                this.telemetryType = telemetryType;
                return this;
            }

            public OutputDetail build() {
                return new OutputDetail(this);
            } 

        } 

    }
}
