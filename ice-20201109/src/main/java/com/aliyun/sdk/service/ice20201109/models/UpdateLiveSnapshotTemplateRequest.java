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
 * {@link UpdateLiveSnapshotTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveSnapshotTemplateRequest</p>
 */
public class UpdateLiveSnapshotTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OverwriteFormat")
    private String overwriteFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SequenceFormat")
    private String sequenceFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeInterval")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeInterval;

    private UpdateLiveSnapshotTemplateRequest(Builder builder) {
        super(builder);
        this.overwriteFormat = builder.overwriteFormat;
        this.sequenceFormat = builder.sequenceFormat;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.timeInterval = builder.timeInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveSnapshotTemplateRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateLiveSnapshotTemplateRequest, Builder> {
        private String overwriteFormat; 
        private String sequenceFormat; 
        private String templateId; 
        private String templateName; 
        private Integer timeInterval; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveSnapshotTemplateRequest request) {
            super(request);
            this.overwriteFormat = request.overwriteFormat;
            this.sequenceFormat = request.sequenceFormat;
            this.templateId = request.templateId;
            this.templateName = request.templateName;
            this.timeInterval = request.timeInterval;
        } 

        /**
         * <p>The file format for overwrite snapshots.</p>
         * <ul>
         * <li>It cannot start with a forward slash (/) and currently supports only the .jpg extension.</li>
         * <li>The maximum length is 255 characters.</li>
         * <li>Supported placeholder: {JobId}, which indicates the snapshot job ID.</li>
         * <li>Placeholders such as {UnixTimestamp}, {Sequence}, and {Date} are not allowed.</li>
         * <li>You must specify at least one of the file formats for overwrite snapshots and sequence snapshots.</li>
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
         * <p>The file format for sequence snapshots.</p>
         * <ul>
         * <li>It cannot start with a forward slash (/) and currently supports only the .jpg extension.</li>
         * <li>The maximum length is 255 characters.</li>
         * <li>Supported placeholders: {JobId} (snapshot job ID), {Date} (snapshot date), {UnixTimestamp} (timestamp), and {Sequence} (sequence number). You must specify at least one of {UnixTimestamp} and {Sequence}.</li>
         * <li>You must specify at least one of the file formats for overwrite snapshots and sequence snapshots.</li>
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
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The template name. The maximum length is 128 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>template1</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The time interval between snapshots, in seconds. Valid values: 5 to 3600.</p>
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
        public UpdateLiveSnapshotTemplateRequest build() {
            return new UpdateLiveSnapshotTemplateRequest(this);
        } 

    } 

}
