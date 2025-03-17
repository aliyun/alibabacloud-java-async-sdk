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
 * {@link GetLiveRecordTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveRecordTemplateResponseBody</p>
 */
public class GetLiveRecordTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordTemplate")
    private RecordTemplate recordTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLiveRecordTemplateResponseBody(Builder builder) {
        this.recordTemplate = builder.recordTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRecordTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordTemplate
     */
    public RecordTemplate getRecordTemplate() {
        return this.recordTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordTemplate recordTemplate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLiveRecordTemplateResponseBody model) {
            this.recordTemplate = model.recordTemplate;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The recording template.</p>
         */
        public Builder recordTemplate(RecordTemplate recordTemplate) {
            this.recordTemplate = recordTemplate;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C892855F-95DF-50D6-A28C-279ABDB76810</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLiveRecordTemplateResponseBody build() {
            return new GetLiveRecordTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLiveRecordTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveRecordTemplateResponseBody</p>
     */
    public static class RecordFormatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CycleDuration")
        private Integer cycleDuration;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("OssObjectPrefix")
        private String ossObjectPrefix;

        @com.aliyun.core.annotation.NameInMap("SliceDuration")
        private Integer sliceDuration;

        @com.aliyun.core.annotation.NameInMap("SliceOssObjectPrefix")
        private String sliceOssObjectPrefix;

        private RecordFormatList(Builder builder) {
            this.cycleDuration = builder.cycleDuration;
            this.format = builder.format;
            this.ossObjectPrefix = builder.ossObjectPrefix;
            this.sliceDuration = builder.sliceDuration;
            this.sliceOssObjectPrefix = builder.sliceOssObjectPrefix;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordFormatList create() {
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

            private Builder(RecordFormatList model) {
                this.cycleDuration = model.cycleDuration;
                this.format = model.format;
                this.ossObjectPrefix = model.ossObjectPrefix;
                this.sliceDuration = model.sliceDuration;
                this.sliceOssObjectPrefix = model.sliceOssObjectPrefix;
            } 

            /**
             * <p>The duration of the recording cycle. Unit: seconds. If you do not specify this parameter, the default value 6 hours is used.</p>
             * 
             * <strong>example:</strong>
             * <p>7200</p>
             */
            public Builder cycleDuration(Integer cycleDuration) {
                this.cycleDuration = cycleDuration;
                return this;
            }

            /**
             * <p>The output file format.</p>
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
             * 
             * <strong>example:</strong>
             * <p>record/{JobId}/{Sequence}{EscapedStartTime}{EscapedEndTime}</p>
             */
            public Builder ossObjectPrefix(String ossObjectPrefix) {
                this.ossObjectPrefix = ossObjectPrefix;
                return this;
            }

            /**
             * <p>The duration of a single segment. Unit: seconds.</p>
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
             * 
             * <strong>example:</strong>
             * <p>record/{JobId}/{UnixTimestamp}_{Sequence}</p>
             */
            public Builder sliceOssObjectPrefix(String sliceOssObjectPrefix) {
                this.sliceOssObjectPrefix = sliceOssObjectPrefix;
                return this;
            }

            public RecordFormatList build() {
                return new RecordFormatList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveRecordTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveRecordTemplateResponseBody</p>
     */
    public static class RecordTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RecordFormatList")
        private java.util.List<RecordFormatList> recordFormatList;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RecordTemplate(Builder builder) {
            this.createTime = builder.createTime;
            this.lastModified = builder.lastModified;
            this.name = builder.name;
            this.recordFormatList = builder.recordFormatList;
            this.templateId = builder.templateId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordTemplate create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return recordFormatList
         */
        public java.util.List<RecordFormatList> getRecordFormatList() {
            return this.recordFormatList;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private String lastModified; 
            private String name; 
            private java.util.List<RecordFormatList> recordFormatList; 
            private String templateId; 
            private String type; 

            private Builder() {
            } 

            private Builder(RecordTemplate model) {
                this.createTime = model.createTime;
                this.lastModified = model.lastModified;
                this.name = model.name;
                this.recordFormatList = model.recordFormatList;
                this.templateId = model.templateId;
                this.type = model.type;
            } 

            /**
             * <p>The time when the job was created.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-20T03:26:36Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the template was last modified.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-20T03:26:36Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>test template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of recording formats.</p>
             */
            public Builder recordFormatList(java.util.List<RecordFormatList> recordFormatList) {
                this.recordFormatList = recordFormatList;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The type of the template.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>system</li>
             * <li>custom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecordTemplate build() {
                return new RecordTemplate(this);
            } 

        } 

    }
}
