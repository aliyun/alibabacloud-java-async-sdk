// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link SecondRank} extends {@link TeaModel}
 *
 * <p>SecondRank</p>
 */
public class SecondRank extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("meta")
    private Object meta;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private SecondRank(Builder builder) {
        this.active = builder.active;
        this.description = builder.description;
        this.meta = builder.meta;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SecondRank create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private Boolean active; 
        private String description; 
        private Object meta; 
        private String name; 

        private Builder() {
        } 

        private Builder(SecondRank model) {
            this.active = model.active;
            this.description = model.description;
            this.meta = model.meta;
            this.name = model.name;
        } 

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

        public SecondRank build() {
            return new SecondRank(this);
        } 

    } 

}
