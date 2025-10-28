// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentsResponseBody</p>
 */
public class ListComponentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("ComponentList")
    private ComponentList componentList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    private ListComponentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.componentList = builder.componentList;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return componentList
     */
    public ComponentList getComponentList() {
        return this.componentList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private Integer code; 
        private ComponentList componentList; 
        private String message; 

        private Builder() {
        } 

        private Builder(ListComponentsResponseBody model) {
            this.code = model.code;
            this.componentList = model.componentList;
            this.message = model.message;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The components.</p>
         */
        public Builder componentList(ComponentList componentList) {
            this.componentList = componentList;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ListComponentsResponseBody build() {
            return new ListComponentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListComponentsResponseBody</p>
     */
    public static class Component extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentKey")
        private String componentKey;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Component(Builder builder) {
            this.componentId = builder.componentId;
            this.componentKey = builder.componentKey;
            this.desc = builder.desc;
            this.expired = builder.expired;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Component create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentKey
         */
        public String getComponentKey() {
            return this.componentKey;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String componentId; 
            private String componentKey; 
            private String desc; 
            private Boolean expired; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(Component model) {
                this.componentId = model.componentId;
                this.componentKey = model.componentKey;
                this.desc = model.desc;
                this.expired = model.expired;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The ID of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The key of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>JDK 7</p>
             */
            public Builder componentKey(String componentKey) {
                this.componentKey = componentKey;
                return this;
            }

            /**
             * <p>The description of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>JDK 7</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>Indicates whether the component has expired. Valid values:</p>
             * <ul>
             * <li>false: The component has not expired.</li>
             * <li>true: The component has expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The type of the component. Valid values:</p>
             * <ul>
             * <li>JDK</li>
             * <li>TOMCAT</li>
             * <li>TENGINE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>JDK</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>oraclejdk7</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Component build() {
                return new Component(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListComponentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListComponentsResponseBody</p>
     */
    public static class ComponentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Component")
        private java.util.List<Component> component;

        private ComponentList(Builder builder) {
            this.component = builder.component;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentList create() {
            return builder().build();
        }

        /**
         * @return component
         */
        public java.util.List<Component> getComponent() {
            return this.component;
        }

        public static final class Builder {
            private java.util.List<Component> component; 

            private Builder() {
            } 

            private Builder(ComponentList model) {
                this.component = model.component;
            } 

            /**
             * Component.
             */
            public Builder component(java.util.List<Component> component) {
                this.component = component;
                return this;
            }

            public ComponentList build() {
                return new ComponentList(this);
            } 

        } 

    }
}
