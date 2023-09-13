// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveSnapshotTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveSnapshotTemplateRequest</p>
 */
public class UpdateLiveSnapshotTemplateRequest extends Request {
    @Body
    @NameInMap("OverwriteFormat")
    private String overwriteFormat;

    @Body
    @NameInMap("SequenceFormat")
    private String sequenceFormat;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Body
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Body
    @NameInMap("TimeInterval")
    @Validation(required = true)
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
         * OverwriteFormat.
         */
        public Builder overwriteFormat(String overwriteFormat) {
            this.putBodyParameter("OverwriteFormat", overwriteFormat);
            this.overwriteFormat = overwriteFormat;
            return this;
        }

        /**
         * SequenceFormat.
         */
        public Builder sequenceFormat(String sequenceFormat) {
            this.putBodyParameter("SequenceFormat", sequenceFormat);
            this.sequenceFormat = sequenceFormat;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TimeInterval.
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
