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
 * {@link OSSExportConfiguration} extends {@link TeaModel}
 *
 * <p>OSSExportConfiguration</p>
 */
public class OSSExportConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("fromTime")
    private Long fromTime;

    @com.aliyun.core.annotation.NameInMap("logstore")
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("roleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("sink")
    private Sink sink;

    @com.aliyun.core.annotation.NameInMap("toTime")
    private Long toTime;

    private OSSExportConfiguration(Builder builder) {
        this.fromTime = builder.fromTime;
        this.logstore = builder.logstore;
        this.roleArn = builder.roleArn;
        this.sink = builder.sink;
        this.toTime = builder.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSExportConfiguration create() {
        return builder().build();
    }

    /**
     * @return fromTime
     */
    public Long getFromTime() {
        return this.fromTime;
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return sink
     */
    public Sink getSink() {
        return this.sink;
    }

    /**
     * @return toTime
     */
    public Long getToTime() {
        return this.toTime;
    }

    public static final class Builder {
        private Long fromTime; 
        private String logstore; 
        private String roleArn; 
        private Sink sink; 
        private Long toTime; 

        /**
         * fromTime.
         */
        public Builder fromTime(Long fromTime) {
            this.fromTime = fromTime;
            return this;
        }

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * roleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * sink.
         */
        public Builder sink(Sink sink) {
            this.sink = sink;
            return this;
        }

        /**
         * toTime.
         */
        public Builder toTime(Long toTime) {
            this.toTime = toTime;
            return this;
        }

        public OSSExportConfiguration build() {
            return new OSSExportConfiguration(this);
        } 

    } 

    /**
     * 
     * {@link OSSExportConfiguration} extends {@link TeaModel}
     *
     * <p>OSSExportConfiguration</p>
     */
    public static class Sink extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bucket")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("bufferInterval")
        private Long bufferInterval;

        @com.aliyun.core.annotation.NameInMap("bufferSize")
        private Long bufferSize;

        @com.aliyun.core.annotation.NameInMap("compressionType")
        private String compressionType;

        @com.aliyun.core.annotation.NameInMap("contentDetail")
        private java.util.Map<String, ?> contentDetail;

        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("delaySec")
        @Deprecated
        private Long delaySec;

        @com.aliyun.core.annotation.NameInMap("delaySeconds")
        private Long delaySeconds;

        @com.aliyun.core.annotation.NameInMap("endpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("pathFormat")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pathFormat;

        @com.aliyun.core.annotation.NameInMap("pathFormatType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String pathFormatType;

        @com.aliyun.core.annotation.NameInMap("prefix")
        private String prefix;

        @com.aliyun.core.annotation.NameInMap("roleArn")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("suffix")
        private String suffix;

        @com.aliyun.core.annotation.NameInMap("timeZone")
        private String timeZone;

        private Sink(Builder builder) {
            this.bucket = builder.bucket;
            this.bufferInterval = builder.bufferInterval;
            this.bufferSize = builder.bufferSize;
            this.compressionType = builder.compressionType;
            this.contentDetail = builder.contentDetail;
            this.contentType = builder.contentType;
            this.delaySec = builder.delaySec;
            this.delaySeconds = builder.delaySeconds;
            this.endpoint = builder.endpoint;
            this.pathFormat = builder.pathFormat;
            this.pathFormatType = builder.pathFormatType;
            this.prefix = builder.prefix;
            this.roleArn = builder.roleArn;
            this.suffix = builder.suffix;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sink create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return bufferInterval
         */
        public Long getBufferInterval() {
            return this.bufferInterval;
        }

        /**
         * @return bufferSize
         */
        public Long getBufferSize() {
            return this.bufferSize;
        }

        /**
         * @return compressionType
         */
        public String getCompressionType() {
            return this.compressionType;
        }

        /**
         * @return contentDetail
         */
        public java.util.Map<String, ?> getContentDetail() {
            return this.contentDetail;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return delaySec
         */
        public Long getDelaySec() {
            return this.delaySec;
        }

        /**
         * @return delaySeconds
         */
        public Long getDelaySeconds() {
            return this.delaySeconds;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return pathFormat
         */
        public String getPathFormat() {
            return this.pathFormat;
        }

        /**
         * @return pathFormatType
         */
        public String getPathFormatType() {
            return this.pathFormatType;
        }

        /**
         * @return prefix
         */
        public String getPrefix() {
            return this.prefix;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return suffix
         */
        public String getSuffix() {
            return this.suffix;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String bucket; 
            private Long bufferInterval; 
            private Long bufferSize; 
            private String compressionType; 
            private java.util.Map<String, ?> contentDetail; 
            private String contentType; 
            private Long delaySec; 
            private Long delaySeconds; 
            private String endpoint; 
            private String pathFormat; 
            private String pathFormatType; 
            private String prefix; 
            private String roleArn; 
            private String suffix; 
            private String timeZone; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test-bucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * bufferInterval.
             */
            public Builder bufferInterval(Long bufferInterval) {
                this.bufferInterval = bufferInterval;
                return this;
            }

            /**
             * bufferSize.
             */
            public Builder bufferSize(Long bufferSize) {
                this.bufferSize = bufferSize;
                return this;
            }

            /**
             * compressionType.
             */
            public Builder compressionType(String compressionType) {
                this.compressionType = compressionType;
                return this;
            }

            /**
             * contentDetail.
             */
            public Builder contentDetail(java.util.Map<String, ?> contentDetail) {
                this.contentDetail = contentDetail;
                return this;
            }

            /**
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * delaySec.
             */
            public Builder delaySec(Long delaySec) {
                this.delaySec = delaySec;
                return this;
            }

            /**
             * delaySeconds.
             */
            public Builder delaySeconds(Long delaySeconds) {
                this.delaySeconds = delaySeconds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://oss-cn-hangzhou-internal.aliyuncs.com">http://oss-cn-hangzhou-internal.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>%Y/%m/%d/%H/%M</p>
             */
            public Builder pathFormat(String pathFormat) {
                this.pathFormat = pathFormat;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>time</p>
             */
            public Builder pathFormatType(String pathFormatType) {
                this.pathFormatType = pathFormatType;
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789:role/aliyunlogdefaultrole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * suffix.
             */
            public Builder suffix(String suffix) {
                this.suffix = suffix;
                return this;
            }

            /**
             * timeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public Sink build() {
                return new Sink(this);
            } 

        } 

    }
}
