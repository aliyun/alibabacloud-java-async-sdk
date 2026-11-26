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
 * {@link CreateAppRecordTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRecordTemplateRequest</p>
 */
public class CreateAppRecordTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
    private RecordTemplate recordTemplate;

    private CreateAppRecordTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.recordTemplate = builder.recordTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRecordTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return recordTemplate
     */
    public RecordTemplate getRecordTemplate() {
        return this.recordTemplate;
    }

    public static final class Builder extends Request.Builder<CreateAppRecordTemplateRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private RecordTemplate recordTemplate; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRecordTemplateRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.recordTemplate = request.recordTemplate;
        } 

        /**
         * <p>The application ID. You can create and query the ID in the console. Only a single ID is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ac7N****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The client token.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The recording template.</p>
         * <p>This parameter is required.</p>
         */
        public Builder recordTemplate(RecordTemplate recordTemplate) {
            String recordTemplateShrink = shrink(recordTemplate, "RecordTemplate", "json");
            this.putQueryParameter("RecordTemplate", recordTemplateShrink);
            this.recordTemplate = recordTemplate;
            return this;
        }

        @Override
        public CreateAppRecordTemplateRequest build() {
            return new CreateAppRecordTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppRecordTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateAppRecordTemplateRequest</p>
     */
    public static class RecordTemplate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelayStopTime")
        @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 180)
        private Integer delayStopTime;

        @com.aliyun.core.annotation.NameInMap("FilePrefix")
        @com.aliyun.core.annotation.Validation(required = true)
        private String filePrefix;

        @com.aliyun.core.annotation.NameInMap("FileSplitInterval")
        @com.aliyun.core.annotation.Validation(required = true, maximum = 20000, minimum = 1800)
        private Integer fileSplitInterval;

        @com.aliyun.core.annotation.NameInMap("Formats")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> formats;

        @com.aliyun.core.annotation.NameInMap("LayoutIds")
        private java.util.List<String> layoutIds;

        @com.aliyun.core.annotation.NameInMap("MediaEncode")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer mediaEncode;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private RecordTemplate(Builder builder) {
            this.delayStopTime = builder.delayStopTime;
            this.filePrefix = builder.filePrefix;
            this.fileSplitInterval = builder.fileSplitInterval;
            this.formats = builder.formats;
            this.layoutIds = builder.layoutIds;
            this.mediaEncode = builder.mediaEncode;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordTemplate create() {
            return builder().build();
        }

        /**
         * @return delayStopTime
         */
        public Integer getDelayStopTime() {
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
        public Integer getFileSplitInterval() {
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

        public static final class Builder {
            private Integer delayStopTime; 
            private String filePrefix; 
            private Integer fileSplitInterval; 
            private java.util.List<String> formats; 
            private java.util.List<String> layoutIds; 
            private Integer mediaEncode; 
            private String name; 

            private Builder() {
            } 

            private Builder(RecordTemplate model) {
                this.delayStopTime = model.delayStopTime;
                this.filePrefix = model.filePrefix;
                this.fileSplitInterval = model.fileSplitInterval;
                this.formats = model.formats;
                this.layoutIds = model.layoutIds;
                this.mediaEncode = model.mediaEncode;
                this.name = model.name;
            } 

            /**
             * <p>The delay time before stopping the recording. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder delayStopTime(Integer delayStopTime) {
                this.delayStopTime = delayStopTime;
                return this;
            }

            /**
             * <p>The naming rule for recorded files.</p>
             * <blockquote>
             * <p>To ensure the uniqueness of recorded file names, the current naming rule for recorded files is record/{AppId}/{ChannelId}<em>{TaskId}/{EscapedStartTime}</em>{EscapedEndTime}.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>record/{AppId}/{ChannelId}<em>{TaskId}/{EscapedStartTime}</em>{EscapedEndTime}</p>
             */
            public Builder filePrefix(String filePrefix) {
                this.filePrefix = filePrefix;
                return this;
            }

            /**
             * <p>The splitting duration of the recorded file. The value must be greater than or equal to 1800. Unit: seconds.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1800</p>
             */
            public Builder fileSplitInterval(Integer fileSplitInterval) {
                this.fileSplitInterval = fileSplitInterval;
                return this;
            }

            /**
             * <p>The format of the recorded file. Only .m3u8, .mp4, and .flv are supported.</p>
             * <p>This parameter is required.</p>
             */
            public Builder formats(java.util.List<String> formats) {
                this.formats = formats;
                return this;
            }

            /**
             * <p>The list of layout IDs. A maximum of 16 layout IDs can be specified.</p>
             * <p>Note: The layouts in the list must correspond to different numbers of data sources.</p>
             */
            public Builder layoutIds(java.util.List<String> layoutIds) {
                this.layoutIds = layoutIds;
                return this;
            }

            /**
             * <p>The encoding options.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder mediaEncode(Integer mediaEncode) {
                this.mediaEncode = mediaEncode;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Template</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RecordTemplate build() {
                return new RecordTemplate(this);
            } 

        } 

    }
}
