// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link DataField} extends {@link TeaModel}
 *
 * <p>DataField</p>
 */
public class DataField extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("id")
    private Integer id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private FullDataType type;

    private DataField(Builder builder) {
        this.description = builder.description;
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataField create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
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
    public FullDataType getType() {
        return this.type;
    }

    public static final class Builder {
        private String description; 
        private Integer id; 
        private String name; 
        private FullDataType type; 

        private Builder() {
        } 

        private Builder(DataField model) {
            this.description = model.description;
            this.id = model.id;
            this.name = model.name;
            this.type = model.type;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Integer id) {
            this.id = id;
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
        public Builder type(FullDataType type) {
            this.type = type;
            return this;
        }

        public DataField build() {
            return new DataField(this);
        } 

    } 

}
