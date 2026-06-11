// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link DataResourceValue} extends {@link TeaModel}
 *
 * <p>DataResourceValue</p>
 */
public class DataResourceValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private java.util.Map<String, ?> metadata;

    private DataResourceValue(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.content = builder.content;
        this.metadata = builder.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataResourceValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return metadata
     */
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public static final class Builder {
        private String name; 
        private String type; 
        private String content; 
        private java.util.Map<String, ?> metadata; 

        private Builder() {
        } 

        private Builder(DataResourceValue model) {
            this.name = model.name;
            this.type = model.type;
            this.content = model.content;
            this.metadata = model.metadata;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }

        public DataResourceValue build() {
            return new DataResourceValue(this);
        } 

    } 

}
