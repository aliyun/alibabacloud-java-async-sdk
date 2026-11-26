// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeAppRecordTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppRecordTemplatesResponseBody</p>
 */
public class DescribeAppRecordTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.List<Templates> templates;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeAppRecordTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalNum = builder.totalNum;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppRecordTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List<Templates> getTemplates() {
        return this.templates;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Templates> templates; 
        private Long totalNum; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeAppRecordTemplatesResponseBody model) {
            this.requestId = model.requestId;
            this.templates = model.templates;
            this.totalNum = model.totalNum;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2A7497D0-BEAE-58E7-B13A-751BD8EAE4C6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of templates.</p>
         */
        public Builder templates(java.util.List<Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeAppRecordTemplatesResponseBody build() {
            return new DescribeAppRecordTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAppRecordTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAppRecordTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DelayStopTime")
        private Long delayStopTime;

        @com.aliyun.core.annotation.NameInMap("FilePrefix")
        private String filePrefix;

        @com.aliyun.core.annotation.NameInMap("FileSplitInterval")
        private Long fileSplitInterval;

        @com.aliyun.core.annotation.NameInMap("Formats")
        private java.util.List<String> formats;

        @com.aliyun.core.annotation.NameInMap("LayoutIds")
        private java.util.List<String> layoutIds;

        @com.aliyun.core.annotation.NameInMap("MediaEncode")
        private Integer mediaEncode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Templates(Builder builder) {
            this.createTime = builder.createTime;
            this.delayStopTime = builder.delayStopTime;
            this.filePrefix = builder.filePrefix;
            this.fileSplitInterval = builder.fileSplitInterval;
            this.formats = builder.formats;
            this.layoutIds = builder.layoutIds;
            this.mediaEncode = builder.mediaEncode;
            this.name = builder.name;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return delayStopTime
         */
        public Long getDelayStopTime() {
            return this.delayStopTime;
        }

        /**
         * @return filePrefix
         */
        public String getFilePrefix() {
            return this.filePrefix;
        }

        /**
         * @return fileSplitInterval
         */
        public Long getFileSplitInterval() {
            return this.fileSplitInterval;
        }

        /**
         * @return formats
         */
        public java.util.List<String> getFormats() {
            return this.formats;
        }

        /**
         * @return layoutIds
         */
        public java.util.List<String> getLayoutIds() {
            return this.layoutIds;
        }

        /**
         * @return mediaEncode
         */
        public Integer getMediaEncode() {
            return this.mediaEncode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String createTime; 
            private Long delayStopTime; 
            private String filePrefix; 
            private Long fileSplitInterval; 
            private java.util.List<String> formats; 
            private java.util.List<String> layoutIds; 
            private Integer mediaEncode; 
            private String name; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Templates model) {
                this.createTime = model.createTime;
                this.delayStopTime = model.delayStopTime;
                this.filePrefix = model.filePrefix;
                this.fileSplitInterval = model.fileSplitInterval;
                this.formats = model.formats;
                this.layoutIds = model.layoutIds;
                this.mediaEncode = model.mediaEncode;
                this.name = model.name;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The creation time. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-09-04T06:22:15Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The delay time before stopping the recording. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder delayStopTime(Long delayStopTime) {
                this.delayStopTime = delayStopTime;
                return this;
            }

            /**
             * <p>The naming rule for recording files.</p>
             * <blockquote>
             * <p>To ensure the uniqueness of recording file names, the current naming rule is record/{AppId}/{ChannelId}<em>{TaskId}/{EscapedStartTime}</em>{EscapedEndTime}.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>record/{AppId}/{ChannelId_TaskId}/{EscapedStartTime}_{EscapedEndTime}</p>
             */
            public Builder filePrefix(String filePrefix) {
                this.filePrefix = filePrefix;
                return this;
            }

            /**
             * <p>The splitting duration of the recording file. The value must be greater than or equal to 1800. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder fileSplitInterval(Long fileSplitInterval) {
                this.fileSplitInterval = fileSplitInterval;
                return this;
            }

            /**
             * <p>The formats of the recording file. Valid values: .m3u8, .mp4, and .flv.</p>
             * <blockquote>
             * <p>Only lowercase letters are supported for file formats.</p>
             * </blockquote>
             */
            public Builder formats(java.util.List<String> formats) {
                this.formats = formats;
                return this;
            }

            /**
             * <p>The list of layout IDs.</p>
             */
            public Builder layoutIds(java.util.List<String> layoutIds) {
                this.layoutIds = layoutIds;
                return this;
            }

            /**
             * <p>The encoding options.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mediaEncode(Integer mediaEncode) {
                this.mediaEncode = mediaEncode;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>wv7N****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
