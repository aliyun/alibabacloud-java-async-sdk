// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Connector} extends {@link TeaModel}
 *
 * <p>Connector</p>
 */
public class Connector extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("creatorName")
    private String creatorName;

    @com.aliyun.core.annotation.NameInMap("dependencies")
    private java.util.List < String > dependencies;

    @com.aliyun.core.annotation.NameInMap("lookup")
    private Boolean lookup;

    @com.aliyun.core.annotation.NameInMap("modifier")
    private String modifier;

    @com.aliyun.core.annotation.NameInMap("modifierName")
    private String modifierName;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("properties")
    private java.util.List < Property > properties;

    @com.aliyun.core.annotation.NameInMap("sink")
    private Boolean sink;

    @com.aliyun.core.annotation.NameInMap("source")
    private Boolean source;

    @com.aliyun.core.annotation.NameInMap("supportedFormats")
    private java.util.List < String > supportedFormats;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private Connector(Builder builder) {
        this.creator = builder.creator;
        this.creatorName = builder.creatorName;
        this.dependencies = builder.dependencies;
        this.lookup = builder.lookup;
        this.modifier = builder.modifier;
        this.modifierName = builder.modifierName;
        this.name = builder.name;
        this.properties = builder.properties;
        this.sink = builder.sink;
        this.source = builder.source;
        this.supportedFormats = builder.supportedFormats;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Connector create() {
        return builder().build();
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return creatorName
     */
    public String getCreatorName() {
        return this.creatorName;
    }

    /**
     * @return dependencies
     */
    public java.util.List < String > getDependencies() {
        return this.dependencies;
    }

    /**
     * @return lookup
     */
    public Boolean getLookup() {
        return this.lookup;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return this.modifier;
    }

    /**
     * @return modifierName
     */
    public String getModifierName() {
        return this.modifierName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return properties
     */
    public java.util.List < Property > getProperties() {
        return this.properties;
    }

    /**
     * @return sink
     */
    public Boolean getSink() {
        return this.sink;
    }

    /**
     * @return source
     */
    public Boolean getSource() {
        return this.source;
    }

    /**
     * @return supportedFormats
     */
    public java.util.List < String > getSupportedFormats() {
        return this.supportedFormats;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String creator; 
        private String creatorName; 
        private java.util.List < String > dependencies; 
        private Boolean lookup; 
        private String modifier; 
        private String modifierName; 
        private String name; 
        private java.util.List < Property > properties; 
        private Boolean sink; 
        private Boolean source; 
        private java.util.List < String > supportedFormats; 
        private String type; 

        /**
         * creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * creatorName.
         */
        public Builder creatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }

        /**
         * dependencies.
         */
        public Builder dependencies(java.util.List < String > dependencies) {
            this.dependencies = dependencies;
            return this;
        }

        /**
         * lookup.
         */
        public Builder lookup(Boolean lookup) {
            this.lookup = lookup;
            return this;
        }

        /**
         * modifier.
         */
        public Builder modifier(String modifier) {
            this.modifier = modifier;
            return this;
        }

        /**
         * modifierName.
         */
        public Builder modifierName(String modifierName) {
            this.modifierName = modifierName;
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
         * properties.
         */
        public Builder properties(java.util.List < Property > properties) {
            this.properties = properties;
            return this;
        }

        /**
         * sink.
         */
        public Builder sink(Boolean sink) {
            this.sink = sink;
            return this;
        }

        /**
         * source.
         */
        public Builder source(Boolean source) {
            this.source = source;
            return this;
        }

        /**
         * supportedFormats.
         */
        public Builder supportedFormats(java.util.List < String > supportedFormats) {
            this.supportedFormats = supportedFormats;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Connector build() {
            return new Connector(this);
        } 

    } 

}
