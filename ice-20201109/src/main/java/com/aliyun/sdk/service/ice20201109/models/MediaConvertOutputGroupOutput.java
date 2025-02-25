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
         * OutputFileName.
         */
        public Builder outputFileName(String outputFileName) {
            this.outputFileName = outputFileName;
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

        public MediaConvertOutputGroupOutput build() {
            return new MediaConvertOutputGroupOutput(this);
        } 

    } 

}
