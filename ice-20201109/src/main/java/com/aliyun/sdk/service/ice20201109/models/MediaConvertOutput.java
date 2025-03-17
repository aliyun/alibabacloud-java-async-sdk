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
 * {@link MediaConvertOutput} extends {@link TeaModel}
 *
 * <p>MediaConvertOutput</p>
 */
public class MediaConvertOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Features")
    private String features;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OutputFile")
    private MediaObject outputFile;

    @com.aliyun.core.annotation.NameInMap("OverrideParams")
    private String overrideParams;

    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private MediaConvertOutput(Builder builder) {
        this.features = builder.features;
        this.name = builder.name;
        this.outputFile = builder.outputFile;
        this.overrideParams = builder.overrideParams;
        this.priority = builder.priority;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MediaConvertOutput create() {
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
     * @return outputFile
     */
    public MediaObject getOutputFile() {
        return this.outputFile;
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
        private MediaObject outputFile; 
        private String overrideParams; 
        private Integer priority; 
        private String templateId; 

        private Builder() {
        } 

        private Builder(MediaConvertOutput model) {
            this.features = model.features;
            this.name = model.name;
            this.outputFile = model.outputFile;
            this.overrideParams = model.overrideParams;
            this.priority = model.priority;
            this.templateId = model.templateId;
        } 

        /**
         * Features.
         */
        public Builder features(String features) {
            this.features = features;
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
         * OutputFile.
         */
        public Builder outputFile(MediaObject outputFile) {
            this.outputFile = outputFile;
            return this;
        }

        /**
         * OverrideParams.
         */
        public Builder overrideParams(String overrideParams) {
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        public MediaConvertOutput build() {
            return new MediaConvertOutput(this);
        } 

    } 

}
