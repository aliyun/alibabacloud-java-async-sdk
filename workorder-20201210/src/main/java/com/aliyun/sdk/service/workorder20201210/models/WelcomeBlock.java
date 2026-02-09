// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20201210.models;

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
 * {@link WelcomeBlock} extends {@link TeaModel}
 *
 * <p>WelcomeBlock</p>
 */
public class WelcomeBlock extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisplayType")
    private String displayType;

    @com.aliyun.core.annotation.NameInMap("Icon")
    private String icon;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private WelcomeBlock(Builder builder) {
        this.description = builder.description;
        this.displayType = builder.displayType;
        this.icon = builder.icon;
        this.label = builder.label;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WelcomeBlock create() {
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
     * @return displayType
     */
    public String getDisplayType() {
        return this.displayType;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
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
        private String displayType; 
        private String icon; 
        private String label; 
        private String type; 
        private String value; 

        private Builder() {
        } 

        private Builder(WelcomeBlock model) {
            this.description = model.description;
            this.displayType = model.displayType;
            this.icon = model.icon;
            this.label = model.label;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisplayType.
         */
        public Builder displayType(String displayType) {
            this.displayType = displayType;
            return this;
        }

        /**
         * Icon.
         */
        public Builder icon(String icon) {
            this.icon = icon;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public WelcomeBlock build() {
            return new WelcomeBlock(this);
        } 

    } 

}
