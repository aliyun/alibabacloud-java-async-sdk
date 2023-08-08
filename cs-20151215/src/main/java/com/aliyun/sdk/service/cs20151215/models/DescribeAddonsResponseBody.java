// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAddonsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAddonsResponseBody</p>
 */
public class DescribeAddonsResponseBody extends TeaModel {
    @NameInMap("ComponentGroups")
    private java.util.List < ComponentGroups> componentGroups;

    @NameInMap("StandardComponents")
    private java.util.Map < String, StandardComponentsValue > standardComponents;

    private DescribeAddonsResponseBody(Builder builder) {
        this.componentGroups = builder.componentGroups;
        this.standardComponents = builder.standardComponents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAddonsResponseBody create() {
        return builder().build();
    }

    /**
     * @return componentGroups
     */
    public java.util.List < ComponentGroups> getComponentGroups() {
        return this.componentGroups;
    }

    /**
     * @return standardComponents
     */
    public java.util.Map < String, StandardComponentsValue > getStandardComponents() {
        return this.standardComponents;
    }

    public static final class Builder {
        private java.util.List < ComponentGroups> componentGroups; 
        private java.util.Map < String, StandardComponentsValue > standardComponents; 

        /**
         * The details of the returned components.
         */
        public Builder componentGroups(java.util.List < ComponentGroups> componentGroups) {
            this.componentGroups = componentGroups;
            return this;
        }

        /**
         * StandardComponents.
         */
        public Builder standardComponents(java.util.Map < String, StandardComponentsValue > standardComponents) {
            this.standardComponents = standardComponents;
            return this;
        }

        public DescribeAddonsResponseBody build() {
            return new DescribeAddonsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("name")
        private String name;

        private Items(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * The name of the component.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class ComponentGroups extends TeaModel {
        @NameInMap("group_name")
        private String groupName;

        @NameInMap("items")
        private java.util.List < Items> items;

        private ComponentGroups(Builder builder) {
            this.groupName = builder.groupName;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentGroups create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List < Items> items; 

            /**
             * The name of the component group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The names of the components in the component group.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public ComponentGroups build() {
                return new ComponentGroups(this);
            } 

        } 

    }
}
