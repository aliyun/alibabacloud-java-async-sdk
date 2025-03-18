// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ConfigValueFilesConfigVariablesValue} extends {@link TeaModel}
 *
 * <p>ConfigValueFilesConfigVariablesValue</p>
 */
public class ConfigValueFilesConfigVariablesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("disableModify")
    private Boolean disableModify;

    @com.aliyun.core.annotation.NameInMap("isModify")
    private Boolean isModify;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private ConfigValueFilesConfigVariablesValue(Builder builder) {
        this.description = builder.description;
        this.disableModify = builder.disableModify;
        this.isModify = builder.isModify;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigValueFilesConfigVariablesValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return disableModify
     */
    public Boolean getDisableModify() {
        return this.disableModify;
    }

    /**
     * @return isModify
     */
    public Boolean getIsModify() {
        return this.isModify;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String description; 
        private Boolean disableModify; 
        private Boolean isModify; 
        private String type; 
        private String value; 

        private Builder() {
        } 

        private Builder(ConfigValueFilesConfigVariablesValue model) {
            this.description = model.description;
            this.disableModify = model.disableModify;
            this.isModify = model.isModify;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the variable is not allowed to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder disableModify(Boolean disableModify) {
            this.disableModify = disableModify;
            return this;
        }

        /**
         * <p>Specifies whether the variable is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isModify(Boolean isModify) {
            this.isModify = isModify;
            return this;
        }

        /**
         * <p>The variable type. Valid values: NORMAL: common variable. FUNCTION: function variable.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The variable value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public ConfigValueFilesConfigVariablesValue build() {
            return new ConfigValueFilesConfigVariablesValue(this);
        } 

    } 

}
