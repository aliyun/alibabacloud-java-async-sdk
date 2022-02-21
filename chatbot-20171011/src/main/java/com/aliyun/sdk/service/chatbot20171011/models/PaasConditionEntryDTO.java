// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PaasConditionEntryDTO} extends {@link TeaModel}
 *
 * <p>PaasConditionEntryDTO</p>
 */
public class PaasConditionEntryDTO extends TeaModel {
    @NameInMap("Id")
    private String id;

    @NameInMap("Name")
    private String name;

    @NameInMap("Term")
    private String term;

    @NameInMap("Type")
    private String type;

    @NameInMap("Value")
    private String value;

    private PaasConditionEntryDTO(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.term = builder.term;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaasConditionEntryDTO create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return term
     */
    public String getTerm() {
        return this.term;
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
        private String id; 
        private String name; 
        private String term; 
        private String type; 
        private String value; 

        /**
         * Id
         */
        public Builder id(String id) {
            this.id = id;
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
         * Term
         */
        public Builder term(String term) {
            this.term = term;
            return this;
        }

        /**
         * Type
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Value
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public PaasConditionEntryDTO build() {
            return new PaasConditionEntryDTO(this);
        } 

    } 

}
