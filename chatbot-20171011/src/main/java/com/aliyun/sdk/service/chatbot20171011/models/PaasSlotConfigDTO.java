// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasSlotConfigDTO} extends {@link TeaModel}
 *
 * <p>PaasSlotConfigDTO</p>
 */
public class PaasSlotConfigDTO extends TeaModel {
    @NameInMap("IsArray")
    private Boolean isArray;

    @NameInMap("IsNecessary")
    private Boolean isNecessary;

    @NameInMap("LifeSpan")
    private Integer lifeSpan;

    @NameInMap("Name")
    private String name;

    @NameInMap("Question")
    private java.util.List < String > question;

    @NameInMap("Value")
    private String value;

    private PaasSlotConfigDTO(Builder builder) {
        this.isArray = builder.isArray;
        this.isNecessary = builder.isNecessary;
        this.lifeSpan = builder.lifeSpan;
        this.name = builder.name;
        this.question = builder.question;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasSlotConfigDTO create() {
        return builder().build();
    }

    /**
     * @return isArray
     */
    public Boolean getIsArray() {
        return this.isArray;
    }

    /**
     * @return isNecessary
     */
    public Boolean getIsNecessary() {
        return this.isNecessary;
    }

    /**
     * @return lifeSpan
     */
    public Integer getLifeSpan() {
        return this.lifeSpan;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return question
     */
    public java.util.List < String > getQuestion() {
        return this.question;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private Boolean isArray; 
        private Boolean isNecessary; 
        private Integer lifeSpan; 
        private String name; 
        private java.util.List < String > question; 
        private String value; 

        /**
         * IsArray
         */
        public Builder isArray(Boolean isArray) {
            this.isArray = isArray;
            return this;
        }

        /**
         * IsNecessary
         */
        public Builder isNecessary(Boolean isNecessary) {
            this.isNecessary = isNecessary;
            return this;
        }

        /**
         * LifeSpan
         */
        public Builder lifeSpan(Integer lifeSpan) {
            this.lifeSpan = lifeSpan;
            return this;
        }

        /**
         * Name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Question
         */
        public Builder question(java.util.List < String > question) {
            this.question = question;
            return this;
        }

        /**
         * Value
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public PaasSlotConfigDTO build() {
            return new PaasSlotConfigDTO(this);
        } 

    } 

}
