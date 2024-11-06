// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
    private java.util.List < Templates> templates;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
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
        private java.util.List < Templates> templates; 
        private Long totalNum; 
        private Long totalPage; 

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
         * Templates.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        /**
         * TotalPage.
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
        private byte[] createTime;

        @com.aliyun.core.annotation.NameInMap("DelayStopTime")
        private Long delayStopTime;

        @com.aliyun.core.annotation.NameInMap("FilePrefix")
        private String filePrefix;

        @com.aliyun.core.annotation.NameInMap("FileSplitInterval")
        private Long fileSplitInterval;

        @com.aliyun.core.annotation.NameInMap("Formats")
        private java.util.List < String > formats;

        @com.aliyun.core.annotation.NameInMap("LayoutIds")
        private java.util.List < Long > layoutIds;

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
        public byte[] getCreateTime() {
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
        public java.util.List < String > getFormats() {
            return this.formats;
        }

        /**
         * @return layoutIds
         */
        public java.util.List < Long > getLayoutIds() {
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
            private byte[] createTime; 
            private Long delayStopTime; 
            private String filePrefix; 
            private Long fileSplitInterval; 
            private java.util.List < String > formats; 
            private java.util.List < Long > layoutIds; 
            private Integer mediaEncode; 
            private String name; 
            private String templateId; 

            /**
             * CreateTime.
             */
            public Builder createTime(byte[] createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DelayStopTime.
             */
            public Builder delayStopTime(Long delayStopTime) {
                this.delayStopTime = delayStopTime;
                return this;
            }

            /**
             * FilePrefix.
             */
            public Builder filePrefix(String filePrefix) {
                this.filePrefix = filePrefix;
                return this;
            }

            /**
             * FileSplitInterval.
             */
            public Builder fileSplitInterval(Long fileSplitInterval) {
                this.fileSplitInterval = fileSplitInterval;
                return this;
            }

            /**
             * Formats.
             */
            public Builder formats(java.util.List < String > formats) {
                this.formats = formats;
                return this;
            }

            /**
             * LayoutIds.
             */
            public Builder layoutIds(java.util.List < Long > layoutIds) {
                this.layoutIds = layoutIds;
                return this;
            }

            /**
             * MediaEncode.
             */
            public Builder mediaEncode(Integer mediaEncode) {
                this.mediaEncode = mediaEncode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TemplateId.
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
