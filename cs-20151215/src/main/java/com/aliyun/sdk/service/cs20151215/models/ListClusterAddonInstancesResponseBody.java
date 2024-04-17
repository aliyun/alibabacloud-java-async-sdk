// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterAddonInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterAddonInstancesResponseBody</p>
 */
public class ListClusterAddonInstancesResponseBody extends TeaModel {
    @NameInMap("addons")
    private java.util.List < Addons> addons;

    private ListClusterAddonInstancesResponseBody(Builder builder) {
        this.addons = builder.addons;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterAddonInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return addons
     */
    public java.util.List < Addons> getAddons() {
        return this.addons;
    }

    public static final class Builder {
        private java.util.List < Addons> addons; 

        /**
         * A list of components that are installed in the cluster.
         */
        public Builder addons(java.util.List < Addons> addons) {
            this.addons = addons;
            return this;
        }

        public ListClusterAddonInstancesResponseBody build() {
            return new ListClusterAddonInstancesResponseBody(this);
        } 

    } 

    public static class Addons extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("state")
        private String state;

        @NameInMap("version")
        private String version;

        private Addons(Builder builder) {
            this.name = builder.name;
            this.state = builder.state;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addons create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String state; 
            private String version; 

            /**
             * The component name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the component. Valid values:
             * <p>
             * 
             * *   active: The component is installed.
             * *   updating: The component is being modified.
             * *   upgrading: The component is being updated.
             * *   deleting: The component is being uninstalled.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The version of the component.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Addons build() {
                return new Addons(this);
            } 

        } 

    }
}
