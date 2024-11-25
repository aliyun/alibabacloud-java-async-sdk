// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    private java.util.List < RecordFormat> recordFormat;

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
    public java.util.List < RecordFormat> getRecordFormat() {
        return this.recordFormat;
    }

    public static final class Builder extends Request.Builder<CreateLiveRecordTemplateRequest, Builder> {
        private String name; 
        private java.util.List < RecordFormat> recordFormat; 

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
        public Builder recordFormat(java.util.List < RecordFormat> recordFormat) {
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

            /**
             * <p>The duration of the recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If a live stream is interrupted during a recording cycle but is resumed within 3 minutes, the stream is recorded in the same recording before and after the interruption.</p>
             * </li>
             * <li><p>If a live stream is interrupted for more than 3 minutes, a new recording is generated. To change the default stream interruption time, submit a ticket.</p>
             * </li>
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
             * <p> If you set this parameter to m3u8, you must also specify the SliceOssObjectPrefix and SliceDuration parameters.</p>
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
             * <p>The name of the recording file that is stored in Object Storage Service (OSS).</p>
             * <ul>
             * <li>The name must be less than 256 bytes in length and can contain the {JobId}, {Sequence}, {StartTime}, {EndTime}, {EscapedStartTime}, and {EscapedEndTime} variables.</li>
             * <li>The name must contain the {StartTime} and {EndTime} variables or the {EscapedStartTime} and {EscapedEndTime} variables.</li>
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
             * <p>The duration of a single segment. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter takes effect only if you set Format to m3u8.</p>
             * </blockquote>
             * <p>If you do not specify this parameter, the default value 30 seconds is used. Valid values: 5 to 30.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * <p>The name of the TS segment.</p>
             * <blockquote>
             * <p> This parameter is required only if you set Format to m3u8.</p>
             * </blockquote>
             * <ul>
             * <li>By default, the duration of a segment is 30 seconds. The segment name must be less than 256 bytes in length and can contain the {JobId}, {UnixTimestamp}, and {Sequence} variables.</li>
             * <li>The segment name must contain the {UnixTimestamp} and {Sequence} variables.</li>
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
