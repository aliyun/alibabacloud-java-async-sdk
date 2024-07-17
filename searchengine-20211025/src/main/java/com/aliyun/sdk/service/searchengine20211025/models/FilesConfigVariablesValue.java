// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FilesConfigVariablesValue} extends {@link TeaModel}
 *
 * <p>FilesConfigVariablesValue</p>
 */
public class FilesConfigVariablesValue extends TeaModel {
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

    private FilesConfigVariablesValue(Builder builder) {
        this.description = builder.description;
        this.disableModify = builder.disableModify;
        this.isModify = builder.isModify;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FilesConfigVariablesValue create() {
        return builder().build();
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

        /**
         * The description of the variable.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Specifies whether the variable is not allowed to be modified.
         */
        public Builder disableModify(Boolean disableModify) {
            this.disableModify = disableModify;
            return this;
        }

        /**
         * Specifies whether the variable is modified.
         */
        public Builder isModify(Boolean isModify) {
            this.isModify = isModify;
            return this;
        }

        /**
         * The variable type. Valid values: NORMAL: common variable. FUNCTION: function variable.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The variable value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public FilesConfigVariablesValue build() {
            return new FilesConfigVariablesValue(this);
        } 

    } 

}
