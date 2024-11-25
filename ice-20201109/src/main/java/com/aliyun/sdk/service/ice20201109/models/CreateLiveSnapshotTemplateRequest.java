// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateLiveSnapshotTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateLiveSnapshotTemplateRequest</p>
 */
public class CreateLiveSnapshotTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OverwriteFormat")
    private String overwriteFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SequenceFormat")
    private String sequenceFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeInterval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeInterval;

    private CreateLiveSnapshotTemplateRequest(Builder builder) {
        super(builder);
        this.overwriteFormat = builder.overwriteFormat;
        this.sequenceFormat = builder.sequenceFormat;
        this.templateName = builder.templateName;
        this.timeInterval = builder.timeInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLiveSnapshotTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return overwriteFormat
     */
    public String getOverwriteFormat() {
        return this.overwriteFormat;
    }

    /**
     * @return sequenceFormat
     */
    public String getSequenceFormat() {
        return this.sequenceFormat;
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

    public static final class Builder extends Request.Builder<CreateLiveSnapshotTemplateRequest, Builder> {
        private String overwriteFormat; 
        private String sequenceFormat; 
        private String templateName; 
        private Integer timeInterval; 

        private Builder() {
            super();
        } 

        private Builder(CreateLiveSnapshotTemplateRequest request) {
            super(request);
            this.overwriteFormat = request.overwriteFormat;
            this.sequenceFormat = request.sequenceFormat;
            this.templateName = request.templateName;
            this.timeInterval = request.timeInterval;
        } 

        /**
         * <p>The naming format of the snapshot captured in overwrite mode.</p>
         * <ul>
         * <li>The value cannot start with a forward slash (/). Only the suffix .jpg is supported.</li>
         * <li>It cannot exceed 255 characters in length.</li>
         * <li>The {JobId} placeholder is supported. It specifies the ID of the snapshot job.</li>
         * <li>Placeholders such as {UnixTimestamp}, {Sequence}, and {Date} are not allowed.</li>
         * <li>You must specify at least one of the OverwriteFormat and SequenceFormat parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>snapshot/{JobId}.jpg</p>
         */
        public Builder overwriteFormat(String overwriteFormat) {
            this.putBodyParameter("OverwriteFormat", overwriteFormat);
            this.overwriteFormat = overwriteFormat;
            return this;
        }

        /**
         * <p>The naming format of the snapshot captured in time series mode.</p>
         * <ul>
         * <li>The value cannot start with a forward slash (/). Only the suffix .jpg is supported.</li>
         * <li>It cannot exceed 255 characters in length.</li>
         * <li>The {JobId}, {Date}, {UnixTimestamp}, and {Sequence} placeholders are supported. {JobId} specifies the ID of the snapshot job. {Date} specifies the date on which the snapshot is captured. {UnixTimestamp} specifies the timestamp of the snapshot. {Sequence} specifies the sequence number of the snapshot. You must specify at least one of the {UnixTimestamp} and {Sequence} placeholders.</li>
         * <li>You must specify at least one of the OverwriteFormat and SequenceFormat parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>snapshot/{JobId}/{UnixTimestamp}.jpg</p>
         */
        public Builder sequenceFormat(String sequenceFormat) {
            this.putBodyParameter("SequenceFormat", sequenceFormat);
            this.sequenceFormat = sequenceFormat;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * <ul>
         * <li>It cannot exceed 128 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The interval between two adjacent snapshots. Unit: seconds.</p>
         * <ul>
         * <li>Valid values: [5,3600].</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder timeInterval(Integer timeInterval) {
            this.putBodyParameter("TimeInterval", timeInterval);
            this.timeInterval = timeInterval;
            return this;
        }

        @Override
        public CreateLiveSnapshotTemplateRequest build() {
            return new CreateLiveSnapshotTemplateRequest(this);
        } 

    } 

}
