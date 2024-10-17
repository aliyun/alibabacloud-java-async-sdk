// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLiveSnapshotTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveSnapshotTemplateResponseBody</p>
 */
public class GetLiveSnapshotTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("LastModified")
    private String lastModified;

    @com.aliyun.core.annotation.NameInMap("OverwriteFormat")
    private String overwriteFormat;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SequenceFormat")
    private String sequenceFormat;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TimeInterval")
    private Integer timeInterval;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetLiveSnapshotTemplateResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.lastModified = builder.lastModified;
        this.overwriteFormat = builder.overwriteFormat;
        this.requestId = builder.requestId;
        this.sequenceFormat = builder.sequenceFormat;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.timeInterval = builder.timeInterval;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveSnapshotTemplateResponseBody create() {
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
     * @return overwriteFormat
     */
    public String getOverwriteFormat() {
        return this.overwriteFormat;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sequenceFormat
     */
    public String getSequenceFormat() {
        return this.sequenceFormat;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return this.timeInterval;
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
        private String overwriteFormat; 
        private String requestId; 
        private String sequenceFormat; 
        private String templateId; 
        private String templateName; 
        private Integer timeInterval; 
        private String type; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * LastModified.
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * OverwriteFormat.
         */
        public Builder overwriteFormat(String overwriteFormat) {
            this.overwriteFormat = overwriteFormat;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SequenceFormat.
         */
        public Builder sequenceFormat(String sequenceFormat) {
            this.sequenceFormat = sequenceFormat;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * TimeInterval.
         */
        public Builder timeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetLiveSnapshotTemplateResponseBody build() {
            return new GetLiveSnapshotTemplateResponseBody(this);
        } 

    } 

}
