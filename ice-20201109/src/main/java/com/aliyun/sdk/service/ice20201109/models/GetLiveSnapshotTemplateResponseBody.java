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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetLiveSnapshotTemplateResponseBody model) {
            this.createTime = model.createTime;
            this.lastModified = model.lastModified;
            this.overwriteFormat = model.overwriteFormat;
            this.requestId = model.requestId;
            this.sequenceFormat = model.sequenceFormat;
            this.templateId = model.templateId;
            this.templateName = model.templateName;
            this.timeInterval = model.timeInterval;
            this.type = model.type;
        } 

        /**
         * <p>The time when the configuration was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-02T22:22:22Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-02T22:22:22Z</p>
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * <p>The naming format of the snapshot captured in overwrite mode.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot/{JobId}.jpg</p>
         */
        public Builder overwriteFormat(String overwriteFormat) {
            this.overwriteFormat = overwriteFormat;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The naming format of the snapshot captured in time series mode.</p>
         * 
         * <strong>example:</strong>
         * <p>snapshot/{JobId}/{UnixTimestamp}.jpg</p>
         */
        public Builder sequenceFormat(String sequenceFormat) {
            this.sequenceFormat = sequenceFormat;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The template name.</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The interval between two adjacent snapshots.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder timeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
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

        public GetLiveSnapshotTemplateResponseBody build() {
            return new GetLiveSnapshotTemplateResponseBody(this);
        } 

    } 

}
