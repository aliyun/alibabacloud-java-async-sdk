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
         * <p>代表资源名称的资源属性字段</p>
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>录制格式</p>
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
             * CycleDuration.
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>格式</p>
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
             * <p>Oss对象名，不包含后缀</p>
             * 
             * <strong>example:</strong>
             * <p>record/{JobId}/{Sequence}<em>{EscapedStartTime}</em>{EscapedEndTime}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>切片时长</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * <p>切片Oss对象名，不包含后缀</p>
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
