// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link InstanceEventItem} extends {@link TeaModel}
 *
 * <p>InstanceEventItem</p>
 */
public class InstanceEventItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("children")
    private java.util.List<InstanceEventItem> children;

    @com.aliyun.core.annotation.NameInMap("level")
    private String level;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private InstanceEventItem(Builder builder) {
        this.children = builder.children;
        this.level = builder.level;
        this.message = builder.message;
        this.time = builder.time;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceEventItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return children
     */
    public java.util.List<InstanceEventItem> getChildren() {
        return this.children;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List<InstanceEventItem> children; 
        private String level; 
        private String message; 
        private String time; 
        private String type; 

        private Builder() {
        } 

        private Builder(InstanceEventItem model) {
            this.children = model.children;
            this.level = model.level;
            this.message = model.message;
            this.time = model.time;
            this.type = model.type;
        } 

        /**
         * children.
         */
        public Builder children(java.util.List<InstanceEventItem> children) {
            this.children = children;
            return this;
        }

        /**
         * level.
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public InstanceEventItem build() {
            return new InstanceEventItem(this);
        } 

    } 

}
