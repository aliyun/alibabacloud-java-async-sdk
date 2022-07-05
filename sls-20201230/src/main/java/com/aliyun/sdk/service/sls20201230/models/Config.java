// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Config} extends {@link TeaModel}
 *
 * <p>Config</p>
 */
public class Config extends TeaModel {
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("inputDetail")
    @Validation(required = true)
    private InputDetail inputDetail;

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

    private Config(Builder builder) {
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

    public static Config create() {
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
    public InputDetail getInputDetail() {
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
        private InputDetail inputDetail; 
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
        public Builder inputDetail(InputDetail inputDetail) {
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

        public Config build() {
            return new Config(this);
        } 

    } 

    public static class SensitiveKeys extends TeaModel {
        @NameInMap("all")
        @Validation(required = true)
        private Boolean all;

        @NameInMap("key")
        @Validation(required = true)
        private String key;

        @NameInMap("regex_begin")
        @Validation(required = true)
        private String regexBegin;

        @NameInMap("regex_content")
        @Validation(required = true)
        private String regexContent;

        @NameInMap("type")
        @Validation(required = true)
        private String type;

        private SensitiveKeys(Builder builder) {
            this.all = builder.all;
            this.key = builder.key;
            this.regexBegin = builder.regexBegin;
            this.regexContent = builder.regexContent;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveKeys create() {
            return builder().build();
        }

        /**
         * @return all
         */
        public Boolean getAll() {
            return this.all;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return regexBegin
         */
        public String getRegexBegin() {
            return this.regexBegin;
        }

        /**
         * @return regexContent
         */
        public String getRegexContent() {
            return this.regexContent;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean all; 
            private String key; 
            private String regexBegin; 
            private String regexContent; 
            private String type; 

            /**
             * all
             */
            public Builder all(Boolean all) {
                this.all = all;
                return this;
            }

            /**
             * key
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * regex_begin
             */
            public Builder regexBegin(String regexBegin) {
                this.regexBegin = regexBegin;
                return this;
            }

            /**
             * regex_content
             */
            public Builder regexContent(String regexContent) {
                this.regexContent = regexContent;
                return this;
            }

            /**
             * type
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SensitiveKeys build() {
                return new SensitiveKeys(this);
            } 

        } 

    }
    public static class InputDetail extends TeaModel {
        @NameInMap("adjustTimezone")
        private Boolean adjustTimezone;

        @NameInMap("delayAlarmBytes")
        private Long delayAlarmBytes;

        @NameInMap("enableTag")
        @Validation(required = true)
        private Boolean enableTag;

        @NameInMap("filePattern")
        private String filePattern;

        @NameInMap("filterKey")
        private java.util.List < String > filterKey;

        @NameInMap("filterRegex")
        private java.util.List < String > filterRegex;

        @NameInMap("localStorage")
        @Validation(required = true)
        private Boolean localStorage;

        @NameInMap("logBeginRegex")
        private String logBeginRegex;

        @NameInMap("logPath")
        private String logPath;

        @NameInMap("logTimezone")
        private String logTimezone;

        @NameInMap("logType")
        private String logType;

        @NameInMap("maxSendRate")
        private Integer maxSendRate;

        @NameInMap("mergeType")
        private String mergeType;

        @NameInMap("priority")
        private Integer priority;

        @NameInMap("sendRateExpire")
        private Integer sendRateExpire;

        @NameInMap("sensitive_keys")
        private java.util.List < SensitiveKeys> sensitiveKeys;

        @NameInMap("shardHashKey")
        private java.util.List < String > shardHashKey;

        @NameInMap("timeFormat")
        private String timeFormat;

        @NameInMap("topicFormat")
        private String topicFormat;

        private InputDetail(Builder builder) {
            this.adjustTimezone = builder.adjustTimezone;
            this.delayAlarmBytes = builder.delayAlarmBytes;
            this.enableTag = builder.enableTag;
            this.filePattern = builder.filePattern;
            this.filterKey = builder.filterKey;
            this.filterRegex = builder.filterRegex;
            this.localStorage = builder.localStorage;
            this.logBeginRegex = builder.logBeginRegex;
            this.logPath = builder.logPath;
            this.logTimezone = builder.logTimezone;
            this.logType = builder.logType;
            this.maxSendRate = builder.maxSendRate;
            this.mergeType = builder.mergeType;
            this.priority = builder.priority;
            this.sendRateExpire = builder.sendRateExpire;
            this.sensitiveKeys = builder.sensitiveKeys;
            this.shardHashKey = builder.shardHashKey;
            this.timeFormat = builder.timeFormat;
            this.topicFormat = builder.topicFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputDetail create() {
            return builder().build();
        }

        /**
         * @return adjustTimezone
         */
        public Boolean getAdjustTimezone() {
            return this.adjustTimezone;
        }

        /**
         * @return delayAlarmBytes
         */
        public Long getDelayAlarmBytes() {
            return this.delayAlarmBytes;
        }

        /**
         * @return enableTag
         */
        public Boolean getEnableTag() {
            return this.enableTag;
        }

        /**
         * @return filePattern
         */
        public String getFilePattern() {
            return this.filePattern;
        }

        /**
         * @return filterKey
         */
        public java.util.List < String > getFilterKey() {
            return this.filterKey;
        }

        /**
         * @return filterRegex
         */
        public java.util.List < String > getFilterRegex() {
            return this.filterRegex;
        }

        /**
         * @return localStorage
         */
        public Boolean getLocalStorage() {
            return this.localStorage;
        }

        /**
         * @return logBeginRegex
         */
        public String getLogBeginRegex() {
            return this.logBeginRegex;
        }

        /**
         * @return logPath
         */
        public String getLogPath() {
            return this.logPath;
        }

        /**
         * @return logTimezone
         */
        public String getLogTimezone() {
            return this.logTimezone;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return maxSendRate
         */
        public Integer getMaxSendRate() {
            return this.maxSendRate;
        }

        /**
         * @return mergeType
         */
        public String getMergeType() {
            return this.mergeType;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return sendRateExpire
         */
        public Integer getSendRateExpire() {
            return this.sendRateExpire;
        }

        /**
         * @return sensitiveKeys
         */
        public java.util.List < SensitiveKeys> getSensitiveKeys() {
            return this.sensitiveKeys;
        }

        /**
         * @return shardHashKey
         */
        public java.util.List < String > getShardHashKey() {
            return this.shardHashKey;
        }

        /**
         * @return timeFormat
         */
        public String getTimeFormat() {
            return this.timeFormat;
        }

        /**
         * @return topicFormat
         */
        public String getTopicFormat() {
            return this.topicFormat;
        }

        public static final class Builder {
            private Boolean adjustTimezone; 
            private Long delayAlarmBytes; 
            private Boolean enableTag; 
            private String filePattern; 
            private java.util.List < String > filterKey; 
            private java.util.List < String > filterRegex; 
            private Boolean localStorage; 
            private String logBeginRegex; 
            private String logPath; 
            private String logTimezone; 
            private String logType; 
            private Integer maxSendRate; 
            private String mergeType; 
            private Integer priority; 
            private Integer sendRateExpire; 
            private java.util.List < SensitiveKeys> sensitiveKeys; 
            private java.util.List < String > shardHashKey; 
            private String timeFormat; 
            private String topicFormat; 

            /**
             * adjustTimezone
             */
            public Builder adjustTimezone(Boolean adjustTimezone) {
                this.adjustTimezone = adjustTimezone;
                return this;
            }

            /**
             * delayAlarmBytes
             */
            public Builder delayAlarmBytes(Long delayAlarmBytes) {
                this.delayAlarmBytes = delayAlarmBytes;
                return this;
            }

            /**
             * enableTag
             */
            public Builder enableTag(Boolean enableTag) {
                this.enableTag = enableTag;
                return this;
            }

            /**
             * filePattern
             */
            public Builder filePattern(String filePattern) {
                this.filePattern = filePattern;
                return this;
            }

            /**
             * filterKey
             */
            public Builder filterKey(java.util.List < String > filterKey) {
                this.filterKey = filterKey;
                return this;
            }

            /**
             * filterRegex
             */
            public Builder filterRegex(java.util.List < String > filterRegex) {
                this.filterRegex = filterRegex;
                return this;
            }

            /**
             * localStorage
             */
            public Builder localStorage(Boolean localStorage) {
                this.localStorage = localStorage;
                return this;
            }

            /**
             * logBeginRegex
             */
            public Builder logBeginRegex(String logBeginRegex) {
                this.logBeginRegex = logBeginRegex;
                return this;
            }

            /**
             * logPath
             */
            public Builder logPath(String logPath) {
                this.logPath = logPath;
                return this;
            }

            /**
             * logTimezone
             */
            public Builder logTimezone(String logTimezone) {
                this.logTimezone = logTimezone;
                return this;
            }

            /**
             * logType
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * maxSendRate
             */
            public Builder maxSendRate(Integer maxSendRate) {
                this.maxSendRate = maxSendRate;
                return this;
            }

            /**
             * mergeType
             */
            public Builder mergeType(String mergeType) {
                this.mergeType = mergeType;
                return this;
            }

            /**
             * priority
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * sendRateExpire
             */
            public Builder sendRateExpire(Integer sendRateExpire) {
                this.sendRateExpire = sendRateExpire;
                return this;
            }

            /**
             * sensitive_keys
             */
            public Builder sensitiveKeys(java.util.List < SensitiveKeys> sensitiveKeys) {
                this.sensitiveKeys = sensitiveKeys;
                return this;
            }

            /**
             * shardHashKey
             */
            public Builder shardHashKey(java.util.List < String > shardHashKey) {
                this.shardHashKey = shardHashKey;
                return this;
            }

            /**
             * timeFormat
             */
            public Builder timeFormat(String timeFormat) {
                this.timeFormat = timeFormat;
                return this;
            }

            /**
             * topicFormat
             */
            public Builder topicFormat(String topicFormat) {
                this.topicFormat = topicFormat;
                return this;
            }

            public InputDetail build() {
                return new InputDetail(this);
            } 

        } 

    }
    public static class OutputDetail extends TeaModel {
        @NameInMap("endpoint")
        @Validation(required = true)
        private String endpoint;

        @NameInMap("logstore")
        @Validation(required = true)
        private String logstore;

        private OutputDetail(Builder builder) {
            this.endpoint = builder.endpoint;
            this.logstore = builder.logstore;
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
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        public static final class Builder {
            private String endpoint; 
            private String logstore; 

            /**
             * endpoint
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * logstore
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            public OutputDetail build() {
                return new OutputDetail(this);
            } 

        } 

    }
}
