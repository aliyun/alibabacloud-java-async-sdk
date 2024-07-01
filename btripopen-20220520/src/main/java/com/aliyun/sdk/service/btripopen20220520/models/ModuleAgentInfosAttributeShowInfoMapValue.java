// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModuleAgentInfosAttributeShowInfoMapValue} extends {@link TeaModel}
 *
 * <p>ModuleAgentInfosAttributeShowInfoMapValue</p>
 */
public class ModuleAgentInfosAttributeShowInfoMapValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("text")
    private String text;

    private ModuleAgentInfosAttributeShowInfoMapValue(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModuleAgentInfosAttributeShowInfoMapValue create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder {
        private String code; 
        private String name; 
        private String text; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * text.
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public ModuleAgentInfosAttributeShowInfoMapValue build() {
            return new ModuleAgentInfosAttributeShowInfoMapValue(this);
        } 

    } 

}
