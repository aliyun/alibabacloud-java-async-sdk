// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link IdpLoginOrderItem} extends {@link TeaModel}
 *
 * <p>IdpLoginOrderItem</p>
 */
public class IdpLoginOrderItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Class")
    private String _class;

    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("Enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private IdpLoginOrderItem(Builder builder) {
        this._class = builder._class;
        this.configId = builder.configId;
        this.desc = builder.desc;
        this.enabled = builder.enabled;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpLoginOrderItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return _class
     */
    public String get_class() {
        return this._class;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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
        private String _class; 
        private String configId; 
        private String desc; 
        private Boolean enabled; 
        private String name; 
        private String type; 

        private Builder() {
        } 

        private Builder(IdpLoginOrderItem model) {
            this._class = model._class;
            this.configId = model.configId;
            this.desc = model.desc;
            this.enabled = model.enabled;
            this.name = model.name;
            this.type = model.type;
        } 

        /**
         * Class.
         */
        public Builder _class(String _class) {
            this._class = _class;
            return this;
        }

        /**
         * ConfigId.
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * Enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
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

        public IdpLoginOrderItem build() {
            return new IdpLoginOrderItem(this);
        } 

    } 

}
