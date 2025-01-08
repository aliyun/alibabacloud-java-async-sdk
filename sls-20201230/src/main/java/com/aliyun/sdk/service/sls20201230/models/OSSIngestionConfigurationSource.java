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
 * {@link OSSIngestionConfigurationSource} extends {@link TeaModel}
 *
 * <p>OSSIngestionConfigurationSource</p>
 */
public class OSSIngestionConfigurationSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("compressionCodec")
    @com.aliyun.core.annotation.Validation(required = true)
    private String compressionCodec;

    @com.aliyun.core.annotation.NameInMap("encoding")
    @com.aliyun.core.annotation.Validation(required = true)
    private String encoding;

    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("format")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> format;

    @com.aliyun.core.annotation.NameInMap("interval")
    @com.aliyun.core.annotation.Validation(required = true)
    private String interval;

    @com.aliyun.core.annotation.NameInMap("pattern")
    private String pattern;

    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("restoreObjectEnabled")
    private Boolean restoreObjectEnabled;

    @com.aliyun.core.annotation.NameInMap("roleARN")
    private String roleARN;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("timeField")
    private String timeField;

    @com.aliyun.core.annotation.NameInMap("timeFormat")
    private String timeFormat;

    @com.aliyun.core.annotation.NameInMap("timePattern")
    private String timePattern;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    @com.aliyun.core.annotation.NameInMap("useMetaIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean useMetaIndex;

    private OSSIngestionConfigurationSource(Builder builder) {
        this.bucket = builder.bucket;
        this.compressionCodec = builder.compressionCodec;
        this.encoding = builder.encoding;
        this.endTime = builder.endTime;
        this.endpoint = builder.endpoint;
        this.format = builder.format;
        this.interval = builder.interval;
        this.pattern = builder.pattern;
        this.prefix = builder.prefix;
        this.restoreObjectEnabled = builder.restoreObjectEnabled;
        this.roleARN = builder.roleARN;
        this.startTime = builder.startTime;
        this.timeField = builder.timeField;
        this.timeFormat = builder.timeFormat;
        this.timePattern = builder.timePattern;
        this.timeZone = builder.timeZone;
        this.useMetaIndex = builder.useMetaIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSIngestionConfigurationSource create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return compressionCodec
     */
    public String getCompressionCodec() {
        return this.compressionCodec;
    }

    /**
     * @return encoding
     */
    public String getEncoding() {
        return this.encoding;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return format
     */
    public java.util.Map<String, ?> getFormat() {
        return this.format;
    }

    /**
     * @return interval
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return restoreObjectEnabled
     */
    public Boolean getRestoreObjectEnabled() {
        return this.restoreObjectEnabled;
    }

    /**
     * @return roleARN
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeField
     */
    public String getTimeField() {
        return this.timeField;
    }

    /**
     * @return timeFormat
     */
    public String getTimeFormat() {
        return this.timeFormat;
    }

    /**
     * @return timePattern
     */
    public String getTimePattern() {
        return this.timePattern;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return useMetaIndex
     */
    public Boolean getUseMetaIndex() {
        return this.useMetaIndex;
    }

    public static final class Builder {
        private String bucket; 
        private String compressionCodec; 
        private String encoding; 
        private Long endTime; 
        private String endpoint; 
        private java.util.Map<String, ?> format; 
        private String interval; 
        private String pattern; 
        private String prefix; 
        private Boolean restoreObjectEnabled; 
        private String roleARN; 
        private Long startTime; 
        private String timeField; 
        private String timeFormat; 
        private String timePattern; 
        private String timeZone; 
        private Boolean useMetaIndex; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ossbucket</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        public Builder compressionCodec(String compressionCodec) {
            this.compressionCodec = compressionCodec;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        public Builder encoding(String encoding) {
            this.encoding = encoding;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou.aliyuncs.com</p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder format(java.util.Map<String, ?> format) {
            this.format = format;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>never</p>
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * pattern.
         */
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            return this;
        }

        /**
         * prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * restoreObjectEnabled.
         */
        public Builder restoreObjectEnabled(Boolean restoreObjectEnabled) {
            this.restoreObjectEnabled = restoreObjectEnabled;
            return this;
        }

        /**
         * roleARN.
         */
        public Builder roleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * timeField.
         */
        public Builder timeField(String timeField) {
            this.timeField = timeField;
            return this;
        }

        /**
         * timeFormat.
         */
        public Builder timeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }

        /**
         * timePattern.
         */
        public Builder timePattern(String timePattern) {
            this.timePattern = timePattern;
            return this;
        }

        /**
         * timeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useMetaIndex(Boolean useMetaIndex) {
            this.useMetaIndex = useMetaIndex;
            return this;
        }

        public OSSIngestionConfigurationSource build() {
            return new OSSIngestionConfigurationSource(this);
        } 

    } 

}
