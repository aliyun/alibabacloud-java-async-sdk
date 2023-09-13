// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLiveRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveRecordTemplateRequest</p>
 */
public class CreateLiveRecordTemplateRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("RecordFormat")
    @Validation(required = true)
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
         * 代表资源名称的资源属性字段
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 录制格式
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

    public static class RecordFormat extends TeaModel {
        @NameInMap("CycleDuration")
        private Integer cycleDuration;

        @NameInMap("Format")
        @Validation(required = true)
        private String format;

        @NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @NameInMap("SliceDuration")
        private Integer sliceDuration;

        @NameInMap("SliceOssObjectPrefix")
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
             * 格式
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Oss对象名，不包含后缀
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * 切片时长
             */
            public Builder sliceDuration(Integer sliceDuration) {
                this.sliceDuration = sliceDuration;
                return this;
            }

            /**
             * 切片Oss对象名，不包含后缀
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
