// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SinkOSSParameters} extends {@link TeaModel}
 *
 * <p>SinkOSSParameters</p>
 */
public class SinkOSSParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.NameInMap("CompressionType")
    private String compressionType;

    @com.aliyun.core.annotation.NameInMap("ContentTransform")
    private ContentTransform contentTransform;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("PathFormat")
    private String pathFormat;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RoleArn")
    private String roleArn;

    @com.aliyun.core.annotation.NameInMap("RotateIntervalMs")
    private String rotateIntervalMs;

    @com.aliyun.core.annotation.NameInMap("RotateSizeBytes")
    private String rotateSizeBytes;

    @com.aliyun.core.annotation.NameInMap("SSLEnabled")
    private Boolean SSLEnabled;

    @com.aliyun.core.annotation.NameInMap("TaskConcurrency")
    private String taskConcurrency;

    @com.aliyun.core.annotation.NameInMap("TimeZone")
    private String timeZone;

    private SinkOSSParameters(Builder builder) {
        this.bucketName = builder.bucketName;
        this.compressionType = builder.compressionType;
        this.contentTransform = builder.contentTransform;
        this.endpoint = builder.endpoint;
        this.pathFormat = builder.pathFormat;
        this.regionId = builder.regionId;
        this.roleArn = builder.roleArn;
        this.rotateIntervalMs = builder.rotateIntervalMs;
        this.rotateSizeBytes = builder.rotateSizeBytes;
        this.SSLEnabled = builder.SSLEnabled;
        this.taskConcurrency = builder.taskConcurrency;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkOSSParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return compressionType
     */
    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * @return contentTransform
     */
    public ContentTransform getContentTransform() {
        return this.contentTransform;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return rotateIntervalMs
     */
    public String getRotateIntervalMs() {
        return this.rotateIntervalMs;
    }

    /**
     * @return rotateSizeBytes
     */
    public String getRotateSizeBytes() {
        return this.rotateSizeBytes;
    }

    /**
     * @return SSLEnabled
     */
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    /**
     * @return taskConcurrency
     */
    public String getTaskConcurrency() {
        return this.taskConcurrency;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String bucketName; 
        private String compressionType; 
        private ContentTransform contentTransform; 
        private String endpoint; 
        private String pathFormat; 
        private String regionId; 
        private String roleArn; 
        private String rotateIntervalMs; 
        private String rotateSizeBytes; 
        private Boolean SSLEnabled; 
        private String taskConcurrency; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(SinkOSSParameters model) {
            this.bucketName = model.bucketName;
            this.compressionType = model.compressionType;
            this.contentTransform = model.contentTransform;
            this.endpoint = model.endpoint;
            this.pathFormat = model.pathFormat;
            this.regionId = model.regionId;
            this.roleArn = model.roleArn;
            this.rotateIntervalMs = model.rotateIntervalMs;
            this.rotateSizeBytes = model.rotateSizeBytes;
            this.SSLEnabled = model.SSLEnabled;
            this.taskConcurrency = model.taskConcurrency;
            this.timeZone = model.timeZone;
        } 

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * CompressionType.
         */
        public Builder compressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }

        /**
         * ContentTransform.
         */
        public Builder contentTransform(ContentTransform contentTransform) {
            this.contentTransform = contentTransform;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * PathFormat.
         */
        public Builder pathFormat(String pathFormat) {
            this.pathFormat = pathFormat;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        /**
         * RotateIntervalMs.
         */
        public Builder rotateIntervalMs(String rotateIntervalMs) {
            this.rotateIntervalMs = rotateIntervalMs;
            return this;
        }

        /**
         * RotateSizeBytes.
         */
        public Builder rotateSizeBytes(String rotateSizeBytes) {
            this.rotateSizeBytes = rotateSizeBytes;
            return this;
        }

        /**
         * SSLEnabled.
         */
        public Builder SSLEnabled(Boolean SSLEnabled) {
            this.SSLEnabled = SSLEnabled;
            return this;
        }

        /**
         * TaskConcurrency.
         */
        public Builder taskConcurrency(String taskConcurrency) {
            this.taskConcurrency = taskConcurrency;
            return this;
        }

        /**
         * TimeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public SinkOSSParameters build() {
            return new SinkOSSParameters(this);
        } 

    } 

    /**
     * 
     * {@link SinkOSSParameters} extends {@link TeaModel}
     *
     * <p>SinkOSSParameters</p>
     */
    public static class ContentTransform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Form")
        private String form;

        @com.aliyun.core.annotation.NameInMap("Template")
        private String template;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ContentTransform(Builder builder) {
            this.form = builder.form;
            this.template = builder.template;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentTransform create() {
            return builder().build();
        }

        /**
         * @return form
         */
        public String getForm() {
            return this.form;
        }

        /**
         * @return template
         */
        public String getTemplate() {
            return this.template;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String form; 
            private String template; 
            private String value; 

            private Builder() {
            } 

            private Builder(ContentTransform model) {
                this.form = model.form;
                this.template = model.template;
                this.value = model.value;
            } 

            /**
             * Form.
             */
            public Builder form(String form) {
                this.form = form;
                return this;
            }

            /**
             * Template.
             */
            public Builder template(String template) {
                this.template = template;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ContentTransform build() {
                return new ContentTransform(this);
            } 

        } 

    }
}
