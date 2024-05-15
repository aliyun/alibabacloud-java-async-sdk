// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskTemplateConfig} extends {@link TeaModel}
 *
 * <p>TaskTemplateConfig</p>
 */
public class TaskTemplateConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Exif")
    private java.util.Map < String, String > exif;

    @com.aliyun.core.annotation.NameInMap("ResourceKey")
    private String resourceKey;

    @com.aliyun.core.annotation.NameInMap("SelectQuestions")
    private java.util.List < String > selectQuestions;

    @com.aliyun.core.annotation.NameInMap("TemplateOptionMap")
    private java.util.Map < String, TaskTemplateOptionConfig > templateOptionMap;

    @com.aliyun.core.annotation.NameInMap("TemplateRelationId")
    private String templateRelationId;

    private TaskTemplateConfig(Builder builder) {
        this.exif = builder.exif;
        this.resourceKey = builder.resourceKey;
        this.selectQuestions = builder.selectQuestions;
        this.templateOptionMap = builder.templateOptionMap;
        this.templateRelationId = builder.templateRelationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskTemplateConfig create() {
        return builder().build();
    }

    /**
     * @return exif
     */
    public java.util.Map < String, String > getExif() {
        return this.exif;
    }

    /**
     * @return resourceKey
     */
    public String getResourceKey() {
        return this.resourceKey;
    }

    /**
     * @return selectQuestions
     */
    public java.util.List < String > getSelectQuestions() {
        return this.selectQuestions;
    }

    /**
     * @return templateOptionMap
     */
    public java.util.Map < String, TaskTemplateOptionConfig > getTemplateOptionMap() {
        return this.templateOptionMap;
    }

    /**
     * @return templateRelationId
     */
    public String getTemplateRelationId() {
        return this.templateRelationId;
    }

    public static final class Builder {
        private java.util.Map < String, String > exif; 
        private String resourceKey; 
        private java.util.List < String > selectQuestions; 
        private java.util.Map < String, TaskTemplateOptionConfig > templateOptionMap; 
        private String templateRelationId; 

        /**
         * Exif.
         */
        public Builder exif(java.util.Map < String, String > exif) {
            this.exif = exif;
            return this;
        }

        /**
         * ResourceKey.
         */
        public Builder resourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }

        /**
         * SelectQuestions.
         */
        public Builder selectQuestions(java.util.List < String > selectQuestions) {
            this.selectQuestions = selectQuestions;
            return this;
        }

        /**
         * TemplateOptionMap.
         */
        public Builder templateOptionMap(java.util.Map < String, TaskTemplateOptionConfig > templateOptionMap) {
            this.templateOptionMap = templateOptionMap;
            return this;
        }

        /**
         * TemplateRelationId.
         */
        public Builder templateRelationId(String templateRelationId) {
            this.templateRelationId = templateRelationId;
            return this;
        }

        public TaskTemplateConfig build() {
            return new TaskTemplateConfig(this);
        } 

    } 

}
