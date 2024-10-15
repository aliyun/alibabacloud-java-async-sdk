// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClusterAddonInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterAddonInstancesResponseBody</p>
 */
public class ListClusterAddonInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addons")
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
         * <p>A list of components that are installed in the cluster.</p>
         */
        public Builder addons(java.util.List < Addons> addons) {
            this.addons = addons;
            return this;
        }

        public ListClusterAddonInstancesResponseBody build() {
            return new ListClusterAddonInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterAddonInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterAddonInstancesResponseBody</p>
     */
    public static class Addons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("version")
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
             * <p>The component name.</p>
             * 
             * <strong>example:</strong>
             * <p>coredns</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the component. Valid values:</p>
             * <ul>
             * <li>active: The component is installed.</li>
             * <li>updating: The component is being modified.</li>
             * <li>upgrading: The component is being updated.</li>
             * <li>deleting: The component is being uninstalled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The version of the component.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.9.3.10-7dfca203-aliyun</p>
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
