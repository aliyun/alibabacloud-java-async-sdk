// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FirstRank} extends {@link TeaModel}
 *
 * <p>FirstRank</p>
 */
public class FirstRank extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("meta")
    private Object meta;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private FirstRank(Builder builder) {
        this.active = builder.active;
        this.description = builder.description;
        this.meta = builder.meta;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FirstRank create() {
        return builder().build();
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return meta
     */
    public Object getMeta() {
        return this.meta;
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

    public static final class Builder {
        private Boolean active; 
        private String description; 
        private Object meta; 
        private String name; 
        private String type; 

        /**
         * active.
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * meta.
         */
        public Builder meta(Object meta) {
            this.meta = meta;
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
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public FirstRank build() {
            return new FirstRank(this);
        } 

    } 

}
