// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasSwitchCaseDTO} extends {@link TeaModel}
 *
 * <p>PaasSwitchCaseDTO</p>
 */
public class PaasSwitchCaseDTO extends TeaModel {
    @NameInMap("Id")
    private String id;

    @NameInMap("Label")
    private String label;

    @NameInMap("Type")
    private String type;

    @NameInMap("Value")
    private String value;

    @NameInMap("VariableName")
    private String variableName;

    private PaasSwitchCaseDTO(Builder builder) {
        this.id = builder.id;
        this.label = builder.label;
        this.type = builder.type;
        this.value = builder.value;
        this.variableName = builder.variableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasSwitchCaseDTO create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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

    /**
     * @return variableName
     */
    public String getVariableName() {
        return this.variableName;
    }

    public static final class Builder {
        private String id; 
        private String label; 
        private String type; 
        private String value; 
        private String variableName; 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
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

        /**
         * VariableName.
         */
        public Builder variableName(String variableName) {
            this.variableName = variableName;
            return this;
        }

        public PaasSwitchCaseDTO build() {
            return new PaasSwitchCaseDTO(this);
        } 

    } 

}
