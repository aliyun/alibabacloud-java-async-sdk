// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListComponentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentsResponseBody</p>
 */
public class ListComponentsResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("ComponentList")
    private ComponentList componentList;

    @NameInMap("Message")
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

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The components.
         */
        public Builder componentList(ComponentList componentList) {
            this.componentList = componentList;
            return this;
        }

        /**
         * The message that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public ListComponentsResponseBody build() {
            return new ListComponentsResponseBody(this);
        } 

    } 

    public static class Component extends TeaModel {
        @NameInMap("ComponentId")
        private String componentId;

        @NameInMap("ComponentKey")
        private String componentKey;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("Type")
        private String type;

        @NameInMap("Version")
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

            /**
             * The ID of the component.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * The key of the component.
             */
            public Builder componentKey(String componentKey) {
                this.componentKey = componentKey;
                return this;
            }

            /**
             * The description of the component.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Indicates whether the component has expired. Valid values:
             * <p>
             * 
             * *   false: The component has not expired.
             * *   true: The component has expired.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The type of the component. Valid values:
             * <p>
             * 
             * *   JDK
             * *   TOMCAT
             * *   TENGINE
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The version of the component.
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
    public static class ComponentList extends TeaModel {
        @NameInMap("Component")
        private java.util.List < Component> component;

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
        public java.util.List < Component> getComponent() {
            return this.component;
        }

        public static final class Builder {
            private java.util.List < Component> component; 

            /**
             * Component.
             */
            public Builder component(java.util.List < Component> component) {
                this.component = component;
                return this;
            }

            public ComponentList build() {
                return new ComponentList(this);
            } 

        } 

    }
}
