// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateLiveRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveRecordTemplateRequest</p>
 */
public class CreateLiveRecordTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<RecordFormat> recordFormat;

    private CreateLiveRecordTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.recordFormat = builder.recordFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveRecordTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recordFormat
     */
    public java.util.List<RecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public static final class Builder extends Request.Builder<CreateLiveRecordTemplateRequest, Builder> {
        private String name; 
        private java.util.List<RecordFormat> recordFormat; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveRecordTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.recordFormat = request.recordFormat;
        } 

        /**
         * <p>The name of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-record-template</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of recording formats.</p>
         * <p>This parameter is required.</p>
         */
        public Builder recordFormat(java.util.List<RecordFormat> recordFormat) {
            String recordFormatShrink = shrink(recordFormat, "RecordFormat", "json");
            this.putBodyParameter("RecordFormat", recordFormatShrink);
            this.recordFormat = recordFormat;
            return this;
        }

        @Override
        public CreateLiveRecordTemplateRequest build() {
            return new CreateLiveRecordTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLiveRecordTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateLiveRecordTemplateRequest</p>
     */
    public static class RecordFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        @com.aliyun.core.annotation.Validation(required = true)
        private String format;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        @com.aliyun.core.annotation.NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private RecordFormat(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormat create() {
            return builder().build();
        }

        /**
         * @return cycleDuration
         */
        public Integer getCycleDuration() {
            return this.cycleDuration;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return ossObjectPrefix
         */
        public String getOssObjectPrefix() {
            return this.ossObjectPrefix;
        }

        /**
         * @return sliceDuration
         */
        public Integer getSliceDuration() {
            return this.sliceDuration;
        }

        /**
         * @return sliceOssObjectPrefix
         */
        public String getSliceOssObjectPrefix() {
            return this.sliceOssObjectPrefix;
        }

        public static final class Builder {
            private Integer cycleDuration; 
            private String format; 
            private String ossObjectPrefix; 
            private Integer sliceDuration; 
            private String sliceOssObjectPrefix; 

            private Builder() {
            } 

            private Builder(RecordFormat model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.ossObjectPrefix = model.ossObjectPrefix;
                this.sliceDuration = model.sliceDuration;
                this.sliceOssObjectPrefix = model.sliceOssObjectPrefix;
            } 

            /**
             * <p>The duration of a recording cycle. Unit: seconds. If you do not specify this parameter, the default value is 6 hours.</p>
             * <blockquote>
             * <ul>
             * <li>If a live stream is interrupted during a recording cycle but resumes within 3 minutes, the recording continues in the same recording file.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>A live stream must be interrupted for more than 3 minutes before the last recording file is generated. If you need to change the default 3-minute interruption threshold, submit a ticket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>The format.</p>
             * <blockquote>
             * <p>If you select the m3u8 format, you must also set the SliceOssObjectPrefix and SliceDuration request parameters.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>m3u8</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The name of the recording file stored in OSS.</p>
             * <ul>
             * <li><p>The file name must be less than 256 bytes in size and supports variable matching. Supported variables include {JobId}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime}.</p>
             * </li>
             * <li><p>The parameter value must contain {StartTime} or {EscapedStartTime}, and {EndTime} or {EscapedEndTime}.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>record/{JobId}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>The duration of a single slice. Unit: seconds.</p>
             * <blockquote>
             * <p>This parameter is valid only when Format is set to m3u8.</p>
             * </blockquote>
             * <p>If you do not specify this parameter, the default value is 30 seconds. Valid values: 5 to 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * <p>The name of the TS slice.</p>
             * <blockquote>
             * <p>You need to configure this parameter only when Format is set to m3u8.</p>
             * </blockquote>
             * <ul>
             * <li>By default, a slice is generated every 30 seconds. The name must be less than 256 bytes in size and supports variable matching. Supported variables include {JobId}, {UnixTimestamp}, and {Sequence}.</li>
             * <li>The parameter value must contain the {UnixTimestamp} and {Sequence} variables.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>record/{JobId}/{UnixTimestamp}_{Sequence}</p>
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public RecordFormat build() {
                return new RecordFormat(this);
            } 

        } 

    }
}
