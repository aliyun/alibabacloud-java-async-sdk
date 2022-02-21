// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasButtonDTO} extends {@link TeaModel}
 *
 * <p>PaasButtonDTO</p>
 */
public class PaasButtonDTO extends TeaModel {
    @NameInMap("Name")
    private String name;

    @NameInMap("Text")
    private String text;

    @NameInMap("Type")
    private String type;

    private PaasButtonDTO(Builder builder) {
        this.name = builder.name;
        this.text = builder.text;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasButtonDTO create() {
        return builder().build();
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String name; 
        private String text; 
        private String type; 

        /**
         * Name
         */
        public Builder name(String name) {
            this.name = name;
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
         * Type
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public PaasButtonDTO build() {
            return new PaasButtonDTO(this);
        } 

    } 

}
