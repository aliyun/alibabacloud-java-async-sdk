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
 * {@link S3IngestionConfigurationSource} extends {@link TeaModel}
 *
 * <p>S3IngestionConfigurationSource</p>
 */
public class S3IngestionConfigurationSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("awsAccessKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String awsAccessKey;

    @com.aliyun.core.annotation.NameInMap("awsAccessKeySecret")
    @com.aliyun.core.annotation.Validation(required = true)
    private String awsAccessKeySecret;

    @com.aliyun.core.annotation.NameInMap("awsRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String awsRegion;

    @com.aliyun.core.annotation.NameInMap("awsSQSQueueUrl")
    private String awsSQSQueueUrl;

    @com.aliyun.core.annotation.NameInMap("awsUseSQS")
    private Boolean awsUseSQS;

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

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("tagPackId")
    private Boolean tagPackId;

    @com.aliyun.core.annotation.NameInMap("timeField")
    private String timeField;

    @com.aliyun.core.annotation.NameInMap("timeFormat")
    private String timeFormat;

    @com.aliyun.core.annotation.NameInMap("timePattern")
    private String timePattern;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    @com.aliyun.core.annotation.NameInMap("useAwsSQSOnly")
    private Boolean useAwsSQSOnly;

    private S3IngestionConfigurationSource(Builder builder) {
        this.awsAccessKey = builder.awsAccessKey;
        this.awsAccessKeySecret = builder.awsAccessKeySecret;
        this.awsRegion = builder.awsRegion;
        this.awsSQSQueueUrl = builder.awsSQSQueueUrl;
        this.awsUseSQS = builder.awsUseSQS;
        this.bucket = builder.bucket;
        this.compressionCodec = builder.compressionCodec;
        this.encoding = builder.encoding;
        this.endTime = builder.endTime;
        this.format = builder.format;
        this.interval = builder.interval;
        this.pattern = builder.pattern;
        this.prefix = builder.prefix;
        this.startTime = builder.startTime;
        this.tagPackId = builder.tagPackId;
        this.timeField = builder.timeField;
        this.timeFormat = builder.timeFormat;
        this.timePattern = builder.timePattern;
        this.timeZone = builder.timeZone;
        this.useAwsSQSOnly = builder.useAwsSQSOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static S3IngestionConfigurationSource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return awsAccessKey
     */
    public String getAwsAccessKey() {
        return this.awsAccessKey;
    }

    /**
     * @return awsAccessKeySecret
     */
    public String getAwsAccessKeySecret() {
        return this.awsAccessKeySecret;
    }

    /**
     * @return awsRegion
     */
    public String getAwsRegion() {
        return this.awsRegion;
    }

    /**
     * @return awsSQSQueueUrl
     */
    public String getAwsSQSQueueUrl() {
        return this.awsSQSQueueUrl;
    }

    /**
     * @return awsUseSQS
     */
    public Boolean getAwsUseSQS() {
        return this.awsUseSQS;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagPackId
     */
    public Boolean getTagPackId() {
        return this.tagPackId;
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
     * @return useAwsSQSOnly
     */
    public Boolean getUseAwsSQSOnly() {
        return this.useAwsSQSOnly;
    }

    public static final class Builder {
        private String awsAccessKey; 
        private String awsAccessKeySecret; 
        private String awsRegion; 
        private String awsSQSQueueUrl; 
        private Boolean awsUseSQS; 
        private String bucket; 
        private String compressionCodec; 
        private String encoding; 
        private Long endTime; 
        private java.util.Map<String, ?> format; 
        private String interval; 
        private String pattern; 
        private String prefix; 
        private Long startTime; 
        private Boolean tagPackId; 
        private String timeField; 
        private String timeFormat; 
        private String timePattern; 
        private String timeZone; 
        private Boolean useAwsSQSOnly; 

        private Builder() {
        } 

        private Builder(S3IngestionConfigurationSource model) {
            this.awsAccessKey = model.awsAccessKey;
            this.awsAccessKeySecret = model.awsAccessKeySecret;
            this.awsRegion = model.awsRegion;
            this.awsSQSQueueUrl = model.awsSQSQueueUrl;
            this.awsUseSQS = model.awsUseSQS;
            this.bucket = model.bucket;
            this.compressionCodec = model.compressionCodec;
            this.encoding = model.encoding;
            this.endTime = model.endTime;
            this.format = model.format;
            this.interval = model.interval;
            this.pattern = model.pattern;
            this.prefix = model.prefix;
            this.startTime = model.startTime;
            this.tagPackId = model.tagPackId;
            this.timeField = model.timeField;
            this.timeFormat = model.timeFormat;
            this.timePattern = model.timePattern;
            this.timeZone = model.timeZone;
            this.useAwsSQSOnly = model.useAwsSQSOnly;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AKIxxxxxxxxxxYJE</p>
         */
        public Builder awsAccessKey(String awsAccessKey) {
            this.awsAccessKey = awsAccessKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123xxxxxxxxxxfjf</p>
         */
        public Builder awsAccessKeySecret(String awsAccessKeySecret) {
            this.awsAccessKeySecret = awsAccessKeySecret;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-northeast-1</p>
         */
        public Builder awsRegion(String awsRegion) {
            this.awsRegion = awsRegion;
            return this;
        }

        /**
         * awsSQSQueueUrl.
         */
        public Builder awsSQSQueueUrl(String awsSQSQueueUrl) {
            this.awsSQSQueueUrl = awsSQSQueueUrl;
            return this;
        }

        /**
         * awsUseSQS.
         */
        public Builder awsUseSQS(Boolean awsUseSQS) {
            this.awsUseSQS = awsUseSQS;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s3bucket</p>
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
         */
        public Builder format(java.util.Map<String, ?> format) {
            this.format = format;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30m</p>
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
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * tagPackId.
         */
        public Builder tagPackId(Boolean tagPackId) {
            this.tagPackId = tagPackId;
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
         * useAwsSQSOnly.
         */
        public Builder useAwsSQSOnly(Boolean useAwsSQSOnly) {
            this.useAwsSQSOnly = useAwsSQSOnly;
            return this;
        }

        public S3IngestionConfigurationSource build() {
            return new S3IngestionConfigurationSource(this);
        } 

    } 

}
