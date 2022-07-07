// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link LogtailConfig} extends {@link TeaModel}
 *
 * <p>LogtailConfig</p>
 */
public class LogtailConfig extends TeaModel {
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("inputDetail")
    @Validation(required = true)
    private java.util.Map < String, ? > inputDetail;

    @NameInMap("inputType")
    @Validation(required = true)
    private String inputType;

    @NameInMap("lastModifyTime")
    private Long lastModifyTime;

    @NameInMap("logSample")
    private String logSample;

    @NameInMap("outputDetail")
    @Validation(required = true)
    private OutputDetail outputDetail;

    @NameInMap("outputType")
    @Validation(required = true)
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
    public java.util.Map < String, ? > getInputDetail() {
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
        private java.util.Map < String, ? > inputDetail; 
        private String inputType; 
        private Long lastModifyTime; 
        private String logSample; 
        private OutputDetail outputDetail; 
        private String outputType; 

        /**
         * configName
         */
        public Builder configName(String configName) {
            this.configName = configName;
            return this;
        }

        /**
         * 创建时间
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * inputDetail
         */
        public Builder inputDetail(java.util.Map < String, ? > inputDetail) {
            this.inputDetail = inputDetail;
            return this;
        }

        /**
         * inputType
         */
        public Builder inputType(String inputType) {
            this.inputType = inputType;
            return this;
        }

        /**
         * 修改时间
         */
        public Builder lastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }

        /**
         * 日志样例
         */
        public Builder logSample(String logSample) {
            this.logSample = logSample;
            return this;
        }

        /**
         * outputDetail
         */
        public Builder outputDetail(OutputDetail outputDetail) {
            this.outputDetail = outputDetail;
            return this;
        }

        /**
         * outputType
         */
        public Builder outputType(String outputType) {
            this.outputType = outputType;
            return this;
        }

        public LogtailConfig build() {
            return new LogtailConfig(this);
        } 

    } 

    public static class OutputDetail extends TeaModel {
        @NameInMap("endpoint")
        @Validation(required = true)
        private String endpoint;

        @NameInMap("logstoreName")
        @Validation(required = true)
        private String logstoreName;

        @NameInMap("region")
        private String region;

        private OutputDetail(Builder builder) {
            this.endpoint = builder.endpoint;
            this.logstoreName = builder.logstoreName;
            this.region = builder.region;
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

        public static final class Builder {
            private String endpoint; 
            private String logstoreName; 
            private String region; 

            /**
             * endpoint
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * logstoreName
             */
            public Builder logstoreName(String logstoreName) {
                this.logstoreName = logstoreName;
                return this;
            }

            /**
             * 地域
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public OutputDetail build() {
                return new OutputDetail(this);
            } 

        } 

    }
}
