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
 * {@link MediaConvertOutputGroupOutput} extends {@link TeaModel}
 *
 * <p>MediaConvertOutputGroupOutput</p>
 */
public class MediaConvertOutputGroupOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Features")
    private String features;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OutputFileName")
    private String outputFileName;

    @com.aliyun.core.annotation.NameInMap("OverrideParams")
    private String overrideParams;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private MediaConvertOutputGroupOutput(Builder builder) {
        this.features = builder.features;
        this.name = builder.name;
        this.outputFileName = builder.outputFileName;
        this.overrideParams = builder.overrideParams;
        this.priority = builder.priority;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertOutputGroupOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return features
     */
    public String getFeatures() {
        return this.features;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputFileName
     */
    public String getOutputFileName() {
        return this.outputFileName;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder {
        private String features; 
        private String name; 
        private String outputFileName; 
        private String overrideParams; 
        private Integer priority; 
        private String templateId; 

        private Builder() {
        } 

        private Builder(MediaConvertOutputGroupOutput model) {
            this.features = model.features;
            this.name = model.name;
            this.outputFileName = model.outputFileName;
            this.overrideParams = model.overrideParams;
            this.priority = model.priority;
            this.templateId = model.templateId;
        } 

        /**
         * <p>The feature parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder features(String features) {
            this.features = features;
            return this;
        }

        /**
         * <p>A name to label this output. This is for identification purposes only and does not affect the filename.</p>
         * 
         * <strong>example:</strong>
         * <p>group-output</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The filename for this output. This path is relative to OutputFileBase defined in MediaConvertOutputGroupConfig. The final output path is {OutputFileBase}/{OutputFileName}.</p>
         * 
         * <strong>example:</strong>
         * <p>720p.mp4</p>
         */
        public Builder outputFileName(String outputFileName) {
            this.outputFileName = outputFileName;
            return this;
        }

        /**
         * <p>A JSON string containing parameters to override the settings from the associated transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder overrideParams(String overrideParams) {
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * <p>The processing priority for this output. Valid values: 1 to 10. A higher value indicates higher priority. Default value: 6.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public MediaConvertOutputGroupOutput build() {
            return new MediaConvertOutputGroupOutput(this);
        } 

    } 

}
