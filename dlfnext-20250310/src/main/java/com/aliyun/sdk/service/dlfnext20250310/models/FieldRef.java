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
 * {@link FieldRef} extends {@link TeaModel}
 *
 * <p>FieldRef</p>
 */
public class FieldRef extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("index")
    private Integer index;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private FullDataType type;

    private FieldRef(Builder builder) {
        this.index = builder.index;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FieldRef create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return index
     */
    public Integer getIndex() {
        return this.index;
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
        private Integer index; 
        private String name; 
        private FullDataType type; 

        private Builder() {
        } 

        private Builder(FieldRef model) {
            this.index = model.index;
            this.name = model.name;
            this.type = model.type;
        } 

        /**
         * index.
         */
        public Builder index(Integer index) {
            this.index = index;
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

        public FieldRef build() {
            return new FieldRef(this);
        } 

    } 

}
