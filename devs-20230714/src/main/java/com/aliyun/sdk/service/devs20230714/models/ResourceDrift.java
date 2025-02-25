// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResourceDrift} extends {@link TeaModel}
 *
 * <p>ResourceDrift</p>
 */
public class ResourceDrift extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("change")
    private Change change;

    @com.aliyun.core.annotation.NameInMap("mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ResourceDrift(Builder builder) {
        this.address = builder.address;
        this.change = builder.change;
        this.mode = builder.mode;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResourceDrift create() {
        return builder().build();
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return change
     */
    public Change getChange() {
        return this.change;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
        private String address; 
        private Change change; 
        private String mode; 
        private String name; 
        private String type; 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * change.
         */
        public Builder change(Change change) {
            this.change = change;
            return this;
        }

        /**
         * mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
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

        public ResourceDrift build() {
            return new ResourceDrift(this);
        } 

    } 

    public static class Change extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("actions")
        private java.util.List < String > actions;

        @com.aliyun.core.annotation.NameInMap("after")
        private Object after;

        @com.aliyun.core.annotation.NameInMap("before")
        private Object before;

        private Change(Builder builder) {
            this.actions = builder.actions;
            this.after = builder.after;
            this.before = builder.before;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Change create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < String > getActions() {
            return this.actions;
        }

        /**
         * @return after
         */
        public Object getAfter() {
            return this.after;
        }

        /**
         * @return before
         */
        public Object getBefore() {
            return this.before;
        }

        public static final class Builder {
            private java.util.List < String > actions; 
            private Object after; 
            private Object before; 

            /**
             * actions.
             */
            public Builder actions(java.util.List < String > actions) {
                this.actions = actions;
                return this;
            }

            /**
             * after.
             */
            public Builder after(Object after) {
                this.after = after;
                return this;
            }

            /**
             * before.
             */
            public Builder before(Object before) {
                this.before = before;
                return this;
            }

            public Change build() {
                return new Change(this);
            } 

        } 

    }
}
