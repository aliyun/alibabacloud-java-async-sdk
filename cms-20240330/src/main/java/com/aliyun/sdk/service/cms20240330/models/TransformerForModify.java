// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link TransformerForModify} extends {@link TeaModel}
 *
 * <p>TransformerForModify</p>
 */
public class TransformerForModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actions")
    private java.util.List<TransformAction> actions;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("filterSetting")
    private FilterSetting filterSetting;

    @com.aliyun.core.annotation.NameInMap("quitAfterMatch")
    private Boolean quitAfterMatch;

    @com.aliyun.core.annotation.NameInMap("sortId")
    private Integer sortId;

    @com.aliyun.core.annotation.NameInMap("transformerName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transformerName;

    private TransformerForModify(Builder builder) {
        this.actions = builder.actions;
        this.description = builder.description;
        this.filterSetting = builder.filterSetting;
        this.quitAfterMatch = builder.quitAfterMatch;
        this.sortId = builder.sortId;
        this.transformerName = builder.transformerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformerForModify create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public java.util.List<TransformAction> getActions() {
        return this.actions;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return filterSetting
     */
    public FilterSetting getFilterSetting() {
        return this.filterSetting;
    }

    /**
     * @return quitAfterMatch
     */
    public Boolean getQuitAfterMatch() {
        return this.quitAfterMatch;
    }

    /**
     * @return sortId
     */
    public Integer getSortId() {
        return this.sortId;
    }

    /**
     * @return transformerName
     */
    public String getTransformerName() {
        return this.transformerName;
    }

    public static final class Builder {
        private java.util.List<TransformAction> actions; 
        private String description; 
        private FilterSetting filterSetting; 
        private Boolean quitAfterMatch; 
        private Integer sortId; 
        private String transformerName; 

        private Builder() {
        } 

        private Builder(TransformerForModify model) {
            this.actions = model.actions;
            this.description = model.description;
            this.filterSetting = model.filterSetting;
            this.quitAfterMatch = model.quitAfterMatch;
            this.sortId = model.sortId;
            this.transformerName = model.transformerName;
        } 

        /**
         * actions.
         */
        public Builder actions(java.util.List<TransformAction> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * filterSetting.
         */
        public Builder filterSetting(FilterSetting filterSetting) {
            this.filterSetting = filterSetting;
            return this;
        }

        /**
         * quitAfterMatch.
         */
        public Builder quitAfterMatch(Boolean quitAfterMatch) {
            this.quitAfterMatch = quitAfterMatch;
            return this;
        }

        /**
         * sortId.
         */
        public Builder sortId(Integer sortId) {
            this.sortId = sortId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder transformerName(String transformerName) {
            this.transformerName = transformerName;
            return this;
        }

        public TransformerForModify build() {
            return new TransformerForModify(this);
        } 

    } 

}
