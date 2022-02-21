// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RuleMtopDTO} extends {@link TeaModel}
 *
 * <p>RuleMtopDTO</p>
 */
public class RuleMtopDTO extends TeaModel {
    @NameInMap("Error")
    private java.util.List < String > error;

    @NameInMap("Strict")
    private Boolean strict;

    @NameInMap("Text")
    private String text;

    @NameInMap("Warning")
    private java.util.List < String > warning;

    private RuleMtopDTO(Builder builder) {
        this.error = builder.error;
        this.strict = builder.strict;
        this.text = builder.text;
        this.warning = builder.warning;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RuleMtopDTO create() {
        return builder().build();
    }

    /**
     * @return error
     */
    public java.util.List < String > getError() {
        return this.error;
    }

    /**
     * @return strict
     */
    public Boolean getStrict() {
        return this.strict;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    /**
     * @return warning
     */
    public java.util.List < String > getWarning() {
        return this.warning;
    }

    public static final class Builder {
        private java.util.List < String > error; 
        private Boolean strict; 
        private String text; 
        private java.util.List < String > warning; 

        /**
         * Error
         */
        public Builder error(java.util.List < String > error) {
            this.error = error;
            return this;
        }

        /**
         * Strict
         */
        public Builder strict(Boolean strict) {
            this.strict = strict;
            return this;
        }

        /**
         * Text
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Warning
         */
        public Builder warning(java.util.List < String > warning) {
            this.warning = warning;
            return this;
        }

        public RuleMtopDTO build() {
            return new RuleMtopDTO(this);
        } 

    } 

}
