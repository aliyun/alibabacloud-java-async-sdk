// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeviceFormProperty} extends {@link TeaModel}
 *
 * <p>DeviceFormProperty</p>
 */
public class DeviceFormProperty extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("Keyword")
    private String keyword;

    @NameInMap("Placeholder")
    private Boolean placeholder;

    @NameInMap("Required")
    private Boolean required;

    @NameInMap("SearchSupported")
    private Boolean searchSupported;

    @NameInMap("Sequence")
    private Integer sequence;

    @NameInMap("TableVisible")
    private Boolean tableVisible;

    @NameInMap("Uniqueness")
    private Boolean uniqueness;

    @NameInMap("ValueReference")
    private String valueReference;

    @NameInMap("ValueSource")
    private String valueSource;

    @NameInMap("ValueType")
    private String valueType;

    private DeviceFormProperty(Builder builder) {
        this.content = builder.content;
        this.keyword = builder.keyword;
        this.placeholder = builder.placeholder;
        this.required = builder.required;
        this.searchSupported = builder.searchSupported;
        this.sequence = builder.sequence;
        this.tableVisible = builder.tableVisible;
        this.uniqueness = builder.uniqueness;
        this.valueReference = builder.valueReference;
        this.valueSource = builder.valueSource;
        this.valueType = builder.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeviceFormProperty create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return placeholder
     */
    public Boolean getPlaceholder() {
        return this.placeholder;
    }

    /**
     * @return required
     */
    public Boolean getRequired() {
        return this.required;
    }

    /**
     * @return searchSupported
     */
    public Boolean getSearchSupported() {
        return this.searchSupported;
    }

    /**
     * @return sequence
     */
    public Integer getSequence() {
        return this.sequence;
    }

    /**
     * @return tableVisible
     */
    public Boolean getTableVisible() {
        return this.tableVisible;
    }

    /**
     * @return uniqueness
     */
    public Boolean getUniqueness() {
        return this.uniqueness;
    }

    /**
     * @return valueReference
     */
    public String getValueReference() {
        return this.valueReference;
    }

    /**
     * @return valueSource
     */
    public String getValueSource() {
        return this.valueSource;
    }

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
    }

    public static final class Builder {
        private String content; 
        private String keyword; 
        private Boolean placeholder; 
        private Boolean required; 
        private Boolean searchSupported; 
        private Integer sequence; 
        private Boolean tableVisible; 
        private Boolean uniqueness; 
        private String valueReference; 
        private String valueSource; 
        private String valueType; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        /**
         * Placeholder.
         */
        public Builder placeholder(Boolean placeholder) {
            this.placeholder = placeholder;
            return this;
        }

        /**
         * Required.
         */
        public Builder required(Boolean required) {
            this.required = required;
            return this;
        }

        /**
         * SearchSupported.
         */
        public Builder searchSupported(Boolean searchSupported) {
            this.searchSupported = searchSupported;
            return this;
        }

        /**
         * Sequence.
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * TableVisible.
         */
        public Builder tableVisible(Boolean tableVisible) {
            this.tableVisible = tableVisible;
            return this;
        }

        /**
         * Uniqueness.
         */
        public Builder uniqueness(Boolean uniqueness) {
            this.uniqueness = uniqueness;
            return this;
        }

        /**
         * ValueReference.
         */
        public Builder valueReference(String valueReference) {
            this.valueReference = valueReference;
            return this;
        }

        /**
         * ValueSource.
         */
        public Builder valueSource(String valueSource) {
            this.valueSource = valueSource;
            return this;
        }

        /**
         * ValueType.
         */
        public Builder valueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public DeviceFormProperty build() {
            return new DeviceFormProperty(this);
        } 

    } 

}
