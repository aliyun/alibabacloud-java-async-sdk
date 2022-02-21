// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SlotrecordMtopDTO} extends {@link TeaModel}
 *
 * <p>SlotrecordMtopDTO</p>
 */
public class SlotrecordMtopDTO extends TeaModel {
    @NameInMap("Id")
    private String id;

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

    @NameInMap("Tags")
    private java.util.List < TagMtopDTO > tags;

    @NameInMap("Value")
    private String value;

    private SlotrecordMtopDTO(Builder builder) {
        this.id = builder.id;
        this.isArray = builder.isArray;
        this.isNecessary = builder.isNecessary;
        this.lifeSpan = builder.lifeSpan;
        this.name = builder.name;
        this.question = builder.question;
        this.tags = builder.tags;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SlotrecordMtopDTO create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
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
     * @return tags
     */
    public java.util.List < TagMtopDTO > getTags() {
        return this.tags;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String id; 
        private Boolean isArray; 
        private Boolean isNecessary; 
        private Integer lifeSpan; 
        private String name; 
        private java.util.List < String > question; 
        private java.util.List < TagMtopDTO > tags; 
        private String value; 

        /**
         * Id
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

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
         * Tags
         */
        public Builder tags(java.util.List < TagMtopDTO > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Value
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public SlotrecordMtopDTO build() {
            return new SlotrecordMtopDTO(this);
        } 

    } 

}
